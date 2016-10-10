package com.sy.webservice.client.identifier;


import javax.xml.namespace.QName;

import org.apache.log4j.Logger;

import com.sy.webservice.client.identifier.finance.CheckRequest;
import com.sy.webservice.client.identifier.finance.CheckResponse;
import com.sy.webservice.client.identifier.finance.Credential;
import com.sy.webservice.client.identifier.finance.IdentifierData;
import com.sy.webservice.client.identifier.finance.IsExistsResponse;
import com.sy.webservice.client.identifier.finance.ModifyPwdRequest;
import com.sy.webservice.client.identifier.nciic.IIdentifierService;
import com.sy.webservice.client.identifier.nciic.IdentifierService;



public final class Identifier {
	private static final Logger logger = Logger.getLogger(Identifier.class);

	private static final QName SERVICE_NAME = new QName("http://www.nciic.com.cn", "IdentifierService");
	
	private static final String USERNAME = "gcjr_admin";
	private static final String PASSWORD = "888888";
	
	private static final String RESULT_PASS = "一致";
	
	private static final com.sy.webservice.client.identifier.finance.ObjectFactory financeObjectFactory = new com.sy.webservice.client.identifier.finance.ObjectFactory();
	private static final String credential_json = "{\"UserName\":\"" + USERNAME + "\",\"Password\":\"" + PASSWORD + "\"}";
	private static final Credential credential = new Credential();
	static {
		credential.setUserName(financeObjectFactory.createCredentialUserName(USERNAME));
		credential.setPassword(financeObjectFactory.createCredentialPassword(PASSWORD));
	}

	private static IIdentifierService getIdentifierService() {
		return new IdentifierService(IdentifierService.WSDL_LOCATION, SERVICE_NAME).getBasicHttpBindingIIdentifierService();
	}
	
	/**
	 * <p>
	 * Description:简项认证（json格式 ）<br />
	 * </p>
	 * 
	 * @author yangshijin
	 * @version 0.1 2014年8月14日
	 * @param idNumber
	 * @param name
	 * @return String
	 */
	public static String simpleCheckByJson(final String idNumber, final String name) {
		try {
			return getIdentifierService().simpleCheckByJson(buildCheckRequestJson(idNumber, name), credential_json);
		} catch (Exception e) {
			logger.error("简项认证（json格式 ）", e);
		}
		return null;
	}
	
	/**
	 * <p>
	 * Description:简项认证<br />
	 * </p>
	 * 
	 * @author yangshijin
	 * @version 0.1 2014年8月14日
	 * @param checkRequest
	 * @return com.sy.webservice.client.identifier.finance.CheckResponse
	 */
	public static CheckResponse simpleCheck(final String idNumber, final String name) {
		try {
			return getIdentifierService().simpleCheck(buildCheckRequest(idNumber, name), credential);
		} catch (Exception e) {
			logger.error("简项认证", e);
		}
		return null;
	}
	
	/**
	 * <p>
	 * Description:多项认证 （json格式 ）<br />
	 * </p>
	 * 
	 * @author qiongbiao.zhang
	 * @version 0.1 2014年8月25日
	 * @param idNumber
	 * @param name
	 * @return String
	 */
	public static String exactCheckByJson(final String idNumber, final String name) {
		try {
			return getIdentifierService().exactCheckByJson(buildCheckRequestJson(idNumber, name), credential_json);
		} catch (Exception e) {
			logger.error("多项认证 （json格式 ）", e);
		}
		return null;
	}

	/**
	 * <p>
	 * Description:多项认证 <br />
	 * </p>
	 * 
	 * @author qiongbiao.zhang
	 * @version 0.1 2014年8月25日
	 * @param idNumber
	 * @param name
	 * @return String
	 */
	public static CheckResponse exactCheck(final String idNumber, final String name) {
		try {
			return getIdentifierService().exactCheck(buildCheckRequest(idNumber, name), credential);
		} catch (Exception e) {
			logger.error("多项认证", e);
		}
		return null;
	}

