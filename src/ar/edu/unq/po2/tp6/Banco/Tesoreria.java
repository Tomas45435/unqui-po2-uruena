package ar.edu.unq.po2.tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public class Tesoreria {

	private List<SolicitudDeCredito> solicitudes;
	
	public Tesoreria() {
		solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	public void agregarSolicitud(SolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	/*
	 * public void limpiarSolicitudesProcesadas() {
    		
    	solicitudes.clear();
	 */
	
	public Double montoTotalADesembolsar() {
		Double montoTotal = 0d;
		
		for(SolicitudDeCredito solicitud : solicitudes) {
			if (solicitud.esAceptable()) {
				montoTotal = montoTotal + solicitud.getMonto();
			}
		}
		
		return montoTotal;
	}
}
