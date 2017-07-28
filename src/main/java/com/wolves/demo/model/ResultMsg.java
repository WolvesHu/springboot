package com.wolves.demo.model;

import java.util.List;

public class ResultMsg {
	private String errorCode;
	private String errorMsg;
	private List<UserInfo> userInfoList;
	private UserInfo userEntity;

	public ResultMsg(String errorCode, String errorMsg, List<UserInfo> userInfoList) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.userInfoList = userInfoList;
	}

	public ResultMsg(String errorCode, String errorMsg, UserInfo userEntity) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.userEntity = userEntity;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<UserInfo> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(List<UserInfo> userInfoList) {
		this.userInfoList = userInfoList;
	}

	public UserInfo getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserInfo userEntity) {
		this.userEntity = userEntity;
	}

}
