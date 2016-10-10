package com.sy.controller.rest.chinabank.util;

import java.util.Map;

/**
 * XML交易参数
 * @since 2013.06.08
 * @version 1.0.0_1
 * 
 */
public class XmlMsg {
    public static final String XML_CHARSET          = "xml.charset";            // 字符集
    
    // 请求报文
    public static final String CHINABANK_VERSION    = "chinabank.version";      // 版本号
    public static final String CHINABANK_MERCHANT   = "chinabank.merchant";     // 商户号
    public static final String CHINABANK_TERMINAL   = "chinabank.terminal";     // 终端号
    public static final String CHINABANK_DATA       = "chinabank.data";         // 交易密文
    public static final String CHINABANK_SIGN       = "chinabank.sign";         // 交易签名
    
    // 卡信息
    public static final String DATA_CARD_BANK       = "data.card.bank";         // 持卡人支付卡号发卡行
    public static final String DATA_CARD_TYPE       = "data.card.type";         // 持卡人支付卡号卡类型
    public static final String DATA_CARD_NO         = "data.card.no";           // 持卡人支付卡号
    public static final String DATA_CARD_EXP        = "data.card.exp";          // 持卡人信用卡有效期
    public static final String DATA_CARD_CVV2       = "data.card.cvv2";         // 持卡人信用卡校验码
    public static final String DATA_CARD_NAME       = "data.card.name";         // 持卡人姓名
    public static final String DATA_CARD_IDTYPE     = "data.card.idtype";       // 持卡人证件类型
    public static final String DATA_CARD_IDNO       = "data.card.idno";         // 持卡人证件号
    public static final String DATA_CARD_PHONE      = "data.card.phone";        // 持卡人手机号
    
    // 交易信息
    public static final String DATA_TRADE_TYPE      = "data.trade.type";        // 交易类型
    public static final String DATA_TRADE_ID        = "data.trade.id";          // 交易号
    public static final String DATA_TRADE_OID       = "data.trade.oid";         // 原交易号
    public static final String DATA_TRADE_AMOUNT    = "data.trade.amount";      // 交易金额
    public static final String DATA_TRADE_CURRENCY  = "data.trade.currency";    // 交易币种
    public static final String DATA_TRADE_DATE      = "data.trade.date";        // 交易日期
    public static final String DATA_TRADE_TIME      = "data.trade.time";        // 交易时间
    public static final String DATA_TRADE_NOTICE    = "data.trade.notice";      // 通知地址
    public static final String DATA_TRADE_NOTE      = "data.trade.note";        // 交易备注
    public static final String DATA_TRADE_CODE      = "data.trade.code";        // 交易验证码
    public static final String DATA_TRADE_STATUS    = "data.trade.status";      // 交易返回状态
    
    // 返回信息
    public static final String DATA_RETRUN_CODE     = "data.return.code";       // 交易返回码
    public static final String DATA_RETRUN_DESC     = "data.return.desc";       // 交易返回码信息

    
    /**
     * 解析交易请求XML
     * @param xml
     * @return Map<String, String>
     */
    public static Map<String, String> parse(String xml) throws Exception {
        Map<String, String> map  = null;
        
        int t1 = xml.indexOf("?>") + 2;
        String head = xml.substring(0, t1).toLowerCase();
        String body = xml.substring(t1);
        
        int t2 = head.indexOf("encoding") + 8;
        String temp = head.substring(t2).trim().substring(2);
        String charset = temp.substring(0, temp.indexOf("\""));
        
        map = XML.parse(head + body, false, charset);
        map.put(XML_CHARSET, charset);
        
        return map;
    }
}