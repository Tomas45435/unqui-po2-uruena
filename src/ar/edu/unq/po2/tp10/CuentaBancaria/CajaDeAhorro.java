package ar.edu.unq.po2.tp10.CuentaBancaria;

public class CajaDeAhorro extends CuentaBancaria {
	
	private int limite;
	
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}
	
	public int getLimite() {
		return this.limite;
	}

	@Override
	public Boolean sePuedeExtraer(int monto) {
		Boolean sePuedeExtraer = this.getSaldo() >= monto && this.getLimite() >= monto;
		return sePuedeExtraer;
	}

}
