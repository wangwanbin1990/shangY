package com.gcmobile.func.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * <p>
 * Description:账户类<br />
 * </p>
 * 
 * @title Account.java
 * @package com.gcmobile.func.account.entity
 * @author yangshijin
 * @version 0.1 2016年1月30日
 */
public class Account implements Serializable {

    private static final long serialVersionUID = -3531851612222097637L;

    private Integer id;

    private Integer userId;

    /** 账户总额 */
    private BigDecimal total;

    /** 可用余额 */
    private BigDecimal useMoney;

    /** 冻结金额 */
    private BigDecimal noUseMoney;

    /** 可提现金额 */
    private BigDecimal drawMoney;

    /** 不可提现金额 */
    private BigDecimal noDrawMoney;

    /** 最后更新时间 */
    private Date lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public BigDecimal getNoUseMoney() {
        return noUseMoney;
    }

    public void setNoUseMoney(BigDecimal noUseMoney) {
        this.noUseMoney = noUseMoney;
    }

    public BigDecimal getDrawMoney() {
        return drawMoney;
    }

    public void setDrawMoney(BigDecimal drawMoney) {
        this.drawMoney = drawMoney;
    }

    public BigDecimal getNoDrawMoney() {
        return noDrawMoney;
    }

    public void setNoDrawMoney(BigDecimal noDrawMoney) {
        this.noDrawMoney = noDrawMoney;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
