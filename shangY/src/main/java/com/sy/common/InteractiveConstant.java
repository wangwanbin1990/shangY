package com.sy.common;

import com.sy.utils.PropertiesUtil;

/**
 * 与官网交互的url以及相关固定参数的集合
 * <p>
 * * Description:这里写描述<br />
 * </p>
 * 
 * @title InteractiveConstant.java
 * @package com.cxdai.wx.common
 * @author ZHUCHEN
 * @version 0.1 2014年10月21日
 */
public class InteractiveConstant {
	public static String ERRORPAGE = "/common/error";

	public static String MAINURL = WxBase.MAINURL;// 官网地址
	public static String BBSURL = PropertiesUtil.getValue("bbs_url");// 论坛地址
	public static String WXMAINURL = WxBase.WXMAINURL;// WX地址

	/********************************** 微信入口begin ***************************/
	public static String MENUURL = MAINURL + "/wx/menu/createMenu.html";// 菜单url
	public static String MAININURL = MAINURL + "/wx/mainIn/mainIn.html";// 入口url
	public static String BINDURL = MAINURL + "/wx/bind/bind.html";// 绑定url
	public static String UNBINDURL = MAINURL + "/wx/bind/unbind.html";// 解绑url
	public static String AUTOUNBINDURL = MAINURL + "/wx/bind/updateBindUnsubscribe.html";// 取消关注自动解绑
	public static String AUTO_UNBIND_USER = MAINURL + "/wx/bind/autoUnbindtoPortal.html";// 微信项目启动
																							// 通知官网连接微信更新自动解绑
	public static String BINDSENDSMS = MAINURL + "/wx/bind/sendBindMsg.html";// 发送手机验证码url
	public static String TRANSFERRED_MENU_URL = WXMAINURL + "/entry/transferred.html";// 用户关注时推送的消息附带的绑定连接
	public static String RECOMMENDREGISTERPATH = WXMAINURL + "/friend/toRegister"; // 微信推荐好友链接
	/********************************** 微信入口end ***************************/

	/** 论坛 */
	public static String SIGNCHECK = BBSURL + "/posts/signin/check";// 签到帖查询
	public static String SIGN = BBSURL + "/posts/signin/save?itemId=";// 签到
	public static String SIGNINFO = BBSURL + "/posts/signin/info";// 签到信息
	public static String ITEMSLIST = BBSURL + "/wx/items/";// 精华帖列表
	public static String ITEMDETAIL = BBSURL + "/wx/item/";// 帖子详情
	public static String ITEMREPLYLIST = BBSURL + "/wx/item/replyList/";// 回帖列表

	/** 活动/推荐 */
	public static String ACTIVITYINDEX = MAINURL + "/wx/activity.html";

	/** 我的账户的url */
	public static String ACCOUNTINDEXURL = MAINURL + "/wx/account/index.html";
	public static String ACCOUNTINDEXTENDERURL = MAINURL + "/wx/account/indexTender.html";// 我的账户的投标管理url
	public static String ACCOUNTINDEXBORROWURL = MAINURL + "/wx/account/indexBorrow.html";// 我的账户的融资管理
	public static String USERINFOURL = MAINURL + "/wx/account/userInfo.html";// 我的账户-个人信息url
	public static String BANKCARDURL = MAINURL + "/wx/account/bankCard.html";// 我的账户-我的银行卡
	public static String ADDBANKCARD = MAINURL + "/bankinfo/saveChinabank.html";// 我的账户-我的银行卡-添加
	public static String TOCHANGEBANKCHECK = MAINURL + "/bankinfo/initChangeCard.html";// 我的账户-我的银行卡-点击更换
	public static String CHANGEBANKNEXT = MAINURL + "/bankinfo/subChange.html";// 我的账户-我的银行卡-点击更换-下一步
	public static String INITADDBANKCARD = MAINURL + "/wx/account/bankCard/initAdd.html";
	public static String INITCHANGEBANKCARD = MAINURL + "/wx/account/bankCard/initChange.html";
	public static String CHECKCARD = MAINURL + "/bankinfo/initChangeCard.html";
	public static String CHANGEBANKCARD = MAINURL + "/wx/account/addChange.html";// 我的账户-我的银行卡-更换
	public static String SENDCODEFORADDCARD = MAINURL + "/account/topup/sendMsg.html";// 新增卡-发送手机验证码
	public static String SENDCODEFORCHANGECARD = MAINURL + "/bankinfo/sendMsg.html";// 换卡-发送手机验证码
	// public static String PICREALPATH = MAINURL + "/wx/account/path.html";//
	// 上传图片路径-本地及测试用
	public static String PICREALPATH =  PropertiesUtil.getValue("PICREALPATH");// 上传图片路径
	public static String BANKPICURL = PropertiesUtil.getValue("BANKPICURL");//换卡图片路径
	public static String HANDAUTHENTICATIONPICURL = PropertiesUtil.getValue("HANDAUTHENTICATIONPICURL");//人工审核路径
	public static String UPDATECHANGEBANKCARD = MAINURL + "/wx/account/addModifyChange.html";// 我的账户-我的银行卡-更换
	public static String GETPAYPWD = MAINURL + "/wx/account/payPwd.html";// 验证交易密码

