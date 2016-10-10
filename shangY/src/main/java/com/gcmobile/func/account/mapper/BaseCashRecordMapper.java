package com.gcmobile.func.account.mapper;

import com.gcmobile.func.account.entity.CashRecord;

/**
 * <p>
 * Description:提现记录数据访问类<br />
 * </p>
 * 
 * @title BaseCashRecordMapper.java
 * @package com.cxdai.base.mapper
 * @author justin.xu
 * @version 0.1 2014年6月18日
 */
public interface BaseCashRecordMapper {
	/**
	 * <p>
	 * Description:插入记录,返回新增的主键ID<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年4月15日
	 * @param cashRecord
	 * @return
	 * @throws Exception
	 *             int
	 */
	public int insertEntity(CashRecord cashRecord) throws Exception;

	/**
	 * <p>
	 * Description:根据id查询<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年4月15日
	 * @param id
	 * @return
	 * @throws Exception
	 *             CashRecord
	 */
	public CashRecord queryById(Integer id) throws Exception;

	/**
	 * <p>
	 * Description:更新对象<br />
	 * </p>
	 * 
	 * @author justin.xu
	 * @version 0.1 2014年4月15日
	 * @param accountLog
	 * @return
	 * @throws Exception
	 *             int
	 */
	public int updateEntity(CashRecord cashRecord) throws Exception;

}
