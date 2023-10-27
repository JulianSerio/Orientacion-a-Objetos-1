package ar.edu.unlp.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LlamadaTest {
	private LlamadaLocal local;
	private LlamadaInternacional inter;
	private LlamadaInterurbana urbana;
	
	
	@BeforeEach
	public void inicializar() {
		local = new LlamadaLocal(LocalDate.of(2023, 7, 10),800,10,221001,221002);
		inter = new LlamadaInternacional(LocalDate.of(2023, 7, 22),900, 10, 221000001, 221000002,"Argentina","Belgica");
		urbana = new LlamadaInterurbana(LocalDate.of(2023, 7, 15),800,20,221001,221003,20);
	}
	
	
	
	@Test
	public void testLlamadasCliente() {
		assertFalse(local.llamadasDeCliente(221002));
		assertTrue(local.llamadasDeCliente(221001));
	}
	
	@Test
	public void testLlamadaLocal() {
		assertNotEquals(0,local.costoPorLlamada());
		assertNotEquals(-1,local.costoPorLlamada());
		assertEquals(10,local.costoPorLlamada());
	}
	
	@Test
	public void testLlamadaInternacional() {
		assertNotEquals(0,inter.costoPorLlamada());
		assertNotEquals(-1,inter.costoPorLlamada());
		assertEquals(40,inter.costoPorLlamada());
	}
	
	@Test
	public void testLlamadaInterurbana() {
		assertNotEquals(0,urbana.costoPorLlamada());
		assertNotEquals(-1,urbana.costoPorLlamada());
		assertEquals(45,urbana.costoPorLlamada());
	}

	
}
