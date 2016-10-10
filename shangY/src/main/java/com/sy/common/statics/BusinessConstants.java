package com.sy.common.statics;

import com.sy.utils.PropertiesUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * <p>
 * Description:业务常量类<br />
 * </p>
 * 
 * @title BusinessConstants.java
 * @package com.cxdai.portal.statics
 * @author justin.xu
 * @version 0.1 2014年4月18日
 */
public interface BusinessConstants {

	/********************* 平台来源（PLATFORM 1：官网 2、微信） *************************/
	public static Integer MEMBER_OPERATE_ON_PORTAL = Integer.valueOf("1");
	public static Integer MEMBER_OPERATE_ON_WX = Integer.valueOf("2");
	/**********************************************/
	/** 认证修改记录日志 修改类型（1、邮箱 2、手机 3、实名认证） begin */
	public Integer APPRO_MODIFY_LOG_TYPE_EMAIL = Integer.valueOf(1);
	public Integer APPRO_MODIFY_LOG_TYPE_MOBILE = Integer.valueOf(2);
	public Integer APPRO_MODIFY_LOG_TYPE_REALNAME = Integer.valueOf(3);
	/** 认证修改记录日志 修改类型（1、邮箱 2、手机） end */

	/******************** 首页链接地址开始 ******************************/
	public static String TOP_HOME_ADDRESS = new String("home/index.html");// 系统首页地址

	/******************* 积分规则， 登陆积分：3 begin *********************/
	public Integer POINTS_RULE_LOGIN = 3;

	/******************* 积分规则， 登陆积分：3 end *********************/
	/******************* 当前用户身份 0：正式身份 -1：游客身份 begin *************/
	public Integer VISITOR_OFFICIAL = 0;
	public Integer VISITOR_TOURIST = -1;
	public String VISITOR_UNAUTHERIZED = "Unautherized";
	public String VISITOR_AUTHERIZED = "autherized";
	/*********************************************************************/

	/******************** 文件水印图片 ***************************************/
	public String WATERMARK_PNG = new String("/images/watermark.png");
	public static String BORROW_UPLOAD_FILE_PATH = new String("/image/uploaddoc/");
	public static String CHANGE_BANK_FILE_PATH = new String("/image/changebank/");
	/******************** 上传身份证位置开始 ***************************************/
	public static String UPLOAD_FILE_PATH = new String("uploadFile");
	/******************** 上传身份证位置结束 ***************************************/

	/******************** 上传头像位置开始 ***************************************/
	public static String HEADIMG_UPLOAD_FILE_PATH = new String("image/headimg");
	/******************** 上传头像证位置结束 ***************************************/

	/********************* 图片上传文件大小 (单位：M) ,比如说身份证 ********************/
	public Long IMAGE_MAX_SIZE = 1l;

	/********************* 图片上传文件支持的类型 ，比如说身份证 ********************/
	public String[] IMAGE_FILE_TYPE_LIST = new String[] { ".jpg", ".jpeg", ".gif", ".png" };

	/********************* 认证扣款开始 *****************************************/
	public BigDecimal VIP_MONEY = new BigDecimal(10);
	public BigDecimal APPRO_PASS_MONEY = new BigDecimal(10);
	/********************* 认证扣款结束 *****************************************/

	/********************* VIP认证增加信用积分 20分 begin *************************/
	public Integer VIP_CREDIT_INTEGRAL = 20;
	/** VIP认证增加信用积分 20分 end */

	public String MOBILE_APPRO_RESET_FUNCTION = "MOBILE_APPRO_RESET"; // 手机认证
	/********************* 缓存验证码功能列表名称 begin ****************************/
	public String MOBILE_APPRO_FUNCTION = "MOBILE_APPRO"; // 手机认证
	public String BANK_INFO_MODIFY_FUNCTION = "BANK_INFO_MODIFY";// 银行卡修改
	public String MOBILE_FINANCING = "MOBILE_FIANNCING"; // 快速融资
	public String MOBILE_CODE_LOGIN = "MOBILE_CODE_LOGIN"; // 验证码登录
	public String HAND_APPRO_AUTHENTICATION = "HAND_APPRO"; // 人工实名认证
	/********************* 缓存验证码功能列表名称 end *******************************/

