package ar.edu.unq.po.tp3.counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po.tp3.Counter;

public class CounterTestCase {
	private Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par, nueve impares y dos numeros multiplos de 3
			
		counter.addNumber(1);	
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);

	}
	
	/**
	* Verifica la cantidad de numeros pares
	*/
	
	@Test
	public void testNumerosPares() {
		
		//Obtengo la cantidad de numeros pares
			int cantidad = counter.cantidadNumerosPares();
			
		//Verifico que la cantidad sea la esperada
			assertEquals(cantidad, 1);
	}
	
	
	/**
	* Verifica la cantidad de numeros impares
	*/
	
	@Test
	public void testNumerosImpares() {
		
		//Obtengo la cantidad de numeros impares
			int cantidad = counter.cantidadNumerosImpares();
			
		//Verifico que la cantidad sea la esperada
			assertEquals(cantidad, 9);
	}
	
	
	/**
	* Verifica la cantidad de numeros que son multiplo de tres
	*/
	
	@Test
	public void testNumerosMultiplosDeTres() {
		
		//Obtengo la cantidad de numeros que son multiplo de tres
			int cantidad = counter.cantidadDeMultiplosDe(3);
			
		//Verifico que la cantidad sea la esperada
			assertEquals(cantidad, 2);
	}
}