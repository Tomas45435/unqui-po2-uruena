package ar.edu.unq.po2.tp10.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
	
	private int descubierto;
	
	public CuentaCorriente(String titular, int descubierto){ 
        super(titular); 
        this.descubierto=descubierto; 
    }
	
	public int getDescubierto() {
		return this.descubierto;
	}

	@Override
	public Boolean sePuedeExtraer(int monto) {
		Boolean sePuedeExtraer = (this.getSaldo() + this.getDescubierto()) >= monto;
		return sePuedeExtraer;
	}

}
