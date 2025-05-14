package ar.edu.unq.po2.tp7.SistemaDeArchivos.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.SistemaDeArchivos.Archivo;

class ArchivoTest {
	
	private Archivo archivo;
	
	@BeforeEach
	public void setUp() {
		archivo = new Archivo("TP07.txt", 800, LocalDate.of(2025, 05, 13));
	}

	@Test
	void testConstructor() {
		assertEquals(archivo.getNombre(), "TP07.txt");
		assertEquals(archivo.totalSize(), 800);
		assertEquals(archivo.getFecha(), LocalDate.of(2025, 05, 13));
	}
	
	@Test
	void testPrintStructure() {
		archivo.printStructure(""); 
	}
	
	@Test
	void testLastModified() {
		assertEquals(archivo.lastModified(), archivo);
	}
	
	@Test
	void testOldestElement() {
		assertEquals(archivo.oldestElement(), archivo);
	}

}