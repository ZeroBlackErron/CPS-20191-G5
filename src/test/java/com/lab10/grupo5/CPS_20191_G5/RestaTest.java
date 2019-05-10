package com.lab10.grupo5.CPS_20191_G5;


import org.junit.Assert;
import org.junit.Test;

public class RestaTest {

	
	@Test
	public void testResta() {
		Resta app = new Resta();		
		Assert.assertEquals(app.resta(4, 3), 1);		
	}

	
}
