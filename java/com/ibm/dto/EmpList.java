package com.ibm.dto;


public class EmpList {
	
	
	private Integer id;
	private String userName;
	private String email;
	private Integer sex;
	private String favourate;
	private String departmentName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getFavourate() {
		return favourate;
	}
	public void setFavourate(String favourate) {
		this.favourate = favourate;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "EmpList [id=" + id + ", userName=" + userName + ", email="
				+ email + ", sex=" + sex + ", favourate=" + favourate
				+ ", departmentName=" + departmentName + "]";
	}
	
	
	
	
}
