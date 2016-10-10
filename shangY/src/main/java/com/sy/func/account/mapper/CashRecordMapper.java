package com.sy.func.account.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.common.page.Page;
import com.sy.func.account.entity.CashRecordCnd;
import com.sy.func.account.entity.CashRecordVo;

/**
 * <p>
 * Description:提现记录数据访问类<br />
 * </p>
 * 
 * @title CashRecordMapper.java
 * @package com.cxdai.portal.account.mapper
 * @author justin.xu
 * @version 0.1 2014年6月18日
 */
public interface CashRecordMapper {
	/**
	 * <p>
	 * Description:根据条件查询对象集合<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月18日
	 * @param cashRecordCnd
	 * @return
	 * @throws Exception
	 *             List<CashRecordVo>
	 */
	public List<CashRecordVo> queryCashRecordList(CashRecordCnd cashRecordCnd) throws Exception;

	/**
	 * <p>
	 * Description:根据条件分页查询对象集合<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月18日
	 * @param cashRecordCnd
	 * @param page
	 * @return
	 * @throws Exception
	 *             List<CashRecordVo>
	 */
	public List<CashRecordVo> queryCashRecordList(CashRecordCnd cashRecordCnd, Page page) throws Exception;

	/**
	 * <p>
	 * Description:根据条件查询数量<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月18日
	 * @param cashRecordCnd
	 * @return
	 * @throws Exception
	 *             Integer
	 */
	public Integer queryCashRecordCount(CashRecordCnd cashRecordCnd) throws Exception;

	/**
	 * 
	 * <p>
	 * Description:根据查询条件统计提现总额<br />
	 * </p>
	 * 
	 * @author YangShiJin
	 * @version 0.1 2015年6月1日
	 * @param cashRecordCnd
	 * @return
	 * @throws Exception
	 *             BigDecimal
	 */
	public BigDecimal queryCashRecordTotalByCnd(CashRecordCnd cashRecordCnd) throws Exception;

	/**
	 * 
	 * <p>
	 * Description:查询当天提现次数<br />
	 * </p>
	 * 
	 * @author YangShiJin
	 * @version 0.1 2015年6月17日
	 * @param userId
	 * @param date
	 * @return
	 * @throws Exception
	 *             Integer
	 */
	public Integer getCashedCount(@Param("userId") Integer userId)
			throws Exception;

	
	
	/**
	 * 
	 * <p>
	 * Description:查询该用户提现记录<br />
	 * </p>
	 * @author tanghaitao
	 * @version 0.1 2016年2月27日
	 * @param userId
	 * @return
	 * CashRecordVo
	 */
	public List<CashRecordVo> findCashRecord(@Param("userId") Integer userId,Page page) throws Exception;;

	
	/**
	 * 查询提现金额
	 * <p>
	 * Description:这里写描述<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年2月27日
	 * @param userId
	 * @param today 是否当天，为true则为当天
	 * @return
	 * @throws Exception
	 * BigDecimal
	 */
	public BigDecimal getCashedAccountTotal(@Param("userId") Integer userId, @Param("today") boolean today, @Param("sumColumn") String sumColumn)
			throws Exception;

}
