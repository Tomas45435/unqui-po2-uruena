package ar.edu.unq.po2.tp5.CajaMercadoCentral;

public class Stock {
	
	private int cantidad;
	
	public Stock(int cantidadInicial) {
		this.cantidad = cantidadInicial;
	}
	
	public void decrementar() {
		if (cantidad <= 0) {
			throw new IllegalStateException("No hay stock disponible.");
		}
		
		cantidad-- ;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
