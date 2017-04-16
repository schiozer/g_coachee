package br.com.g_coachee.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_COACHEE")
public class Coachee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	coacheeId;
    
	@Version   
    private Integer version;
	
	@NotBlank
	@Size (min = 12, max=12)
	@Column(name="CPF", length=12, unique=true, nullable=false)
	protected String cpf;
	
	@NotBlank
	@Size (max=60)
	@Column(name="COACHEENAME", length=60, nullable=false)
	protected String name;
	
	@NotBlank
	@Size (max=150)
	@Column(name="EMAIL", length=150, unique=true, nullable=false)
	protected String email;
	
	@NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="DATEOFBIRTH", nullable=false)
	protected Calendar dateOfBirth;
	
	@NotBlank
	@Size (max=1)
	@Column(name="GENDER", length=1, nullable=false)
	protected Gender gender;
	
	@Embedded
	protected Phone phone;
	
	@Embedded
	protected Address address;
	
	@Lob
	@Column(name="COMMENTS", nullable=true)
	protected String comments;
	
	public Integer getCoacheeId() {
		return coacheeId;
	}
	
	public void setCoacheeId(Integer id) {
		this.coacheeId = id;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
