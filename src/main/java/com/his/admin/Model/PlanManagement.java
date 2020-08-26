package com.his.admin.Model;

import java.util.Date;

public class PlanManagement {
	
	private Integer planId;
	private String activateSw;
	private  String createDate;
    private String createBy;
    private String planDesc;
    private String planName;
    private Date  planStartDt;
    private Date  planEndDt;
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getActivateSw() {
		return activateSw;
	}
	public void setActivateSw(String activateSw) {
		this.activateSw = activateSw;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getPlanDesc() {
		return planDesc;
	}
	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Date getPlanStartDt() {
		return planStartDt;
	}
	public void setPlanStartDt(Date planStartDt) {
		this.planStartDt = planStartDt;
	}
	public Date getPlanEndDt() {
		return planEndDt;
	}
	public void setPlanEndDt(Date planEndDt) {
		this.planEndDt = planEndDt;
	}

}
