package ar.edu.unq.po2.tp10.Empleados.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp10.Empleados.EmpleadoTemporario;

class EmpleadoTemporarioTest {

	private EmpleadoTemporario empleado;
	
	@BeforeEach
	public void setUp() {
		empleado = new EmpleadoTemporario(120, true, false);
	}
	
	@Test
	void testSueldo() {
		assertEquals(empleado.sueldo(), 1479d);
	}

}
