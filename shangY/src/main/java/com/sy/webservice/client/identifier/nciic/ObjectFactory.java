
package com.sy.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.sy.webservice.client.identifier.finance.AllocateFundRequest;
import com.sy.webservice.client.identifier.finance.BaseResponse;
import com.sy.webservice.client.identifier.finance.BatchCheckRequest;
import com.sy.webservice.client.identifier.finance.BatchCheckResponse;
import com.sy.webservice.client.identifier.finance.CheckRequest;
import com.sy.webservice.client.identifier.finance.CheckResponse;
import com.sy.webservice.client.identifier.finance.Credential;
import com.sy.webservice.client.identifier.finance.IsExistsResponse;
import com.sy.webservice.client.identifier.finance.LoginUser;
import com.sy.webservice.client.identifier.finance.ModifyPwdRequest;
import com.sy.webservice.client.identifier.finance.QueryHistoryRequest;
import com.sy.webservice.client.identifier.finance.QueryHistoryResponse;
import com.sy.webservice.client.identifier.finance.QueryRecordCountResponse;
import com.sy.webservice.client.identifier.finance.QueryUserRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sy.webservice.client.identifier.nciic package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryExactHistoryDataCountResponseQueryExactHistoryDataCountResult_QNAME = new QName("http://www.nciic.com.cn", "QueryExactHistoryDataCountResult");
    private final static QName _BatchExactCheckResponseBatchExactCheckResult_QNAME = new QName("http://www.nciic.com.cn", "BatchExactCheckResult");
    private final static QName _ExactCheckByJsonRequest_QNAME = new QName("http://www.nciic.com.cn", "request");
    private final static QName _ExactCheckByJsonCred_QNAME = new QName("http://www.nciic.com.cn", "cred");
    private final static QName _ExactCheckByJsonResponseExactCheckByJsonResult_QNAME = new QName("http://www.nciic.com.cn", "ExactCheckByJsonResult");
    private final static QName _QueryUserResponseQueryUserResult_QNAME = new QName("http://www.nciic.com.cn", "QueryUserResult");
    private final static QName _QueryBalanceResponseQueryBalanceResult_QNAME = new QName("http://www.nciic.com.cn", "QueryBalanceResult");
    private final static QName _SimpleCheckByJsonResponseSimpleCheckByJsonResult_QNAME = new QName("http://www.nciic.com.cn", "SimpleCheckByJsonResult");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://www.nciic.com.cn", "LoginResult");
    private final static QName _QuerySimpleCitizenDataResponseQuerySimpleCitizenDataResult_QNAME = new QName("http://www.nciic.com.cn", "QuerySimpleCitizenDataResult");
    private final static QName _ModifyPasswordResponseModifyPasswordResult_QNAME = new QName("http://www.nciic.com.cn", "ModifyPasswordResult");
    private final static QName _CreateUserResponseCreateUserResult_QNAME = new QName("http://www.nciic.com.cn", "CreateUserResult");
    private final static QName _NciicAddrExactSearchInConditions_QNAME = new QName("http://www.nciic.com.cn", "inConditions");
    private final static QName _NciicAddrExactSearchInLicense_QNAME = new QName("http://www.nciic.com.cn", "inLicense");
    private final static QName _QuerySimpleHistoryDataCountResponseQuerySimpleHistoryDataCountResult_QNAME = new QName("http://www.nciic.com.cn", "QuerySimpleHistoryDataCountResult");
    private final static QName _QueryExactHistoryDataResponseQueryExactHistoryDataResult_QNAME = new QName("http://www.nciic.com.cn", "QueryExactHistoryDataResult");
    private final static QName _ModifyUserResponseModifyUserResult_QNAME = new QName("http://www.nciic.com.cn", "ModifyUserResult");
    private final static QName _AllocateFundResponseAllocateFundResult_QNAME = new QName("http://www.nciic.com.cn", "AllocateFundResult");
    private final static QName _IsExactCitizenExistsResponseIsExactCitizenExistsResult_QNAME = new QName("http://www.nciic.com.cn", "IsExactCitizenExistsResult");
    private final static QName _QuerySimpleHistoryDataResponseQuerySimpleHistoryDataResult_QNAME = new QName("http://www.nciic.com.cn", "QuerySimpleHistoryDataResult");
    private final static QName _QueryAllUserResponseQueryAllUserResult_QNAME = new QName("http://www.nciic.com.cn", "QueryAllUserResult");
    private final static QName _ModifyPasswordByJsonResponseModifyPasswordByJsonResult_QNAME = new QName("http://www.nciic.com.cn", "ModifyPasswordByJsonResult");
    private final static QName _CreateUserUser_QNAME = new QName("http://www.nciic.com.cn", "user");
    private final static QName _QueryExactCitizenDataResponseQueryExactCitizenDataResult_QNAME = new QName("http://www.nciic.com.cn", "QueryExactCitizenDataResult");
    private final static QName _NciicAddrExactSearchResponseNciicAddrExactSearchResult_QNAME = new QName("http://www.nciic.com.cn", "nciicAddrExactSearchResult");
    private final static QName _IsSimpleCitizenExistsResponseIsSimpleCitizenExistsResult_QNAME = new QName("http://www.nciic.com.cn", "IsSimpleCitizenExistsResult");
    private final static QName _SimpleCheckResponseSimpleCheckResult_QNAME = new QName("http://www.nciic.com.cn", "SimpleCheckResult");
    private final static QName _ExactCheckResponseExactCheckResult_QNAME = new QName("http://www.nciic.com.cn", "ExactCheckResult");
    private final static QName _GetVersionResponseGetVersionResult_QNAME = new QName("http://www.nciic.com.cn", "GetVersionResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sy.webservice.client.identifier.nciic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsSimpleCitizenExists }
     * 
     */
    public IsSimpleCitizenExists createIsSimpleCitizenExists() {
        return new IsSimpleCitizenExists();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link QuerySimpleCitizenDataResponse }
     * 
     */
    public QuerySimpleCitizenDataResponse createQuerySimpleCitizenDataResponse() {
        return new QuerySimpleCitizenDataResponse();
    }

    /**
     * Create an instance of {@link SimpleCheckByJson }
     * 
     */
    public SimpleCheckByJson createSimpleCheckByJson() {
        return new SimpleCheckByJson();
    }

    /**
     * Create an instance of {@link QueryExactCitizenData }
     * 
     */
    public QueryExactCitizenData createQueryExactCitizenData() {
        return new QueryExactCitizenData();
    }

    /**
     * Create an instance of {@link ExactCheckResponse }
     * 
     */
    public ExactCheckResponse createExactCheckResponse() {
        return new ExactCheckResponse();
    }

    /**
     * Create an instance of {@link QueryExactHistoryDataCount }
     * 
     */
    public QueryExactHistoryDataCount createQueryExactHistoryDataCount() {
        return new QueryExactHistoryDataCount();
    }

    /**
     * Create an instance of {@link QueryAllUserResponse }
     * 
     */
    public QueryAllUserResponse createQueryAllUserResponse() {
        return new QueryAllUserResponse();
    }

    /**
     * Create an instance of {@link IsExactCitizenExistsResponse }
     * 
     */
    public IsExactCitizenExistsResponse createIsExactCitizenExistsResponse() {
        return new IsExactCitizenExistsResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link QueryExactCitizenDataResponse }
     * 
     */
    public QueryExactCitizenDataResponse createQueryExactCitizenDataResponse() {
        return new QueryExactCitizenDataResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link ExactCheck }
     * 
     */
    public ExactCheck createExactCheck() {
        return new ExactCheck();
    }

    /**
     * Create an instance of {@link AllocateFundResponse }
     * 
     */
    public AllocateFundResponse createAllocateFundResponse() {
        return new AllocateFundResponse();
    }

    /**
     * Create an instance of {@link BatchExactCheckResponse }
     * 
     */
    public BatchExactCheckResponse createBatchExactCheckResponse() {
        return new BatchExactCheckResponse();
    }

    /**
     * Create an instance of {@link QuerySimpleHistoryDataCount }
     * 
     */
    public QuerySimpleHistoryDataCount createQuerySimpleHistoryDataCount() {
        return new QuerySimpleHistoryDataCount();
    }

    /**
     * Create an instance of {@link SimpleCheckResponse }
     * 
     */
    public SimpleCheckResponse createSimpleCheckResponse() {
        return new SimpleCheckResponse();
    }

    /**
     * Create an instance of {@link BatchExactCheck }
     * 
     */
    public BatchExactCheck createBatchExactCheck() {
        return new BatchExactCheck();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link com.sy.webservice.client.identifier.nciic.QueryUserResponse }
     * 
     */
    public com.sy.webservice.client.identifier.nciic.QueryUserResponse createQueryUserResponse() {
        return new com.sy.webservice.client.identifier.nciic.QueryUserResponse();
    }

    /**
     * Create an instance of {@link QuerySimpleCitizenData }
     * 
     */
    public QuerySimpleCitizenData createQuerySimpleCitizenData() {
        return new QuerySimpleCitizenData();
    }

    /**
     * Create an instance of {@link QueryExactHistoryDataResponse }
     * 
     */
    public QueryExactHistoryDataResponse createQueryExactHistoryDataResponse() {
        return new QueryExactHistoryDataResponse();
    }

    /**
     * Create an instance of {@link com.sy.webservice.client.identifier.nciic.LoginResponse }
     * 
     */
    public com.sy.webservice.client.identifier.nciic.LoginResponse createLoginResponse() {
        return new com.sy.webservice.client.identifier.nciic.LoginResponse();
    }

    /**
     * Create an instance of {@link QueryExactHistoryDataCountResponse }
     * 
     */
    public QueryExactHistoryDataCountResponse createQueryExactHistoryDataCountResponse() {
        return new QueryExactHistoryDataCountResponse();
    }

    /**
     * Create an instance of {@link QuerySimpleHistoryData }
     * 
     */
    public QuerySimpleHistoryData createQuerySimpleHistoryData() {
        return new QuerySimpleHistoryData();
    }

    /**
     * Create an instance of {@link ModifyPasswordResponse }
     * 
     */
    public ModifyPasswordResponse createModifyPasswordResponse() {
        return new ModifyPasswordResponse();
    }

    /**
     * Create an instance of {@link QueryAllUser }
     * 
     */
    public QueryAllUser createQueryAllUser() {
        return new QueryAllUser();
    }

    /**
     * Create an instance of {@link ModifyUser }
     * 
     */
    public ModifyUser createModifyUser() {
        return new ModifyUser();
    }

    /**
     * Create an instance of {@link IsExactCitizenExists }
     * 
     */
    public IsExactCitizenExists createIsExactCitizenExists() {
        return new IsExactCitizenExists();
    }

    /**
     * Create an instance of {@link QuerySimpleHistoryDataCountResponse }
     * 
     */
    public QuerySimpleHistoryDataCountResponse createQuerySimpleHistoryDataCountResponse() {
        return new QuerySimpleHistoryDataCountResponse();
    }

    /**
     * Create an instance of {@link QueryBalance }
     * 
     */
    public QueryBalance createQueryBalance() {
        return new QueryBalance();
    }

    /**
     * Create an instance of {@link ModifyPasswordByJsonResponse }
     * 
     */
    public ModifyPasswordByJsonResponse createModifyPasswordByJsonResponse() {
        return new ModifyPasswordByJsonResponse();
    }

    /**
     * Create an instance of {@link QuerySimpleHistoryDataResponse }
     * 
     */
    public QuerySimpleHistoryDataResponse createQuerySimpleHistoryDataResponse() {
        return new QuerySimpleHistoryDataResponse();
    }

    /**
     * Create an instance of {@link ModifyUserResponse }
     * 
     */
    public ModifyUserResponse createModifyUserResponse() {
        return new ModifyUserResponse();
    }

    /**
     * Create an instance of {@link SimpleCheck }
     * 
     */
    public SimpleCheck createSimpleCheck() {
        return new SimpleCheck();
    }

    /**
     * Create an instance of {@link ExactCheckByJsonResponse }
     * 
     */
    public ExactCheckByJsonResponse createExactCheckByJsonResponse() {
        return new ExactCheckByJsonResponse();
    }

    /**
     * Create an instance of {@link AllocateFund }
     * 
     */
    public AllocateFund createAllocateFund() {
        return new AllocateFund();
    }

    /**
     * Create an instance of {@link QueryBalanceResponse }
     * 
     */
    public QueryBalanceResponse createQueryBalanceResponse() {
        return new QueryBalanceResponse();
    }

    /**
     * Create an instance of {@link QueryExactHistoryData }
     * 
     */
    public QueryExactHistoryData createQueryExactHistoryData() {
        return new QueryExactHistoryData();
    }

    /**
     * Create an instance of {@link NciicAddrExactSearch }
     * 
     */
    public NciicAddrExactSearch createNciicAddrExactSearch() {
        return new NciicAddrExactSearch();
    }

    /**
     * Create an instance of {@link ModifyPassword }
     * 
     */
    public ModifyPassword createModifyPassword() {
        return new ModifyPassword();
    }

    /**
     * Create an instance of {@link ModifyPasswordByJson }
     * 
     */
    public ModifyPasswordByJson createModifyPasswordByJson() {
        return new ModifyPasswordByJson();
    }

    /**
     * Create an instance of {@link ExactCheckByJson }
     * 
     */
    public ExactCheckByJson createExactCheckByJson() {
        return new ExactCheckByJson();
    }

    /**
     * Create an instance of {@link QueryUser }
     * 
     */
    public QueryUser createQueryUser() {
        return new QueryUser();
    }

    /**
     * Create an instance of {@link SimpleCheckByJsonResponse }
     * 
     */
    public SimpleCheckByJsonResponse createSimpleCheckByJsonResponse() {
        return new SimpleCheckByJsonResponse();
    }

    /**
     * Create an instance of {@link NciicAddrExactSearchResponse }
     * 
     */
    public NciicAddrExactSearchResponse createNciicAddrExactSearchResponse() {
        return new NciicAddrExactSearchResponse();
    }

    /**
     * Create an instance of {@link IsSimpleCitizenExistsResponse }
     * 
     */
    public IsSimpleCitizenExistsResponse createIsSimpleCitizenExistsResponse() {
        return new IsSimpleCitizenExistsResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryExactHistoryDataCountResult", scope = QueryExactHistoryDataCountResponse.class)
    public JAXBElement<QueryRecordCountResponse> createQueryExactHistoryDataCountResponseQueryExactHistoryDataCountResult(QueryRecordCountResponse value) {
        return new JAXBElement<QueryRecordCountResponse>(_QueryExactHistoryDataCountResponseQueryExactHistoryDataCountResult_QNAME, QueryRecordCountResponse.class, QueryExactHistoryDataCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "BatchExactCheckResult", scope = BatchExactCheckResponse.class)
    public JAXBElement<BatchCheckResponse> createBatchExactCheckResponseBatchExactCheckResult(BatchCheckResponse value) {
        return new JAXBElement<BatchCheckResponse>(_BatchExactCheckResponseBatchExactCheckResult_QNAME, BatchCheckResponse.class, BatchExactCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = ExactCheckByJson.class)
    public JAXBElement<String> createExactCheckByJsonRequest(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonRequest_QNAME, String.class, ExactCheckByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = ExactCheckByJson.class)
    public JAXBElement<String> createExactCheckByJsonCred(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonCred_QNAME, String.class, ExactCheckByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QueryBalance.class)
    public JAXBElement<String> createQueryBalanceRequest(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonRequest_QNAME, String.class, QueryBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryBalance.class)
    public JAXBElement<String> createQueryBalanceCred(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonCred_QNAME, String.class, QueryBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "ExactCheckByJsonResult", scope = ExactCheckByJsonResponse.class)
    public JAXBElement<String> createExactCheckByJsonResponseExactCheckByJsonResult(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonResponseExactCheckByJsonResult_QNAME, String.class, ExactCheckByJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.sy.webservice.client.identifier.finance.QueryUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryUserResult", scope = com.sy.webservice.client.identifier.nciic.QueryUserResponse.class)
    public JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse> createQueryUserResponseQueryUserResult(com.sy.webservice.client.identifier.finance.QueryUserResponse value) {
        return new JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse>(_QueryUserResponseQueryUserResult_QNAME, com.sy.webservice.client.identifier.finance.QueryUserResponse.class, com.sy.webservice.client.identifier.nciic.QueryUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyPwdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = ModifyPassword.class)
    public JAXBElement<ModifyPwdRequest> createModifyPasswordRequest(ModifyPwdRequest value) {
        return new JAXBElement<ModifyPwdRequest>(_ExactCheckByJsonRequest_QNAME, ModifyPwdRequest.class, ModifyPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = ModifyPassword.class)
    public JAXBElement<Credential> createModifyPasswordCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, ModifyPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = ModifyPasswordByJson.class)
    public JAXBElement<String> createModifyPasswordByJsonRequest(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonRequest_QNAME, String.class, ModifyPasswordByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = ModifyPasswordByJson.class)
    public JAXBElement<String> createModifyPasswordByJsonCred(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonCred_QNAME, String.class, ModifyPasswordByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryBalanceResult", scope = QueryBalanceResponse.class)
    public JAXBElement<String> createQueryBalanceResponseQueryBalanceResult(String value) {
        return new JAXBElement<String>(_QueryBalanceResponseQueryBalanceResult_QNAME, String.class, QueryBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "SimpleCheckByJsonResult", scope = SimpleCheckByJsonResponse.class)
    public JAXBElement<String> createSimpleCheckByJsonResponseSimpleCheckByJsonResult(String value) {
        return new JAXBElement<String>(_SimpleCheckByJsonResponseSimpleCheckByJsonResult_QNAME, String.class, SimpleCheckByJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = SimpleCheck.class)
    public JAXBElement<CheckRequest> createSimpleCheckRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, SimpleCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = SimpleCheck.class)
    public JAXBElement<Credential> createSimpleCheckCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, SimpleCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = Login.class)
    public JAXBElement<Credential> createLoginCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QueryExactCitizenData.class)
    public JAXBElement<CheckRequest> createQueryExactCitizenDataRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, QueryExactCitizenData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryExactCitizenData.class)
    public JAXBElement<Credential> createQueryExactCitizenDataCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QueryExactCitizenData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.sy.webservice.client.identifier.finance.LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "LoginResult", scope = com.sy.webservice.client.identifier.nciic.LoginResponse.class)
    public JAXBElement<com.sy.webservice.client.identifier.finance.LoginResponse> createLoginResponseLoginResult(com.sy.webservice.client.identifier.finance.LoginResponse value) {
        return new JAXBElement<com.sy.webservice.client.identifier.finance.LoginResponse>(_LoginResponseLoginResult_QNAME, com.sy.webservice.client.identifier.finance.LoginResponse.class, com.sy.webservice.client.identifier.nciic.LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = IsSimpleCitizenExists.class)
    public JAXBElement<CheckRequest> createIsSimpleCitizenExistsRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, IsSimpleCitizenExists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = IsSimpleCitizenExists.class)
    public JAXBElement<Credential> createIsSimpleCitizenExistsCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, IsSimpleCitizenExists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QuerySimpleCitizenDataResult", scope = QuerySimpleCitizenDataResponse.class)
    public JAXBElement<CheckResponse> createQuerySimpleCitizenDataResponseQuerySimpleCitizenDataResult(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_QuerySimpleCitizenDataResponseQuerySimpleCitizenDataResult_QNAME, CheckResponse.class, QuerySimpleCitizenDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QueryExactHistoryDataCount.class)
    public JAXBElement<QueryHistoryRequest> createQueryExactHistoryDataCountRequest(QueryHistoryRequest value) {
        return new JAXBElement<QueryHistoryRequest>(_ExactCheckByJsonRequest_QNAME, QueryHistoryRequest.class, QueryExactHistoryDataCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryExactHistoryDataCount.class)
    public JAXBElement<Credential> createQueryExactHistoryDataCountCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QueryExactHistoryDataCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QueryAllUser.class)
    public JAXBElement<QueryUserRequest> createQueryAllUserRequest(QueryUserRequest value) {
        return new JAXBElement<QueryUserRequest>(_ExactCheckByJsonRequest_QNAME, QueryUserRequest.class, QueryAllUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryAllUser.class)
    public JAXBElement<Credential> createQueryAllUserCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QueryAllUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "ModifyPasswordResult", scope = ModifyPasswordResponse.class)
    public JAXBElement<BaseResponse> createModifyPasswordResponseModifyPasswordResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_ModifyPasswordResponseModifyPasswordResult_QNAME, BaseResponse.class, ModifyPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "CreateUserResult", scope = CreateUserResponse.class)
    public JAXBElement<BaseResponse> createCreateUserResponseCreateUserResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_CreateUserResponseCreateUserResult_QNAME, BaseResponse.class, CreateUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "inConditions", scope = NciicAddrExactSearch.class)
    public JAXBElement<String> createNciicAddrExactSearchInConditions(String value) {
        return new JAXBElement<String>(_NciicAddrExactSearchInConditions_QNAME, String.class, NciicAddrExactSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "inLicense", scope = NciicAddrExactSearch.class)
    public JAXBElement<String> createNciicAddrExactSearchInLicense(String value) {
        return new JAXBElement<String>(_NciicAddrExactSearchInLicense_QNAME, String.class, NciicAddrExactSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QuerySimpleHistoryData.class)
    public JAXBElement<QueryHistoryRequest> createQuerySimpleHistoryDataRequest(QueryHistoryRequest value) {
        return new JAXBElement<QueryHistoryRequest>(_ExactCheckByJsonRequest_QNAME, QueryHistoryRequest.class, QuerySimpleHistoryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QuerySimpleHistoryData.class)
    public JAXBElement<Credential> createQuerySimpleHistoryDataCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QuerySimpleHistoryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QuerySimpleHistoryDataCountResult", scope = QuerySimpleHistoryDataCountResponse.class)
    public JAXBElement<QueryRecordCountResponse> createQuerySimpleHistoryDataCountResponseQuerySimpleHistoryDataCountResult(QueryRecordCountResponse value) {
        return new JAXBElement<QueryRecordCountResponse>(_QuerySimpleHistoryDataCountResponseQuerySimpleHistoryDataCountResult_QNAME, QueryRecordCountResponse.class, QuerySimpleHistoryDataCountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryExactHistoryDataResult", scope = QueryExactHistoryDataResponse.class)
    public JAXBElement<QueryHistoryResponse> createQueryExactHistoryDataResponseQueryExactHistoryDataResult(QueryHistoryResponse value) {
        return new JAXBElement<QueryHistoryResponse>(_QueryExactHistoryDataResponseQueryExactHistoryDataResult_QNAME, QueryHistoryResponse.class, QueryExactHistoryDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "ModifyUserResult", scope = ModifyUserResponse.class)
    public JAXBElement<BaseResponse> createModifyUserResponseModifyUserResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_ModifyUserResponseModifyUserResult_QNAME, BaseResponse.class, ModifyUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "AllocateFundResult", scope = AllocateFundResponse.class)
    public JAXBElement<BaseResponse> createAllocateFundResponseAllocateFundResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_AllocateFundResponseAllocateFundResult_QNAME, BaseResponse.class, AllocateFundResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "IsExactCitizenExistsResult", scope = IsExactCitizenExistsResponse.class)
    public JAXBElement<IsExistsResponse> createIsExactCitizenExistsResponseIsExactCitizenExistsResult(IsExistsResponse value) {
        return new JAXBElement<IsExistsResponse>(_IsExactCitizenExistsResponseIsExactCitizenExistsResult_QNAME, IsExistsResponse.class, IsExactCitizenExistsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QueryExactHistoryData.class)
    public JAXBElement<QueryHistoryRequest> createQueryExactHistoryDataRequest(QueryHistoryRequest value) {
        return new JAXBElement<QueryHistoryRequest>(_ExactCheckByJsonRequest_QNAME, QueryHistoryRequest.class, QueryExactHistoryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryExactHistoryData.class)
    public JAXBElement<Credential> createQueryExactHistoryDataCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QueryExactHistoryData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = BatchExactCheck.class)
    public JAXBElement<BatchCheckRequest> createBatchExactCheckRequest(BatchCheckRequest value) {
        return new JAXBElement<BatchCheckRequest>(_ExactCheckByJsonRequest_QNAME, BatchCheckRequest.class, BatchExactCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = BatchExactCheck.class)
    public JAXBElement<Credential> createBatchExactCheckCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, BatchExactCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QuerySimpleHistoryDataResult", scope = QuerySimpleHistoryDataResponse.class)
    public JAXBElement<QueryHistoryResponse> createQuerySimpleHistoryDataResponseQuerySimpleHistoryDataResult(QueryHistoryResponse value) {
        return new JAXBElement<QueryHistoryResponse>(_QuerySimpleHistoryDataResponseQuerySimpleHistoryDataResult_QNAME, QueryHistoryResponse.class, QuerySimpleHistoryDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.sy.webservice.client.identifier.finance.QueryUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryAllUserResult", scope = QueryAllUserResponse.class)
    public JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse> createQueryAllUserResponseQueryAllUserResult(com.sy.webservice.client.identifier.finance.QueryUserResponse value) {
        return new JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse>(_QueryAllUserResponseQueryAllUserResult_QNAME, com.sy.webservice.client.identifier.finance.QueryUserResponse.class, QueryAllUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QueryUser.class)
    public JAXBElement<Credential> createQueryUserCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QueryUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QuerySimpleHistoryDataCount.class)
    public JAXBElement<QueryHistoryRequest> createQuerySimpleHistoryDataCountRequest(QueryHistoryRequest value) {
        return new JAXBElement<QueryHistoryRequest>(_ExactCheckByJsonRequest_QNAME, QueryHistoryRequest.class, QuerySimpleHistoryDataCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QuerySimpleHistoryDataCount.class)
    public JAXBElement<Credential> createQuerySimpleHistoryDataCountCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QuerySimpleHistoryDataCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "ModifyPasswordByJsonResult", scope = ModifyPasswordByJsonResponse.class)
    public JAXBElement<String> createModifyPasswordByJsonResponseModifyPasswordByJsonResult(String value) {
        return new JAXBElement<String>(_ModifyPasswordByJsonResponseModifyPasswordByJsonResult_QNAME, String.class, ModifyPasswordByJsonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = SimpleCheckByJson.class)
    public JAXBElement<String> createSimpleCheckByJsonRequest(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonRequest_QNAME, String.class, SimpleCheckByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = SimpleCheckByJson.class)
    public JAXBElement<String> createSimpleCheckByJsonCred(String value) {
        return new JAXBElement<String>(_ExactCheckByJsonCred_QNAME, String.class, SimpleCheckByJson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = CreateUser.class)
    public JAXBElement<Credential> createCreateUserCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "user", scope = CreateUser.class)
    public JAXBElement<LoginUser> createCreateUserUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_CreateUserUser_QNAME, LoginUser.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "QueryExactCitizenDataResult", scope = QueryExactCitizenDataResponse.class)
    public JAXBElement<CheckResponse> createQueryExactCitizenDataResponseQueryExactCitizenDataResult(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_QueryExactCitizenDataResponseQueryExactCitizenDataResult_QNAME, CheckResponse.class, QueryExactCitizenDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = QuerySimpleCitizenData.class)
    public JAXBElement<CheckRequest> createQuerySimpleCitizenDataRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, QuerySimpleCitizenData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = QuerySimpleCitizenData.class)
    public JAXBElement<Credential> createQuerySimpleCitizenDataCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, QuerySimpleCitizenData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = IsExactCitizenExists.class)
    public JAXBElement<CheckRequest> createIsExactCitizenExistsRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, IsExactCitizenExists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = IsExactCitizenExists.class)
    public JAXBElement<Credential> createIsExactCitizenExistsCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, IsExactCitizenExists.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllocateFundRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = AllocateFund.class)
    public JAXBElement<AllocateFundRequest> createAllocateFundRequest(AllocateFundRequest value) {
        return new JAXBElement<AllocateFundRequest>(_ExactCheckByJsonRequest_QNAME, AllocateFundRequest.class, AllocateFund.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = AllocateFund.class)
    public JAXBElement<Credential> createAllocateFundCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, AllocateFund.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "nciicAddrExactSearchResult", scope = NciicAddrExactSearchResponse.class)
    public JAXBElement<String> createNciicAddrExactSearchResponseNciicAddrExactSearchResult(String value) {
        return new JAXBElement<String>(_NciicAddrExactSearchResponseNciicAddrExactSearchResult_QNAME, String.class, NciicAddrExactSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = ModifyUser.class)
    public JAXBElement<Credential> createModifyUserCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, ModifyUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "user", scope = ModifyUser.class)
    public JAXBElement<LoginUser> createModifyUserUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_CreateUserUser_QNAME, LoginUser.class, ModifyUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "IsSimpleCitizenExistsResult", scope = IsSimpleCitizenExistsResponse.class)
    public JAXBElement<IsExistsResponse> createIsSimpleCitizenExistsResponseIsSimpleCitizenExistsResult(IsExistsResponse value) {
        return new JAXBElement<IsExistsResponse>(_IsSimpleCitizenExistsResponseIsSimpleCitizenExistsResult_QNAME, IsExistsResponse.class, IsSimpleCitizenExistsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "request", scope = ExactCheck.class)
    public JAXBElement<CheckRequest> createExactCheckRequest(CheckRequest value) {
        return new JAXBElement<CheckRequest>(_ExactCheckByJsonRequest_QNAME, CheckRequest.class, ExactCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "cred", scope = ExactCheck.class)
    public JAXBElement<Credential> createExactCheckCred(Credential value) {
        return new JAXBElement<Credential>(_ExactCheckByJsonCred_QNAME, Credential.class, ExactCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "SimpleCheckResult", scope = SimpleCheckResponse.class)
    public JAXBElement<CheckResponse> createSimpleCheckResponseSimpleCheckResult(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_SimpleCheckResponseSimpleCheckResult_QNAME, CheckResponse.class, SimpleCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "ExactCheckResult", scope = ExactCheckResponse.class)
    public JAXBElement<CheckResponse> createExactCheckResponseExactCheckResult(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_ExactCheckResponseExactCheckResult_QNAME, CheckResponse.class, ExactCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nciic.com.cn", name = "GetVersionResult", scope = GetVersionResponse.class)
    public JAXBElement<String> createGetVersionResponseGetVersionResult(String value) {
        return new JAXBElement<String>(_GetVersionResponseGetVersionResult_QNAME, String.class, GetVersionResponse.class, value);
    }

}
