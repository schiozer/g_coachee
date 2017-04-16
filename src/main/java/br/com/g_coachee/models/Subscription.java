package br.com.g_coachee.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/*
 * http://stackoverflow.com/questions/34588354/difference-between-size-length-and-columnlength-value
 * */
@Entity
@Table(name="T_SUBSCRIPTION")
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	subscriptionId;
    
	@Version   
    private Integer version;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="EXPIRATION_DATE", nullable=true)
	protected Calendar expirationDate;
	
	@NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="START_DATE", nullable=false)
	protected Calendar startDate;
	
	@NotBlank
	@Column(name="STATUS", nullable=false)
	protected SubscriptionStatus status;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "id", nullable=false)
	Subscriber subscriber;
	
    public Integer getSubscriptionId() {
		return subscriptionId;
	}
	
	public void setSubscriptionId(Integer id) {
		this.subscriptionId = id;
	}
	
	public Calendar getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
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
	
	public Subscriber getSubscriber() {
		return subscriber;
	}
	
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
}
