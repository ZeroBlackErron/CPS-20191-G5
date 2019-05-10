package com.lab10.grupo5.CPS_20191_G5;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {
	
	@Test
	public void testMultilpicar() {
		
		int VALOR_ESPERADO = 540;
		int VALOR_A = 12;
		int VALOR_B = 45;
		
		Producto p = new Producto();
		
		int r = p.multlipicar(VALOR_A, VALOR_B);
		
		Assert.assertEquals(VALOR_ESPERADO, r);
	}
}
