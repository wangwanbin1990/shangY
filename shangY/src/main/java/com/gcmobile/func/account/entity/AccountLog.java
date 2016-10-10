package com.gcmobile.func.account.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * Description:资金操作日志<br />
 * </p>
 * 
 * @title AccountLog.java
 * @package com.cxdai.base.entity
 * @author justin.xu
 * @version 0.1 2014年4月25日
 */
public class AccountLog implements Serializable {
    private static final long serialVersionUID = 8983061145517554053L;

    private Integer id;

    /** 用户id */
    private Integer userId;

    /** 日志类型 */
    private String type;

    /** 账户总额 */
    private BigDecimal total;

    /** 操作金额 */
    private BigDecimal money;

    /** 可用余额 */
    private BigDecimal useMoney;

    /** 冻结金额 */
    private BigDecimal noUseMoney;

    /** 交易对方 */
    private Integer toUser;

    /** 业务id */
    private Integer targetId;

    /** 业务名称 */
    private String targetName;

    /** 业务类型 0：充值，1:提现，2：活期宝转出，3：活期宝转入 */
    private Integer targetType;

    /** 备注 */
    private String remark;

    /** 操作时间 */
    private Date addtime;

    /** 插入IP */
    private String addip;

    /** 可提现金额 */
    private BigDecimal drawMoney;

    /** 不可提现金额 */
    private BigDecimal noDrawMoney;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public Integer getToUser() {
        return toUser;
    }

    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip;
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
}
