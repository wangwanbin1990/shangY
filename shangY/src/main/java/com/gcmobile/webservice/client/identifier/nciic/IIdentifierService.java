package com.gcmobile.webservice.client.identifier.nciic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-25T15:37:52.261+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://www.nciic.com.cn", name = "IIdentifierService")
@XmlSeeAlso({com.gcmobile.webservice.client.identifier.finance.ObjectFactory.class, ObjectFactory.class, com.gcmobile.webservice.client.identifier.serialization.ObjectFactory.class})
public interface IIdentifierService {

    @WebResult(name = "IsSimpleCitizenExistsResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/IsSimpleCitizenExists", output = "http://www.nciic.com.cn/IIdentifierService/IsSimpleCitizenExistsResponse")
    @RequestWrapper(localName = "IsSimpleCitizenExists", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.IsSimpleCitizenExists")
    @WebMethod(operationName = "IsSimpleCitizenExists", action = "http://www.nciic.com.cn/IIdentifierService/IsSimpleCitizenExists")
    @ResponseWrapper(localName = "IsSimpleCitizenExistsResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.IsSimpleCitizenExistsResponse")
    public com.gcmobile.webservice.client.identifier.finance.IsExistsResponse isSimpleCitizenExists(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "ModifyPasswordByJsonResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/ModifyPasswordByJson", output = "http://www.nciic.com.cn/IIdentifierService/ModifyPasswordByJsonResponse")
    @RequestWrapper(localName = "ModifyPasswordByJson", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyPasswordByJson")
    @WebMethod(operationName = "ModifyPasswordByJson", action = "http://www.nciic.com.cn/IIdentifierService/ModifyPasswordByJson")
    @ResponseWrapper(localName = "ModifyPasswordByJsonResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyPasswordByJsonResponse")
    public java.lang.String modifyPasswordByJson(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String cred
    );

    @WebResult(name = "QueryExactCitizenDataResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryExactCitizenData", output = "http://www.nciic.com.cn/IIdentifierService/QueryExactCitizenDataResponse")
    @RequestWrapper(localName = "QueryExactCitizenData", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactCitizenData")
    @WebMethod(operationName = "QueryExactCitizenData", action = "http://www.nciic.com.cn/IIdentifierService/QueryExactCitizenData")
    @ResponseWrapper(localName = "QueryExactCitizenDataResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactCitizenDataResponse")
    public com.gcmobile.webservice.client.identifier.finance.CheckResponse queryExactCitizenData(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QueryUserResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryUser", output = "http://www.nciic.com.cn/IIdentifierService/QueryUserResponse")
    @RequestWrapper(localName = "QueryUser", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryUser")
    @WebMethod(operationName = "QueryUser", action = "http://www.nciic.com.cn/IIdentifierService/QueryUser")
    @ResponseWrapper(localName = "QueryUserResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryUserResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryUserResponse queryUser(
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QuerySimpleHistoryDataResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryData", output = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryDataResponse")
    @RequestWrapper(localName = "QuerySimpleHistoryData", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleHistoryData")
    @WebMethod(operationName = "QuerySimpleHistoryData", action = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryData")
    @ResponseWrapper(localName = "QuerySimpleHistoryDataResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleHistoryDataResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryHistoryResponse querySimpleHistoryData(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.QueryHistoryRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "ExactCheckByJsonResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/ExactCheckByJson", output = "http://www.nciic.com.cn/IIdentifierService/ExactCheckByJsonResponse")
    @RequestWrapper(localName = "ExactCheckByJson", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ExactCheckByJson")
    @WebMethod(operationName = "ExactCheckByJson", action = "http://www.nciic.com.cn/IIdentifierService/ExactCheckByJson")
    @ResponseWrapper(localName = "ExactCheckByJsonResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ExactCheckByJsonResponse")
    public java.lang.String exactCheckByJson(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String cred
    );

    @WebResult(name = "ModifyPasswordResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/ModifyPassword", output = "http://www.nciic.com.cn/IIdentifierService/ModifyPasswordResponse")
    @RequestWrapper(localName = "ModifyPassword", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyPassword")
    @WebMethod(operationName = "ModifyPassword", action = "http://www.nciic.com.cn/IIdentifierService/ModifyPassword")
    @ResponseWrapper(localName = "ModifyPasswordResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyPasswordResponse")
    public com.gcmobile.webservice.client.identifier.finance.BaseResponse modifyPassword(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.ModifyPwdRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "SimpleCheckResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/SimpleCheck", output = "http://www.nciic.com.cn/IIdentifierService/SimpleCheckResponse")
    @RequestWrapper(localName = "SimpleCheck", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.SimpleCheck")
    @WebMethod(operationName = "SimpleCheck", action = "http://www.nciic.com.cn/IIdentifierService/SimpleCheck")
    @ResponseWrapper(localName = "SimpleCheckResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.SimpleCheckResponse")
    public com.gcmobile.webservice.client.identifier.finance.CheckResponse simpleCheck(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "IsExactCitizenExistsResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/IsExactCitizenExists", output = "http://www.nciic.com.cn/IIdentifierService/IsExactCitizenExistsResponse")
    @RequestWrapper(localName = "IsExactCitizenExists", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.IsExactCitizenExists")
    @WebMethod(operationName = "IsExactCitizenExists", action = "http://www.nciic.com.cn/IIdentifierService/IsExactCitizenExists")
    @ResponseWrapper(localName = "IsExactCitizenExistsResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.IsExactCitizenExistsResponse")
    public com.gcmobile.webservice.client.identifier.finance.IsExistsResponse isExactCitizenExists(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "ExactCheckResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/ExactCheck", output = "http://www.nciic.com.cn/IIdentifierService/ExactCheckResponse")
    @RequestWrapper(localName = "ExactCheck", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ExactCheck")
    @WebMethod(operationName = "ExactCheck", action = "http://www.nciic.com.cn/IIdentifierService/ExactCheck")
    @ResponseWrapper(localName = "ExactCheckResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ExactCheckResponse")
    public com.gcmobile.webservice.client.identifier.finance.CheckResponse exactCheck(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QuerySimpleHistoryDataCountResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryDataCount", output = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryDataCountResponse")
    @RequestWrapper(localName = "QuerySimpleHistoryDataCount", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleHistoryDataCount")
    @WebMethod(operationName = "QuerySimpleHistoryDataCount", action = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleHistoryDataCount")
    @ResponseWrapper(localName = "QuerySimpleHistoryDataCountResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleHistoryDataCountResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryRecordCountResponse querySimpleHistoryDataCount(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.QueryHistoryRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QueryExactHistoryDataCountResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryDataCount", output = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryDataCountResponse")
    @RequestWrapper(localName = "QueryExactHistoryDataCount", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactHistoryDataCount")
    @WebMethod(operationName = "QueryExactHistoryDataCount", action = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryDataCount")
    @ResponseWrapper(localName = "QueryExactHistoryDataCountResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactHistoryDataCountResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryRecordCountResponse queryExactHistoryDataCount(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.QueryHistoryRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "BatchExactCheckResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/BatchExactCheck", output = "http://www.nciic.com.cn/IIdentifierService/BatchExactCheckResponse")
    @RequestWrapper(localName = "BatchExactCheck", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.BatchExactCheck")
    @WebMethod(operationName = "BatchExactCheck", action = "http://www.nciic.com.cn/IIdentifierService/BatchExactCheck")
    @ResponseWrapper(localName = "BatchExactCheckResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.BatchExactCheckResponse")
    public com.gcmobile.webservice.client.identifier.finance.BatchCheckResponse batchExactCheck(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.BatchCheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "SimpleCheckByJsonResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/SimpleCheckByJson", output = "http://www.nciic.com.cn/IIdentifierService/SimpleCheckByJsonResponse")
    @RequestWrapper(localName = "SimpleCheckByJson", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.SimpleCheckByJson")
    @WebMethod(operationName = "SimpleCheckByJson", action = "http://www.nciic.com.cn/IIdentifierService/SimpleCheckByJson")
    @ResponseWrapper(localName = "SimpleCheckByJsonResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.SimpleCheckByJsonResponse")
    public java.lang.String simpleCheckByJson(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String cred
    );

    @WebResult(name = "ModifyUserResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/ModifyUser", output = "http://www.nciic.com.cn/IIdentifierService/ModifyUserResponse")
    @RequestWrapper(localName = "ModifyUser", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyUser")
    @WebMethod(operationName = "ModifyUser", action = "http://www.nciic.com.cn/IIdentifierService/ModifyUser")
    @ResponseWrapper(localName = "ModifyUserResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.ModifyUserResponse")
    public com.gcmobile.webservice.client.identifier.finance.BaseResponse modifyUser(
        @WebParam(name = "user", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.LoginUser user,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QueryAllUserResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryAllUser", output = "http://www.nciic.com.cn/IIdentifierService/QueryAllUserResponse")
    @RequestWrapper(localName = "QueryAllUser", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryAllUser")
    @WebMethod(operationName = "QueryAllUser", action = "http://www.nciic.com.cn/IIdentifierService/QueryAllUser")
    @ResponseWrapper(localName = "QueryAllUserResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryAllUserResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryUserResponse queryAllUser(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.QueryUserRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "nciicAddrExactSearchResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/nciicAddrExactSearch", output = "http://www.nciic.com.cn/IIdentifierService/nciicAddrExactSearchResponse")
    @RequestWrapper(localName = "nciicAddrExactSearch", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.NciicAddrExactSearch")
    @WebMethod(action = "http://www.nciic.com.cn/IIdentifierService/nciicAddrExactSearch")
    @ResponseWrapper(localName = "nciicAddrExactSearchResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.NciicAddrExactSearchResponse")
    public java.lang.String nciicAddrExactSearch(
        @WebParam(name = "inLicense", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String inLicense,
        @WebParam(name = "inConditions", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String inConditions
    );

    @WebResult(name = "LoginResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/Login", output = "http://www.nciic.com.cn/IIdentifierService/LoginResponse")
    @RequestWrapper(localName = "Login", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.Login")
    @WebMethod(operationName = "Login", action = "http://www.nciic.com.cn/IIdentifierService/Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.LoginResponse")
    public com.gcmobile.webservice.client.identifier.finance.LoginResponse login(
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QuerySimpleCitizenDataResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleCitizenData", output = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleCitizenDataResponse")
    @RequestWrapper(localName = "QuerySimpleCitizenData", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleCitizenData")
    @WebMethod(operationName = "QuerySimpleCitizenData", action = "http://www.nciic.com.cn/IIdentifierService/QuerySimpleCitizenData")
    @ResponseWrapper(localName = "QuerySimpleCitizenDataResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QuerySimpleCitizenDataResponse")
    public com.gcmobile.webservice.client.identifier.finance.CheckResponse querySimpleCitizenData(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.CheckRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "AllocateFundResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/AllocateFund", output = "http://www.nciic.com.cn/IIdentifierService/AllocateFundResponse")
    @RequestWrapper(localName = "AllocateFund", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.AllocateFund")
    @WebMethod(operationName = "AllocateFund", action = "http://www.nciic.com.cn/IIdentifierService/AllocateFund")
    @ResponseWrapper(localName = "AllocateFundResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.AllocateFundResponse")
    public com.gcmobile.webservice.client.identifier.finance.BaseResponse allocateFund(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.AllocateFundRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QueryExactHistoryDataResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryData", output = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryDataResponse")
    @RequestWrapper(localName = "QueryExactHistoryData", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactHistoryData")
    @WebMethod(operationName = "QueryExactHistoryData", action = "http://www.nciic.com.cn/IIdentifierService/QueryExactHistoryData")
    @ResponseWrapper(localName = "QueryExactHistoryDataResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryExactHistoryDataResponse")
    public com.gcmobile.webservice.client.identifier.finance.QueryHistoryResponse queryExactHistoryData(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.QueryHistoryRequest request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "CreateUserResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/CreateUser", output = "http://www.nciic.com.cn/IIdentifierService/CreateUserResponse")
    @RequestWrapper(localName = "CreateUser", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.CreateUser")
    @WebMethod(operationName = "CreateUser", action = "http://www.nciic.com.cn/IIdentifierService/CreateUser")
    @ResponseWrapper(localName = "CreateUserResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.CreateUserResponse")
    public com.gcmobile.webservice.client.identifier.finance.BaseResponse createUser(
        @WebParam(name = "user", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.LoginUser user,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        com.gcmobile.webservice.client.identifier.finance.Credential cred
    );

    @WebResult(name = "QueryBalanceResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/QueryBalance", output = "http://www.nciic.com.cn/IIdentifierService/QueryBalanceResponse")
    @RequestWrapper(localName = "QueryBalance", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryBalance")
    @WebMethod(operationName = "QueryBalance", action = "http://www.nciic.com.cn/IIdentifierService/QueryBalance")
    @ResponseWrapper(localName = "QueryBalanceResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.QueryBalanceResponse")
    public java.lang.String queryBalance(
        @WebParam(name = "request", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String request,
        @WebParam(name = "cred", targetNamespace = "http://www.nciic.com.cn")
        java.lang.String cred
    );

    @WebResult(name = "GetVersionResult", targetNamespace = "http://www.nciic.com.cn")
    @Action(input = "http://www.nciic.com.cn/IIdentifierService/GetVersion", output = "http://www.nciic.com.cn/IIdentifierService/GetVersionResponse")
    @RequestWrapper(localName = "GetVersion", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.GetVersion")
    @WebMethod(operationName = "GetVersion", action = "http://www.nciic.com.cn/IIdentifierService/GetVersion")
    @ResponseWrapper(localName = "GetVersionResponse", targetNamespace = "http://www.nciic.com.cn", className = "com.gcmobile.webservice.client.identifier.nciic.GetVersionResponse")
    public java.lang.String getVersion();
}
