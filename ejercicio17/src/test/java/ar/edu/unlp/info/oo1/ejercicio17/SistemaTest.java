package ar.edu.unlp.info.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	private Sistema sistema;
	private PersonaJuridica pj1,pj2;
	private PersonaFisica pf1,pf2;
	
	@BeforeEach
	public void inicializar() {
		sistema = new Sistema();
		sistema.agregarNumero(221000001); //primero
		sistema.agregarNumero(221000002); //segundo
		sistema.agregarNumero(221000003); //tercero
		sistema.agregarNumero(221000004); //cuarto
		pf1 = new PersonaFisica("Pepe","32 Y 2",440012,'F');
	}
	
	@Test
	public void testAgregarCliente() {
		assertTrue(sistema.getClientes().isEmpty());
		sistema.agregarPersonaFisica("Juan", "67 Y 13", 442411);
		sistema.agregarPersonaFisica("Pepe", "32 Y 2", 440012);
		sistema.agregarPersonaJuridica("ReparT", "80 Y 7", 2032420,"Repartición Provincial");
		assertFalse(sistema.getClientes().isEmpty());
	}
	
	@Test
	public void testAgregarLlamadas() {
		assertTrue(sistema.getLlamadas().isEmpty());
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 20), 900, 10, 221000001, 221000003);
		sistema.registrarLlamadaInterurbana(LocalDate.of(2023, 7, 20), 900, 10, 221000001, 221000002,40);
		sistema.registrarLlamadaInternacional(LocalDate.of(2023, 7, 20), 900, 10, 221000001, 221000005,"Ruanda","Argentina");
		assertFalse(sistema.getLlamadas().isEmpty());
	}
	
	@Test
	public void testFacturarLlamadasLocal() {
		sistema.agregarPersonaFisica("Pepe", "32 Y 2",440012);
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 22), 1500, 10, 221000001, 221000004);
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 10), 900, 10, 221000002, 221000001);
		sistema.registrarLlamadaLocal(LocalDate.of(2023, 7, 30), 800, 10, 221000001, 221000007);
		assertEquals(18,sistema.facturarLlamadasCliente(pf1, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 8, 1)).getMonto()); 
		
		//esta retornando una lista vacia no se por que
		
	}
}
