package com.java.ex.jdbc.HR.dao;

import java.sql.Date;

//데이터 전송 객체(DTO)
//- 데이터베이스 필드에 매칭되는 필드
//- 기본 생성자
//- getters/setters
//- 로직은 (가급적) 포함하지 않음
//- toString(), equals() 메서드는 포함하기도 한다
public class HRVO {
// 필드
private Long empId;
private String empName;
private String firstName;
private String lastName;
private String email;
private String phoneNumber;
private Date hiredate;
private String salary;
// 기본 생성자
public HRVO(Long empId, String empName, String empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}
public HRVO(Long empId, String empName, String firstName, String lastName, String email, String phoneNumber,
		Date hiredate, String salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hiredate = hiredate;
	this.salary = salary;
}
public HRVO(String firstName, String lastName, String email, String phoneNumber, Date hireDate) {
	// TODO Auto-generated constructor stub
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.hiredate = hiredate;
}
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "HRVO [empId=" + empId + ", empName=" + empName + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hiredate=" + hiredate + ", salary=" + salary
			+ "]";
}


}


