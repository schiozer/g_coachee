package br.com.g_coachee.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * http://stackoverflow.com/questions/34588354/difference-between-size-length-and-columnlength-value
 * */

@Entity
@Table(name="T_COACH_SUBSCRIBER")

//indexes = {@Index(name = "i_company_activity", columnList = "activity_id,company_id")})
public class CoachSubscriber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	@NotBlank
	@Size (min = 12, max=12)
	@Column(name="CPF", length=12, unique=true, nullable=false)
	private String cpf;
	@NotBlank
	@Size (max=60)
	@Column(name="COACHNAME", length=60, nullable=false)
	private String name;
	@NotBlank
	@Size (max=150)
	@Column(name="EMAIL", length=150, unique=true, nullable=false)
	private String email;
	@NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="DATEOFBIRTH", nullable=false)
	private Calendar dateOfBirth;
	@Embedded
	private Phone phone;
	@Embedded
	private Address address;

}
