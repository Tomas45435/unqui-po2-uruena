package ar.edu.unq.po2.tp3.Point.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point.Point;

class PointTest {

	private Point point1;
	private Point point2;
	
	
	@Test
	public void testCrearPuntoConCordenadasXY() {
		//Se crea el Punto1.
		point1 = new Point(1, 3);
		
		//Se verifica que el punto este seteado correctamente.
		assertEquals(point1.getX(), 1);
		assertEquals(point1.getY(), 3);
	}
	
	@Test
	public void testCrearPuntoSinCoordenadas() {
		//Se crea el Punto1 sin parametros.
		point1 = new Point();
		
		//Se verifica que el punto este seteado correctamente.
		assertEquals(point1.getX(), 0);
		assertEquals(point1.getY(), 0);
	}
	
	@Test
	public void testMoverUnPunto() {
		//Se crea un Punto1 y se mueve a las coordenadas X = 5, Y = 2.
		point1 = new Point();
		point1.moverPuntoACoordenadas(5, 2);
		
		//Se verifica que el punto este seteado en las nuevas coordenadas.
		assertEquals(point1.getX(), 5);
		assertEquals(point1.getY(), 2);
	}
	
	@Test
	public void testSumarseConOtroPunto() {
		//Se crea el Punto1 y suma sus coordenadas con otro Punto2.
		point1 = new Point(2, 5);
		point2 = new Point(6, 6);
		point1.sumarseConPunto(point2);
		
		//Se verifica que el punto este seteado correctamente.
		assertEquals(point1.getX(), 8);
		assertEquals(point1.getY(), 11);
	}

}