	/************************ 短信类型设置 开始 *****************************************/
	public static int SMS_TEMPLATE_TYPE_REGISTER_SUCCESS = 1;// 注册成功
	public static int SMS_TEMPLATE_TYPE_MODIFY_LOGINPASSWORD_REQUEST = 2;// 修改登陆密码
	public static int SMS_TEMPLATE_TYPE_MODIFY_LOGINPASSWORD_SUCCESS = 3;// 修改登陆密码成功
	public static int SMS_TEMPLATE_TYPE_MODIFY_PAYPASSWORD_REQUEST = 4;// 修改交易密码
	public static int SMS_TEMPLATE_TYPE_MODIFY_PAYPASSWORD_SUCCESS = 5;// 修改交易密码成功
	public static int SMS_TEMPLATE_TYPE_MODIFY_MOBILE_REQUEST = 6;// 修改手机号
	public static int SMS_TEMPLATE_TYPE_MODIFY_MOBILE_SUCCESS = 7;// 修改手机号码成功
	public static int SMS_TEMPLATE_TYPE_MODIFY_BANKNO_REQUEST = 8;// 修改银行账号
	public static int SMS_TEMPLATE_TYPE_MODIFY_BANKNO_SUCCESS = 9;// 修改提现银行卡成功
	public static int SMS_TEMPLATE_TYPE_AUTO_INVEST_SUCCESS = 10;// 自动投标成功
	public static int SMS_TEMPLATE_TYPE_COLLECTION = 11;// 标的到期回款
	public static int SMS_TEMPLATE_TYPE_RESET_LOGINPASSWORD_REQUEST = 12;// 重置登陆密码成功
	public static int SMS_TEMPLATE_TYPE_RESET_PAYPASSWORD_SUCCESS = 13;// 重置交易密码成功
	public static int SMS_TEMPLATE_TYPE_FIND_PASSWORD = 14;// 找回密码
	public static int SMS_TEMPLATE_TYPE_REGIST_MOBILE_CODE = 15;// 注册手机认证
	public static int SMS_TEMPLATE_TYPE_VERIFY_MOBILE_CODE = 16;// 解除绑定验证码
	public static int SMS_TEMPLATE_TYPE_VERIFYSUCCESS_MOBILE_CODE = 17;// 解除绑定成功
	public static int SMS_TEMPLATE_TYPE_ADD_BANKCARD_CODE = 18;// 添加银行卡验证码
	public static int SMS_TEMPLATE_TYPE_ADD_BANKCARD_SUCCESS = 19;// 添加银行卡成功
	public static int SMS_TEMPLATE_TYPE_BIND_WX_CODE = 201;
	public static int SMS_TEMPLATE_TYPE_BIND_WX_SUCCESS = 202;
	public static int SMS_TEMPLATE_TYPE_WX_SAFECENTER_MOBILEVALIDATE = 203;
	public static Integer SMS_TEMPLATE_TYPE_GT_ADVERTISEMENT_REGIST = 303;// 高铁广告推广注册
	public static Integer SMS_TEMPLATE_TYPE_GT_ADVERTISEMENT_REGIST_SUCCESS = 304;// 高铁广告推广注册成功
	public static int SMS_TEMPLATE_TYPE_QUCIKFINANCING=600;//快速融资
	public static int SMS_TEMPLATE_TYPE_LOGIN_MOBILE_CODE = 404;// 登录验证码
	public static int SMS_TEMPLATE_TYPE_HAND_REALNAME_APPROVE = 407;// 人工实名认证
	/************************ 短信类型设置 开始 *****************************************/

	/************************ 短信发送状态设置 开始 *****************************************/
	public static int SMS_SEND_STATUS_WAIT = 0;// 等待发送
	/************************ 短信发送状态设置 开始 *****************************************/

	/************************** 初始化用户角色id,开始 *********************************************/
	public static String[] initRoleArray = { "1" };

	/************************** 初始化用户角色id结束 *********************************************/

	/************************ 日均待收范围设置 开始 *****************************************/
	public static int DAY_INTERST_LENGTH = 180; // 180天
	/************************ 日均待收范围设置 开始 *****************************************/

	/************************* 会员等级 开始 **********************************************/
	public static String MEMBER_LEVEL_NULL = "0";
	public static String MEMBER_LEVEL_MONEY_GOLD = "20000";
	public static String MEMBER_LEVEL_GOLD = "10";
	public static String MEMBER_LEVEL_MONEY_PLATINUM = "100000";
	public static String MEMBER_LEVEL_PLATINUM = "20";
	public static String MEMBER_LEVEL_MONEY_DIAMOND = "200000";
	public static String MEMBER_LEVEL_DIAMOND = "30";
	public static String MEMBER_LEVEL_MONEY_CROWN = "500000";
	public static String MEMBER_LEVEL_CROWN = "40";
	public static String MEMBER_LEVEL_MONEY_GOLD_CROWN = "1000000";
	public static String MEMBER_LEVEL_GOLD_CROWN = "50";

	public static String MEMBER_LEVEL_GOLD_CROWN_DATE = "2013-09-26";
	public static String MEMBER_LEVEL_GOLD_CROWN_DATE_TWO = "2013-09-25";

	/** 用户等级钱区间定义，区间0-20000,实际为0-(20000-1),对应的等级为0,如果为20000,等级为10 */
	public String[] MEMBER_LEVEL_MONEY_RANGE = { "0-20000", "20000-100000", "100000-200000", "200000-500000", "500000-1000000", "1000000" };
	/** 区间对应的用户等级集合 */
	public String[] MEMBER_LEVEL_RANGE = { "0", "10", "20", "30", "40", "50" };

	/************************* 会员等级 结束 **********************************************/

	/**** 罚息计算比率， 罚息比率一，罚息比率二 begin *****************************************/
	public BigDecimal LATE_INTEREST_RATE_ONE = new BigDecimal(0.001); // 罚息比率一
	public BigDecimal LATE_INTEREST_RATE_TWO = new BigDecimal(0.002); // 罚息比率二
	/**** 罚息计算比率 全部罚息比率，部份罚息比率 begin *****************************************/

	/*********************** 账户详情相关操作设置 开始 ***************************************/
	public static String ACCOUNT_DETAIL_TOPUP = "topup"; // 充值
	public static String ACCOUNT_DETAIL_TOPUP_RECORD = "topuprecord";// 充值记录
	public static String ACCOUNT_DETAIL_GET_CASH = "getcash";// 提现
	public static String ACCOUNT_DETAIL_GET_CASH_RECORD = "getcashrecord";// 提现记录
	public static String ACCOUNT_DETAIL_BANK_CARD_MANAGE = "bankcardmanage";// 银行卡管理
	/************************ 账户详情相关操作设置 结束 *****************************************/

	/*********************** 盛付通在线支付相关信息 开始 ***************************************/
	public static String ONLINE_PAY_SHENGPAY_NAME = "B2CPayment"; // 版本名称
	public static String ONLINE_PAY_SHENGPAY_VERSION = "V4.1.1.1.1"; // 版本号
	public static String ONLINE_PAY_SHENGPAY_CHARSET = "UTF-8"; // 字符集,支持GBK、UTF-8、GB2312,默认属性值为:UTF-8
	public static String ONLINE_PAY_SHENGPAY_MSGSENDER = "100894"; // 发送方标识（正式帐号：306631,测试帐号：100894）
	// // 商户前台通知地址(frontMerUrl)
	public static String ONLINE_PAY_SHENGPAY_FRONTMERURL = "https://www.chengxindai.com/account/topup/shengpay/recevie.html";
	// // 商户后台通知地址(backgroundMerUrl)
	public static String ONLINE_PAY_SHENGPAY_BACKGROUNDMERURL = "https://www.chengxindai.com/account/topup/shengpay/autoRecevie.html";
	public static String ONLINE_PAY_SHENGPAY_SIGNTYPE = "MD5"; // 签名类型
	public static String ONLINE_PAY_SHENGPAY_KEY = "shengfutongSHENGFUTONGtest"; // 商户密钥（正式帐号：gcjr0000077253,测试帐号：shengfutongSHENGFUTONGtest;）
	public String ONLINE_PAY_SHENGPAY_PAYCHANNEL_DEBIT_CARD = "19"; // 支付渠道,储蓄卡：19
	/************************ 在线支付相关信息 结束 *****************************************/

