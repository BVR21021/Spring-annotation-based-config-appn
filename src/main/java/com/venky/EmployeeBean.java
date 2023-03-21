package com.venky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

	private int empid;
	private String empname;

	public int getEmpid() {
		return empid;
	}

	@Value("101")
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	@Value("Rama")
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "EmployeeBean [getEmpid()=" + getEmpid() + ", getEmpname()=" + getEmpname() + "]";
	}

}
