package com.sy.utils;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CSRFTokenManager {
	 /**
     * The token parameter name
     */
    static final String CSRF_PARAM_NAME = "CSRFToken";
    public static final String CSRF_PARAM_COUNTER="counter";
    /**
     * The location on the session which stores the token
     */
    public static final  String CSRF_TOKEN_FOR_SESSION_ATTR_NAME = CSRFTokenManager.class.getName() + ".tokenval";

    public static String getTokenForSession() {
    	HttpSession session=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
    			            .getRequest().getSession();
        String token = null;
   
        synchronized (session) {
            token = (String) session.getAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME);
            token = UUID.randomUUID().toString().replace("-", "");
            session.setAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME, token);
            
        }
        return token;
    }
    public static Integer getCounter() {
    	HttpSession session=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
    			            .getRequest().getSession();
        synchronized (session) {
        	Object object=session.getAttribute(CSRF_PARAM_COUNTER);
			if(object==null){
				session.setAttribute(CSRF_PARAM_COUNTER, 1);
			}else{
				session.setAttribute(CSRF_PARAM_COUNTER, (Integer)(object)+1);
			}    
        }
        return (Integer)session.getAttribute(CSRF_PARAM_COUNTER);
    }

    /**
     * Extracts the token value from the session
     * 
     * @param request
     * @return
     */
    public static String getTokenFromRequest(HttpServletRequest request) {
        return request.getParameter(CSRF_PARAM_NAME);
    }

    private CSRFTokenManager() { };
}
