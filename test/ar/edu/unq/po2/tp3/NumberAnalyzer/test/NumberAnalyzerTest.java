package ar.edu.unq.po2.tp3.NumberAnalyzer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.NumberAnalyzer.NumberAnalyzer;


class NumberAnalyzerTest {

	
	/*
	* Verifica la cantidad de numeros pares
	*/
	@Test
	public void testCantidadDeDigitosPares() {
		
		int[] numeros = new int[] {1234, 2468, 13579, 86420, 5555, 22111} ;
		
		//Obtengo el numero con mas digitos pares
			int numMaxDigitosPares = NumberAnalyzer.numeroConMasDigitosPares(numeros);
			
		//Verifico que el numero es el esperado.
			assertEquals(numMaxDigitosPares, 86420);
	}
	
	
	@Test
	public void testMaximoComunMultiploDentroDeRango() {
		
		//Obtengo el maximo comun multiplo dentro un rango
		int maxComunMultiplo = NumberAnalyzer.maximoComunMultiplo(3, 9);
		
		//Verifico que el numero es el esperado.
		assertEquals(maxComunMultiplo, 999);
	}
	
	@Test
	public void testMaximoComunMultiploFueraDeRango() {
		
		//Obtengo el maximo comun multiplo dentro un rango, en este caso es fuera de rango
		int maxComunMultiplo = NumberAnalyzer.maximoComunMultiplo(1001, 1);
		
		//Verifico que devuelva fuera de rango.
		assertEquals(maxComunMultiplo, -1);
	}


}