	/*********************** 新浪支付相关信息 开始 ***************************************/
	public static String ONLINE_PAY_SINAPAY_CHARSET = "1"; // 字符集,1代表UTF-8;2代表GBK;3代表GB2312默认值为1
	public static String ONLINE_PAY_SINAPAY_BGURL = new String("http://www.gcjr.com/autoreceive/sinapay.html"); // 服务器接受支付结果的后台
	public static String ONLINE_PAY_SINAPAY_FRONTURL = new String("http://www.gcjr.com/account/topup/sinapay/recevie.html"); // 支付成功跳转的页面
	public static String ONLINE_PAY_SINAPAY_VERSION = "v2.3"; // 版本号
	public static String ONLINE_PAY_SINAPAY_LANGUAGE = "1"; // 语言
	public static String ONLINE_PAY_SINAPAY_SIGNTYPE = "4"; // 签名类型 1:MD5, 4:PKI
	// 发送方标识正式帐号： 200100100120000666880600001,测试帐号：200100100120000373358401101
	public static String ONLINE_PAY_SINAPAY_MERCHANT_ACCT_ID = new String("200100100120000666880600001");
	// 正式帐号：200006668806测试帐号：200003733584
	public static String ONLINE_PAY_SINAPAY_MEMBER_ID = new String("200006668806");
	// 正式环境：https://gate.pay.sina.com.cn/acquire-order-channel/gateway/receiveOrderLoading.htm
	// 测试环境：https://testgate.pay.sina.com.cn/acquire-order-channel/gateway/receiveOrderLoading.htm
	public static String ONLINE_PAY_SINAPAY_ACTIONURL = new String("https://gate.pay.sina.com.cn/acquire-order-channel/gateway/receiveOrderLoading.htm");
	public static String ONLINE_PAY_SINAPAY_QUERY_VERSION = "weibopay_query_api_1"; // 查询接口版本
	// 对账查询正式环境：https://gate.pay.sina.com.cn/acquire-order-channel/gateway/receiveQuery.htm
	// 对账查询测试环境：https://testgate.pay.sina.com.cn/acquire-order-channel/gateway/receiveQuery.htm
	public static String ONLINE_PAY_SINAPAY_QUERY_ACTIONURL = new String("https://gate.pay.sina.com.cn/acquire-order-channel/gateway/receiveQuery.htm");

	/************************ 新浪支付相关信息 结束 *****************************************/

	/*********************** 连连支付相关信息 开始 ***************************************/
	// 服务器接受支付结果的后台生产环境http://www.gcjr.com/account/topup/lianlianpay/autoRecevie.html测试环境http://www.gcjr.com.cn/cxdai_portal/account/topup/lianlianpay/autoRecevie.html
	public static String ONLINE_PAY_LIANLIANPAY_BGURL = new String("http://www.gcjr.com/autoreceive/lianlianpay.html"); // 服务器接受支付结果的后台
	// 支付成功跳转的页面https://www.gcjr.com/account/topup/lianlianpay/recevie.html测试环境http://www.gcjr.com.cn/cxdai_portal/account/topup/lianlianpay/recevie.html
	public static String ONLINE_PAY_LIANLIANPAY_FRONTURL = new String("http://www.gcjr.com/account/topup/lianlianpay/recevie.html"); // 支付成功跳转的页面
	public static String ONLINE_PAY_LIANLIANPAY_VERSION = "1.0"; // 版本号
	public static String ONLINE_PAY_LIANLIANPAY_SIGNTYPE = "RSA"; // 签名类型RSA或者MD5
	// 业务类型，连连支付根据商户业务为商户开设的业务类型； （101001：虚拟商品销售、109001：实物商品销售、108001：外部账户充值）
	public static String ONLINE_PAY_LIANLIANPAY_BUSI_PARTNER = "101001";
	// 发送方标识正式帐号：201411031000082502 ,测试帐号：201408071000001546 201408071000001540
	// 201408071000001543 201408071000001541
	public static String ONLINE_PAY_LIANLIANPAY_OID_PARTNER = new String("201411031000082502");

	public static String ONLINE_PAY_LIANLIANPAY_FORMAT_USER_ID = new String("8888");
	// 公钥
	public static String ONLINE_PAY_LIANLIANPAY_PUB_KEY = new String(
			"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSS/DiwdCf/aZsxxcacDnooGph3d2JOj5GXWi+q3gznZauZjkNP8SKl3J2liP0O6rU/Y/29+IUe+GTMhMOFJuZm1htAtKiu5ekW0GlBMWxf4FPkYlQkPE0FtaoMP3gYfh+OwI+fIRrpW3ySn3mScnc6Z700nU/VYrRkfcSCbSnRwIDAQAB");
	public static String ONLINE_PAY_LIANLIANPAY_ACTIONURL = new String("https://yintong.com.cn/payment/bankgateway.htm");
	// 私钥路径 lianlianpay/private_key.txt测试：lianlianpay/test_private_key.key
	public static String ONLINE_PAY_LIANLIANPAY_RPIVATE_KEY = new String("lianlianpay/private_key.txt");
	// 补单查询路径
	public static String ONLINE_PAY_LIANLIANPAY_LOSEACTION_URL = new String("https://yintong.com.cn/traderapi/orderquery.htm");
	/************************ 连连支付相关信息 结束 *****************************************/

