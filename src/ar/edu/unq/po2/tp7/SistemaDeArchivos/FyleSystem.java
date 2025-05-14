package ar.edu.unq.po2.tp7.SistemaDeArchivos;

import java.time.LocalDate;

public interface FyleSystem {
	
	/** 
	* Retorna el total ocupado en disco del receptor. Expresado en 
	*cantidad de bytes. 
	*/ 
	public int totalSize();
	
	/** 
	* Imprime en consola el contenido indicando el nombre del elemento e
	* indentandolo con tantos espacios como profundidad en la estructura. 
	*/  
	public void printStructure(String sangria);
	
	/** 
	* Elemento mas nuevo 
	*/
	public FyleSystem lastModified();
	
	/** 
	* Elemento mas antiguo 
	*/ 
	public FyleSystem oldestElement();
	
	/** 
	* Retorna la ultima fecha del elemento, ya sea de creacion o modificacion
	*/ 
	public LocalDate getFecha();
}
