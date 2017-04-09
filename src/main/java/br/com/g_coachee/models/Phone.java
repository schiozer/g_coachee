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
		return phone.length() == 13 ? (String.valueOf(phone).replaceFirst("(\\d{2})(\\d{2})(\\d{5})(\\d+)", "+$1 $2 $3-$4")) : (String.valueOf(phone).replaceFirst("(\\d{2})(\\d{2})(\\d{4})(\\d+)", "+$1 $2 $3-$4"));
	}
}
