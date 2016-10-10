package com.gcmobile.func.account.mapper;

import com.gcmobile.func.account.entity.GesturePwdVo;


public interface GesturePwdMapper {

	public int saveGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public String getIsOpen(GesturePwdVo gesturePwdVo) throws Exception;

	public int updateGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public int saveNewGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public int validateGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public int updateLoginOut(GesturePwdVo gesturePwdVo) throws Exception;

	public int updateForgetpwd(GesturePwdVo gesturePwdVo) throws Exception;

	public int isShowGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public int isShowGesturePwd2(GesturePwdVo gesturePwdVo) throws Exception;

	public int isExistByUserIdInfo(GesturePwdVo gesturePwdVo) throws Exception;

	public int updateFirstIsSafeExit(GesturePwdVo gesturePwdVo) throws Exception;

	public int updatePassGesturePwd(GesturePwdVo gesturePwdVo) throws Exception;

	public GesturePwdVo isExistUnsafe(GesturePwdVo gesturePwdVo) throws Exception;

	public String selectHeadImg(int UserId) throws Exception;

	public int jundeMinuteInteval(GesturePwdVo gesturePwdVo) throws Exception;

	public int updatetime(GesturePwdVo gesturePwdVo) throws Exception;


}