	public static IsExistsResponse isSimpleCitizenExists(final CheckRequest checkRequest) {
		return getIdentifierService().isSimpleCitizenExists(checkRequest, credential);
	}
	
	public static IsExistsResponse isExactCitizenExists(final CheckRequest checkRequest) {
		return getIdentifierService().isExactCitizenExists(checkRequest, credential);
	}

	public static CheckResponse querySimpleCitizenData(final CheckRequest checkRequest) {
		return getIdentifierService().querySimpleCitizenData(checkRequest, credential);
	}
	
	public static CheckResponse queryExactCitizenData(final CheckRequest checkRequest) {
		return getIdentifierService().queryExactCitizenData(checkRequest, credential);
	}

	public static String modifyPasswordByJson(final String userId, final String orgPwd, final String newPwd) {
		return getIdentifierService().modifyPasswordByJson(buildModifyPwdRequest(userId, orgPwd, newPwd), credential_json);
	}

	public static String queryBalance() {
		return getIdentifierService().queryBalance(null, credential_json);
	}
	
	public static boolean isPass(IdentifierData identifierData) {
		return RESULT_PASS.equals(identifierData.getResult().getValue());
	}

	public static String buildModifyPwdRequest(final String userId, final String orgPwd, final String newPwd) {
		return "{\"UserID\":\"" + userId + "\",\"OrgPwd\":\"" + orgPwd + "\",\"NewPwd\":\"" + newPwd + "\"}";
	}

	public static String buildCheckRequestJson(final String idNumber, final String name) {
		return "{\"IDNumber\":\"" + idNumber + "\",\"Name\":\"" + name + "\"}";
	}

	public static CheckRequest buildCheckRequest(final String idNumber, final String name) {
		final CheckRequest checkRequest = new CheckRequest();
		checkRequest.setIDNumber(financeObjectFactory.createCheckRequestIDNumber(idNumber));
		checkRequest.setName(financeObjectFactory.createCheckRequestName(name));
		return checkRequest;
	}
	