	/** 活期宝 */
	public static String CURINDEX = MAINURL + "/wx/cur.html";// 活期宝初始化
	public static String CURINSUB = MAINURL + "/curInController/doCurrentIn.html";// 活期宝转入
	public static String ACCOUNTCURINDEX = MAINURL + "/wx/cur/accountIndex.html";// 我的账户-活期生期初始化
	public static String ACCOUNTCUROUTSUB = MAINURL + "/curOut/saveCurOut.html";// 我的账户-活期生期-转出
	public static String CURINTERESTLIST = MAINURL + "/wx/cur/interestList/";// 我的账户-活期生期-收益明细

	/** 定期宝 */
	public static String FIXLIST = MAINURL + "/wx/fix/list/";// 定期宝列表
	public static String FIXDETAIL = MAINURL + "/wx/fix/detail/";// 定期宝详情
	public static String FIXJOIN = MAINURL + "/dingqibao/tender/";// 加入定期宝
	public static String FIXUSECURMONEY = MAINURL + "/dingqibao/findEffectiveTenderMoney/";// 使用活期宝
	public static String FIXJOINLIST = MAINURL + "/wx/fix/joinList/";// 定期宝-加入详情
	/** 我的定期宝 */
	public static String MYFIXLIST = MAINURL + "/wx/fix/mylist/";// 我的定期宝列表

	/** 普通投标专区url */
	public static String newTender = MAINURL + "/user/newTender.html";// 新手标号
	public static String BIDLIST = MAINURL + "/wx/tender/bidList/";// 标列表
	public static String BIDINFO = MAINURL + "/wx/tender/bid/";// 标详情
	public static String BIDTENDERLIST = MAINURL + "/wx/tender/bid/tenderList/";// 投标记录
	public static String TOTENDER = MAINURL + "/wx/tender/toTender/";// 填投标信息
	public static String SUBMITTENDER = MAINURL + "/borrow/borrow/tenderBorrow.html";// 提交投标
	public static String USECURMONEY = MAINURL + "/borrow/borrow/findEffectiveTenderMoney/";// 使用活期宝

	/** 投标直通车专区url */
	public static String FIRSTINFO = MAINURL + "/wx/first/info/";// 直通车详情
	public static String FIRSTJOINLIST = MAINURL + "/wx/first/joinList/";// 开通记录
	public static String TOJOIN = MAINURL + "/wx/first/toJoin/";// 填开通信息
	public static String SUBMITJOIN = MAINURL + "/zhitongche/tender/";// 提交开通
	public static String FIRSTLIST = MAINURL + "/wx/first/firstList/";// 直通车列表
	public static String FIRSTUSECURMONEY = MAINURL + "/zhitongche/findEffectiveTenderMoney/";// 使用活期宝

