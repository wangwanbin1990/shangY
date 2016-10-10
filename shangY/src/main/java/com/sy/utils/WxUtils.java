package com.sy.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sy.common.WxConstants;

public class WxUtils {
	private static final Logger logger = Logger.getLogger(WxUtils.class);

	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	public static String encodeURL(String input) {
		return encodeURL(input, WxConstants.default_enc);
	}

	public static String encodeURL(String input, String enc) {
		if (input == null) {
			return null;
		}
		try {
			return URLEncoder.encode(input, enc);
		} catch (UnsupportedEncodingException e) {
			logger.error("WxUtils.encodeURL()异常", e);
		}
		return input;
	}

	public static String decodeURL(String input) {
		return decodeURL(input, WxConstants.default_enc);
	}

	public static String decodeURL(String input, String enc) {
		if (input == null) {
			return null;
		}
		try {
			return URLDecoder.decode(input, enc);
		} catch (UnsupportedEncodingException e) {
			logger.error("WxUtils.decodeURL()异常", e);
		}
		return input;
	}

	public static <T> T json2Bean(String json, Class<T> clazz) {
		if (json == null || "{}".equals(json) || "".equals(json)) {
			return null;
		}
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			logger.error("WxUtils.json2Bean(1,2)异常", e);
		}
		return null;
	}

	public static String bean2Json(Object bean) {
		if (bean == null) {
			return null;
		}
		try {
			return objectMapper.writeValueAsString(bean);
		} catch (Exception e) {
			logger.error("WxUtils.json2Bean(1)异常", e);
		}
		return null;
	}

	public static Map<?, ?> json2Map(String json) {
		if (json == null) {
			return null;
		}
		try {
			return objectMapper.readValue(json, Map.class);
		} catch (Exception e) {
			logger.error("WxUtils.json2Map(1)异常", e);
		}
		return null;
	}

	public static List<?> json2List(String json) {
		if (json == null || "".equals(json)) {
			return null;
		}
		try {
			return objectMapper.readValue(json, List.class);
		} catch (Exception e) {
			logger.error("WxUtils.json2List(1)异常", e);
		}
		return null;
	}

	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest = strDigest + byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4 & 0xF)];
		tempArr[1] = Digit[(mByte & 0xF)];

		String s = new String(tempArr);
		return s;
	}

	//
	// /**
	// * 图片消息对象转换成xml
	// *
	// * @param imageMessage 图片消息对象
	// * @return xml
	// */
	// public static String messageToXml(ImageMessage imageMessage) {
	// xstream.alias("xml", imageMessage.getClass());
	// return xstream.toXML(imageMessage);
	// }
	//
	// /**
	// * 语音消息对象转换成xml
	// *
	// * @param voiceMessage 语音消息对象
	// * @return xml
	// */
	// public static String messageToXml(VoiceMessage voiceMessage) {
	// xstream.alias("xml", voiceMessage.getClass());
	// return xstream.toXML(voiceMessage);
	// }
	//
	// /**
	// * 视频消息对象转换成xml
	// *
	// * @param videoMessage 视频消息对象
	// * @return xml
	// */
	// public static String messageToXml(VideoMessage videoMessage) {
	// xstream.alias("xml", videoMessage.getClass());
	// return xstream.toXML(videoMessage);
	// }
	//
	// /**
	// * 音乐消息对象转换成xml
	// *
	// * @param musicMessage 音乐消息对象
	// * @return xml
	// */
	// public static String messageToXml(MusicMessage musicMessage) {
	// xstream.alias("xml", musicMessage.getClass());
	// return xstream.toXML(musicMessage);
	// }
	//
	// public static String messageToXml(NewsMessage newsMessage) {
	// xstream.alias("xml", newsMessage.getClass());
	// xstream.alias("item", new Article().getClass());
	// return xstream.toXML(newsMessage);
	// }
	//
	// private static XStream xstream = new XStream(new XppDriver() {
	// public HierarchicalStreamWriter createWriter(Writer out) {
	// return new PrettyPrintWriter(out) {
	// boolean cdata = true;
	//
	// protected void writeText(QuickWriter writer, String text) {
	// if (cdata) {
	// writer.write("<![CDATA[");
	// writer.write(text);
	// writer.write("]]>");
	// } else {
	// writer.write(text);
	// }
	// }
	// };
	// }
	// });
	public static String getRealIpAddr() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if (requestAttributes == null)
			return null;
		HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
		String ip = request.getHeader("X-Real-IP");
		if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 获取重复提交控制的字符串，并置入session
	 * <p>
	 * Description:这里写描述<br />
	 * </p>
	 * @author ZHUCHEN
	 * @version 0.1 2014年11月10日
	 * @return String
	 */
	public static String setRepeat() {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute("uuid", uuid);
		return uuid;
	}
	
	/**
	 * 验证重复提交的字符串，一致返回true
	 * <p>
	 * Description:这里写描述<br />
	 * </p>
	 * @author ZHUCHEN
	 * @version 0.1 2014年11月10日
	 * @param uid 页面提交的重复提交相关参数
	 * @return boolean
	 */
	public static boolean getRepeat(String uid) {
		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		Object uuid = session.getAttribute("uuid");
		System.out.println("session"+uuid);
		System.out.println("页面"+uid);
		if (uuid == null || (!uuid.toString().equals(uid))) {
			return false;
		}
		session.removeAttribute("uuid");
		return true;
	}
}
