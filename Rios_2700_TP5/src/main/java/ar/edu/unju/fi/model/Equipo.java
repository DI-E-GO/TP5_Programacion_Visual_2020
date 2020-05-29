package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private String nombre;
	private String estadio;
	
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
}
