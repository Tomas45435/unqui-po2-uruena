package ar.edu.unq.po2.tp10.LlamadasTelefonicas;

public class LlamadaDescuento extends LlamadaTelefonica {

	public LlamadaDescuento(int tiempo, int horaDelDia) { 
		  super(tiempo, horaDelDia); 
	} 
	
	//Implementa la operacion primitiva de la clase abstracta
	@Override 
	public boolean esHoraPico() { 
		return false; 
	} 
	
	//Sobrescribe el Hook Method
	@Override 
	public float costoNeto(){ 
		return this.getTiempo()*0.95f; 
	}

}
