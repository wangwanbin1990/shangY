package com.sy.tags;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.shiro.SecurityUtils;

import com.sy.common.Dictionary;
import com.sy.security.ShiroUser;
import com.mysql.jdbc.StringUtils;

/**
 * 微信自定义el表达式<br />
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title WxTag.java
 * @package com.cxdai.wx.tag
 * @author ZHUCHEN
 * @version 0.1 2014年10月30日
 */
public class WxEL {

    public static String toDate(String value, String pattern) {
        if (StringUtils.isNullOrEmpty(value))
            return "";
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(Long.parseLong(value));
        return new SimpleDateFormat(pattern).format(c.getTime());
    }

    public static String desc(String type, String name) {
        return Dictionary.getValue(type, name);
    }

    public static ShiroUser currentUser() {
        return (ShiroUser) SecurityUtils.getSubject().getPrincipal();
    }
}
