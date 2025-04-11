package ar.edu.unq.po2.tp3.NumberAnalyzer.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.NumberAnalyzer.NumberAnalyzer;


class NumberAnalyzerTest {

	
	/*
	* Verifica la cantidad de numeros pares
	*/
	@Test
	public void testCantidadDeDigitosPares() {
		
		NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
		int[] numeros = new int[] {1234, 2468, 13579, 86420, 5555, 22111} ;
		
		//Obtengo el numero con mas digitos pares
			int numMaxDigitosPares = numberAnalyzer.encontrarNumeroConMasDigitosPares(numeros);
			
		//Verifico que el numero es el esperado.
			assertEquals(numMaxDigitosPares, 86420);
	}


}
