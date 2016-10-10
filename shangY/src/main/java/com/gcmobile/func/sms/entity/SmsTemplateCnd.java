package com.gcmobile.func.sms.entity;

import java.io.Serializable;

/**
 * <p>
 * Description:短信模板查询条件<br />
 * </p>
 * 
 * @title SmsTemplateCnd.java
 * @package com.cxdai.portal.sms.vo
 * @author justin.xu
 * @version 0.1 2014年4月29日
 */
public class SmsTemplateCnd implements Serializable {
	private static final long serialVersionUID = 3687328787009445438L;

	private Integer id;

	/** 模板类型 */
	private Integer type;

	/** 逻辑删除标识【0：有效；-1：无效】 */
	private Integer flag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}