	/************************ 连连支付手机支付相关信息 开始 ***********************************/
	// 银行卡卡BIN查询接口路径 测试：https://test.yintong.com.cn/traderapi/bankcardquery.htm
	// 正式：https://yintong.com.cn/traderapi/bankcardquery.htm
	public static String ONLINE_PAY_LLWAP_VERSION = "1.0"; // 版本号
	public static String ONLINE_PAY_LLWAP_APP_REQUEST = "3";// 1-Android,2-ios,3-wap
	public static String ONLINE_PAY_LLWAP_CARD_QUERY_URL = PropertiesUtil.getValue("ONLINE_PAY_LLWAP_CARD_QUERY_URL");//银行卡查询接口
	public static String ONLINE_PAY_LLWAP_CARD_UNBIND_URL = PropertiesUtil.getValue("ONLINE_PAY_LLWAP_CARD_UNBIND_URL");// 银行卡解约API接口
//	public static String ONLINE_PAY_LLWAP_BGURL = new String("http://m.gcjr.com/autoreceive/lianlianpay"); // 服务器接受支付结果的后台
//	public static String ONLINE_PAY_LLWAP_BGURL = new String("http://testpay.gcjr.com/app_service/autoreceive/lianlianpay"); // 服务器接受支付结果的后台
	public static String ONLINE_PAY_LLWAP_BGURL = PropertiesUtil.getValue("ONLINE_PAY_LLWAP_BGURL"); // 服务器接受支付结果的后台（支付）
	public static String ONLINE_PAY_LLWAP_BIND_BGURL = PropertiesUtil.getValue("ONLINE_PAY_LLWAP_BIND_BGURL");// 服务器接受支付结果的后台（绑定）
	public static String ONLINE_PAY_LLWAP_FRONTURL_PREFIX_M = new String("http://m.zgzlc.com.cn"); // 异步通知地址 M版
	public static String ONLINE_PAY_LLWAP_FRONTURL_PREFIX_IOS = new String("http://ios.zgzlc.com.cn"); // 异步通知地址ios
	public static String ONLINE_PAY_LLWAP_FRONTURL_PREFIX_ANDROID = new String("http://android.zgzlc.com.cn"); // 异步通知地址android
	public static String ONLINE_PAY_LLWAP_FRONTURL = new String("/account"); // 支付成功跳转的页面
	public static String ONLINE_PAY_LLWAP_FRONTURL_ADVERTISED = new String("/advertised/awardrecharge/success"); // 支付成功跳转的页面
	public static String ONLINE_PAY_LLWAP_ACTIONURL = new String("https://yintong.com.cn/llpayh5/authpay.htm");// 支付请求url

	/***************************源生版app回调地址***********************/
	String ONLINE_PAY_LLWAP_CHARGE_FRONTURL_PREFIX_ANDROID =  PropertiesUtil.getValue("ONLINE_PAY_LLWAP_CHARGE_FRONTURL_PREFIX_ANDROID");//连连支付安卓充值回调
	String ONLINE_PAY_LLWAP_CHARGE_FRONTURL_PREFIX_IOS =  PropertiesUtil.getValue("ONLINE_PAY_LLWAP_CHARGE_FRONTURL_PREFIX_IOS");//连连支付IOS充值回调

	String ONLINE_PAY_LLWAP_BIND_FRONTURL_PREFIX_ANDROID =  PropertiesUtil.getValue("ONLINE_PAY_LLWAP_BIND_FRONTURL_PREFIX_ANDROID");//连连支付安卓绑卡回调
	String ONLINE_PAY_LLWAP_BIND_FRONTURL_PREFIX_IOS =  PropertiesUtil.getValue("ONLINE_PAY_LLWAP_BIND_FRONTURL_PREFIX_IOS");//连连支付IOS绑卡回调
	/************************ 连连支付手机支付相关信息 结束 ***********************************/

	/*********************** 网银在线支付相关信息 开始 ***************************************/
	String ONLINE_PAY_CHINABANK_MERCHANT = new String("110207037002"); // 公司在网银在线平台开通的商户号(新账号)
	String ONLINE_PAY_CHINABANK_MD5KEY = new String("HpGppPgfm18FopRGDdwazQIL6JEfG2Ta");// 公司在网银在线平台设置的MD5
	String ONLINE_PAY_CHINABANK_DESKEY = new String("trz7qMscyFGSPiwjx8EjtZTpm0loGSyF");// 公司在网银在线平台设置的DES
	String ONLINE_PAY_CHINABANK_VERSION = new String("1.0.0");// 网银在线接口的版本号
	String ONLINE_PAY_CHINABANK_TERMINAL = new String("00000001");// 公司在网银在线平台设置的终端号
	String ONLINE_PAY_CHINABANK_CHARSET = new String("UTF-8");// 编码方式
	String ONLINE_PAY_CHINABANK_URL = new String("https://quick.chinabank.com.cn/express.htm");// 公司在网银在线平台签约协议地址
	String ONLINE_PAY_CHINABANK_RECEIVE_URL_ANDROID = PropertiesUtil.getValue("ONLINE_PAY_CHINABANK_RECEIVE_URL_ANDROID");// 网银在线异步回调地址ANDROID
	String ONLINE_PAY_CHINABANK_RECEIVE_URL_IOS = PropertiesUtil.getValue("ONLINE_PAY_CHINABANK_RECEIVE_URL_IOS");// 网银在线异步回调地址ANDROID
	String ONLINE_PAY_CHINABANK_RECEIVE_URL_M = PropertiesUtil.getValue("ONLINE_PAY_CHINABANK_RECEIVE_URL_M");// 网银在线异步回调地址ANDROID
	String ONLINE_PAY_CHINABANK_RETURN_CODE_SUCCESS = "0000";//返回码-成功
	String ONLINE_PAY_CHINABANK_RETURN_CODE_ACTIVECODE_ERROR = "EES0027";//返回码-验证码不正确
	String ONLINE_PAY_CHINABANK_STATUS_SUCCESS = "0";//状态-成功
	String ONLINE_PAY_CHINABANK_STATUS_MONEYBACK = "3";//状态-退款
	String ONLINE_PAY_CHINABANK_STATUS_PARTBACK = "4";//状态-部分退款
	String ONLINE_PAY_CHINABANK_STATUS_DEALING = "6";//状态-处理中
	String ONLINE_PAY_CHINABANK_STATUS_FAILED = "7";//状态-失败
	String CHINABANK_MONEY_TYPE = "CNY";// 币种
	/*********************** 网银在线支付相关信息 结束 ***************************************/

