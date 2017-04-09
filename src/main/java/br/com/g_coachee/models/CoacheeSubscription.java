package br.com.g_coachee.models;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class CoacheeSubscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	
    @Version   
    private Integer version;
    
    @Min(1)
    @Column(name="NUMBER_OF_SESSIONS", nullable=false)
	protected Integer numberOfSessions;
    
    @NotEmpty
    @Column(name="TOTAL_AMOUNT", scale = 2)
	protected BigDecimal totalAmount;
	
    @NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="START_DATE", nullable=false)
	protected Calendar startDate;
	
    @NotBlank
	@Column(name="STATUS", nullable=false)
	protected SubscriptionStatus status;
	
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "id", nullable=false)
	Coachee coachee;
	
    public Integer getId() {
		return id;
	}
	
    public void setId(Integer id) {
		this.id = id;
	}
	
    public Integer getVersion() {
		return version;
	}
	
    public void setVersion(Integer version) {
		this.version = version;
	}
	
    public Integer getNumberOfSessions() {
		return numberOfSessions;
	}
	
    public void setNumberOfSessions(Integer numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}
	
    public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	
    public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
    public Calendar getStartDate() {
		return startDate;
	}
	
    public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
    public SubscriptionStatus getStatus() {
		return status;
	}
	
    public void setStatus(SubscriptionStatus status) {
		this.status = status;
	}
	
    public Coachee getCoachee() {
		return coachee;
	}
	
    public void setCoachee(Coachee coachee) {
		this.coachee = coachee;
	}
}