	/** 债转专区url */
	public static String TRANSFERLIST = MAINURL + "/wx/transfer/list/";// 债转专区列表
	public static String TRANSFERINFO = MAINURL + "/wx/transfer/";// 债转详情
	public static String TRANSFERBUYLIST = MAINURL + "/wx/transfer/buyList/";// 认购列表
	public static String TRANSFER_INIT_BUY = MAINURL + "/wx/transfer/toTransferSubscribe/";// 初始化购买页面数据
	public static String TRANSFER_BUY = MAINURL + "/zhaiquan/subscribeTransfer.html";// 认购债权
	public static String TRANSFER_JUDGTENDER = MAINURL + "/tender/judgTender.html";// 打开购买页面前的用户判断
	public static String FIRSTTRANSFERLIST = MAINURL + "/wx/transfer/first/list/";// 直通车-债转专区列表
	public static String FIRSTTRANSFERINFO = MAINURL + "/wx/transfer/first/";// 直通车-债转详情
	public static String FIRSTBIDLIST = MAINURL + "/wx/transfer/first/bidList/";// 直通车-相关标的债权信息
	public static String FIRSTTOBUY = MAINURL + "/wx/transfer/first/tobuy/";// 直通车-初始化认购
	public static String FIRSTBUY = MAINURL + "/zhitongche/subscribe.html";// 直通车-提交认购
	public static String TRANSFERUSECURMONEY = MAINURL + "/zhaiquan/findEffectiveTenderMoney/";// 使用活期宝-普通标债转

	/** 我的债转url */
	public static String MYTRANSFER = MAINURL + "/wx/favorite/myTransfer/";// 我的债转
	public static String INITSALETRANSFER = MAINURL + "/wx/favorite/initSaleTransfer/";// 初始化发布债转
	public static String SUBSALETRANSFER = MAINURL + "/zhaiquan/dotransfer.html";// 发布债转
	public static String CANCEL_TRANSFER = MAINURL + "/wx/favorite/cancelTransfer.html";// 取消我的债转
	public static String MYFIRSTTRANSFER = MAINURL + "/wx/favorite/first/";// 我的直通车债转
	public static String CANCELFIRSTTRANSFER = MAINURL + "/wx/favorite/first/cancelTransfer.html";// 取消直通车转让
	public static String INITFIRSTSALETRANSFER = MAINURL + "/wx/favorite/first/initSaleTransfer/";
	public static String MYFIRSTBIDLIST = MAINURL + "/wx/favorite/first/initSaleTransfer/bidList/";
	public static String SUBSALEFIRSTTRANSFER = MAINURL + "/zhitongche/zhuanrang/dotransfer.html";// 发布直通车债转

	/** 推荐活动 */
	public static String FRIENDLIST = MAINURL + "/wx/recommend/friendList/";// 所有推荐人列表
	public static String REWARD = MAINURL + "/wx/recommend/reward.html";// 推荐奖励详情
	public static String REWARDHISTORY = MAINURL + "/wx/recommend/rewardHistory.html";// 共享奖发放历史
	public static String RECOMMENDRANK = MAINURL + "/wx/recommend/recommendRank/";// 推荐竞技排名
	public static String REWARDRANK = MAINURL + "/wx/recommend/rewardRank/";// 共享奖排名
	public static String RECOMMENDLIST = MAINURL + "/wx/recommend/recommendList/";// 推荐竞技人数列表

	/** 充值url */
	public static String CHARGELIST = MAINURL + "/wx/recharge/chargeList/";// 充值列表
	public static String CHARGETOTAL = MAINURL + "/wx/recharge/chargeTotal.html";// 充值总额
	public static String CHARGE = MAINURL + "/account/topup/llwap/send.html?money=";

	/** 平台公告url */
	public static String NOTICELIST = MAINURL + "/wx/notice/";// 列表
	public static String NOTICE = MAINURL + "/wx/notice/detail/";// 详情

	/** 自动投标url */
	public static String AUTOSETLIST = MAINURL + "/wx/autoTender/setList.html";// 自动投标设置记录
	public static String AUTOTENDERLIST = MAINURL + "/wx/autoTender/autoList/";// 自动投标记录
	public static String AUTOTENDERADD = MAINURL + "/wx/autoTender/saveAutoInvest.html";// 自动投标记录
	public static String ISAUTOTENDERADD = MAINURL + "/wx/autoTender/checkAutoCount.html";// 验证用户是否可以再次创建标

