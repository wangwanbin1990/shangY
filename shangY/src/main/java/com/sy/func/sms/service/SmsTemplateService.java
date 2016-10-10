package com.sy.func.sms.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.common.statics.Constants;
import com.sy.func.sms.entity.SmsTemplateCnd;
import com.sy.func.sms.entity.SmsTemplateVo;
import com.sy.func.sms.mapper.SmsTemplateMapper;

@Service
public class SmsTemplateService {
	public Logger logger = Logger.getLogger(SmsTemplateService.class);

	@Autowired
	private SmsTemplateMapper smsTemplateMapper;

	public SmsTemplateVo querySmsTemplateByType(Integer type) throws Exception {
		SmsTemplateCnd smsTemplateCnd = new SmsTemplateCnd();
		smsTemplateCnd.setType(type);
		smsTemplateCnd.setFlag(Constants.SMS_TEMPLATE_FLAG_YES);
		List<SmsTemplateVo> list = smsTemplateMapper
				.querySmsTemplateList(smsTemplateCnd);
		if (null != list && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}
}
