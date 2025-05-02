package ar.edu.unq.po2.tp5.CajaMercadoCentral;

public abstract class Producto implements Pagable {
	
	private String nombre;
	private Double precioBase;
	private Stock stock;
	
	public Producto(String nombreProducto, Double precioProducto, int cantidadInicial) {
		setNombre(nombreProducto);
		setPrecioBase(precioProducto);
		this.stock = new Stock(cantidadInicial);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	private void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	public abstract Double getMonto();
	
	public void registrarItem() {
		stock.decrementar();
	}
	
	public int getStockDisponible() {
		return stock.getCantidad();
	}
	
}