	/********************** 支付宝支付相关信息开始 *******************************************/
	public static String ALIPAY_BANK_USERNAME = "王建章";
	public static String ALIPAY_PAYMENT = "支付宝充值账号";
	public static String ALIPAY_CARDNUM = "44461248@qq.com";
	/********************** 支付宝支付相关信息结束 *******************************************/

	public String ONLINE_PAY_CURRENCYTYPE = "156"; // 币种(currencyType),目前只能为：156(人民币)

	/*********************** 充值种类设置 开始 ***************************************/
	public static int RECHARGE_TYPE_ONLINE = 1;// 在线充值
	public static int RECHARGE_TYPE_OFFLINE = 2;// 线下充值
	/************************ 充值种类设置 结束 *****************************************/

	/*********************** 充值状态设置 开始 ***************************************/
	public static int RECHARGE_STATUS_APPROVING = 0;// 充值审核中
	public static int RECHARGE_STATUS_SUCCESS = 1;// 充值成功
	public static int RECHARGE_STATUS_FAILURE = 9;// 充值失败
	public static int RECHARGE_STATUS_ONLINE_WAIT = 2;// 在线充值待付款

	/************************ 充值状态设置 结束 *****************************************/

	/*********** 默认分页条数 *****************************/
	public Integer DEFAULT_PAGE_SIZE = 10;

	/****/
	/** 格式化数字,保留两位小数，以，进行分隔符千位 */
	public static DecimalFormat decimalDf = new DecimalFormat("#,#00.00");
	public static DecimalFormat decimalPercentDf = new DecimalFormat("#,##0.00");
	/** 格式化数字,保留两位小数，以，进行分隔符千位 */
	public static DecimalFormat numberDf = new DecimalFormat("#,##0");

	/******************** 系统中处理金额的小数位数 开始 ******************************/
	public static int CALCULATOR_MONEY_NUM = 2; // 系统中处理金额的小数位数
	/******************** 系统中处理金额的小数位数 结束 ******************************/
	/********************* 锁定记录 ****************************/
	public static String LOCKED_RECORD_YES = "yes";

	/******************** 可以可几个月申请提前解锁 **********************************/
	public Integer FIRST_UNLOCK_AFTER_MONTH = 6;

	public static final String BORROW_STATUS_1 = "新标,审核中";
	public static final String BORROW_STATUS_2 = "投标中";
	public static final String BORROW_STATUS_3 = "满标复审中";
	public static final String BORROW_STATUS_4 = "还款中";
	public static final String BORROW_STATUS_5 = "还款结束";
	public static final String BORROW_STATUS_n1 = "流标";
	public static final String BORROW_STATUS_n2 = "被撤销";
	public static final String BORROW_STATUS_n3 = "审核失败";

	/********************** 操作成功 ********************************************/
	public String SUCCESS = "success";
	public String FAILURE = "failurre";
    public static final String DISABLE="DISABLE";
    public static final String ENABLE="ENABLE";
	/************************ 异常错误页面 add by hujianpan **********************/
	public String NO_PAGE_FOUND_404 = "/common/404";
	public String NO_POW_ACCES_403 = "/common/403";
	public String ERROR_IN_APP = "/common/500";
	public String ERROR = "/common/404";

	/******************************* END *****************************************/
	/**************************************************************************/
	public static String COLLECTION_TYPE_FIST = "1";// 直通车待收
	public static String COLLECTION_TYPE_COMMON = "0";// 普通待收
	/**************************************************************************/

	/****************************** begin 查询时间差额 ****************************/
	public static Integer BEGINDATE_ENDDATE_RANGE = 30;
	/****************************** end 查询时间差额 ******************************/
	/************************ 逾期利率 *****************************************/
	public static String OUT_OF_DAYE_RATE = "0.002";
	/************************ 逾期利率 *****************************************/

	/************************ 我的帐号左边导航菜单名称定义开始 ******************************/
	/*********************** 资金管理 ************************************************/
	public static String ACCOUNT_FIRST_MENU = "ACCOUNT_FIRST_MENU"; // 一级菜单
	public static String ACCOUNT_SECOND_MENU = "ACCOUNT_SECOND_MENU"; // 二级菜单

	public static String LEFT_MENU_ZJ = "LEFT_MENU_ZJ";
	public static String LEFT_MENU_ZJ_TAKE_CASH = "LEFT_MENU_ZJ_TAKE_CASH"; // 提现
	public static String LEFT_MENU_ZJ_TOPUP = "LEFT_MENU_ZJ_TOPUP"; // 充值

	public static String LEFT_MENU_RZ = "LEFT_MENU_RZ";
	public static String LEFT_MENU_RZ_REPAYMENT = "LEFT_MENU_RZ_REPAYMENT"; // 待还列表
	public static String LEFT_MENU_RZ_RENDERING = "LEFT_MENU_RZ_RENDERING"; // 正在投标中

	/************************ 我的帐号左边导航菜单名称定义开始结束 ****************************/

	/********************* 实名认证增加信用积分 20分 begin *************************/
	public Integer REALNAME_APPRO_CREDIT_INTEGRAL = 20;
	/** 实名认证增加信用积分 20分 end */

