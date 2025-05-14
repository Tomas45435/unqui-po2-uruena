package ar.edu.unq.po2.tp7.SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem {
	
	private String nombre;
	private LocalDate fechaCreacion;
	private List<FyleSystem> contenido;
	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		this.setNombre(nombre);
		this.setFechaCreacion(fechaCreacion);
		this.contenido = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}

	public List<FyleSystem> getContenido() {
		return contenido;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Override
	public LocalDate getFecha() {
		return fechaCreacion;
	}

	@Override
	public int totalSize() {
		int totalSize = 0;
		
		for (FyleSystem contenidoHijo : contenido) {
			totalSize += contenidoHijo.totalSize();
		}
		return totalSize;
	}

	@Override
	public void printStructure(String sangria) {
		System.out.println(sangria + getNombre() + "/");
		for (FyleSystem contenidoHijo : contenido ) {
			contenidoHijo.printStructure(sangria + " ");
		}

	}

	@Override
	public FyleSystem lastModified() {
		FyleSystem masReciente = this;
		
		for (FyleSystem contenidoHijo : contenido) {
			FyleSystem masRecienteHijo = contenidoHijo.lastModified();
			if (masRecienteHijo.getFecha().isAfter(masReciente.getFecha())) {
				masReciente = masRecienteHijo;
			}
		}
		
		return masReciente;
	}

	@Override
	public FyleSystem oldestElement() {
		FyleSystem masAntiguo = this;
		
		for (FyleSystem contenidoHijo : contenido) {
			FyleSystem masAntiguoHijo = contenidoHijo.oldestElement();
			if (masAntiguoHijo.getFecha().isBefore(masAntiguo.getFecha())) {
				masAntiguo = masAntiguoHijo;
			}
		}
		
		return masAntiguo;
	}
	
	public void agregarComponente(FyleSystem componente) {
		contenido.add(componente);
	}
	
	public void eliminarComponente(FyleSystem componente) {
		contenido.remove(componente);
	}

}
