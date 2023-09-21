package oo1.ejercicio8_distribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	private List<Factura> facturas;
	
	public Usuario (String nombre, String direccion) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}
	
	public void agregarMedicion(Consumo unConsumo) {
		this.consumos.add(unConsumo);
	}
	
	public Consumo ultimoConsumo() {
		return consumos.get(consumos.size() - 1);
	}
	
	public double ultimoConsumoActiva() {
		return this.ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	public Factura facturarEnBaseA(double precioKw) {
		Factura f = new Factura(this.ultimoConsumoActiva() * precioKw,this.descuento(),this);
		facturas.add(f);
		return f;
	}

	private double descuento() {
        double descuento = 0;
        if (this.ultimoConsumo().factorDePotencia() > 0.8) {
            descuento = 0.10;
        }
        return descuento;
    }
	
	//TODO???
	public List<Factura> facturas(){
		return facturas;
	}
	
}
