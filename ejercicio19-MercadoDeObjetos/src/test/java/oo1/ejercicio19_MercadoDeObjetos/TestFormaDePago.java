package oo1.ejercicio19_MercadoDeObjetos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFormaDePago {
	private AlContado al;
	private Cuotas cu;
	
	@BeforeEach
	public void setUp() {
		al = new AlContado();
		cu = new Cuotas();
	}
	
	@Test
	public void testPrecioFinal() {
		
	}

}
