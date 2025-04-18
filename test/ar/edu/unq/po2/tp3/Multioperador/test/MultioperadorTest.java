package ar.edu.unq.po2.tp3.Multioperador.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador.Multioperador;


class MultioperadorTest {

	private Multioperador multioperador;
	/**
	* Crea un escenario de test básico, que consiste en un multioperador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea contador
		multioperador = new Multioperador();
		
		//Se agregan los numeros.
			
		multioperador.addNumber(2);	
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		multioperador.addNumber(7);
		multioperador.addNumber(9);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(1);
		multioperador.addNumber(4);

	}
	
	
	/*
	 * Verifica el resultado de aplicar el operador suma en todos los numeros
	 */
	@Test
	public void testSumaDeTodosLosNumeros() {
		//Obtengo la resultado de la suma
		int resultado = multioperador.sumarTodo();
		//Verifico que el resultado sea el esperado
		assertEquals(resultado, 34);
	}
	
	
	/*
	 * Verifica el resultado de aplicar el operador resta en todos los numeros
	 */
	@Test
	public void testRestaDeTodosLosNumeros() {
		//Obtengo la resultado de la resta
		int resultado = multioperador.restarTodo();
		//Verifico que el resultado sea el esperado
		assertEquals(resultado, -30);
	}
	
	/*
	 * Verifica el resultado de aplicar el operador multiplicacion en todos los numeros
	 */
	@Test
	public void testMultiplicacionDeTodosLosNumeros() {
		//Obtengo la resultado de la multiplicacion
		int resultado = multioperador.multiplicarTodo();
		//Verifico que el resultado sea el esperado
		assertEquals(resultado, 7560);
	}

}
