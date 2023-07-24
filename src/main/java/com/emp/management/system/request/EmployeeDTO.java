package com.emp.management.system.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class EmployeeDTO {
	
	    private Integer employeeId;
	    private String name;
	    private LocalDate dob;
	    private Integer managerId;
	    private BigDecimal salary;
	    private String emailId;
	    @JsonIgnoreProperties(ignoreUnknown = true) // Ignore unknown properties during deserialization
	    private List<PhoneNumberDTO> phoneNumbers;
	    private VoterIDDTO voterID;
	    private LocalDateTime createdDateTime;
	    private LocalDateTime updatedDateTime;
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public Integer getManagerId() {
			return managerId;
		}
		public void setManagerId(Integer managerId) {
			this.managerId = managerId;
		}
		public BigDecimal getSalary() {
			return salary;
		}
		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public List<PhoneNumberDTO> getPhoneNumbers() {
			return phoneNumbers;
		}
		public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}
		public VoterIDDTO getVoterID() {
			return voterID;
		}
		public void setVoterID(VoterIDDTO voterID) {
			this.voterID = voterID;
		}
		public EmployeeDTO() {
			super();
		}
		public LocalDateTime getCreatedDateTime() {
			return createdDateTime;
		}
		public void setCreatedDateTime(LocalDateTime createdDateTime) {
			this.createdDateTime = createdDateTime;
		}
		public LocalDateTime getUpdatedDateTime() {
			return updatedDateTime;
		}
		public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
			this.updatedDateTime = updatedDateTime;
		}
	

	    // Getters and setters

	    // Additional methods if needed
	}


