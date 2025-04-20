package ar.edu.unq.po2.tp3.Supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto) {
		super(nombreProducto, precioProducto);
	}
	
	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Boolean esPrecioCuidado) {
		super(nombreProducto, precioProducto, esPrecioCuidado);
	}
	
	@Override
	public Double getPrecio() {
		return (super.getPrecio() * 0.9);
	}
	
}
