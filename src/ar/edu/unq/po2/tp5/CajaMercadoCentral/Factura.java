package ar.edu.unq.po2.tp5.CajaMercadoCentral;

import java.time.LocalDate;

public abstract class Factura implements Pagable{
	
	private String numero;
	private LocalDate fecha;
	private Agencia agencia;
	
	public Factura(String numero, LocalDate fecha, Agencia agenciaRecaudadora) {
		this.setNumero(numero);
		this.setFecha(fecha);
		this.setAgencia(agenciaRecaudadora);
	}
	
	public abstract Double getMonto();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void registrarItem() {
		agencia.registrarPago(this);
	}
	
}
