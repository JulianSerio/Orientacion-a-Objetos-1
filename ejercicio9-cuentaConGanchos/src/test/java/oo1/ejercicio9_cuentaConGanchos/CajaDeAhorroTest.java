package oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {
	
	@Test
	public void testExtraer() {
		CajaDeAhorro caja1 = new CajaDeAhorro();
		CajaDeAhorro caja2 = new CajaDeAhorro();
		
		caja1.depositar(1000);
		assertEquals(false,caja1.extraer(1000));
		caja1.depositar(500);
		assertEquals(true,caja1.extraer(1000));
	}
	
	@Test
	public void testTransferirACuenta() {
		CajaDeAhorro caja1 = new CajaDeAhorro();
		CajaDeAhorro caja2 = new CajaDeAhorro();
		
		caja1.depositar(1000);
		assertEquals(true, caja1.transferirACuenta(500, caja2));
		assertEquals(false, caja1.transferirACuenta(500, caja2));
	}
	
	

}
