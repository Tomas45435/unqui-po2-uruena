package ar.edu.unq.po2.tp6.Banco;

import java.time.LocalDate;
import java.time.Period;

public class ClienteIndividual implements Cliente{

	private String nombre;
	private String apellido;
	private String direccion;
	private LocalDate fechaNac;
	private Double sueldoNetoMensual;
	
	
	public ClienteIndividual(String nombre, String apellido, String direccion, LocalDate fechaNac, Double sueldoNetoMensual) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setFechaNac(fechaNac);
		this.setSueldoNetoMensual(sueldoNetoMensual);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	private void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	private void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public int getEdad() {
		 LocalDate fechaActual = LocalDate.now();
	        Period periodo = Period.between(this.getFechaNac(), fechaActual);
	        return periodo.getYears();
	}
	
	public Double getIngresoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
	
	
}
