package oo1.ejercicio17_FacturacionDeLlamadas;

public class PersonaJuridica extends Cliente{
	private int CUIL;
	private String tipo;
	public PersonaJuridica(String nombre, String direccion, int CUIL, String tipo,char id) {
		super(nombre, direccion,id);
		this.CUIL = CUIL;
		this.tipo = tipo;
	}

}
