package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.AgenciaMunicipal;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.Factura;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.FacturaImpuesto;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.FacturaServicio;

class FacturaTest {
	
	private FacturaServicio facturaNetflix;
	private FacturaImpuesto facturaLuz;
	private AgenciaMunicipal agenciaBerazategui;
	
	@BeforeEach
	public void setUp() {
		agenciaBerazategui = new AgenciaMunicipal();
		facturaNetflix = new FacturaServicio("12134", LocalDate.of(2025, 4, 5), agenciaBerazategui, 5500d, 3);
		facturaLuz = new FacturaImpuesto("435345",LocalDate.of(2025, 3, 12), agenciaBerazategui, 19000d);
	}
	
	// Se registra el pago de la factura
	@Test
	public void testRegistrarItem() {
		facturaNetflix.registrarItem();
		facturaLuz.registrarItem();
		
		assertEquals(true, agenciaBerazategui.fueRegistrado(facturaNetflix));
		assertEquals(true, agenciaBerazategui.fueRegistrado(facturaLuz));
	}

}
