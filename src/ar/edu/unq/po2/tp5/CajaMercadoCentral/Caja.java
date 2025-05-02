package ar.edu.unq.po2.tp5.CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Pagable> items;
	private Double montoTotal;
	
	public Caja() {
		this.items = new ArrayList<>();
		setMontoTotal(0d);
	}

	public List<Pagable> getItems() {
		return items;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	private void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	public void agregarItem(Pagable item) {
		items.add(item);
	}
	
	public void registrarItems() {
		Double precioTotalAPagar = 0d;
	
		for (Pagable item : items) {
			item.registrarItem();
			precioTotalAPagar = precioTotalAPagar + item.getMonto();
		}
		
		setMontoTotal(precioTotalAPagar);
		
	}
	
	public void informarTotal() {
		System.out.println("Total a pagar: $" + this.getMontoTotal());
	}
		
	
}
