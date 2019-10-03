package calendar.model.vo;

import java.sql.Date;

public class Calendar implements java.io.Serializable {
	private static final long serialVersionUID = 400L;
	
	private int calNo;
	private int cateNo;
	private String empId;
	private String calTitle;
	private java.sql.Date calStartDate;
	private java.sql.Date calEndDate;
	private String calAllDay;
	private String calContent;
	
	public Calendar() {}

	public Calendar(int calNo, int cateNo, String empId, String calTitle, Date calStartDate, Date calEndDate,
			String calAllDay, String calContent) {
		super();
		this.calNo = calNo;
		this.cateNo = cateNo;
		this.empId = empId;
		this.calTitle = calTitle;
		this.calStartDate = calStartDate;
		this.calEndDate = calEndDate;
		this.calAllDay = calAllDay;
		this.calContent = calContent;
	}

	public int getCalNo() {
		return calNo;
	}

	public void setCalNo(int calNo) {
		this.calNo = calNo;
	}

	public int getCateNo() {
		return cateNo;
	}

	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getCalTitle() {
		return calTitle;
	}

	public void setCalTitle(String calTitle) {
		this.calTitle = calTitle;
	}

	public java.sql.Date getCalStartDate() {
		return calStartDate;
	}

	public void setCalStartDate(java.sql.Date calStartDate) {
		this.calStartDate = calStartDate;
	}

	public java.sql.Date getCalEndDate() {
		return calEndDate;
	}

	public void setCalEndDate(java.sql.Date calEndDate) {
		this.calEndDate = calEndDate;
	}

	public String getCalAllDay() {
		return calAllDay;
	}

	public void setCalAllDay(String calAllDay) {
		this.calAllDay = calAllDay;
	}

	public String getCalContent() {
		return calContent;
	}

	public void setCalContent(String calContent) {
		this.calContent = calContent;
	}

	@Override
	public String toString() {
		return "Calendar [calNo=" + calNo + ", cateNo=" + cateNo + ", empId=" + empId + ", calTitle=" + calTitle
				+ ", calStartDate=" + calStartDate + ", calEndDate=" + calEndDate + ", calAllDay=" + calAllDay
				+ ", calContent=" + calContent + "]";
	}
	
	
}
