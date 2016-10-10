package com.gcmobile.common;

/**
 * 微信基本常量
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title Constants.java
 * @package com.cxdai.bbs.base
 * @author ZHUCHEN
 * @version 0.1 2014年10月18日
 */
public class WxConstants {
	public static String default_enc = "UTF-8";
	/** 开发者id */
	public static String AppId = WxBase.AppId;
	/** 开发者密钥 */
	public static String AppSecret = WxBase.AppSecret;
	/** 公众平台上，开发者设置的token */
	public static String token = "cxdai_wx";
	/** 用于js验证的token */
	public static String encrypt_type_aes = "aes";
	/** 非aes 加密方式 */
	public static String encrypt_type_raw = "raw";
	/** 公众平台上，开发者设置的EncodingAESKey */
	public static String EncodingAESKey = WxBase.EncodingAESKey;
	/** 地图api key */
	public static String MAP_KEY = WxBase.MAP_KEY;
	/** 获取关注者 */
	public static String GETOPENID_URL = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
	/** 获取token */
	public static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	/* 获取js接口的钥匙 */
	public static String GET_JS_TICKET = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
	/** 菜单创建地址 */
	public static String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	/** 获取菜单详情地址 */
	public static String MENU_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	/** 菜单删除地址 */
	public static String MENU_DELETE_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	/** 得到用户详细信息地址 */
	public static String GET_USER_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
	/** 利用客户接口48小时内回复 */
	public static String PUSH_MESSAGE_BY_KEFU = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
	/** 微信消息类型 text */
	public static String MESSAGE_TYPE_TEXT = "text";
	/** 微信消息类型 事件 */
	public static String MESSAGE_TYPE_EVENT = "event";
	/** 微信消息类型 关注 */
	public static String EVENT_TYPE_SUBSCRIBE = "subscribe";
	/** 微信消息类型 取消关注 */
	public static String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
	/** 微信消息类型 地理位置 */
	public static String EVENT_TYPE_LOCATION = "LOCATION";
	/** 微信消息类型 click事件 */
	public static String EVENT_TYPE_CLICK = "CLICK";
	/** 微信消息类型 view跳转 */
	public static String EVENT_TYPE_VIEW = "view";
	/** 微信消息类型 图文消息 */
	public static String RESP_MESSAGE_TYPE_NEWS = "news";
	/** 新闻地址 */
	public static String WX_NEWS_URL = "http://mp.weixin.qq.com/s?__biz=";
	/** 主动推送地址 */
	public static String PUSH_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
	/** Oauto2.0验证地址 */
	public static String OAUTO2_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=0#wechat_redirect";
	/** 只获取openid */
	public static String ONLY_OPENID = "snsapi_base";
	/** 获取所有用户信息 */
	public static String MULTI_OPENID = "snsapi_userinfo";
	/** 更多openid */
	public static String NEXT_OPENID = "&next_openid=NEXT_OPENID";
	/** oauto2.0验证获取code */
	public static String CODE_ACCESSTOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

	/********************************************* 微信菜单click事件key ****************************************************/
	/** 资金详情 */
	public static String MONEYDETAIL = "moneydetail";
	/** 收益详情 */
	public static String COLLECTION_DETAIL = "collectiondetail";
	/** 投标详情 */
	public static String Tender_DETAIL = "tubiaodetail";
	/** 借款详情 */
	public static String NETVALUE_DETAIL = "netvalueinfo";
	/** 更多查询 */
	public static String MORESEARCH = "moresearch";
	/** 微博 */
	public static String WEIBO = "weibo";
	/** 电话 */
	public static String TEL = "tel";
	/** 在线客服 */
	public static String ONLINE_KEFU = "onlinekefu";
	/** 在线客服回复的type */
	public static String ONLINE_KEFU_TYPE = "transfer_customer_service";// 微信定义
	/** 地图api地址 */
	public static String SOSOMAP_URL = "http://apis.map.qq.com/ws/geocoder/v1/?location=LOCATION&key=KEY&get_poi=0";
	/********************************************* 微信关键字查询 *************************************************/
	/** 期权详情 */
	// public static String OPTIONS_KEY = "2";
	/** 加权待收详情 */
	// public static String COLLECTWEIGHT_KEY = "1";
	/** 最少投资额查询 */
	// public static String LEASTINVEST_KEY = "3";
	/** 推广人数查询 */
	// public static String PROMOT_KEY = "4";
	/** vip查询 */
	// public static String VIP_KEY = "5";
	/** 解除绑定 */
	public static String UNBIND_KEY = "6";
	// public static String UNBIND_KEY = "7";
	/** 取消消息推送 */
	public static String TDXXTS = "TDXXQT";
	/** 订阅消息推送 */
	public static String DYXXQT = "DYXXQT";
	/*********************************************** 微信返回结果码 *********************************************************/
	/** 服务器异常 */
	public static Integer WX_BUST = -1;
	/** 成功 */
	public static Integer WX_SUCCESS = 0;
	/** 错误的openid */
	public static Integer ERROR_OPENID = 40013;
	/** 没token */
	public static Integer NO_TOKEN = 41003;
	/** token失效 */
	public static Integer TOKEN_OUT = 41006;
	/** 需要关注 */
	public static Integer REQUIRE_SUBSCRIBE = 43004;
	/** 其他平台来源 */
	public static Integer WEIXINPLATFORM = 4;
	/** 安卓平台来源 */
	public static Integer ANDROIDPLATFORM = 1;
	/** ios平台来源 */
	public static Integer IOSPLATFORM = 2;

	/** 自动投标的自动类型 1：按抵押标、担保标投标，2：按净值标、信用标投标 */
	public static final String TENDER_TYPE_ONE = "1";
	public static final String TENDER_TYPE_TWO = "2";

	/** checkbox 是否选中 */
	public static final String IS_NOT_CHECKED = "0";
	public static final String IS_CHECKED = "1";
}
