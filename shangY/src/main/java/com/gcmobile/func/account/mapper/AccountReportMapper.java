package com.gcmobile.func.account.mapper;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Description:我的帐号统计数据访问类<br />
 * </p>
 * 
 * @title AccountReportMapper.java
 * @package com.cxdai.portal.account.mapper
 * @author justin.xu
 * @version 0.1 2014年5月14日
 */
public interface AccountReportMapper {

	/**
	 * 
	 * <p>
	 * Description:查询某个用户所有的提现冻结<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2013年12月3日
	 * @param memberId
	 * @return BigDecimal
	 */
	public BigDecimal queryLockCashTotalByMemberId(Integer memberId) throws Exception;

	/**
	 * 根据用户Id和类型集合获取金额.
	 * 
	 * @author justin.xu
	 * @version 0.1 2013年12月3日
	 * @param memberId
	 * @param types
	 *            可为多个
	 * @return
	 */
	public BigDecimal queryMoneyByType(@Param("memberId") Integer memberId, @Param("types") String[] types)
			throws Exception;

}
