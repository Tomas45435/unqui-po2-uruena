package ar.edu.unq.po2.tp4.ImpuestosTrabajador.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ImpuestosTrabajador.IngresoHorasExtras;
import ar.edu.unq.po2.tp4.ImpuestosTrabajador.IngresoRegular;
import ar.edu.unq.po2.tp4.ImpuestosTrabajador.Trabajador;

class TrabajadorTest {

	private Trabajador pedro;
	private IngresoHorasExtras sueldoHorasExtras;
	private IngresoRegular sueldo;
	private IngresoRegular sueldo2;
	
	@BeforeEach
	public void setUp() {
		pedro = new Trabajador();
		sueldoHorasExtras = new IngresoHorasExtras("Marzo", "Horas Extras", 50000d, 21);
		sueldo = new IngresoRegular("Abril", "Sueldo", 150000d);
		sueldo2 = new IngresoRegular("Mayo", "Sueldo", 180000d);
		
		pedro.agregarIngreso(sueldo);
		pedro.agregarIngreso(sueldo2);
		pedro.agregarIngreso(sueldoHorasExtras);
	}
	
	@Test
	public void testTrabajadorAgregaIngresos() {
		
		assertEquals(3, pedro.getCantidadDeIngresos());
	}
	
	@Test
	public void testTotalPercibido() {
		
		assertEquals(380000d, pedro.getTotalPercibido());
	}
	
	@Test
	public void testTotalMontoImponible() {
		
		assertEquals(330000d, pedro.getMontoImponible());
	}
	
	@Test
	public void testMontoTotalAPagar() {
		
		assertEquals(6600d, pedro.getImpuestoAPagar());
	}

}
