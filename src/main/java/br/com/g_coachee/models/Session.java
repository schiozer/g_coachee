package br.com.g_coachee.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_SESSION")
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	
    @Version   
    private Integer version;
    
    @NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	@Column(name="SESSION_DATETIME", nullable=false)
	protected Calendar sessionDateTime;
    
	@Lob
	@Column(name="TOPICS_DISCUSSED", nullable=true)
	private String topicsDiscussed;

	@Lob
	@Column(name="COACHEE_TODO", nullable=true)
	private String toDoForTheCoachee;

	@Lob
	@Column(name="CONCLUSION", nullable=true)
	private String conclusion;

}
