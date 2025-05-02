package ar.edu.unq.po2.tp5.CajaMercadoCentral;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombreProducto, Double precioProducto, int cantidadInicial) {
		super(nombreProducto, precioProducto, cantidadInicial);
	}
	
	@Override
	public Double getMonto() {
		Double precioConDescuento = super.getPrecioBase() * 0.9;
		return precioConDescuento;
	}

}
