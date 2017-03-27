package br.com.g_coachee.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class Address {
	
	@Size (max=200)
	@Column(name="ADDRESS", length=200, nullable=true)
	private String address;
	@Size (max=50)
	@Column(name="ADDRESS_CITY", length=50, nullable=true)
	private String city;
	@Size (max=2)
	@Column(name="ADDRESS_STATE", length=2, nullable=true)
	private String state;
	@Size (max=8)
	@Column(name="ADDRESS_ZIPCODE", length=8, nullable=true)
	private String zipCode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return address + ", " + city + " / " + state + " CEP: " + zipCode;
	}
}
