package oo1.ejercicio8_distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario usuario;

	public Factura(double monto, double descuento, Usuario usuario) {
		this.montoEnergiaActiva = monto;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}
	
	public double montoTotal() {
		return montoEnergiaActiva - descuento;
	}

	public double descuento() {
		return descuento;
	}

	public LocalDate fecha() {
		return fecha;
	}

	public Usuario usuario() {
		return usuario;
	}
	
	
}
