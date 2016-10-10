package com.gcmobile.controller.rest.vo;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * <p>
 * Description:登录请求参数<br />
 * </p>
 * 
 * @title LoginVo.java
 * @package com.gcmobile.controller.rest.vo
 * @author zhaowei
 * @version 0.1 2016年3月22日
 */
@ApiModel(value = "登录返回参数")
public class LoginResponseVo extends AbstractMessage<LoginResponseVo> {

	/**
	 * @fields serialVersionUID
	 */
	private static final long serialVersionUID = 7037455910255410995L;
	
	/** 访问标识 */
	@ApiModelProperty(value = "访问标识，每次请求接口时需要带上该参数", required = true)
	private String accessToken;

	@ApiModelProperty(value="是否第一次登录,0:第一次登录,1:不是第一次登录",required=true)
	private Integer isLoginCount;
	
	@ApiModelProperty(value="首次登录会返回体验金金额",required=false)
	private BigDecimal expMoney;
	
	@ApiModelProperty(value="体验金ID")
	private Integer expId;
	
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public BigDecimal getExpMoney() {
		return expMoney;
	}

	public void setExpMoney(BigDecimal expMoney) {
		this.expMoney = expMoney;
	}

	public Integer getIsLoginCount() {
		return isLoginCount;
	}

	public void setIsLoginCount(Integer isLoginCount) {
		this.isLoginCount = isLoginCount;
	}

	public Integer getExpId() {
		return expId;
	}

	public void setExpId(Integer expId) {
		this.expId = expId;
	}

	
}
