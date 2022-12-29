package com.candidate.vo;

import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;

import lombok.Data;
@Data
public class UserDetailsVo {

	private Integer id;

	private long contactNo;

	private String email;

	private String firstName;

	private String lastName;

	private String password;

	private String securityQues1;

	private String securityQues2;

	private String securityQues3;

	private String securityAns1;

	private String securityAns2;

	private String securityAns3;

	private String userType;

	private String userLevel;

	private Timestamp createdDate = Timestamp.from(Instant.now());

	private Timestamp updatedDate = Timestamp.from(Instant.now());
	
	private Character is_approved = 'N';
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQues1() {
		return securityQues1;
	}

	public void setSecurityQues1(String securityQues1) {
		this.securityQues1 = securityQues1;
	}

	public String getSecurityQues2() {
		return securityQues2;
	}

	public void setSecurityQues2(String securityQues2) {
		this.securityQues2 = securityQues2;
	}

	public String getSecurityQues3() {
		return securityQues3;
	}

	public void setSecurityQues3(String securityQues3) {
		this.securityQues3 = securityQues3;
	}

	public String getSecurityAns1() {
		return securityAns1;
	}

	public void setSecurityAns1(String securityAns1) {
		this.securityAns1 = securityAns1;
	}

	public String getSecurityAns2() {
		return securityAns2;
	}

	public void setSecurityAns2(String securityAns2) {
		this.securityAns2 = securityAns2;
	}

	public String getSecurityAns3() {
		return securityAns3;
	}

	public void setSecurityAns3(String securityAns3) {
		this.securityAns3 = securityAns3;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Character getIs_approved() {
		return is_approved;
	}

	public void setIs_approved(Character is_approved) {
		this.is_approved = is_approved;
	}
	
	

}
