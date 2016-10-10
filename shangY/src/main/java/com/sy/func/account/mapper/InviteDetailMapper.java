package com.sy.func.account.mapper;

import java.util.List;

import com.sy.common.page.Page;
import com.sy.func.account.entity.InviteDetailVo;

/**
 * 
 * <p>
 * Description:推荐好友统计类<br />
 * </p>
 * 
 * @title InviteDetailMapper.java
 * @package com.sy.func.account.mapper
 * @author YangShiJin
 * @version 0.1 2016年3月3日
 */
public interface InviteDetailMapper {

    /**
     * 
     * <p>
     * Description:根据userId查询推荐记录<br />
     * </p>
     * 
     * @author YangShiJin
     * @version 0.1 2016年3月3日
     * @param userId
     * @param page
     * @return
     * @throws Exception
     *             List<InviteDetailVo>
     */
    public List<InviteDetailVo> queryInviteDetailListByUserId(Integer userId, Page page) throws Exception;

    /**
     * 
     * <p>
     * Description:根据userId查询推荐记录数量<br />
     * </p>
     * 
     * @author YangShiJin
     * @version 0.1 2016年3月3日
     * @param userId
     * @return
     * @throws Exception
     *             Integer
     */
    public Integer queryInviteDetailCountByUserId(Integer userId) throws Exception;

    /**
     * 
     * <p>
     * Description:根据userId查询推荐成功记录数量<br />
     * </p>
     * 
     * @author YangShiJin
     * @version 0.1 2016年3月3日
     * @param userId
     * @return
     * @throws Exception
     *             Integer
     */
    public Integer queryInviteSuccessCountByUserId(Integer userId) throws Exception;
}
