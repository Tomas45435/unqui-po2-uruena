package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.AgenciaMunicipal;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.FacturaImpuesto;

class FacturaImpuestoTest {
	
	private FacturaImpuesto facturaLuz;
	private AgenciaMunicipal agenciaBerazategui;
	
	@BeforeEach
	public void setUp() {
		agenciaBerazategui = new AgenciaMunicipal();
		facturaLuz = new FacturaImpuesto("435345",LocalDate.of(2025, 3, 12), agenciaBerazategui, 19000d);
	}

	@Test
	public void testConstructor() {
		assertEquals("435345", facturaLuz.getNumero());
		assertEquals(LocalDate.of(2025, 3, 12), facturaLuz.getFecha());
		assertEquals(agenciaBerazategui, facturaLuz.getAgencia());
		assertEquals(19000d, facturaLuz.getTasaFija());
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(19000d, facturaLuz.getMonto());
	}

}
