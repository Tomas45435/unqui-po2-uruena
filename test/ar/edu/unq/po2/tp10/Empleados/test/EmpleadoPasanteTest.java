package ar.edu.unq.po2.tp10.Empleados.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10.Empleados.EmpleadoPasante;

class EmpleadoPasanteTest {

	private EmpleadoPasante empleado;
	
	@BeforeEach
	public void setUp() {
		empleado = new EmpleadoPasante(120);
	}
	
	@Test
	void testSueldo() {
		assertEquals(empleado.sueldo(), 522d);
	}

}
