package education.model.vo;

import java.sql.Date;

public class Education implements java.io.Serializable {
	private static final long serialVersionUID = 1301L;
	
	private int eduNo;
	private String userCode;
	private int eduPeople;
	private java.sql.Date eduWriteDate;
	private java.sql.Date eduDate;
	private String eduRequest;
	private String eduKind;
	
	public Education() {}

	public Education(int eduNo, String userCode, int eduPeople, Date eduWriteDate, Date eduDate, String eduRequest,
			String eduKind) {
		super();
		this.eduNo = eduNo;
		this.userCode = userCode;
		this.eduPeople = eduPeople;
		this.eduWriteDate = eduWriteDate;
		this.eduDate = eduDate;
		this.eduRequest = eduRequest;
		this.eduKind = eduKind;
	}

	public int getEduNo() {
		return eduNo;
	}

	public void setEduNo(int eduNo) {
		this.eduNo = eduNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public int getEduPeople() {
		return eduPeople;
	}

	public void setEduPeople(int eduPeople) {
		this.eduPeople = eduPeople;
	}

	public java.sql.Date getEduWriteDate() {
		return eduWriteDate;
	}

	public void setEduWriteDate(java.sql.Date eduWriteDate) {
		this.eduWriteDate = eduWriteDate;
	}

	public java.sql.Date getEduDate() {
		return eduDate;
	}

	public void setEduDate(java.sql.Date eduDate) {
		this.eduDate = eduDate;
	}

	public String getEduRequest() {
		return eduRequest;
	}

	public void setEduRequest(String eduRequest) {
		this.eduRequest = eduRequest;
	}

	public String getEduKind() {
		return eduKind;
	}

	public void setEduKind(String eduKind) {
		this.eduKind = eduKind;
	}

	@Override
	public String toString() {
		return "Education [eduNo=" + eduNo + ", userCode=" + userCode + ", eduPeople=" + eduPeople + ", eduWriteDate="
				+ eduWriteDate + ", eduDate=" + eduDate + ", eduRequest=" + eduRequest + ", eduKind=" + eduKind + "]";
	}
	
	
}
