package com.venky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressBean {
	private int hno;
	private String city;
	private String state;

	public int getHno() {
		return hno;
	}

	@Value("8")
	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	@Value("Eluru")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Value("Ap")
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressBean [getHno()=" + getHno() + ", getCity()=" + getCity() + ", getState()=" + getState() + "]";
	}
}
