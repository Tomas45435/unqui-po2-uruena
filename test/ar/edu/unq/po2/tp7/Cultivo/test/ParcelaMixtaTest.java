package ar.edu.unq.po2.tp7.Cultivo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Cultivos.BaseParcela;
import ar.edu.unq.po2.tp7.Cultivos.ParcelaMixta;
import ar.edu.unq.po2.tp7.Cultivos.Soja;
import ar.edu.unq.po2.tp7.Cultivos.Trigo;

class ParcelaMixtaTest extends ParcelaMixta {
	
	private ParcelaMixta parcelaPrincipal;
	private ParcelaMixta parcelaMixta;

	@BeforeEach
	public void setUp() {
		parcelaPrincipal = new ParcelaMixta();
		parcelaMixta = new ParcelaMixta();
	}
	
	@Test
	void testConstructor() {
		assertEquals(parcelaPrincipal.getParcelas().size(), 0);
	}
	
	@Test
	void testAgregarParcela() {
		parcelaPrincipal.agregarParcela(new Soja());
		parcelaPrincipal.agregarParcela(new Trigo());
		
		assertEquals(parcelaPrincipal.getParcelas().size(), 2);
	}
	
	@Test
		void testGananciaSoja() {
		parcelaPrincipal.agregarParcela(new Soja());
		parcelaPrincipal.agregarParcela(new Trigo());
        parcelaPrincipal.agregarParcela(new Soja());

        // Subparcela mixta anidada
        parcelaMixta.agregarParcela(new Soja());
        parcelaMixta.agregarParcela(new Soja());
        parcelaMixta.agregarParcela(new Trigo());
        parcelaMixta.agregarParcela(new Trigo());
        
        parcelaPrincipal.agregarParcela(parcelaMixta);
        
        assertEquals(parcelaPrincipal.getGananciaSoja(), 1250d);
	 }
	
	@Test
		void testGananciaTrigo() {
		parcelaPrincipal.agregarParcela(new Soja());
		parcelaPrincipal.agregarParcela(new Trigo());
		parcelaPrincipal.agregarParcela(new Soja());

		// Subparcela mixta anidada
		parcelaMixta.agregarParcela(new Soja());
		parcelaMixta.agregarParcela(new Soja());
		parcelaMixta.agregarParcela(new Trigo());
		parcelaMixta.agregarParcela(new Trigo());
    
		parcelaPrincipal.agregarParcela(parcelaMixta);
    
		assertEquals(parcelaPrincipal.getGananciaTrigo(), 450d);
	}
	

}
