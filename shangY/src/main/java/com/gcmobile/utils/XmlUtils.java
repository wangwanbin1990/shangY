package com.gcmobile.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.lang.reflect.*;
import java.util.*;

/**
 * <p>
 * Description:java bean和xml转换工具类<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/24
 * @title XmlUtils
 * @package com.gcmobile.utils
 */
public class XmlUtils {

    private static final Logger logger = Logger.getLogger(XmlUtils.class);


    /**
     * xml字符串转换成bean对象(不支持深层转换)
     *
     * @param xmlStr xml字符串
     * @param clazz 待转换的class
     * @return 转换后的对象
     */
    public static Object xmlStrToBean(String xmlStr, Class clazz) {
        Object obj = null;
        try {
            // 将xml格式的数据转换成Map对象
            Map<String, Object> map = xmlStrToMap(xmlStr);
            //将map对象的数据转换成Bean对象
            obj = mapToBean(map, clazz);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 将xml格式的字符串转换成Map对象
     *
     * @param xmlStr xml格式的字符串
     * @return Map对象
     * @throws Exception 异常
     */
    public static Map<String, Object> xmlStrToMap(String xmlStr) throws Exception {
        if(StringUtils.isEmpty(xmlStr)) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        //将xml格式的字符串转换成Document对象
        Document doc = DocumentHelper.parseText(xmlStr);
        //获取根节点
        Element root = doc.getRootElement();
        //获取根节点下的所有元素
        List children = root.elements();
        //循环所有子元素
        if(children != null && children.size() > 0) {
            for(int i = 0; i < children.size(); i++) {
                Element child = (Element)children.get(i);
                map.put(child.getName(), child.getTextTrim());
            }
        }
        return map;
    }

    /**
     * 将Map对象通过反射机制转换成Bean对象
     *
     * @param map 存放数据的map对象
     * @param clazz 待转换的class
     * @return 转换后的Bean对象
     * @throws Exception 异常
     */
    public static Object mapToBean(Map<String, Object> map, Class clazz) throws Exception {
        Object obj = clazz.newInstance();
        if(map != null && map.size() > 0) {
            for(Map.Entry<String, Object> entry : map.entrySet()) {
                String propertyName = entry.getKey();
                Object value = entry.getValue();
                String setMethodName = "set"
                        + propertyName.substring(0, 1).toUpperCase()
                        + propertyName.substring(1);
                Field field = getClassField(clazz, propertyName);
                Class fieldTypeClass = field.getType();
                value = convertValType(value, fieldTypeClass);
                clazz.getMethod(setMethodName, field.getType()).invoke(obj, value);
            }
        }
        return obj;
    }

    /**
     * 将javabean转换为xml字符串(支持深层转换)
     * @param t
     * @return
     */
    public static String beanToXml(Object t){
        Document document = DocumentHelper.createDocument();
        String rootname = t.getClass().getSimpleName().toUpperCase();//获得类名
        Element root = document.addElement(rootname);//添加根节点
        try {
            addDocument(t,root);
        } catch (NoSuchMethodException e) {
            logger.error("bean转换xml异常",e);
        } catch (InvocationTargetException e) {
            logger.error("bean转换xml异常",e);
        } catch (IllegalAccessException e) {
            logger.error("bean转换xml异常",e);
        }
        System.out.println(document.asXML());
        return document.asXML();
    }

    /**
     * 递归方法,深层遍历bean
     * @param t
     * @param element
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static void addDocument(Object t,Element element) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if(t==null){
            return;
        }
        Method[] methods = t.getClass().getMethods();
        for(Method method : methods){
            if (subMethodName(method.getName()).startsWith("get") && !subMethodName(method.getName()).equals("getClass")){
                Type type = method.getReturnType();
                if(type instanceof Class<?>){
                    //1.1实体bean属性
                    Class<?> cls = (Class<?>)type;
                    String value = "";
                    //1.2普通属性
                    if(java.util.List.class.isAssignableFrom(cls)){
                        //说明该类属性为List,需要继续遍历
                        List<?> list = (List<?>)method.invoke(t);
                        if(list!=null && list.size()>0){
                            for(int i=0;i<list.size();i++){
                                // 添加引用bean节点
                                Element second2 = element.addElement(getFieldByMethod(method.getName()));
                                addDocument(list.get(i),second2);
                            }
                        }
                    }else if(java.util.Map.class.isAssignableFrom(cls)){
                        //说明该类属性为Map,需要继续遍历
                        Element second2 = element.addElement(getFieldByMethod(method.getName()));
                        Map<String,?> map = (Map<String,?>)method.invoke(t);
                        for (Map.Entry<String, ?> entry : map.entrySet()) {
                            //添加xml key
                            Element mapElement = second2.addElement(entry.getKey());
                            String mapValue = judgeIsBaseType(entry.getValue().getClass(),entry.getValue());
                            if( mapValue == null){
                                // 如果value不是基本类型,继续递归
                                addDocument(entry.getValue(),mapElement);
                            }else {
                                //为xml key添加值
                                mapElement.setText(mapValue);
                            }
                        }
                    }else if(judgeIsBaseType(cls)){
                        //添加普通属性节点(if判断句添加)
                        addBaseTypeElement(t,method,element);
                    }else {
                        //添加bean节点并递归下去
                        Element second2 = element.addElement(getFieldByMethod(method.getName()));
                        Object t1 = method.invoke(t);
                        addDocument(t1,second2);
                    }
                }
            }
        }
    }

    /**
     * 根据类型判断是否为普通属性并获取值
     * @param cls
     * @return
     */
    private static boolean judgeIsBaseType(Class<?> cls){
        boolean result = false;
        if(java.lang.String.class.isAssignableFrom(cls)){
            result = true;
        } else if(java.lang.Integer.class.isAssignableFrom(cls)){
            result = true;
        }else if(java.math.BigDecimal.class.isAssignableFrom(cls)){
            result = true;
        }else if(java.lang.Boolean.class.isAssignableFrom(cls)){
            result = true;
        } else if(java.util.Date.class.isAssignableFrom(cls)){
            result = true;
        }
        return result;
    }

    /**
     * 根据类型判断是否为普通属性并获取值
     * @param cls
     * @param value
     * @return
     */
    private static String judgeIsBaseType(Class<?> cls , Object value){
        String result = "";
        if(java.lang.String.class.isAssignableFrom(cls)){
            result = String.valueOf(value);
        } else if(java.lang.Integer.class.isAssignableFrom(cls)){
            result = String.valueOf(value);
        }else if(java.math.BigDecimal.class.isAssignableFrom(cls)){
            result = String.valueOf(value);
        }else if(java.lang.Boolean.class.isAssignableFrom(cls)){
            result = String.valueOf(value);
        } else if(java.util.Date.class.isAssignableFrom(cls)){
            Date dateValue = (Date)value;
            result = DateUtils.format(dateValue,"yyyy-MM-dd HH:mm:ss");
        }else {
            return null;
        }
        return result;
    }

    /**
     * 添加普通属性节点
     * @param t
     * @param method
     * @param element
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static boolean addBaseTypeElement(Object t, Method method, Element element) throws InvocationTargetException, IllegalAccessException {
        String value = "";
        Type type = method.getReturnType();
        Class<?> cls = (Class<?>)type;
        //1.2普通属性
        if(java.lang.String.class.isAssignableFrom(cls)){
            value = String.valueOf(method.invoke(t));
        } else if(java.lang.Integer.class.isAssignableFrom(cls)){
            value = String.valueOf(method.invoke(t));
        }else if(java.math.BigDecimal.class.isAssignableFrom(cls)){
            value = String.valueOf(method.invoke(t));
        }else if(java.lang.Boolean.class.isAssignableFrom(cls)){
            value = String.valueOf(method.invoke(t));
        } else if(java.util.Date.class.isAssignableFrom(cls)){
            Date dateValue = (Date)method.invoke(t);
            value = DateUtils.format(dateValue,"yyyy-MM-dd HH:mm:ss");
        }else {
            //非普通属性
            return false;
        }

        // 2.添加普通属性节点
        Element second3 = element.addElement(getFieldByMethod(method.getName()));
        if(StringUtils.isNotBlank(value) && !"null".equals(value)){
            second3.setText(value);
        }else {
            second3.setText("");
        }
        return true;
    }


    public static void main(String[] args){
      /*  Data data = new Data();
        Trade trade = new Trade();
        trade.setType("V");
        trade.setCurrency("RMB");
        trade.setID("10086");
        Card card = new Card();
        card.setPhone("18721976137");
        card.setIdType("身份证");
        card.setName("王万彬");
        card.setSign("99999999999");
        Men men1 = new Men();
        men1.setAge(15);
        men1.setFriend("周杰伦");
        Men men2 = new Men();
        men2.setAge(16);
        men2.setFriend("张学友");
        List<Men> list = new ArrayList<>();
        list.add(men1);
        list.add(men2);
        card.setMen(list);

        Map<String,Object> map = new HashMap<>();
        map.put("pic1","baautiful111");
        map.put("pic1", "baautiful222");
        Picture picture = new Picture();
        picture.setPictureName("国际油画");
        picture.setPicureeNum("有8幅");
        map.put("pictureMap", picture);

        card.setPicMap(map);
        data.setTrade(trade);
        data.setCard(card);

        beanToXml(data);*/
    }

    /**
     * 截取方法名
     * @param name
     * @return
     */
    private static String subMethodName(String name) {
        name = name.substring(name.lastIndexOf(".")+1);//最后的方法名
        return  name;
    }

    /**
     * 根据方法名获取字段名并大写
     * @param methodName
     * @return
     */
    private static String getFieldByMethod(String methodName){
        String name = methodName.substring(methodName.lastIndexOf(".")+1);//最后的方法名
        return name.substring(3).toUpperCase();
    }


    /**
     * 将Object类型的值，转换成bean对象属性里对应的类型值
     *
     * @param value Object对象值
     * @param fieldTypeClass 属性的类型
     * @return 转换后的值
     */
    private static Object convertValType(Object value, Class fieldTypeClass) {
        Object retVal = null;
        if(Long.class.getName().equals(fieldTypeClass.getName())
                || long.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Long.parseLong(value.toString());
        } else if(Integer.class.getName().equals(fieldTypeClass.getName())
                || int.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Integer.parseInt(value.toString());
        } else if(Float.class.getName().equals(fieldTypeClass.getName())
                || float.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Float.parseFloat(value.toString());
        } else if(Double.class.getName().equals(fieldTypeClass.getName())
                || double.class.getName().equals(fieldTypeClass.getName())) {
            retVal = Double.parseDouble(value.toString());
        } else {
            retVal = value;
        }
        return retVal;
    }

    /**
     * 获取指定字段名称查找在class中的对应的Field对象(包括查找父类)
     *
     * @param clazz 指定的class
     * @param fieldName 字段名称
     * @return Field对象
     */
    private static Field getClassField(Class clazz, String fieldName) {
        if( Object.class.getName().equals(clazz.getName())) {
            return null;
        }
        Field []declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }

        Class superClass = clazz.getSuperclass();
        if(superClass != null) {// 简单的递归一下
            return getClassField(superClass, fieldName);
        }
        return null;
    }

}
