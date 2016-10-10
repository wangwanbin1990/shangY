package com.sy.func.account.mapper;

import java.util.List;

import com.sy.func.account.entity.Account;
import com.sy.func.account.entity.AccountCnd;
import com.sy.func.account.entity.AccountVo;

/**
 * 
 * <p>
 * Description:帐号数据访问类<br />
 * </p>
 * 
 * @title AccountMapper.java
 * @package com.sy.func.account.mapper
 * @author yangshijin
 * @version 0.1 2016年1月30日
 */
public interface AccountMapper {

    /**
     * 
     * <p>
     * Description:开户，初始化帐户信息<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param account
     * @return
     * @throws Exception
     *             int
     */
    public int insertEntity(Account account) throws Exception;

    /**
     * 
     * <p>
     * Description:更新账户<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param account
     * @return
     * @throws Exception
     *             int
     */
    public int updateEntity(Account account) throws Exception;

    /**
     * <p>
     * Description:根据条件查询对象集合<br />
     * </p>
     * 
     * @author justin.xu
     * @version 0.1 2014年4月23日
     * @param accountCnd
     * @return
     * @throws Exception
     *             List<AccountVo>
     */
    public List<AccountVo> queryAccountList(AccountCnd accountCnd) throws Exception;

    /**
     * <p>
     * Description:根据条件查询对象集合数量<br />
     * </p>
     * 
     * @author justin.xu
     * @version 0.1 2014年4月23日
     * @param CurAccountCnd
     *            accountCnd
     * @return
     * @throws Exception
     *             Integer
     */
    public Integer queryAccountCount(AccountCnd accountCnd) throws Exception;

    /**
     * 
     * <p>
     * Description:根据用户id查询账户<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param userId
     * @return
     * @throws Exception
     *             AccountVo
     */
    public AccountVo queryByUserId(Integer userId) throws Exception;

    /**
     * 
     * <p>
     * Description:根据用户id查询账户并锁定<br />
     * </p>
     * 
     * @author yangshijin
     * @version 0.1 2016年1月30日
     * @param userId
     * @return
     * @throws Exception
     *             AccountVo
     */
    public AccountVo queryByUserIdForUpdate(Integer userId) throws Exception;
}
