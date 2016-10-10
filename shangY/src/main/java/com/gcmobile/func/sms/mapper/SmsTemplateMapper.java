package com.gcmobile.func.sms.mapper;

import java.util.List;

import com.gcmobile.func.sms.entity.SmsTemplateCnd;
import com.gcmobile.func.sms.entity.SmsTemplateVo;

/**
 * <p>
 * Description:短信模板数据访问类<br />
 * </p>
 * 
 * @title SmsTemplateMapper.java
 * @package com.cxdai.portal.sms.mapper
 * @author justin.xu
 * @version 0.1 2014年4月29日
 */
public interface SmsTemplateMapper {
	/**
	 * <p>
	 * Description:根据条件查询对象集合<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年4月29日
	 * @param smsTemplateCnd
	 * @return
	 * @throws Exception
	 *             List<SmsTemplateVo>
	 */
	public List<SmsTemplateVo> querySmsTemplateList(
			SmsTemplateCnd smsTemplateCnd) throws Exception;

}
