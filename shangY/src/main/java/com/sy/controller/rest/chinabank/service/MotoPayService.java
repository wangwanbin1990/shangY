package com.sy.controller.rest.chinabank.service;


import java.util.HashMap;
import java.util.Map;

import com.sy.common.statics.BusinessConstants;
import com.sy.controller.rest.chinabank.util.DES;
import com.sy.controller.rest.chinabank.util.MD5;
import com.sy.controller.rest.chinabank.util.XmlMsg;
import com.sy.controller.rest.chinabank.vo.ChinaBank;
import com.sy.controller.rest.chinabank.vo.Data;
import com.sy.utils.HttpClientUtils;
import com.sy.utils.XmlUtils;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.apache.log4j.Logger;

/**
 * <p>
 * Description:调用网银在线接口service<br />
 * </p>
 *
 * @author wangwanbin
 * @version 0.1 2016/5/24
 * @title Card
 * @package com.sy.controller.rest.vo.chinabankpay
 */
public class MotoPayService {

	private static final Logger logger = Logger.getLogger(MotoPayService.class);

	
	/**
	 * 发起交易请求
	 * @return 返回交易结果 
	 */
	public static Map<String, String> trade(Data data) throws Exception {
		//1.转换bean
		String reqXML= XmlUtils.beanToXml(data);
		//对data报文进行Des加密
		String dataDes = DES.encrypt(reqXML, BusinessConstants.ONLINE_PAY_CHINABANK_DESKEY, BusinessConstants.ONLINE_PAY_CHINABANK_CHARSET);
		//数据签名
		String signMD5 = MD5.md5(BusinessConstants.ONLINE_PAY_CHINABANK_VERSION + BusinessConstants.ONLINE_PAY_CHINABANK_MERCHANT
				+ BusinessConstants.ONLINE_PAY_CHINABANK_TERMINAL + dataDes, BusinessConstants.ONLINE_PAY_CHINABANK_MD5KEY);
		ChinaBank req = new ChinaBank();
		req.setSign(signMD5);
		req.setData(dataDes);
		String xml = XmlUtils.beanToXml(req);
		logger.info("请求报文:" + xml);
		//最后将xml用base64加密
		String reqParams = Base64.encode(xml.getBytes());
		//发送请求到网银在线快捷支付地址
		Map<String,String> paramMap = new HashMap<>();
		paramMap.put("charset",BusinessConstants.ONLINE_PAY_CHINABANK_CHARSET);
		paramMap.put("req",reqParams);
		String respStr = HttpClientUtils.doPost(BusinessConstants.ONLINE_PAY_CHINABANK_URL,paramMap,BusinessConstants.ONLINE_PAY_CHINABANK_CHARSET);
		//String respStr = HttpClientUtils.process("UTF-8", reqParams);
		//处理交易结果
		//数据格式是resp=XML数据
		String temResp = respStr.substring(respStr.indexOf("=") + 1);
		//获取快捷支付数据先base64解码的xml报文
		temResp = new String(Base64.decode(temResp));
		logger.info("返回报文:" + temResp);
		//解析xml中的数据
		Map<String, String> respParams= XmlMsg.parse(temResp);

		Map<String, String> dataParams = new HashMap<>();
		if(!MD5.verify(respParams.get("chinabank.version")
				+respParams.get("chinabank.merchant")+respParams.get("chinabank.terminal")
				+respParams.get("chinabank.data"), BusinessConstants.ONLINE_PAY_CHINABANK_MD5KEY, respParams.get("chinabank.sign"))){
			dataParams.put("data.return.code", "7777");
			dataParams.put("data.return.desc", "返回报文验签失败");
			return dataParams;
		}
		//使用DES解密data交易数据,des密钥网银在线商户后台设置
		String dataDES = DES.decrypt(respParams.get("chinabank.data"), BusinessConstants.ONLINE_PAY_CHINABANK_DESKEY, respParams.get("xml.charset"));
		dataParams= XmlMsg.parse(dataDES);
		logger.info("接口返回报文:" + dataParams.toString());
		return dataParams;

	}

}
