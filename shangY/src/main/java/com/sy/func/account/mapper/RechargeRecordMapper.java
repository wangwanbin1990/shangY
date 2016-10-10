package com.sy.func.account.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sy.common.page.Page;
import com.sy.func.account.entity.RechargeRecord;
import com.sy.func.account.entity.RechargeRecordCnd;
import com.sy.func.account.entity.RechargeRecordVo;



/**
 * <p>
 * Description:充值记录数据访问类<br />
 * </p>
 * 
 * @title RechargeRecordMapper.java
 * @package com.cxdai.portal.account.mapper
 * @author justin.xu
 * @version 0.1 2014年5月23日
 */
public interface RechargeRecordMapper {
	/**
	 * <p>
	 * Description:根据条件查询对象集合<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年5月23日
	 * @param rechargeRecordCnd
	 * @return
	 *             List<RechargeRecordVo>
	 */
	public List<RechargeRecordVo> queryRechargeRecordList(RechargeRecordCnd rechargeRecordCnd);

	/**
	 * 根据orderNo查询订单
	 * @param orderNo
	 * @return
	 */
	RechargeRecordVo queryRechargeRecordByOrderNo(String orderNo);

	/**
	 * 根据id查询订单并锁定记录
	 * @param id
	 * @return
	 */
	RechargeRecordVo queryRechargeRecordByIdForUpdate(int id);
	/**
	 * <p>
	 * Description:根据条件分页查询对象集合<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年5月23日
	 * @param rechargeRecordCnd
	 * @return
	 * @throws Exception
	 *             List<RechargeRecordVo>
	 */
	public List<RechargeRecordVo> queryRechargeRecordList(RechargeRecordCnd rechargeRecordCnd, Page page) throws Exception;

	/**
	 * <p>
	 * Description:根据条件查询数量<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月4日
	 * @param rechargeRecordCnd
	 * @return
	 * @throws Exception
	 *             Integer
	 */
	public Integer queryRechargeRecordCount(RechargeRecordCnd rechargeRecordCnd) throws Exception;

	/**
	 * <p>
	 * Description:查询某用户大于起始日期的线上充值总和<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月19日
	 * @param memberId
	 * @param datetime
	 * @return
	 * @throws Exception
	 *             BigDecimal
	 */
	public BigDecimal queryOnlineMoneyTotalByDatetime(@Param("memberId") Integer memberId, @Param("datetime") String datetime) throws Exception;

	/**
	 * <p>
	 * Description:查询某用户大于起始日期的线下充值总和<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年6月19日
	 * @param memberId
	 * @param datetime
	 * @return
	 * @throws Exception
	 *             BigDecimal
	 */
	public BigDecimal queryOfflineMoneyTotalByDatetime(@Param("memberId") Integer memberId, @Param("datetime") String datetime) throws Exception;

	/**
	 * 
	 * <p>
	 * Description:根据查询条件统计充值总额<br />
	 * </p>
	 * 
	 * @author YangShiJin
	 * @version 0.1 2015年6月1日
	 * @param rechargeRecordCnd
	 * @return
	 * @throws Exception
	 *             BigDecimal
	 */
	public BigDecimal queryRechargeTotalByCnd(RechargeRecordCnd rechargeRecordCnd) throws Exception;
	
	
	
    // ~~~ for base start ~~~
	public int insertEntity(RechargeRecord rechargeRecord) throws Exception;

	public RechargeRecord queryById(Integer id) throws Exception;

	public RechargeRecord queryByIdForUpdate(Integer id) throws Exception;

	public int updateEntity(RechargeRecord rechargeRecord);
	 // ~~~ for base start ~~~
	
	/**
	 * 
	 * <p>
	 * Description:查询用户充值总额<br />
	 * </p>
	 * @author zhaowei
	 * @version 0.1 2016年2月27日
	 * @param userId
	 * @return
	 * @throws Exception
	 * BigDecimal
	 */
	public BigDecimal getRechargeTotal(@Param("userId") Integer userId) throws Exception;

	/**
	 * <p>
	 * Description:查询最新的20条充值金额>=100的记录(用于轮播显示)<br />
	 * </p>
	 *
	 * @author wangwanbin
	 * @version 0.1 2016年5月20日
	 * @return
	 *  List<RechargeRecordVo>
	 */
	List<RechargeRecordVo> queryRechargeRecordLatest20();

}
