package oo1.ejercicio9_cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		this.limiteDescubierto = 0;
	}

	@Override
	public boolean puedeExtraer(double monto) {
		if (this.getSaldo() - monto >= this.limiteDescubierto) return true;
		else return false;	
	} 
}
