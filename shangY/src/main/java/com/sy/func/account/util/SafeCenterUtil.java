package com.sy.func.account.util;

import com.sy.common.MessageBox;

/**
 * 安全中心工具类
 * <p>
 * Description:这里写描述<br />
 * </p>
 * 
 * @title SafeCenterUtil.java
 * @package com.cxdai.wx.account.util
 * @author ZHUCHEN
 * @version 0.1 2014年11月3日
 */
public class SafeCenterUtil {

	/**
	 * 修改登录密码时的验证
	 * <p>
	 * Description:6到12位，字母加数字
	 * </p>
	 * 
	 * @author ZHUCHEN
	 * @version 0.1 2014年11月3日
	 * @param pwd
	 * @return MessageBox
	 */
	public static MessageBox validatePassword(String pwd) {
		String reg1 = "[0-9a-zA-Z]{6,12}";// 6到12位
		String reg2 = "\\d+";// 全数字
		String newpwd = pwd;
		if (pwd == null) {
			return MessageBox.build("0", "新密码不可为空！");
		}
		if (!newpwd.matches(reg1)) {
			return MessageBox.build("0", "新密码长度不合法（6到12位）");
		}
		if (newpwd.matches(reg2)) {
			return MessageBox.build("0", "新密码不能是全数字");
		}
		return MessageBox.build("1", "验证通过");
	}

}