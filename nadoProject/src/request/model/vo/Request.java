package request.model.vo;

import java.sql.Date;

public class Request implements java.io.Serializable {
	private static final long serialVersionUID = 1302L;
	
	private int reqNo;
	private String userCode;
	private String reqKind;
	private java.sql.Date reqDate;
	private String reqContent;
	
	public Request() {}

	public Request(int reqNo, String userCode, String reqKind, Date reqDate, String reqContent) {
		super();
		this.reqNo = reqNo;
		this.userCode = userCode;
		this.reqKind = reqKind;
		this.reqDate = reqDate;
		this.reqContent = reqContent;
	}

	public int getReqNo() {
		return reqNo;
	}

	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getReqKind() {
		return reqKind;
	}

	public void setReqKind(String reqKind) {
		this.reqKind = reqKind;
	}

	public java.sql.Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(java.sql.Date reqDate) {
		this.reqDate = reqDate;
	}

	public String getReqContent() {
		return reqContent;
	}

	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}

	@Override
	public String toString() {
		return "Request [reqNo=" + reqNo + ", userCode=" + userCode + ", reqKind=" + reqKind + ", reqDate=" + reqDate
				+ ", reqContent=" + reqContent + "]";
	}
	
	
}
