package ar.edu.unq.po2.tp7.SistemaDeArchivos;


import java.time.LocalDate;

public class Archivo implements FyleSystem {
	
	private String nombre;
	private int size;
	private LocalDate fechaModificacion;
	
	public Archivo(String nombre, int size, LocalDate fechaModificacion) {
		this.setNombre(nombre);
		this.setSize(size);
		this.setFechaModificacion(fechaModificacion);
	}
	

	private void setSize(int size) {
		this.size = size;
	}

	private void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public LocalDate getFecha() {
		return fechaModificacion;
	}
	
	@Override
	public int totalSize() {
		return size;
	}

	@Override
	public void printStructure(String sangria) {
		System.out.println(sangria + getNombre() + "(" + this.totalSize() + "bytes)");

	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

}