	/********************* 每笔提现手续费开始 ***************************************/
	public BigDecimal TAKE_MONEY_FEE = new BigDecimal("2");
	public BigDecimal TAKE_MONEY_MAX = new BigDecimal("500000"); // 最大提现额度
	public BigDecimal TAKE_MONEY_MIN = new BigDecimal("100"); // 最小提现额度
	public BigDecimal TAKE_MONEY_EVERY_MAX = new BigDecimal("50000"); // 每笔提现额度
	/********************* 每笔提现手续费 结束 ***************************************/

	/*********** 图形报表类型开始 ***********/
	// 折线形
	public static final String CHART_LINE = "line";
	// 曲线图
	public static final String CHART_SPLINE = "spline";
	// 纵向条形图
	public static final String CHART_COLUMN = "column";
	// 横向条形图
	public static final String CHART_BAR = "bar";
	// 饼形图
	public static final String CHART_PIE = "pie";
	// 散播点图
	public static final String CHART_SCATTER = "scatter";
	// 区域折线图
	public static final String CHART_AREA = "area";
	// 区域曲线图
	public static final String CHART_AREASPLINE = "areaspline";
	/*********** 图形报表类型结束 ***********/

	// 正则表达式 匹配规则 ---不包含特殊字符
	public static final String PETTERN_REGEX_NO_SPECIALCHARS = "[^`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？ ]{1,}";
	/*****************************************************************************************
	 * 净值额度表 类型【0：借款入账，1：网站奖励,2:还款扣除，3：还款入帐 4：垫付入帐 5：垫付后还款扣除 6：垫付还款后非VIP收取利息
	 * 7:提前还款扣除 8：提前还款入帐 9：收取罚息:10:直通车解锁 11:现金行权 12:借款标流标 13:借款标撤消 14:取消提现
	 * 15：直通车撤消 16:提现审核不通过 17：直通车流车 18：债权转让复审通过 19:债权转让撤消 20：VIP扣费
	 * 21：活期宝转出到可用余额】 begin
	 */
	public static final Integer NET_TYPE_BORROW_SUCCESS = 0;
	public static final Integer NET_TYPE_WEB_AWARD = 1;
	public static final Integer NET_TYPE_REPAYMENT_DEDUCT = 2;
	public static final Integer NET_TYPE_REPAYMENT_BACK = 3;
	public static final Integer NET_TYPE_WEBPAY_REPAYMENT_BACK = 4;
	public static final Integer NET_TYPE_AFTER_WEB_REPAY = 5;
	public static final Integer NET_TYPE_INVEST_BACK = 6;
	public static final Integer NET_TYPE_EARLY_REPAYMENT_DEDUCT = 7;
	public static final Integer NET_TYPE_EARLY_REPAYMENT_BACK = 8;
	public static final Integer NET_TYPE_LATER_INVEST_BACK = 9;
	public static final Integer NET_TYPE_FIRST_UNLOCK_SUCCESS = 10;
	public static final Integer NET_TYPE_STOCK_TO_MONEY = 11;
	public static final Integer NET_TYPE_BORROW_FLOW = 12;
	public static final Integer NET_TYPE_BORROW_CANCEL = 13;
	public static final Integer NET_TYPE_CASH_CANCEL = 14;
	public static final Integer NET_TYPE_FIRST_CANCEL = 15;
	public static final Integer NET_TYPE_CASH_FAILED = 16;
	public static final Integer NET_TYPE_VIP_COST = 20;
	public static final Integer NET_TYPE_CUR_OUT = 21;
	/*****************************************************************************************
	 * 净值额度表 类型【0：借款入账，1：网站奖励,2:还款扣除，3：还款入帐 4：垫付入帐 5：垫付后还款扣除 6：垫付还款后非VIP收取利息
	 * 7:提前还款扣除 8：提前还款入帐 9：收取罚息:10:直通车解锁 11:现金行权】 结束
	 */

	/** 自动投标的自动类型 1：按抵押标、担保标投标，2：按净值标、信用标投标 */
	public static final Integer AUTO_TYPE_ONE = 1;
	public static final Integer AUTO_TYPE_TWO = 2;

	/********************************* 还款时待还金额与待收金额最大差值 begin *******************/
	public static BigDecimal MAX_MONEY_FOR_REPAY = new BigDecimal("5");
	/********************************* 还款时待还金额与待收金额差值 end *******************/

	/** VIP会员等级 0：普通VIP 1：终身顶级会员 begin */
	public static final Integer VIP_LEVEL_ONE = 0;
	public static final Integer VIP_LEVEL_TWO = 1;
	/** VIP会员等级 0：普通VIP 1：终身顶级会员 end */

	/** VIP会员等级状态 0：正常 -1：失效 begin */
	public static final Integer VIP_LEVEL_STATUS_ENABLE = 0;
	public static final Integer VIP_LEVEL_STATUS_DISABLE = -1;
	/** VIP会员等级状态 0：正常 -1：失效 end */

	/**
	 * 黑名单禁止操作类型【1：禁止线上充值，2：禁止提现，3:禁止加入定期宝】 BEGIN
	 */
	public static final Integer BLACK_TYPE_ONLINE_RECHARGE = 1;
	public static final Integer BLACK_TYPE_CASH = 2;
	public static final Integer BLACK_TYPE_CURRENT = 3;
	/**
	 * 黑名单禁止操作类型【1：禁止手动投标，2：禁止认购直通车，3：禁止认购债权转让，4：禁止设置自动投标，5：禁止线上充值，6：禁止提现，7：
	 * 禁止发净值标, 8：直通车下车，9：禁止微信消息群推】 END
	 */

	/** 直通车转让类型： 1：可转让 2：转让中 3：已转出 4：已转入 begin */
	public static final Integer FIRST_TRANSFER_TYPE_ENABLED = 1;
	public static final Integer FIRST_TRANSFER_TYPE_DOING = 2;
	public static final Integer FIRST_TRANSFER_TYPE_SUCCESS = 3;
	public static final Integer FIRST_TRANSFER_TYPE_RECEIVED = 4;
	/** 直通车转让类型： 1：可转让 2：转让中 3：已转出 4：已转入 end */

