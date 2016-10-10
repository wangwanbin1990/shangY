package com.sy.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * <p>
 * Description:正则表达式<br />
 * </p>
 * @title RegResource.java
 * @package com.cxdai.utils 
 * @author yubin
 * @version 0.1 2015年9月21日
 */
public class RegResource {
	 
	 /**
	  * 
	  * <p>
	  * Description:验证邮箱号码<br />
	  * </p>
	  * @author yubin
	  * @version 0.1 2015年9月21日
	  * @param email
	  * @return
	  * boolean
	  */
	 public static boolean checkEmail(String email){
	  boolean flag = false;
	  try{
	    String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	    Pattern regex = Pattern.compile(check);
	    Matcher matcher = regex.matcher(email);
	    flag = matcher.matches();
	   }catch(Exception e){
	    flag = false;
	   }
	  return flag;
	 }

	 /**
	  * 
	  * <p>
	  * Description:验证手机号码<br />
	  * </p>
	  * @author yubin
	  * @version 0.1 2015年9月21日
	  * @param mobileNumber
	  * @return
	  * boolean
	  */
	 public static boolean checkMobileNumber(String mobileNumber){
	  boolean flag = false;
	  try{
	    Pattern regex = Pattern.compile("^0?(13|15|14|18|17)[0-9]{9}$");
	    Matcher matcher = regex.matcher(mobileNumber);
	    flag = matcher.matches();
	   }catch(Exception e){
	    flag = false;
	   }
	  return flag;
	 }
 
}