	public static void main(String args[]) throws java.lang.Exception {

		final String idNumber = "610122198608241226";
		final String name = "马导丽";
		
		final CheckRequest checkRequest = buildCheckRequest(idNumber, name);
		System.out.println(buildCheckRequestJson(idNumber, name));
		
		final ModifyPwdRequest modifyPwdRequest = new ModifyPwdRequest();
		modifyPwdRequest.setUserID(financeObjectFactory.createModifyPwdRequestUserID("123"));
		modifyPwdRequest.setOrgPwd(financeObjectFactory.createModifyPwdRequestOrgPwd("213"));
		modifyPwdRequest.setNewPwd(financeObjectFactory.createModifyPwdRequestNewPwd("123"));
		System.out.println(buildModifyPwdRequest("", "", ""));

//		System.err.println("Zzz..");
//		Thread.sleep(30 * 1000);
		
		for (int i = 0; i < 100; i++) {
			long t1 = System.currentTimeMillis();
			{
				System.out.println("Invoking getVersion...");
				java.lang.String _getVersion__return = getIdentifierService().getVersion();
				System.out.println("getVersion.result=" + _getVersion__return);
	
			}
			System.out.println(System.currentTimeMillis() - t1);
		}
		
		if (true) {
			return;
		}
		
		{
			// 3.1.1 简项认证（json格式 ）
			System.out.println("Invoking simpleCheckByJson...");
			java.lang.String _simpleCheckByJson__return = simpleCheckByJson(idNumber, name);
			System.out.println("simpleCheckByJson.result=" + _simpleCheckByJson__return);

		}
		
		{
			// 3.1.2 简项认证
			System.out.println("Invoking simpleCheck...");
			CheckResponse _simpleCheck__return = simpleCheck(idNumber, name);
			System.out.println("simpleCheck.result=" + _simpleCheck__return.getResponseCode() + " | " + _simpleCheck__return.getResponseText() + " | " + _simpleCheck__return.getIdentifier().getName());

		}
		
		{
			// 3.1.3 多项认证 （json格式 ）
			System.out.println("Invoking exactCheckByJson...");
			java.lang.String _exactCheckByJson__return = exactCheckByJson(idNumber, name);
			System.out.println("exactCheckByJson.result=" + _exactCheckByJson__return);

		}
		
		{
			// 3.1.4 多项认证
			System.out.println("Invoking exactCheck...");
			CheckResponse _exactCheck__return = exactCheck(idNumber, name);
			System.out.println("exactCheck.result=" + _exactCheck__return);

		}
		
		{
			// 3.1.5 是否存在简项认证历史记录
			System.out.println("Invoking isSimpleCitizenExists...");
			com.sy.webservice.client.identifier.finance.IsExistsResponse _isSimpleCitizenExists__return = isSimpleCitizenExists(checkRequest);
			System.out.println("isSimpleCitizenExists.result=" + _isSimpleCitizenExists__return.isIsExists());

		}

		{
			// 3.1.6 是否存在多项认证历史记录
			System.out.println("Invoking isExactCitizenExists...");
			com.sy.webservice.client.identifier.finance.IsExistsResponse _isExactCitizenExists__return = isExactCitizenExists(checkRequest);
			System.out.println("isExactCitizenExists.result=" + _isExactCitizenExists__return);

		}
		
		{
			// 3.1.7 提取简项认证历史记录
			System.out.println("Invoking querySimpleCitizenData...");
			CheckResponse _querySimpleCitizenData__return = querySimpleCitizenData(checkRequest);
			System.out.println("querySimpleCitizenData.result=" + _querySimpleCitizenData__return);

		}
		
		{
			// 3.1.8 提取多项认证历史记录
			System.out.println("Invoking queryExactCitizenData...");
			CheckResponse _queryExactCitizenData__return = queryExactCitizenData(checkRequest);
			System.out.println("queryExactCitizenData.result=" + _queryExactCitizenData__return.getIdentifier());

		}

		
		{
			// 3.1.9 查询账户余额
			System.out.println("Invoking queryBalance...");
			java.lang.String _queryBalance__return = queryBalance();
			System.out.println("queryBalance.result=" + _queryBalance__return);

		}
		
		{
			// 3.1.10 修改密码
			System.out.println("Invoking modifyPasswordByJson...");
			java.lang.String _modifyPasswordByJson__return = modifyPasswordByJson("", "", "");
			System.out.println("modifyPasswordByJson.result=" + _modifyPasswordByJson__return);

		}
		
		{
			System.out.println("Invoking queryUser...");
			com.sy.webservice.client.identifier.finance.QueryUserResponse _queryUser__return = getIdentifierService().queryUser(credential);
			System.out.println("queryUser.result=" + _queryUser__return);

		}
		
		{
			System.out.println("Invoking querySimpleHistoryData...");
			com.sy.webservice.client.identifier.finance.QueryHistoryRequest _querySimpleHistoryData_request = null;
			com.sy.webservice.client.identifier.finance.QueryHistoryResponse _querySimpleHistoryData__return = getIdentifierService().querySimpleHistoryData(_querySimpleHistoryData_request, credential);
			System.out.println("querySimpleHistoryData.result=" + _querySimpleHistoryData__return);

		}
		
		{
			System.out.println("Invoking modifyPassword...");
			com.sy.webservice.client.identifier.finance.BaseResponse _modifyPassword__return = getIdentifierService().modifyPassword(modifyPwdRequest, credential);
			System.out.println("modifyPassword.result=" + _modifyPassword__return);

		}
		
		{
			System.out.println("Invoking querySimpleHistoryDataCount...");
			com.sy.webservice.client.identifier.finance.QueryHistoryRequest _querySimpleHistoryDataCount_request = null;
			com.sy.webservice.client.identifier.finance.QueryRecordCountResponse _querySimpleHistoryDataCount__return = getIdentifierService().querySimpleHistoryDataCount(_querySimpleHistoryDataCount_request, credential);
			System.out.println("querySimpleHistoryDataCount.result=" + _querySimpleHistoryDataCount__return);

		}
		
		{
			System.out.println("Invoking queryExactHistoryDataCount...");
			com.sy.webservice.client.identifier.finance.QueryHistoryRequest _queryExactHistoryDataCount_request = null;
			com.sy.webservice.client.identifier.finance.QueryRecordCountResponse _queryExactHistoryDataCount__return = getIdentifierService().queryExactHistoryDataCount(_queryExactHistoryDataCount_request, credential);
			System.out.println("queryExactHistoryDataCount.result=" + _queryExactHistoryDataCount__return);

		}
		
		{
			System.out.println("Invoking batchExactCheck...");
			com.sy.webservice.client.identifier.finance.BatchCheckRequest _batchExactCheck_request = null;
			com.sy.webservice.client.identifier.finance.BatchCheckResponse _batchExactCheck__return = getIdentifierService().batchExactCheck(_batchExactCheck_request, credential);
			System.out.println("batchExactCheck.result=" + _batchExactCheck__return);

		}
		
		{
			System.out.println("Invoking modifyUser...");
			com.sy.webservice.client.identifier.finance.LoginUser _modifyUser_user = null;
			com.sy.webservice.client.identifier.finance.BaseResponse _modifyUser__return = getIdentifierService().modifyUser(_modifyUser_user, credential);
			System.out.println("modifyUser.result=" + _modifyUser__return);

		}
		
		{
			System.out.println("Invoking queryAllUser...");
			com.sy.webservice.client.identifier.finance.QueryUserRequest _queryAllUser_request = null;
			com.sy.webservice.client.identifier.finance.QueryUserResponse _queryAllUser__return = getIdentifierService().queryAllUser(_queryAllUser_request, credential);
			System.out.println("queryAllUser.result=" + _queryAllUser__return);

		}
		
		{
			System.out.println("Invoking nciicAddrExactSearch...");
			java.lang.String _nciicAddrExactSearch_inLicense = "";
			java.lang.String _nciicAddrExactSearch_inConditions = "";
			java.lang.String _nciicAddrExactSearch__return = getIdentifierService().nciicAddrExactSearch(_nciicAddrExactSearch_inLicense, _nciicAddrExactSearch_inConditions);
			System.out.println("nciicAddrExactSearch.result=" + _nciicAddrExactSearch__return);

		}
		
		{
			System.out.println("Invoking login...");
			com.sy.webservice.client.identifier.finance.LoginResponse _login__return = getIdentifierService().login(credential);
			System.out.println("login.result=" + _login__return);

		}
		
		{
			System.out.println("Invoking allocateFund...");
			com.sy.webservice.client.identifier.finance.AllocateFundRequest _allocateFund_request = null;
			com.sy.webservice.client.identifier.finance.BaseResponse _allocateFund__return = getIdentifierService().allocateFund(_allocateFund_request, credential);
			System.out.println("allocateFund.result=" + _allocateFund__return);

		}
		
		{
			System.out.println("Invoking queryExactHistoryData...");
			com.sy.webservice.client.identifier.finance.QueryHistoryRequest _queryExactHistoryData_request = null;
			com.sy.webservice.client.identifier.finance.QueryHistoryResponse _queryExactHistoryData__return = getIdentifierService().queryExactHistoryData(_queryExactHistoryData_request, credential);
			System.out.println("queryExactHistoryData.result=" + _queryExactHistoryData__return);

		}
		
		{
			System.out.println("Invoking createUser...");
			com.sy.webservice.client.identifier.finance.LoginUser _createUser_user = null;
			com.sy.webservice.client.identifier.finance.BaseResponse _createUser__return = getIdentifierService().createUser(_createUser_user, credential);
			System.out.println("createUser.result=" + _createUser__return);

		}

		System.exit(0);
	}

}
