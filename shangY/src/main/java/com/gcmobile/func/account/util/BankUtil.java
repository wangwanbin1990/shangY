package com.gcmobile.func.account.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>
 * Description:银行工具类<br />
 * </p>
 * 
 * @title BankUtil.java
 * @package com.framework.util
 * @author gang.li
 * @version 0.1 2013年9月11日
 */
public class BankUtil {

	public static Map<String, String> bankMap = new HashMap<String, String>();
	static {
		// 以下为储蓄卡
		bankMap.put("1025", "中国工商银行");
		bankMap.put("3080", "招商银行");
		bankMap.put("1051", "中国建设银行");
		bankMap.put("103", "中国农业银行");
		bankMap.put("104", "中国银行");
		bankMap.put("3407", "交通银行");
		bankMap.put("311", "华夏银行");
		bankMap.put("309", "兴业银行");
		bankMap.put("305", "中国民生银行");
		bankMap.put("3061", "广东发展银行");
		bankMap.put("307", "平安银行");
		bankMap.put("314", "上海浦东发展银行");
		bankMap.put("313", "中信银行");
		bankMap.put("312", "光大银行");
		bankMap.put("316", "南京银行");
		bankMap.put("3230", "邮政储蓄银行");
		bankMap.put("324", "杭州银行");
		bankMap.put("302", "宁波银行");
		bankMap.put("326", "上海银行");
		// bankMap.put("329", "浙江泰隆银行");
		// bankMap.put("332", "金华银行");
		bankMap.put("342", "重庆农商银行");
		// bankMap.put("345", "重庆银行");
		// bankMap.put("339", "富滇银行");
		bankMap.put("310", "北京银行");
		bankMap.put("343", "上海农商行");
		bankMap.put("335", "北京农商行");
		bankMap.put("3341", "青岛银行");
		bankMap.put("336", "成都银行");

		// 以下为信用卡
		/*
		 * bankMap.put("308", "招商银行"); bankMap.put("1054", "中国建设银行");
		 * bankMap.put("106", "中国银行"); bankMap.put("1031", "中国农业银行");
		 * bankMap.put("3112", "华夏银行"); bankMap.put("3051", "中国民生银行");
		 * bankMap.put("3121", "光大银行"); bankMap.put("3231", "邮政储蓄银行");
		 * bankMap.put("3241", "杭州银行"); bankMap.put("303", "宁波银行");
		 * bankMap.put("3261", "上海银行"); bankMap.put("1027", "中国工商银行"); //
		 * bankMap.put("301", "交通银行"); bankMap.put("3091", "兴业银行");
		 * bankMap.put("3071", "平安银行"); bankMap.put("306", "广东发展银行");
		 * bankMap.put("3141", "上海浦东发展银行"); bankMap.put("3131", "中信银行");
		 * bankMap.put("334", "青岛银行");
		 */
	}
	/** 盛付通银行 **/
	public static Map<String, String> shengBankMap = new HashMap<String, String>();
	static {
		// shengBankMap.put("ICBC", "工商银行");
		// shengBankMap.put("CCB", "建设银行");
		// shengBankMap.put("ABC", "农业银行");
		// shengBankMap.put("CMBC", "民生银行");
		// shengBankMap.put("HXB", "华夏银行");
		// shengBankMap.put("SZPAB", "平安银行");
		// shengBankMap.put("BCCB", "北京银行");
		// shengBankMap.put("BOC", "中国银行");
		// shengBankMap.put("CITIC", "中信银行");
		// shengBankMap.put("SPDB", "浦东发展银行");
		// shengBankMap.put("PSBC", "中国邮政储蓄银行");
		// shengBankMap.put("CMB", "招商银行");
		// shengBankMap.put("COMM", "交通银行");
		// shengBankMap.put("BOS", "上海银行");
		// shengBankMap.put("CEB", "光大银行");
		// shengBankMap.put("GDB", "广东发展银行");
		// shengBankMap.put("NBCB", "宁波银行");
		// shengBankMap.put("HKBEA", "东亚银行");
		// shengBankMap.put("NJCB", "南京银行");
		// shengBankMap.put("CBHB", "渤海银行");
		// shengBankMap.put("BOCD", "成都银行");
		// shengBankMap.put("SHRCB", "上海市农村商业银行");
		// shengBankMap.put("GNXS", "广州市农村信用合作社");
		// shengBankMap.put("GZCB", "广州银行");
		// shengBankMap.put("CIB", "兴业银行");
		// shengBankMap.put("HKBCHINA", "汉口银行");
		// shengBankMap.put("SXJS", "晋商银行");
		// shengBankMap.put("ZHNX", "珠海市农村信用合作联社");
		// shengBankMap.put("WZCB", "温州银行");
		// shengBankMap.put("YDXH", "尧都信用合作联社");
		// shengBankMap.put("SDE", "顺德农信社");

	}

