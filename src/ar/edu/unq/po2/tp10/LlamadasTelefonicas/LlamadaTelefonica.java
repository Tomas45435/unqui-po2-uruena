package ar.edu.unq.po2.tp10.LlamadasTelefonicas;

public abstract class LlamadaTelefonica {
	
	private int tiempo; 
	private int horaDelDia; 
	
	//Constructor
	public LlamadaTelefonica(int tiempo, int horaDelDia){ 
	this.tiempo=tiempo; 
	this.horaDelDia=horaDelDia; 
	}
	
	//Operacion Concreta
	public int getTiempo(){ 
		return this.tiempo; 
	} 
	//Operacion Concreta
	public int getHoraDelDia(){ 
	return this.horaDelDia; 
	}
	
	//Operacion Primitiva
	public abstract boolean esHoraPico();
	
	//Template Method
	public float costoFinal(){ 
		if(this.esHoraPico()){ 
		   return this.costoNeto()*1.2f*this.getTiempo(); 
		}else{ 
		   return this.costoNeto()*this.getTiempo(); 
		} 
	} 
	
	// Operacion Concretra de Clase Abstracta y Hook Method
	public float costoNeto(){ 
		return this.getTiempo()*1; 
	}
}
