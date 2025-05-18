package ar.edu.unq.po2.tp8.VideoJuego.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp8.VideoJuego.Maquina;

class MaquinaTest {

	private Maquina maquina;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@BeforeEach
	public void setUp() {
		maquina = new Maquina();
		System.setOut(new PrintStream(outContent));
		
	}
	
	//Teardown
	@AfterEach
	void tearDown() {
		System.setOut(originalOut);
	}
	
	@Test
	void testSePrecionaElBotonDeInicioDeLaMaquinaSinFichasIngresadas() {
		//Exercise
		maquina.precionarBotonInicio();
		
		//Verify
		assertTrue(outContent.toString().contains("Ingrese fichas"));
		
	}
	
	@Test
	void testSePrecionaElBotonDeInicioDeLaMaquinaConUnaFichaIngresada() {
		//Exercise
		maquina.ingresarFicha();
		maquina.precionarBotonInicio();
		
		//Verify
		assertTrue(outContent.toString().contains("Juego iniciado para un jugador"));
	}
	
	@Test 
	void testSePrecionaElBotonDeInicioDeLaMaquinaConDosFichaIngresadas() {
		//Exercise
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.precionarBotonInicio();
		
		//Verify
		assertTrue(outContent.toString().contains("Juego iniciado para dos jugadores"));
	}
		

}
