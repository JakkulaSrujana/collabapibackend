package com.srujana.collabapibackend.model;

public class Job {

	private String job_Role;
	private String job_Description;
	private String salary;
	public String getJob_Role() {
		return job_Role;
	}
	public void setJob_Role(String job_Role) {
		this.job_Role = job_Role;
	}
	public String getJob_Description() {
		return job_Description;
	}
	public void setJob_Description(String job_Description) {
		this.job_Description = job_Description;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
