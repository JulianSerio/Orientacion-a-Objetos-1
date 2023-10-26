package oo1.ejercicio17_FacturacionDeLlamadas;

public class Cliente {
	private String nombre;
	private String direccion;
	private int numero;
	private char id;
	public Cliente(String nombre, String direccion,char id) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.id = id;
	}
	
	public void agregarNumero(Integer numero) {
		this.numero = numero.intValue();
	}

	public int getNumero() {
		return numero;
	}
	
	
	
	
	
	
	

}
