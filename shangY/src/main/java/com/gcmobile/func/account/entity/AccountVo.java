package com.gcmobile.func.account.entity;

import java.io.Serializable;

import com.gcmobile.utils.MoneyUtil;

/**
 * 
 * <p>
 * Description:账户Vo类<br />
 * </p>
 * 
 * @title AccountVo.java
 * @package com.gcmobile.func.account.entity
 * @author yangshijin
 * @version 0.1 2016年1月30日
 */
public class AccountVo extends Account implements Serializable {

    private static final long serialVersionUID = -3531851612222097637L;

    /** 格式化金额 */
    private String useMoneyStr;

    public void setUseMoneyStr(String useMoneyStr) {
        this.useMoneyStr = useMoneyStr;
    }

    public String getUseMoneyStr() {
        return MoneyUtil.fmtMoneyByDot(super.getUseMoney());
    }
}
