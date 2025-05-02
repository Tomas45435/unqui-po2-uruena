package ar.edu.unq.po2.tp5.CajaMercadoCentral;

public class  ProductoTradicional extends Producto {

	public ProductoTradicional(String nombreProducto, Double precioProducto, int cantidadInicial) {
		super(nombreProducto, precioProducto, cantidadInicial);
	}
	
	@Override
	public Double getMonto() {
		return super.getPrecioBase();
	}

}
