package ar.edu.unq.po2.tp4.ImpuestosTrabajador.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ImpuestosTrabajador.IngresoHorasExtras;

class IngresoHorasExtrasTest {

	private IngresoHorasExtras sueldoHorasExtras;
	
	@BeforeEach
	public void setUp() {
		sueldoHorasExtras = new IngresoHorasExtras("Enero", "Horas Extras", 10000d, 5);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Enero", sueldoHorasExtras.getMes());
		assertEquals("Horas Extras", sueldoHorasExtras.getConcepto());
		assertEquals(10000d, sueldoHorasExtras.getMonto());
		assertEquals(5, sueldoHorasExtras.getHorasExtras());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(0d, sueldoHorasExtras.getMontoImponible());
	}

}
