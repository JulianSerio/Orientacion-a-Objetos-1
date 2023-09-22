package oo1.ejercicio9_cuentaConGanchos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	
	@Test
	public void testExtraer() {
		CuentaCorriente caja1 = new CuentaCorriente();
		CuentaCorriente caja2 = new CuentaCorriente();
		
		caja1.depositar(1000);
		assertEquals(true,caja1.extraer(1000));
		assertEquals(false,caja1.extraer(1000));	
	}
	
	public void testTransferirACuenta() {
		CuentaCorriente caja1 = new CuentaCorriente();
		CuentaCorriente caja2 = new CuentaCorriente();
		
		caja1.depositar(1000);
		assertEquals(true, caja1.transferirACuenta(500, caja2));
		assertEquals(false, caja1.transferirACuenta(500, caja2));
	}
}
