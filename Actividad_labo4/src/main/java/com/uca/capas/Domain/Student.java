package com.uca.capas.Domain;

public class Student {
	private String nombre;
	private String apellido;
	private String carrera;
	private String fentrada;
	private Boolean estado;
	
	public Student() {}
	
	public Student(String nombre, String apellido, String carrera, String fentrada, Boolean estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.fentrada = fentrada;
		this.estado = estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getFentrada() {
		return fentrada;
	}
	public void setFentrada(String fentrada) {
		this.fentrada = fentrada;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public String delegateEstado() {
		return estado ? "Activo":"Inactivo";
	}
	
	
}
