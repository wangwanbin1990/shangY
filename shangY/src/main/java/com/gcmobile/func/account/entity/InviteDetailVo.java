package com.gcmobile.func.account.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel("我的推荐")
public class InviteDetailVo implements Serializable {
    private static final long serialVersionUID = 3360464536489228703L;

    @ApiModelProperty("主键ID")
    private Integer id; // 主键

    @ApiModelProperty("推荐人ID")
    private Integer userid; //

    @ApiModelProperty("推荐人用户名")
    private String username; //

    @ApiModelProperty("被推荐人ID(包括间接)")
    private Integer invitedUserid; //

    @ApiModelProperty("被推荐人用户名")
    private String invitedUsername; //

    @ApiModelProperty("类别(0:直接,1:间接)")
    private Integer type; //

    @ApiModelProperty("是否投资（1：已投资， 0：未投资）")
    private Integer isInvest; //

    @ApiModelProperty("直接/间接共享奖")
    private BigDecimal interest; //

    @ApiModelProperty("被推荐人注册时间")
    private Date registerTime; //

    @ApiModelProperty("被推荐人实名认证时间")
    private Date realnameApprovedTime; //

    @ApiModelProperty("推荐成功时间")
    private Date inviteSuccessTime; //

    @ApiModelProperty("被推荐人绑卡时间")
    private Date bankInfoApproveTime; //


    @ApiModelProperty("添加时间")
    private Date addTime; //

    @ApiModelProperty("最后更新时间")
    private Date updateTime; //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getInvitedUserid() {
        return invitedUserid;
    }

    public void setInvitedUserid(Integer invitedUserid) {
        this.invitedUserid = invitedUserid;
    }

    public String getInvitedUsername() {
        return invitedUsername;
    }

    public void setInvitedUsername(String invitedUsername) {
        this.invitedUsername = invitedUsername;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsInvest() {
        return isInvest;
    }

    public void setIsInvest(Integer isInvest) {
        this.isInvest = isInvest;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getRealnameApprovedTime() {
        return realnameApprovedTime;
    }

    public void setRealnameApprovedTime(Date realnameApprovedTime) {
        this.realnameApprovedTime = realnameApprovedTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getInviteSuccessTime() {
        return inviteSuccessTime;
    }

    public void setInviteSuccessTime(Date inviteSuccessTime) {
        this.inviteSuccessTime = inviteSuccessTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getBankInfoApproveTime() {
        return bankInfoApproveTime;
    }

    public void setBankInfoApproveTime(Date bankInfoApproveTime) {
        this.bankInfoApproveTime = bankInfoApproveTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}