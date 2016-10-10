package com.gcmobile.func.account.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 
 * <p>
 * Description:账户资金统计数据访问类<br />
 * </p>
 * 
 * @title AccountStatisticsMapper.java
 * @package com.gcmobile.console.account.statistics.mapper
 * @author zhaowei
 * @version 0.1 2016年3月1日
 */
public interface AccountStatisticsMapper {

	/**
	 * 
	 * <p>
	 * Description:提现金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumTotalByCashrecord(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱提现转出金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilOutForCash(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:提现退回金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilInForCashBack(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:充值成功的金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByRechargerecord(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱充值转入金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilInForRecharge(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱转入金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilIn(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:提现退回金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumTotalByCashrecordForCashBack(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:体验金收益转零钱<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByExpOut(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:现金红包转零钱<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByLotteryOut(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱转出金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilOut(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期转入金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurInForInvestment(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱账户累计收益<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumInterestTotalByCurlilAccount(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱发放总收益<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumInterestTotalByInterestDetailForCurlil(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱账户日志收益总额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByCurlilAccountlog(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱转入活期的金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurInWithoutReinvestment(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱转出活期金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilOutForCurIn(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期提现转出金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurOut(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱提现转入金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilInForCurOut(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期账户累计收益<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumInterestTotalByCurAccount(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期发放总收益<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumInterestTotalByInterestDetailForCur(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期账户日志收益金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByCurAccountlog(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:活期账户总额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumTotalByCurAccount(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:零钱账户总额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumTotalByCurlilAccount(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:现金红包奖励及体验金金额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月1日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumAccountByCurlilInForExtra(@Param("userId") Integer userId);
	
	/**
	 * 
	 * <p>
	 * Description:推荐返现奖励<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年3月9日
	 * @param userId
	 * @return
	 * BigDecimal
	 */
	public BigDecimal sumMoneyByInviteRewardIssue(@Param("userId") Integer userId);
	
}