	/** 新浪支付银行 **/
	public static Map<String, String> sinapayBankMap = new HashMap<String, String>();
	static {
		sinapayBankMap.put("ICBC", "工商银行");
		sinapayBankMap.put("CCB", "建设银行");
		sinapayBankMap.put("BOS", "上海银行");
		sinapayBankMap.put("ABC", "农业银行");
		sinapayBankMap.put("PSBC", "中国邮政储蓄银行");
		sinapayBankMap.put("CMB", "招商银行");
		sinapayBankMap.put("COMM", "交通银行");
		sinapayBankMap.put("BOC", "中国银行");
		sinapayBankMap.put("CEB", "光大银行");
		sinapayBankMap.put("CMBC", "民生银行");
		sinapayBankMap.put("CITIC", "中信银行");
		sinapayBankMap.put("CIB", "兴业银行");
		sinapayBankMap.put("GDB", "广东发展银行");
		sinapayBankMap.put("SPDB", "浦东发展银行");
		sinapayBankMap.put("SZPAB", "平安银行");
		sinapayBankMap.put("HXB", "华夏银行");
		sinapayBankMap.put("BCCB", "北京银行");
	}

	/** 新浪支付信用卡银行 **/
	public static Map<String, String> sinapayCreditBankMap = new HashMap<String, String>();
	static {
		sinapayCreditBankMap.put("ICBC", "工商银行");
		sinapayCreditBankMap.put("CCB", "建设银行");
		sinapayCreditBankMap.put("ABC", "农业银行");
		sinapayCreditBankMap.put("PSBC", "中国邮政储蓄银行");
		sinapayCreditBankMap.put("CMB", "招商银行");
		sinapayCreditBankMap.put("COMM", "交通银行");
		sinapayCreditBankMap.put("BOC", "中国银行");
		sinapayCreditBankMap.put("CEB", "光大银行");
		sinapayCreditBankMap.put("CMBC", "民生银行");
		sinapayCreditBankMap.put("CITIC", "中信银行");
		sinapayCreditBankMap.put("CIB", "兴业银行");
		sinapayCreditBankMap.put("GDB", "广东发展银行");
	}

	/** 连连支付银行 **/
	public static Map<String, String> lianlianpayBankMap = new HashMap<String, String>();
	static {
		lianlianpayBankMap.put("01020000", "工商银行");
		lianlianpayBankMap.put("01050000", "建设银行");
		lianlianpayBankMap.put("01030000", "农业银行");
		lianlianpayBankMap.put("03080000", "招商银行");
		lianlianpayBankMap.put("03010000", "交通银行");
		lianlianpayBankMap.put("01040000", "中国银行");
		lianlianpayBankMap.put("03030000", "光大银行");
		lianlianpayBankMap.put("03050000", "民生银行");
		lianlianpayBankMap.put("03020000", "中信银行");
		lianlianpayBankMap.put("03060000", "广东发展银行");
		lianlianpayBankMap.put("03100000", "浦东发展银行");
		lianlianpayBankMap.put("03070000", "平安银行");
		lianlianpayBankMap.put("03040000", "华夏银行");
		lianlianpayBankMap.put("04083320", "宁波银行");
		lianlianpayBankMap.put("03200000", "东亚银行");
		lianlianpayBankMap.put("04012900", "上海银行");
		lianlianpayBankMap.put("01000000", "中国邮政储蓄银行");
		lianlianpayBankMap.put("04243010", "南京银行");
		lianlianpayBankMap.put("04031000", "北京银行");
		lianlianpayBankMap.put("03170000", "渤海银行");
		lianlianpayBankMap.put("64296510", "成都银行");
	}

	/** 连连支付信用卡银行 **/
	public static Map<String, String> lianlianpayCreditBankMap = new HashMap<String, String>();
	static {
	}

	/** 连连手机支付支持银行 **/
	public static Map<String, String> lianlianpayWapBankMap = new HashMap<String, String>();
	static {
		lianlianpayWapBankMap.put("01020000", "中国工商银行");
		lianlianpayWapBankMap.put("01030000", "中国农业银行");
		lianlianpayWapBankMap.put("01040000", "中国银行");
		lianlianpayWapBankMap.put("01050000", "中国建设银行");
		lianlianpayWapBankMap.put("03080000", "招商银行");
		lianlianpayWapBankMap.put("03100000", "上海浦东发展银行");
		lianlianpayWapBankMap.put("03030000", "中国光大银行");
		lianlianpayWapBankMap.put("03070000", "平安银行");
		lianlianpayWapBankMap.put("03040000", "华夏银行");
		lianlianpayWapBankMap.put("03090000", "兴业银行");
		lianlianpayWapBankMap.put("03020000", "中信银行");
		lianlianpayWapBankMap.put("01000000", "中国邮政储蓄银行");
		lianlianpayWapBankMap.put("03050000", "中国民生银行");
		lianlianpayWapBankMap.put("03060000", "广东发展银行");
	}

