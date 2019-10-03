package clouduser.model.vo;

import java.sql.Date;

public class CloudUser implements java.io.Serializable {
	private static final long serialVersionUID = 1300L;
	
	private String userCode;
	private String userName;
	private String userId;
	private String userPwd;
	private String userCom;
	private String userPhone;
	private String userSel;
	private String userEmail;
	private String userAddress;
	private String userDb;
	private java.sql.Date userDate;
	private java.sql.Date userLastDay;
	
	public CloudUser() {}

	public CloudUser(String userCode, String userName, String userId, String userPwd, String userCom, String userPhone,
			String userSel, String userEmail, String userAddress, String userDb, Date userDate, Date userLastDay) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userCom = userCom;
		this.userPhone = userPhone;
		this.userSel = userSel;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userDb = userDb;
		this.userDate = userDate;
		this.userLastDay = userLastDay;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserCom() {
		return userCom;
	}

	public void setUserCom(String userCom) {
		this.userCom = userCom;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserSel() {
		return userSel;
	}

	public void setUserSel(String userSel) {
		this.userSel = userSel;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserDb() {
		return userDb;
	}

	public void setUserDb(String userDb) {
		this.userDb = userDb;
	}

	public java.sql.Date getUserDate() {
		return userDate;
	}

	public void setUserDate(java.sql.Date userDate) {
		this.userDate = userDate;
	}

	public java.sql.Date getUserLastDay() {
		return userLastDay;
	}

	public void setUserLastDay(java.sql.Date userLastDay) {
		this.userLastDay = userLastDay;
	}

	@Override
	public String toString() {
		return "CloudUser [userCode=" + userCode + ", userName=" + userName + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userCom=" + userCom + ", userPhone=" + userPhone + ", userSel=" + userSel
				+ ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userDb=" + userDb + ", userDate="
				+ userDate + ", userLastDay=" + userLastDay + "]";
	}
	
	
	
}
