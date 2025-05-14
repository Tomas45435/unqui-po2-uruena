package ar.edu.unq.po2.tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	private Tesoreria tesoreria;
	
	public Banco(Tesoreria tesoreria) {
		this.setTesoreria(tesoreria);
		clientes = new ArrayList<Cliente>();
	}

	public Tesoreria getTesoreria() {
		return tesoreria;
	}

	public void setTesoreria(Tesoreria tesoreria) {
		this.tesoreria = tesoreria;
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void solicitarCredito(SolicitudDeCredito solicitud) {
		if (!clientes.contains(solicitud.getCliente())) {
            throw new IllegalArgumentException("Cliente no registrado");
		}
		
		tesoreria.agregarSolicitud(solicitud);
	
	}
}
