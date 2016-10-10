package com.gcmobile.controller.rest.vo;

import com.gcmobile.common.MessageBox;

/**
 * 
 * <p>
 * Description:这里写描述<br />
 * </p>
 * @title AbstractMessage.java
 * @package com.gcmobile.controller.rest.vo 
 * @author zhaowei
 * @version 0.1 2016年3月22日
 */
public abstract class AbstractMessage<T> extends MessageBox {
	
	/** 
	 * @fields serialVersionUID 
	 */ 
	
	private static final long serialVersionUID = -9169478320514685041L;

	@SuppressWarnings("unchecked")
	public T msg(String msg) {
		this.setMessage(msg);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T code(String code) {
		this.setCode(code);
		return (T) this;
	}
}
