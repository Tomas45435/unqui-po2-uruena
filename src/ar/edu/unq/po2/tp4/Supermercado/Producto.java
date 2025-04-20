package ar.edu.unq.po2.tp3.Supermercado;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado;
	
	//Constructor por defecto, el producto no es parte del programa de precios cuidados.
	public Producto(String nombreProducto, Double precioProducto) {
		this(nombreProducto, precioProducto, false);
	}
	
	//Constructor especifico para indicar que el producto es parte del programa de precios cuidados.
		public Producto(String nombreProducto, Double precioProducto, Boolean esPrecioCuidado) {
			setNombre(nombreProducto);
			setPrecio(precioProducto);
			setEsPrecioCuidado(esPrecioCuidado);
		}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	private void setEsPrecioCuidado(Boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
		
	
	public void aumentarPrecio(Double aumento) {
		Double precioConAumento = getPrecio() + aumento;
		
		setPrecio(precioConAumento);
	}
	

}