	/**
	 * 直通车转让计算利息的利息 年天数
	 * 如果代收表中的利息是按照360天那么下面的应该改成360天，如果代收表中的利息是按照365天计算那么下面的就是365天 begin
	 */
	public static Integer FIRST_TRANSFER_YEAR_DAYS = 360;
	/**
	 * 直通车转让计算利息的利息 年天数
	 * 如果代收表中的利息是按照360天那么下面的应该改成360天，如果代收表中的利息是按照365天计算那么下面的就是365天 end
	 */

	/** 算新注册用户的开始时间　 */
	public static String NEW_REGISTER_USER_TIME = "2015-04-21 18:00:00";

	/** 抽奖机会来源类型 begin */
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_RECOMMEND = "1"; // 推荐奖励
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_INVEST_AWARD = "2"; // 投资擂台奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_FIRST_BORROW_INVEST = "3"; // 直通车投资奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_FORUM_SIGN = "4"; // 论坛签到奖励
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_NEW_REGISTER = "5"; // 新手注册奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_REAL_NAME_APPRO = "6"; // 实名认证奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_FIRST_INVEST = "7"; // 首次投资奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_INVEST_GRADE = "8"; // 新用户理财里程碑奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_LOTTERY_DRAW = "9"; // 抽奖获得
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_FIX_AWARD = "13"; // 定期宝投资奖
	public static String LOTTERY_CHANCE_RULE_INFO_CODE_TYPE_EVERYDAY_LOGIN_AWARD = "14"; // 每日登录奖励
	/** 抽奖机会来源类型 end */

	/** 活期宝转出类型 begin */
	public static Integer CUR_OUT_TYPE_TO_USE_MONEY = 0; // 活期宝转出到可用余额
	public static Integer CUR_OUT_TYPE_TO_TENDER_BORROW = 1; // 活期宝转出投标
	public static Integer CUR_OUT_TYPE_TO_TENDER_FIRST_BORROW = 2; // 活期宝转出开通直通车
	public static Integer CUR_OUT_TYPE_TO_BUY_TRANSFER = 3; // 活期宝转出购买债权转让
	public static Integer CUR_OUT_TYPE_TO_BUY_FIRST_BORROW_TRANSFER = 4; // 活期宝转出购买直通车转让
	public static Integer CUR_OUT_TYPE_TO_BUY_REGULAR_BAO = 5; // 活期宝转出购买定期宝
	/** 活期宝转出类型 end */

	/** 活期宝转出资金明细操作类型 begin */
	public static Integer CUR_OUT_TYPE_TO_USE_MONEY_CAPITAL_DETAIL = 201; // 活期宝转出到可用余额
	public static Integer CUR_OUT_TYPE_TO_TENDER_BORROW_CAPITAL_DETAIL = 202; // 活期宝转出投标
	public static Integer CUR_OUT_TYPE_TO_TENDER_FIRST_BORROW_CAPITAL_DETAIL = 203; // 活期宝转出开通直通车
	public static Integer CUR_OUT_TYPE_TO_BUY_TRANSFER_CAPITAL_DETAIL = 204; // 活期宝转出购买债权转让
	public static Integer CUR_OUT_TYPE_TO_BUY_FIRST_BORROW_TRANSFER_CAPITAL_DETAIL = 205; // 活期宝转出购买直通车转让
	public static Integer CUR_OUT_TYPE_TO_BUY_REGULAR_BAO_CAPITAL_DETAIL = 206; // 活期宝转出购买定期宝
	/** 活期宝转出资金明细操作类型 end */

	/** 普通账户 活期宝转入资金明细操作类型 begin */
	public static String CUR_OUT_TYPE_TO_USE_MONEY_COMMON_CAPITAL_DETAIL = "101"; // 活期宝转入可用余额
	public static String CUR_OUT_TYPE_TO_TENDER_BORROW_COMMON_CAPITAL_DETAIL = "102"; // 活期宝投标转入
	public static String CUR_OUT_TYPE_TO_TENDER_FIRST_BORROW_COMMON_CAPITAL_DETAIL = "103"; // 活期宝开通直通车转入
	public static String CUR_OUT_TYPE_TO_BUY_TRANSFER_COMMON_CAPITAL_DETAIL = "104"; // 活期宝购买债权转入
	public static String CUR_OUT_TYPE_TO_BUY_FIRST_BORROW_TRANSFER_COMMON_CAPITAL_DETAIL = "105"; // 活期宝购买直通车转让转入
	public static String CUR_OUT_TYPE_TO_BUY_REGULAR_BAO_COMMON_CAPITAL_DETAIL = "106"; // 活期宝购买定期宝转入
	/** 普通账户 活期宝转入资金明细操作类型 end */

	/** 抽奖概率奖池100%基础上扩大倍数 begin */
	public static Integer LOTTERY_int_PROGRESSIVE_RATIO = 100; // 扩大100倍，最低概率万分之一
	/** 抽奖概率奖池100%基础上扩大倍数 end */

	/************************ 新浪新充值接口配置信息 开始 *****************************************/
	String ONLINE_PAY_SINAPAY_INPUT_CHARSET = new String("UTF-8");// 字符编码
	String ONLINE_PAY_SINAPAY_MD5 = new String("MD5");
	String ONLINE_PAY_SINAPAY_SIGN_TYPE = new String("RSA");// 签名类型
	String ONLINE_PAY_SINAPAY_MD5KEY = new String("1234567890qwertyuiopasdfghjklzxc");
	String ONLINE_PAY_SINAPAY_CREATE_INSTANT_ORDER_SERVICENAME = new String("create_instant_order");// 充值接口名称
	String ONLINE_PAY_SINAPAY_QUERY_B2C_ORDERENAME = new String("query_b2c_order");// 查询接口名称

