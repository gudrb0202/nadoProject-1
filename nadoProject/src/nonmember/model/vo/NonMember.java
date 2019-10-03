package nonmember.model.vo;

import java.sql.Date;

public class NonMember implements java.io.Serializable {
	private static final long serialVersionUID = 1303L;
	
	private int nonNo;
	private String nonName;
	private String nonCom;
	private String nonPhone;
	private String nonSel;
	private String nonEmail;
	private java.sql.Date nonDate;
	private String nonContent;
	private String nonKind;
	
	public NonMember() {}

	public NonMember(int nonNo, String nonName, String nonCom, String nonPhone, String nonSel, String nonEmail,
			Date nonDate, String nonContent, String nonKind) {
		super();
		this.nonNo = nonNo;
		this.nonName = nonName;
		this.nonCom = nonCom;
		this.nonPhone = nonPhone;
		this.nonSel = nonSel;
		this.nonEmail = nonEmail;
		this.nonDate = nonDate;
		this.nonContent = nonContent;
		this.nonKind = nonKind;
	}

	public int getNonNo() {
		return nonNo;
	}

	public void setNonNo(int nonNo) {
		this.nonNo = nonNo;
	}

	public String getNonName() {
		return nonName;
	}

	public void setNonName(String nonName) {
		this.nonName = nonName;
	}

	public String getNonCom() {
		return nonCom;
	}

	public void setNonCom(String nonCom) {
		this.nonCom = nonCom;
	}

	public String getNonPhone() {
		return nonPhone;
	}

	public void setNonPhone(String nonPhone) {
		this.nonPhone = nonPhone;
	}

	public String getNonSel() {
		return nonSel;
	}

	public void setNonSel(String nonSel) {
		this.nonSel = nonSel;
	}

	public String getNonEmail() {
		return nonEmail;
	}

	public void setNonEmail(String nonEmail) {
		this.nonEmail = nonEmail;
	}

	public java.sql.Date getNonDate() {
		return nonDate;
	}

	public void setNonDate(java.sql.Date nonDate) {
		this.nonDate = nonDate;
	}

	public String getNonContent() {
		return nonContent;
	}

	public void setNonContent(String nonContent) {
		this.nonContent = nonContent;
	}

	public String getNonKind() {
		return nonKind;
	}

	public void setNonKind(String nonKind) {
		this.nonKind = nonKind;
	}

	@Override
	public String toString() {
		return "NonMember [nonNo=" + nonNo + ", nonName=" + nonName + ", nonCom=" + nonCom + ", nonPhone=" + nonPhone
				+ ", nonSel=" + nonSel + ", nonEmail=" + nonEmail + ", nonDate=" + nonDate + ", nonContent="
				+ nonContent + ", nonKind=" + nonKind + "]";
	}
	
	
}
