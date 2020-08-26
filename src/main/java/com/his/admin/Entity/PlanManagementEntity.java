package com.his.admin.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan_dtls")
public class PlanManagementEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="plan_id")
	private Integer planId;
	@Column(name="activate_sw")
	private String activateSw;
	@Column(name="create_date")
	private  String createDate;
	@Column(name="create_by")
    private String createBy;
	@Column(name="plan_desc")
    private String planDesc;
	@Column(name="plan_name")
    private String planName;
	@Column(name="plan_startDate")
    private Date  planStartDt;
	@Column(name="plan_endDate")
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
