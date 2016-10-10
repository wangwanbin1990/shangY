	package com.sy.sign.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.AccessControlFilter;

import com.sy.utils.RSAUtils;

public class StatelessAuthcFilter extends AccessControlFilter {

	public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		return onAccessDenied(request, response, mappedValue);
	}
	
	protected boolean isAccessAllowed(ServletRequest arg0,ServletResponse arg1, Object arg2) throws Exception {
		return false;
	}

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
    	 
        //1、客户端生成的消息摘要
       String clientDigest = request.getParameter("sign");
    	 //String clientDigest="checkCodelogpassword1saveid1tokenusername18611761973";

        //2、客户端请求的参数列表
        Map<String, String> paramMap = getParameterMap(request);
        paramMap.remove("sign");

        String[] keyArray = paramMap.keySet().toArray(new String[0]);  
        Arrays.sort(keyArray);  
          
        // 拼接有序的参数名-值串  
        StringBuilder stringBuilder = new StringBuilder();  
  
        for (String key : keyArray)  
        {  
            stringBuilder.append(key).append(paramMap.get(key));  
        }  
        String codes = stringBuilder.toString(); 
       String sign = RSAUtils.sign(codes.getBytes(), getPriKey());
        
       boolean b = RSAUtils.verify(codes.getBytes(),getPubKey() , clientDigest);
        if(!b){
        	 onLoginFail(response); //6、验证签名失败
             return false;
        }

        return true;
    }

    //验证签名失败时默认返回401状态码
    private void onLoginFail(ServletResponse response) throws IOException {
     	response.setContentType("text/json; charset=UTF-8"); 
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        httpResponse.getWriter().write("{'msg':'访问服务未经授权'}");
        
    }
    
    @SuppressWarnings("unchecked")
    public  Map<String,String > getParameterMap(ServletRequest request) {
        // 参数Map
        Map properties = request.getParameterMap();
        // 返回值Map
        Map returnMap = new HashMap();
        Iterator entries = properties.entrySet().iterator();
        Map.Entry entry;
        String name = "";
        String value = "";
        while (entries.hasNext()) {
            entry = (Map.Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObj = entry.getValue();
            if(null == valueObj){
                value = "";
            }else if(valueObj instanceof String[]){
                String[] values = (String[])valueObj;
                for(int i=0;i<values.length;i++){
                    value = values[i] + ",";
                }
                value = value.substring(0, value.length()-1);
            }else{
                value = valueObj.toString();
            }
            returnMap.put(name, value);
        }
        return returnMap;
    }

    
    private String getPubKey(){ 	
       return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDMz9sFEsSZ2igv4yMVw12bQ71OGb/mVOmIMuHcZdDG/d5ASN/quxCQdCoyJ7+SCIjCeyM2dYUYYGvyAKWWXOQmWX3i1/wkWXvj3NO0Q0BEnV7e2/zY1VaGs89OMEEaoIl1MYl0YzILsHWuJenvaok64D53pjOVaNui/oFmsdQ1rwIDAQAB";
    }
    
    private String getPriKey(){ 	
        return "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMzP2wUSxJnaKC/jIxXDXZtDvU4Zv+ZU6Ygy4dxl0Mb93kBI3+q7EJB0KjInv5IIiMJ7IzZ1hRhga/IApZ"+
        		"Zc5CZZfeLX/CRZe+Pc07RDQESdXt7b/NjVVoazz04wQRqgiXUxiXRjMguwda4l6e9qiTrgPnemM5Vo26L+gWax1DWvAgMBAAECgYAILn13VGqaIsbcMtyh7+37V9dmGU07"+
        		"LEUv9ahkH4UZjeak9sRLIjHlM17EJiZW9RRRgI3FjShF8wQc5L24pflPJJReA0JIsAwjT74R+tGq5zN9+T44huAgTo2qwyCHOciWghlxAkaw/RmuWTO6qZPA0z7hPJ4XVD"+
        		"Wcqdh1HP0RwQJBAOeyH+fGwkgwayYZmZ8ReZId/yHyV5LFHaba5oMlh+T7hClcNfT0l7A6WIfwTgVQiE3MAKxsJ2wqVtxi3DUjdn8CQQDiS80k+7IF3v5Ml+gY+Nfd170K"+
        		"AoJThMc/nBMc2Nl/iG/jnDgBJEvt+nWapJI1dkMyD3Wn5rnWqP+F8g2Sk4jRAkBni/K4Wdqv+nuYbm56aYvkYmWIXU8H9/IVhNTqHZbLHiDlfyFaFQnJp3mzXxDvTRttcV"+
        		"OHu1ou/AkPu1rgoLWvAkEAx8N8c8JQc8hXGkwa0jiRbr9snDJ807dpoGhpotR2o5NQmk+kTLW65XhsargObW1Zgg6NoUsXEDydXKPBgXwFkQJATVfWqNhZ7bNuFgxWx6xD"+
        		"INNRmRczbcSiO0wUA+afZEJK4dBBFjPVAmc74enPayMBQSd8Lrc/fYOXCKQxja4mxw==";
     }

}
