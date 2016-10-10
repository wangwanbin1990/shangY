package com.gcmobile.common;

import com.gcmobile.utils.PropertiesUtil;


/**
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title WxBase.java
 * @package com.cxdai.wx.common
 * @author ZHUCHEN
 * @version 0.1 2014年12月1日
 */
public class WxBase {
	/******************************************** 官网主url ******************************************/
	public static String MAINURL = PropertiesUtil.getValue("portal_url");// 测试环境官网地址
	/******************************************** 论坛主url ******************************************/
	public static String BBSURL = "";// 测试环境论坛地址
	/******************************************** WX主url *******************************************/
	public static String WXMAINURL = PropertiesUtil.getValue("wx_url");// WX测试环境外网地址
	/** 开发者id */
	public static String AppId = PropertiesUtil.getValue("app_id");
	/** 开发者密钥 */
	public static String AppSecret = PropertiesUtil.getValue("app_secret");
	/** 地图api key */
	public static String MAP_KEY = PropertiesUtil.getValue("map_key");
	/** 地图api key */
	public static String EncodingAESKey = PropertiesUtil.getValue("encoding_aes_key");
	/** 微信主url */
	public static String weixinplatformUrl = PropertiesUtil.getValue("wx_platform_url");
	/** 安卓端url */
	public static String androidplatformUrl = PropertiesUtil.getValue("android_platform_url");
	/** ios端url */
	public static String iosplatformUrl = PropertiesUtil.getValue("ios_platform_url");

	/** 支付userID前缀 */
	public static String USERID_PRE = PropertiesUtil.getValue("USERID_PRE");
}
