package br.com.g_coachee.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="T_APPOINTMENT")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	appointmentId;
	
    @Version   
    private Integer version;
    
    @NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	@Column(name="START_DATETIME", nullable=false)
	protected Calendar startDateTime;

    @NotBlank
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm")
	@Column(name="END_DATETIME", nullable=false)
	protected Calendar endtDateTime;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "subscriberId", nullable=false)
	protected Subscriber subscriber;
    
    @NotBlank
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "coacheeSubscriptionId", nullable=false)
    protected CoacheeSubscription coacheeSubscription;

    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sessionId", nullable=true)
	protected Session session;

	@Lob
	@Column(name="COMMENTS", nullable=true)
	private String comments;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer id) {
		this.appointmentId = id;
	}

	public Integer getVersion() {
		return version;
	}

	public Calendar getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Calendar startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Calendar getEndtDateTime() {
		return endtDateTime;
	}

	public void setEndtDateTime(Calendar endtDateTime) {
		this.endtDateTime = endtDateTime;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public CoacheeSubscription getCoacheeSubscription() {
		return coacheeSubscription;
	}

	public void setCoacheeSubscription(CoacheeSubscription coacheeSubscription) {
		this.coacheeSubscription = coacheeSubscription;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
}
