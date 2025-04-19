package ar.edu.unq.po2.tp3.Point.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point.Point;
import ar.edu.unq.po2.tp3.Point.Rectangulo;

class RectanguloTest {
	
	private Point punto1;
	private Point punto2;
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		punto1 = new Point(1, 1);
		punto2 = new Point(7, 6);
		rectangulo = new Rectangulo(punto1, punto2);
	}
	
	@Test
	public void testCrearUnRectangulo() {

		int ancho = rectangulo.calcularAncho();
		int alto = rectangulo.calcularAlto();
		assertEquals(ancho, 6);
		assertEquals(alto, 5);
	}
	
	@Test
	public void testCalcularAreaDeRectangulo() {
		
		int area = rectangulo.calcularArea();
		assertEquals(area, 30);
	}
	
	@Test
	public void testCalcularPerimetroDeRectangulo() {
		
		int perimetro = rectangulo.calcularPerimetro();
		assertEquals(perimetro, 22);
	}
	
	@Test
	public void testDeterminarSiElRectanguloEsHorizontal() {
		
		assertEquals(rectangulo.esHorizontal(), true);
	}
	
	@Test
	public void testDeterminarSiElRectanguloEsVertical() {
		
		assertEquals(rectangulo.esVertical(), false);
	}
}
