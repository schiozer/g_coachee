package br.com.g_coachee.models;

import org.junit.Assert;
import org.junit.Test;

public class PhoneTest {

	@Test
	public void testToString() {
		
		Phone phone = new Phone();
		phone.setPhone("551199898544");
		
		Assert.assertEquals("+55 11 98291-8544", phone.toString());
	}

}