	/** 连连手机支付支持银行对应的业务银行代码 **/
	public static Map<String, String> lianlianpayWapBankCodeMap = new HashMap<String, String>();
	static {
		lianlianpayWapBankCodeMap.put("01020000", "ICBC");// "工商银行");
		lianlianpayWapBankCodeMap.put("01030000", "ABC");// "农业银行");
		lianlianpayWapBankCodeMap.put("01040000", "BOC");// "中国银行");
		lianlianpayWapBankCodeMap.put("01050000", "CCB");// "建设银行");
		lianlianpayWapBankCodeMap.put("03080000", "CMB");// "招商银行");
		lianlianpayWapBankCodeMap.put("03100000", "SPDB");// "浦东发展银行");
		lianlianpayWapBankCodeMap.put("03030000", "CEB");// "光大银行");
		lianlianpayWapBankCodeMap.put("03070000", "SZPAB");// "平安银行");
		lianlianpayWapBankCodeMap.put("03040000", "HXB");// "华夏银行");
		lianlianpayWapBankCodeMap.put("03090000", "CIB");// "兴业银行");
		lianlianpayWapBankCodeMap.put("03020000", "CITIC");// "中信银行");
		lianlianpayWapBankCodeMap.put("01000000", "PSBC");// "中国邮政储蓄银行");
		lianlianpayWapBankCodeMap.put("03050000", "CMBC");// "民生银行");
		lianlianpayWapBankCodeMap.put("03060000", "GDB");// "广发银行");
	}

	/**
	 * 
	 * <p>
	 * Description:根据银行的编号查询银行的中文名称(使用网银在线支付方式时使用本方法)<br />
	 * </p>
	 * 
	 * @author gang.li
	 * @version 0.1 2013年9月11日
	 * @param bankCode
	 * @return String
	 */
	public static String getChinaBankNameByBankCode(String bankCode) {
		String bankName = "";
		if (bankMap.containsKey(bankCode)) {
			bankName = bankMap.get(bankCode);
		}

		return bankName;
	}

	/**
	 * 
	 * <p>
	 * Description:根据银行编号查询银行名称(使用国付宝支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author gang.li
	 * @version 0.1 2013年10月13日
	 * @param bankSms
	 * @return String
	 */
	public static String getBankNameByBankSms(String bankSms) {
		String bankName = "";
		if (bankMap.containsKey(bankSms)) {
			bankName = bankMap.get(bankSms);
		}

		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询银行名称(使用盛付通支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getShengBankNameByCode(String bankSms) {
		String bankName = "";

		if (shengBankMap.containsKey(bankSms)) {
			bankName = shengBankMap.get(bankSms);
		}

		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询银行名称(使用新浪支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getSinapayBankNameByCode(String bankSms) {
		String bankName = "";

		if (sinapayBankMap.containsKey(bankSms)) {
			bankName = sinapayBankMap.get(bankSms);
		}
		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询支持信用卡银行名称(使用新浪支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getSinapayCreditBankNameByCode(String bankSms) {
		String bankName = "";

		if (sinapayCreditBankMap.containsKey(bankSms)) {
			bankName = sinapayCreditBankMap.get(bankSms);
		}
		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询银行名称(使用连连支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getLianlianpayBankNameByCode(String bankSms) {
		String bankName = "";

		if (lianlianpayBankMap.containsKey(bankSms)) {
			bankName = lianlianpayBankMap.get(bankSms);
		}
		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询支持信用卡银行名称(使用连连支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getLianlianpayCreditBankNameByCode(String bankSms) {
		String bankName = "";

		if (lianlianpayCreditBankMap.containsKey(bankSms)) {
			bankName = lianlianpayCreditBankMap.get(bankSms);
		}
		return bankName;
	}

	/**
	 * <p>
	 * Description:根据银行编号查询银行名称(使用连连手机支付时使用本转换方法)<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getLianlianpayWapBankNameByCode(String bankSms) {
		String bankName = "";

		if (lianlianpayWapBankMap.containsKey(bankSms)) {
			bankName = lianlianpayWapBankMap.get(bankSms);
		}
		return bankName;
	}

	/**
	 * <p>
	 * Description:根据连连银行编号查询银行业务编码<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年1月23日
	 * @param bankSms
	 * @return String
	 */
	public static String getLianlianpayWapBankCodeByCode(String bankSms) {
		String bankCode = "";

		if (lianlianpayWapBankCodeMap.containsKey(bankSms)) {
			bankCode = lianlianpayWapBankCodeMap.get(bankSms);
		}
		return bankCode;
	}
}
