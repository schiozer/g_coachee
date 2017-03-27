package br.com.g_coachee.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Embeddable
public class Phone {
	
	@NotBlank
	@Size (min=12, max=13)
	@Column(name="PHONE", length=13, nullable=false)
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return phone;
	}
}
