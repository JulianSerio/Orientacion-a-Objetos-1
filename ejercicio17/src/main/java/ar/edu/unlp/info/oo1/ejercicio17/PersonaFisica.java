package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaFisica extends Cliente {
	private int DNI;

	public PersonaFisica(String nombre,String direccion,int DNI,Integer numero) {
		super(nombre,direccion,'F',numero);
		this.DNI = DNI;
	}
	
	public double descuento(double monto) {
		return monto * 0.1;
	}
	
	


}