	String ONLINE_PAY_SINAPAY_CREATE_INSTANT_ORDER_SERVICEVERSION = new String("1.0");// 接口版本
	/***** 新浪充值服务测试地址 ***/
	// String ONLINE_PAY_SINAPAY_SERVICEURL = new
	// String("https://testgate.pay.sina.com.cn/mas/gateway.do");
	/***** 新浪充值服务生产地址 ***/
	String ONLINE_PAY_SINAPAY_SERVICEURL = new String("https://gate.pay.sina.com.cn/mas/gateway.do");

	/**
	 * 充值返回平台地址
	 */
	String ONLINE_PAY_SINAPAY_RETURN_URL = new String("http://www.gcjr.com/account/topup/sinapay/recevie.html");// 页面跳转同步返回页面路径
	/**
	 * 充值回调地址
	 */
	String ONLINE_PAY_SINAPAY_NOTIFY_URL = new String("http://www.gcjr.com/autoreceive/sinapay.html");// 系统异步回调通知地址
	/**
	 * 测试账号 "200004265447" 生产账号 200006668806 合作者身份ID 对应老接口的【商户号】
	 */
	String ONLINE_PAY_SINAPAY_PARTNER_ID = new String("200006668806");

	/************************ 新浪新充值接口配置信息 结束 *****************************************/
 
	/**
	 * 新手宝上线时间
	 */
	public static String NEW_FIX_BORROW_ONLINE_TIME = "2015-12-08 17:30:00";
	
	/*************************************************************************8
	 * 涨工资App常量定义
	 */
	
	/** 涨工资 业务类型定义  */	
	/** 充值 */
	public static Integer ZGZ_BIZ_RECHARGE= 1;
	/** 投资 */
	public static Integer ZGZ_BIZ_INVEST= 2;	
	/** 现金红包领取入*/
	public static Integer ZGZ_BIZ_XJ_RECEIVE_IN= 31;	
	/** 现金红包领取出*/
	public static Integer ZGZ_BIZ_XJ_RECEIVE_OUT= 32;		
	/** 提现资金退回*/
	public static Integer ZGZ_BIZ_XJ_BACK= 4;
	/** 体验金收益提现*/
	public static Integer ZGZ_BIZ_XJ_EXP= 5;

	/** 涨工资 业务表名定义  */	
	/** 零钱相关表名 */
	public static String ZGZ_TB_CURLIL_IN="t_curlil_in";
	public static String ZGZ_TB_CURLIL_OUT="t_curlil_out";
	public static String ZGZ_TB_CURLIL_LOG="t_curlil_accountlog";
	public static String ZGZ_TB_RECHARGERECORD="t_rechargerecord";
	public static String ZGZ_TB_CUR_IN="t_cur_in";
	public static String ZGZ_TB_CUR_OUT="t_cur_out";	
	public static String ZGZ_TB_LOTT_USER="t_lottery_use_record";
	
	
	/** 零钱 转入TARGET_TYPE */
	/** 1：充值ID；*/
	public static Integer ZGZ_TARGET_CURLIL_IN_CZ=1;//1：充值ID；
	/** 2：提现记录ID；*/
	public static Integer ZGZ_TARGET_CURLIL_IN_TX=2; //2：提现记录ID；
	/** 3：活期转出记录ID,*/	
	public static Integer ZGZ_TARGET_CURLIL_IN_HQZC=3; //3：活期转出记录ID,
	/** 4：体验金转出记录表ID,*/	
	public static Integer ZGZ_TARGET_CURLIL_IN_EXP=4; //4：体验金转出记录表ID,
	/** 5：抽奖机会使用记录表ID,*/	
	public static Integer ZGZ_TARGET_CURLIL_IN_LOTT=5; //5：抽奖机会使用记录表ID,
	/** 6：t_invite_reward_issueID,*/	
	public static Integer ZGZ_TARGET_CURLIL_IN_ISSUE=6; //6：t_invite_reward_issue ID,
	
	/** 零钱日志TYPE */
	/** 1：零钱生息；*/
	public static Integer ZGZ_TY_CURLIL_LOG_LQSX=1;//1：零钱生息；
	/** 2：转入；*/
	public static Integer ZGZ_TY_CURLIL_LOG_ZR=2; //2：转入；
	/** 3:转出到活期宝；*/
	public static Integer ZGZ_TY_CURLIL_LOG_ZCHQB=3; //3:转出到活期宝;
	/** 4:开户*/
	public static Integer ZGZ_TY_CURLIL_LOG_KH=4; //4:开户;
	/** 5:提现；*/
	public static Integer ZGZ_TY_CURLIL_LOG_TX=5; //5:提现；	
	
	
	
	/** 零钱转入方式 */
	/** 零钱转入方式 1：充值 */
	public static Integer ZGZ_TENDER_TYPE_CLIN_CZ=1; //充值
	/** 零钱转入方式 2：提现退回 */
	public static Integer ZGZ_TENDER_TYPE_CLIN_TXTH=2; //提现退回
	/** 零钱转入方式3：提现活期转零钱*/
	public static Integer ZGZ_TENDER_TYPE_CLIN_TXHQZLQ=3; //提现活期转零钱
	/** 零钱转入方式4：体验金收益转零钱*/
	public static Integer ZGZ_TENDER_TYPE_CLIN_TYJZR=4; //体验金收益转零钱
	/** 零钱转入方式5：现金红包转零钱*/
	public static Integer ZGZ_TENDER_TYPE_CLIN_XJHBZR=5; //现金红包转零钱
	
	
	
	
	/** 投资方式  t_cur_in */
	/** 活期投资方式  1：普通手动投资 */
	public static Integer ZGZ_TENDER_STYLE_PTSD=1; //普通手动投资
	/** 活期投资方式  2：沉淀资金投资 */
	public static Integer ZGZ_TENDER_STYLE_CDZJ=2; //沉淀资金投资
	/** 活期投资方式  3：零钱排队投资 */
	public static Integer ZGZ_TENDER_STYLE_LQPD=3; //零钱排队投资
	
	
	/** 活期转入方式 */
	/** 活期转入方式 1：充值 */
	public static Integer ZGZ_TENDER_TYPE_CIN_LQZR=1; //零钱转出ID
	
	
}
