package ar.edu.unlp.info.oo1.ejercicio17;

public class PersonaJuridica extends Cliente{
	private int CUIL;
	private String tipo;
	public PersonaJuridica(String nombre, String direccion, int CUIL, String tipo,Integer numero) {
		super(nombre, direccion,'J',numero);
		this.CUIL = CUIL;
		this.tipo = tipo;
	}
	
	public double descuento(double monto) {
		return 0;
	}

}
