package ar.edu.unq.po2.tp5.CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class AgenciaMunicipal implements Agencia{

	private List<Factura> listaPagosRegistrados;
	
	public AgenciaMunicipal() {
		listaPagosRegistrados = new ArrayList<>();
	}

	public List<Factura> getListpagosRegistrados() {
		return listaPagosRegistrados;
	}
	
	public void registrarPago(Factura factura) {
		listaPagosRegistrados.add(factura);
	}
	
	public Boolean fueRegistrado(Factura factura) {
		return listaPagosRegistrados.contains(factura);
	}

}
