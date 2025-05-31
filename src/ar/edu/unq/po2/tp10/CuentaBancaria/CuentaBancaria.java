package ar.edu.unq.po2.tp10.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(int monto) {
		this.saldo = monto;
	}
	
	//Operacion concreta
	public void agregarMovimiento(String movimiento) {
		this.movimientos.add(movimiento);
	}
	
	//Operacion concreta de clase abstracta - Se puede sobreescribir
	public int saldoRestantePorExtraccion(int montoDeExtraccion) {
		return (this.getSaldo() - montoDeExtraccion);
	}
	
	//Template Method
	public void extraer(int monto) {
		if (this.sePuedeExtraer(monto)) {
			this.setSaldo(this.saldoRestantePorExtraccion(monto));
			this.agregarMovimiento("Extraccion");
		}
	}
	
	//Operacion primivita
	public abstract Boolean sePuedeExtraer(int monto);
}