	/** 计算器url */
	public static String CALCULATOR = MAINURL + "/wx/calculator.html";

	/** 首页&登录&注册 */
	public static String HOMEINITURL = MAINURL + "/wx/home/init.html";// 首页的url
	public static String CHECKCODEURL = MAINURL + "/random.jsp";// 验证码的url
	public static String LOGINURL = MAINURL + "/wx/login/login.html";// 登录
	public static String REGISTURL = MAINURL + "/wx/regist.html";// 注册
	public static String DIRECTLOGINURL = MAINURL + "/wx/login/directLogin.html";// anroid登录的url，区别微信的登录url
	public static String R1EGCHECKCODE = MAINURL + "/wx/regist/checkCode.html";// 手机验证码
	public static String SENDMESSAGECODE = MAINURL + "/wx/regist/sendMobileCode.html";// 发送短信验证码
	public static String RIGESTECONFIRM = MAINURL + "/wx/regist/confirm.html";// 验证后台

	/** 安全中心url */
	public static String SAFE_CENTER = MAINURL + "/wx/account/safeCenter.html";// 主页数据获取
	public static String SEND_MOBILE_MESSAGE = MAINURL + "/wx/account/safeCenter/sendMobailActiveInSaftCenter.html";// 手机认证发送手机验证码的url
	public static String VALIDATE_MOBILE = MAINURL + "/account/approve/mobile/activeMobile.html";// 提交手机验证的url
	public static String CAN_REAL_NAME = MAINURL + "/appro/findAppro.html";// 验证是否可以实名认证
	public static String VALIDATE_EMAIL_PAGE = MAINURL + "/wx/account/safeCenter/email.html";// 打开邮箱认证
	public static String VALIDATE_EMAIL = MAINURL + "/account/approve/emailVerify.html";// 进行邮箱认证
	public static String VALIDATE_REAL_NAME = MAINURL + "/account/approve/realname/realnameAppro.html";// 进行实名认证
	public static String VALIDATE_VIP_PAGE = MAINURL + "/wx/account/safeCenter/vipforinsert.html";// 打开VIP认证页面
	public static String VALIDATE_VIP = MAINURL + "/account/approve/vip/saveOrUpdate.html";// 进行VIP认证
	public static String MODIFY_LOGIN_PASSWORD = MAINURL + "/account/safe/modifyLoginPwd.html";// 修改登录密码
	public static String SET_PAY_PASSWORD = MAINURL + "/account/safe/setPayPwd.html";// 设置交易密码
	public static String MODIFY_PAY_PASSWORD = MAINURL + "/account/safe/modifyPayPwd.html";// 修改交易密码
	public static String LOGIN_OUT = MAINURL + "/wx/login/logout.html";// 登出
	public static String ACCESSPERMISSION = MAINURL + "/wx/login/accessPermission.html";// 访问权限

	/** 找回密码 url */
	public static String FIND_PWD_ONE = MAINURL + "/account/safe/findPwdOne.html";// 手机找回密码第一步
	public static String FIND_PWD_TWO = MAINURL + "/account/safe/findPwdTwo.html";// 手机找回密码第二步
	public static String FINDLOGINPWD = MAINURL + "/account/safe/findLoginPasswd.html";// 找回登录密码
																						// 第三步
	public static String FINDPAYPWD = MAINURL + "/account/safe/findPayPwd.html";// 找回交易密码
	public static String FIND_EMAIL_ONE = MAINURL + "/account/safe/confrimIdCard.html";// 找回邮箱密码认证
																						// 第一步
	public static String FIND_EMAIL_TWO = MAINURL + "/account/safe/findLoginPasswdByEmail2.html";// 找回邮箱密码认证
																									// 第二步

	/** 资金明细url */
	public static String ACCOUNTLOGLIST = MAINURL + "/wx/accountLog/logList/";// 资金明细

