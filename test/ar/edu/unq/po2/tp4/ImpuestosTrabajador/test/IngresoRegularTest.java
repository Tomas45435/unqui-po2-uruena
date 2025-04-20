package ar.edu.unq.po2.tp4.ImpuestosTrabajador.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ImpuestosTrabajador.IngresoRegular;

class IngresoRegularTest {

	private IngresoRegular sueldo;
	
	@BeforeEach
	public void setUp() {
		sueldo = new IngresoRegular("Enero", "Sueldo", 100000d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Enero", sueldo.getMes());
		assertEquals("Sueldo", sueldo.getConcepto());
		assertEquals(100000, sueldo.getMonto());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(100000d, sueldo.getMontoImponible());
	}

}
