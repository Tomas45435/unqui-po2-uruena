package ar.edu.unq.po2.tp3.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombreSupermercado, String direccionSupermercado) {
		this.setNombre(nombreSupermercado);
		this.setDireccion(direccionSupermercado);
		this.productos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		
		Double precioTotal = 0.0;
		
		for(Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		
		return precioTotal;
	}
}
