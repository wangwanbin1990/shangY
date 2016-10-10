package com.sy.controller.rest.chinabank.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * XML通用类
 * 基于dom4j实现
 * @since 2013.01.15
 * @version 1.0.0_1
 * 
 */
public class XML {
    /**
     * XML格式数据解析为Map<String, String>
     * 
     * @param xmlData XML数据
     * @param unique 元素是否重名
     * @param charset 字符集
     * @return Map<String, String>
     * @throws Exception
     */
	public static Map<String, String> parse(String xmlData, boolean unique, String charset) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		
		InputStream is = new ByteArrayInputStream(xmlData.getBytes(charset));
		SAXReader sax = new SAXReader(false);
		Document document = sax.read(is);
		
		Element rootElement = document.getRootElement();
		map = parseElements(map, rootElement, unique ? null : rootElement.getName().toLowerCase());
		
		return map;
	}
	
	/**
     * XML节点元素数据解析为Map<String, String>
     * 
     * @param map 返回map
     * @param element 节点元素
     * @param name 节点元素名
     * @return Map<String, String>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	private static Map<String, String> parseElements(Map<String, String> map, Element element, String name) throws Exception {
		List<Element> elementList = element.elements();
		
		if(elementList.isEmpty())
		{
			map.put(StringUtils.isBlank(name) ? element.getName().toLowerCase() : name, element.getText());
		}
		else
		{
			for(Element _element : elementList)
			{
				map = parseElements(map, _element, StringUtils.isBlank(name) ? null : (name + "." +_element.getName().toLowerCase()));
			}
		}
		
		return map;
	}
	
	/**
     * 生成XML数据
     * 
     * @param rootName 根元素名
     * @param elements 元素数据
     * @param charset 字符集
     * @return XML数据
     * @throws Exception
     */
	public static String create(String rootName,  Map<String, String> elements, String charset) throws Exception {
		Document document = DocumentHelper.createDocument();
		document.setXMLEncoding(charset);
		Element rootElement = document.addElement(rootName);
		
		Set<Entry<String, String>> elementsSet = elements.entrySet();
		Iterator<Entry<String, String>> elementsIterator = elementsSet.iterator();
		while(elementsIterator.hasNext())
		{
			Entry<String, String> elementEntry = elementsIterator.next();
			String elementName = elementEntry.getKey();
			String elementValue = elementEntry.getValue();
			Element element = rootElement.addElement(elementName);
			element.addText(elementValue);
		}
		
		return document.asXML();
	}
	
	/**
     * 生成XML数据
     * 
     * @param rootName 根元素名
     * @param rootAttributes 根元素数据
     * @param elements 元素数据
     * @param charset 字符集
     * @return XML数据
     * @throws Exception
     */
	public static String create(String rootName,  Map<String, Object> rootAttributes, Map<String, List<Map<String, Object>>> elements, String charset) throws Exception {
		Document document = DocumentHelper.createDocument();
		document.setXMLEncoding(charset);
		Element rootElement = document.addElement(rootName);
		
		if(rootAttributes != null && !rootAttributes.isEmpty())
		{
			Set<Entry<String, Object>> rootAttributesSet = rootAttributes.entrySet();
			Iterator<Entry<String, Object>> rootAttributesIterator = rootAttributesSet.iterator();
			while(rootAttributesIterator.hasNext())
			{
				Entry<String, Object> rootAttributeEntry = rootAttributesIterator.next();
				rootElement.addAttribute(rootAttributeEntry.getKey(), rootAttributeEntry.getValue().toString());
			}
		}
		
		Set<Entry<String, List<Map<String, Object>>>> elementsSet = elements.entrySet();
		Iterator<Entry<String, List<Map<String, Object>>>> elementsIterator = elementsSet.iterator();
		while(elementsIterator.hasNext())
		{
			Entry<String, List<Map<String, Object>>> elementEntry = elementsIterator.next();
			String elementName = elementEntry.getKey();
			List<Map<String, Object>> elementAttributes = elementEntry.getValue();
			Element element = rootElement.addElement(elementName + "s");
			
			for(Map<String, Object> attributes : elementAttributes)
			{
				Element subElement = element.addElement(elementName);
				Set<Entry<String, Object>> attributesSet = attributes.entrySet();
				Iterator<Entry<String, Object>> attributesIterator = attributesSet.iterator();
				while(attributesIterator.hasNext())
				{
					Entry<String, Object> attributeEntry = attributesIterator.next();
					subElement.addAttribute(attributeEntry.getKey(), attributeEntry.getValue().toString());
				}
			}
		}
		
		return document.asXML();
	}
}