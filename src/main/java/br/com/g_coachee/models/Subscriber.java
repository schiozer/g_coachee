package br.com.g_coachee.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * http://stackoverflow.com/questions/34588354/difference-between-size-length-and-columnlength-value
 * */

@Entity
@Table(name="T_SUBSCRIBER", 
	   indexes = { @Index(name = "I_CPF", columnList = "CPF", unique = true),
	   			   @Index(name = "I_EMAIL", columnList = "EMAIL", unique = true),
	   			   @Index(name = "I_NAME", columnList = "COACHNAME", unique = false)
	   		     }
	  )
public class Subscriber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	subscriberId;
    
	@Version   
    private Integer version;
	
	@NotBlank
	@Size (min = 12, max=12)
	@Column(name="CPF", length=12, unique=true, nullable=false)
	protected String cpf;
	
	@NotBlank
	@Size (max=60)
	@Column(name="COACHNAME", length=60, nullable=false)
	protected String name;
	
	@NotBlank
	@Size (max=150)
	@Column(name="EMAIL", length=150, unique=true, nullable=false)
	protected String email;
	
	@NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="DATEOFBIRTH", nullable=false)
	protected Calendar dateOfBirth;
	
	@Embedded
	protected Phone phone;
	
	@Embedded
	protected Address address;
	
	@OneToMany(mappedBy="subscriber", fetch=FetchType.LAZY)
	protected List<Subscription> subscriptions;

	@OneToMany(mappedBy="subscriber", fetch=FetchType.LAZY)
	protected List<Appointment> appointments;

	public Integer getSubscriberId() {
		return subscriberId;
	}
	
	public void setSubscriberId(Integer id) {
		this.subscriberId = id;
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
	
	public Integer getVersion() {
		return version;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
}