	/** 净值贷 */
	public static String INITNETVALUEBORROWAPPLY = MAINURL + "/wx/borrow/applyInit.html";// 我的最爱-净值贷申请初始化
	public static String NETVALUEBORROWAPPLYSUBMIT = MAINURL + "/rongzi/applyNetValueBorrow.html";// 我的最爱-净值贷申请提交
	public static String MY_BORROW_DATA = MAINURL + "/wx/favorite/myBorrow/";// 我的借款
																				// 获取数据列表
	public static String REPAY_DATA = MAINURL + "/wx/favorite/queryRepaymentDetails";// 获取待还列表数据
	public static String REPAY = MAINURL + "/wx/favorite/repayBorrow.html";// 还款

	/** 提现&转可提 */
	public static String WITHDRAW_CASH_INDEX = MAINURL + "/wx/withdrawCash/index.html";// 我的最爱-我要提现首页
	public static String WITHDRAW_CASH = MAINURL + "/myaccount/cashRecord/saveTakeCash.html";// 提现的请求提交
	public static String TO_DRAW_PAGE = MAINURL + "/wx/withdrawCash/toGetDraw.html";// 打开转可提页面
	public static String DRAWTOTAL = MAINURL + "/wx/withdrawCash/drawTotal.html";// 提现总额
	public static String SAVE_TO_DRAW = MAINURL + "/myaccount/todrawLog/saveTodrawLog.html";// 转可提提交
	public static String WITHDRAW_CASH_LIST = MAINURL + "/wx/withdrawCash/toCashRecordInner/";// 提现记录获取
																								// 需要动态添加:
																								// pageNum.html
	public static String TO_DRAW_LIST = MAINURL + "/wx/withdrawCash/toDrawLogRecord/";// 转可提记录获取
																						// 需要动态添加:
																						// pageNum.html
	public static String CANCEL_WITHDRAW_CASH = MAINURL + "/wx/withdrawCash/cancelCash.html";// 取消提现
	public static String CANCEL_BORROW = MAINURL + "/wx/favorite/cancelBorrow.html";// 撤销借款
	public static String ADVANCE_FULL_BORROW = MAINURL + "/wx/favorite/advanceFullBorrow.html";// 立即满标

	/** 待收 */
	public static String UN_COLLECT_DATA = MAINURL + "/wx/favorite/unCollection_record/";// 获取普通待收列数据需要动态添加:
																							// status_type/type_collection/pageNum.html

	/** 我的投标 获取数据列表 */
	public static String MY_TENDER_DATA = MAINURL + "/wx/favorite/myTender/";

	/** 签到 */
	// public static String BBS_CHECKURL = BBSURL + "/posts/signin/check";//
	// 检查是否有签到帖的路径
	// public static String BBS_SIGNURL = BBSURL + "/posts/signin/save";// 签到

	/** 连连手机支付页面url */
	public static String LIANLIAN_WAP_SEND = MAINURL + "/wx/pay/send.html";
	public static String LIANLIAN_WAP_RECEIVE = MAINURL + "/wx/pay/receive.html";
	public static String LIANLIAN_WAP_AUTO_RECEIVE = MAINURL + "/wx/autoreceive/lianlianpay.html";

	/** 市场部广告活动 */

	public static String ADVERTISED_VALITE_CODE = MAINURL + "/advertised/isValiteCode.html";// 验证码
	public static String SEND_MOBAILCODE = MAINURL + "/advertised/sendMobailCode.html";// 市场部广告活动，在未登入状态下，发送手机验证码服务
	public static String ADVERTISED_REGIST = MAINURL + "/advertised/regist.html";// 市场部广告活动，注册服务
	public static String ADVERTISED_REGIST_NOACTIVECODE = MAINURL + "/advertised/registNoActiveCode.html";// 市场部广告活动，无手机验证码的注册服务
	public static String ADVERTISED_BEFORE_RECHARGE = MAINURL + "/advertised/beforerecharge.html";// 市场部广告活动，在【充值】前进行【实名认证】、【银行卡绑定】服务
	public static String ADVERTISED_BANKCARDINFO = MAINURL + "/advertised/bankcardInfo";// 市场部广告活动，银行卡信息查询服务
}
