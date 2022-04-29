package es.mde.Familab;

import java.time.LocalDate;

public class Usuario {
	
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Analitica analiticas;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Analitica getAnaliticas() {
		return analiticas;
	}
	public void setAnaliticas(Analitica analiticas) {
		this.analiticas = analiticas;
	}
	
	

}
