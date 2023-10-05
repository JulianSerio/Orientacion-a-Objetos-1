package oo1.ejercicio13_correo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public List<Archivo> adjuntos() {
		return adjuntos;
	}

	public void agregarArchivoAdjunto(Archivo adjunto) {
		adjuntos.add(adjunto);
	}
	
	public int obtenerTamanoArchivos() {
		return adjuntos.stream()
				.mapToInt(a -> a.tamaño())
				.sum() + this.getTitulo().length() + this.getCuerpo().length();
	}
	

}
