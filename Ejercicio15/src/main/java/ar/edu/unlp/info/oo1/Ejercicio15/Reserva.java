package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;


public class Reserva {
	private DataLapse periodo;
	private Usuario inquilino;
	private Propiedad propiedad;
	
	public Reserva(Propiedad propiedad, DataLapse periodo, Usuario user) {
		this.propiedad = propiedad;
		this.periodo = periodo;
		this.inquilino = user;
	}
	
		
	public DataLapse getPeriodo() {
		return periodo;
	}


	public Usuario getInquilino() {
		return inquilino;
	}
	
	public int diasReserva() {
		return periodo.sizeInDays();
	}

	public double getMontoIngresos() {
		return this.diasReserva() * this.propiedad.getPrecioPorNoche();
	}

	public boolean comparoPeriodo(DataLapse periodo) {
		return this.periodo.overlaps(periodo);
	}

	
	public boolean esPosterior(LocalDate fechaActual) {
		if (this.periodo.startsAfter(fechaActual)) return true;
		else return false;
	}
	

	
}
