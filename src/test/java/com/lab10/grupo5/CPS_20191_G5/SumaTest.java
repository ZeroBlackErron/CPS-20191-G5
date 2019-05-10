package com.lab10.grupo5.CPS_20191_G5;

import org.junit.Assert;
import org.junit.Test;

public class SumaTest {
	@Test
	public void ObtenerSuma() {
		Suma s = new Suma();
		Assert.assertEquals(s.suma(8,2), 10);
	}
}
