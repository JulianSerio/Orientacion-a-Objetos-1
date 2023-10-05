package oo1.ejercicio13_correo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(Carpeta c) {
		inbox = c;
		this.carpetas = new ArrayList<>();
	}
	
	public void agregarCarpeta(Carpeta c) {
		carpetas.add(c);
	}
	
	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public Carpeta getInbox() {
		return inbox;
	}

	public void setInbox(Carpeta inbox) {
		this.inbox = inbox;
	}

	public void recibir (Email email) {
		this.inbox.agregarCorreo(email);
	}
	
	public void mover (Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarCorreo(email);
		destino.agregarCorreo(email);
	}
	
	public Email buscar(String texto) { // podria hacerlo haciendo un stream en Carpeta?)
		return carpetas.stream() 
				.flatMap(c -> c.getEmails().stream()) // Transforma cada lista en un stream y los combina en uno solo
				.filter(e -> e.getTitulo().contains(texto) || e.getCuerpo().contains(texto))
				.findFirst()
				.orElse(null);
	}
			
	
	public int espacioOcupado() {
		return carpetas.stream()
				.flatMap(c -> c.getEmails().stream()) 
				.mapToInt(e -> e.obtenerTamanoArchivos())
				.sum();

	}
	
	

}
