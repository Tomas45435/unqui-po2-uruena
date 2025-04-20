package ar.edu.unq.po2.tp4.Supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Double descuento) {
		super(nombreProducto, precioProducto);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Boolean esPrecioCuidado, Double descuento) {
		super(nombreProducto, precioProducto, esPrecioCuidado);
		this.setDescuento(descuento);
	}
	
	@Override
	public Double getPrecio() {
		Double descuento = super.getPrecio() * this.getDescuento();
		return (super.getPrecio() - descuento);
	}
	
	private void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	public Double getDescuento() {
		return descuento;
	}
}
