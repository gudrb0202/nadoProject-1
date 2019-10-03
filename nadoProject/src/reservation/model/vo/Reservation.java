package reservation.model.vo;

import java.sql.Date;

public class Reservation implements java.io.Serializable {
	private static final long serialVersionUID = 900L;
	
	private int rvNo;
	private String empId;
	private String rvName;
	private java.sql.Date rvStartDate;
	private java.sql.Date rvEndDate;
	private String rvUse;
	private String rvState;
	private String rvEmpId;
	private String rvReturn;
	
	public Reservation() {}

	public Reservation(int rvNo, String empId, String rvName, Date rvStartDate, Date rvEndDate, String rvUse,
			String rvState, String rvEmpId, String rvReturn) {
		super();
		this.rvNo = rvNo;
		this.empId = empId;
		this.rvName = rvName;
		this.rvStartDate = rvStartDate;
		this.rvEndDate = rvEndDate;
		this.rvUse = rvUse;
		this.rvState = rvState;
		this.rvEmpId = rvEmpId;
		this.rvReturn = rvReturn;
	}

	public int getRvNo() {
		return rvNo;
	}

	public void setRvNo(int rvNo) {
		this.rvNo = rvNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getRvName() {
		return rvName;
	}

	public void setRvName(String rvName) {
		this.rvName = rvName;
	}

	public java.sql.Date getRvStartDate() {
		return rvStartDate;
	}

	public void setRvStartDate(java.sql.Date rvStartDate) {
		this.rvStartDate = rvStartDate;
	}

	public java.sql.Date getRvEndDate() {
		return rvEndDate;
	}

	public void setRvEndDate(java.sql.Date rvEndDate) {
		this.rvEndDate = rvEndDate;
	}

	public String getRvUse() {
		return rvUse;
	}

	public void setRvUse(String rvUse) {
		this.rvUse = rvUse;
	}

	public String getRvState() {
		return rvState;
	}

	public void setRvState(String rvState) {
		this.rvState = rvState;
	}

	public String getRvEmpId() {
		return rvEmpId;
	}

	public void setRvEmpId(String rvEmpId) {
		this.rvEmpId = rvEmpId;
	}

	public String getRvReturn() {
		return rvReturn;
	}

	public void setRvReturn(String rvReturn) {
		this.rvReturn = rvReturn;
	}

	@Override
	public String toString() {
		return "Reservation [rvNo=" + rvNo + ", empId=" + empId + ", rvName=" + rvName + ", rvStartDate=" + rvStartDate
				+ ", rvEndDate=" + rvEndDate + ", rvUse=" + rvUse + ", rvState=" + rvState + ", rvEmpId=" + rvEmpId
				+ ", rvReturn=" + rvReturn + "]";
	}
	
	
}
