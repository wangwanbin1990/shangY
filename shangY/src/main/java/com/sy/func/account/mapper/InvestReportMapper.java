package com.sy.func.account.mapper;

import java.math.BigDecimal;

/**
 * <p>
 * Description:我的投资统计数据访问类<br />
 * </p>
 * 
 * @title InvestReportMapper.java
 * @package com.cxdai.portal.account.mapper
 * @author justin.xu
 * @version 0.1 2014年5月20日
 */
public interface InvestReportMapper {

	/**
	 * <p>
	 * Description:查询某个用户ID充值的金额总计<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年5月20日
	 * @param memberId
	 * @return BigDecimal
	 */
	public BigDecimal queryRechargeTotalByMemberId(Integer memberId)
			throws Exception;

	/**
	 * <p>
	 * Description:查询某个用户所有的提现总额<<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年5月20日
	 * @param memberId
	 * @return
	 * @throws Exception
	 *             BigDecimal
	 */
	public BigDecimal queryCashTotalByMemberId(Integer memberId)
			throws Exception;

}
