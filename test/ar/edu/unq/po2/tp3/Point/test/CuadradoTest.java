package ar.edu.unq.po2.tp3.Point.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point.Cuadrado;
import ar.edu.unq.po2.tp3.Point.Point;

class CuadradoTest {

	private Point puntoOrigen;
	private int longitudLado;
	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		puntoOrigen = new Point(1, 1);
		longitudLado = 4;
		cuadrado = new Cuadrado(puntoOrigen, longitudLado);
	}
	
	@Test
	public void testCrearUnCuadrado() {
		
		int ancho = cuadrado.calcularAncho();
		int alto = cuadrado.calcularAlto();
		
		assertEquals(ancho, alto);
	}
	
	@Test
	public void testCalcularAreaDeCuadrado() {
		int area = cuadrado.calcularArea();
		assertEquals(area, 16);
	}
	
	@Test
	public void testCalcularPerimetroDeCuadrado() {
		int perimetro = cuadrado.calcularPerimetro();
		assertEquals(perimetro, 16);
	}
}
