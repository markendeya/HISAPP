package com.his.admin.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caseworker")
public class CaseWorkerEntity {

	@Id
	@Column(name="caseworker_Id")
	private Integer caseWorkerId;
	public Integer getCaseWorkerId() {
		return caseWorkerId;
	}
	public void setCaseWorkerId(Integer caseWorkerId) {
		this.caseWorkerId = caseWorkerId;
	}
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="gender")
	private String gender;
	@Column(name="role")
	private String role;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
