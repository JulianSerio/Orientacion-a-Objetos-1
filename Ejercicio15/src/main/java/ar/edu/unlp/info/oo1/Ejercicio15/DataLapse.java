package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DataLapse(LocalDate from, LocalDate to) {
		this.from=from;
		this.to=to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	@SuppressWarnings("deprecation")
	public int sizeInDays() {
		return new Long(ChronoUnit.DAYS.between(from, to)).intValue(); //probar
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isEqual(getFrom()) || other.isBefore(getTo()) && other.isAfter(from) || other.isEqual(getTo());
	}
	
	public boolean overlaps(DataLapse anotherDateLapse) {
		boolean superpuesto = !this.getTo().isBefore(anotherDateLapse.getFrom()) && !this.getFrom().isAfter(anotherDateLapse.getTo())
		           || this.getTo().equals(anotherDateLapse.getFrom()) || this.getFrom().equals(anotherDateLapse.getTo());
	    return superpuesto;
	}

	public boolean startsAfter(LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
