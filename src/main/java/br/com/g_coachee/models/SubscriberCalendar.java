package br.com.g_coachee.models;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Embeddable
public class SubscriberCalendar {
	
	@OneToMany(mappedBy="subscriberCalendar", fetch=FetchType.LAZY)
	protected List<Appointment> appointments;

}
