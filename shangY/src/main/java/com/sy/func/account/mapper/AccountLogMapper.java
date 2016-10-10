package com.sy.func.account.mapper;

import com.sy.func.account.entity.AccountLog;
import com.sy.func.account.entity.AccountLogCnd;

/**
 * <p>
 * Description:资金记录数据访问类<br />
 * </p>
 * 
 * @title AccountLogMapper.java
 * @package com.cxdai.portal.account.mapper
 * @author justin.xu
 * @version 0.1 2014年4月30日
 */
public interface AccountLogMapper {

    /**
     * 
     * <p>
     * Description:插入记录<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param accountLog
     * @return
     * @throws Exception
     *             int
     */
    public int insertEntity(AccountLog accountLog) throws Exception;

    /**
     * 
     * <p>
     * Description:更新对象<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param accountLog
     * @return
     * @throws Exception
     *             int
     */
    public int updateEntity(AccountLog accountLog) throws Exception;

    /**
     * <p>
     * Description:根据条件查询对象集合数量<br />
     * </p>
     * 
     * @author justin.xu
     * @version 0.1 2014年4月23日
     * @param AccountLogCnd
     *            accountLogCnd
     * @return
     * @throws Exception
     *             Integer
     */
    public Integer queryAccountLogCount(AccountLogCnd accountLogCnd) throws Exception;

    /**
     * 
     * <p>
     * Description:根据id查询记录<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param id
     * @return
     * @throws Exception
     *             AccountLog
     */
    public AccountLog queryById(Integer id) throws Exception;

    /**
     * 
     * <p>
     * Description:查询充值记录是否入账<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param targetId
     * @return int
     */
    public int queryRecharge(Integer targetId);
}
