package oo1.ejercicio9_cuentaConGanchos;

public class CajaDeAhorro extends Cuenta {


	public CajaDeAhorro() {
		
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if ((this.getSaldo() - this.costoAdicional(monto)) - monto >= 0) return true;
		else return false;
	}

	protected double costoAdicional(double monto) {
		return monto * 0.2;
	}
}