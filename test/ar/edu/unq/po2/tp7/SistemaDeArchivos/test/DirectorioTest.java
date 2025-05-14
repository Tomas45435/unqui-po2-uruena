package ar.edu.unq.po2.tp7.SistemaDeArchivos.test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.SistemaDeArchivos.Archivo;
import ar.edu.unq.po2.tp7.SistemaDeArchivos.Directorio;

class DirectorioTest {
	
	private Directorio pendrive;
	private Directorio documentos;
	private Directorio fotos;

	@BeforeEach
	public void setUp() {
		pendrive = new Directorio("PendriveE", LocalDate.of(2025, 6, 5));
		documentos = new Directorio("Documentos", LocalDate.of(2025, 5, 3));
		fotos = new Directorio("Fotos", LocalDate.of(2025, 3, 15));
		
		
		documentos.agregarComponente(new Archivo("TP07.pdf", 2500, LocalDate.of(2025, 4, 3)));
		documentos.agregarComponente(new Archivo("Contrato.docx", 8000, LocalDate.of(2025, 4, 2)));
		
		fotos.agregarComponente(new Archivo("familia.jpg", 3200, LocalDate.of(2025, 2, 3)));
		fotos.agregarComponente(new Archivo("picture_12443.jpeg", 3400, LocalDate.of(2025, 2, 1)));
		
	}
	
	@Test
	void testConstructor() {
		assertEquals(pendrive.getNombre(), "PendriveE");
		assertEquals(pendrive.getFecha(), LocalDate.of(2025, 6, 5));
		assertEquals(pendrive.getContenido().isEmpty(), true);
	}
	
	@Test
	void testPrintStructure() {
		
		pendrive.agregarComponente(documentos);
		pendrive.agregarComponente(fotos);
		
		pendrive.printStructure("");
	}
	
	@Test
	void testLastModified() {
		Archivo txt = new Archivo("leer.txt", 1100, LocalDate.of(2026, 5, 1));
		pendrive.agregarComponente(documentos);
		pendrive.agregarComponente(fotos);
		pendrive.agregarComponente(txt);
		
		assertEquals(pendrive.lastModified(), txt);
	}
	
	@Test
	void testOldestElement() {
		Archivo picture = new Archivo("picture_12443.jpeg", 3400, LocalDate.of(2025, 1, 1));
		pendrive.agregarComponente(documentos);
		pendrive.agregarComponente(fotos);
		pendrive.agregarComponente(picture);
		
		assertEquals(pendrive.oldestElement(), picture);
	}
	
	@Test
	void testAgregarUnComponente() {
		pendrive.agregarComponente(documentos);
		assertEquals(pendrive.getContenido().isEmpty(), false);
		assertEquals(pendrive.getContenido().size(), 1);
		assertEquals(pendrive.getContenido().contains(documentos), true);
	}
	
	@Test
	void testRemoverUnComponente() {
		pendrive.agregarComponente(documentos);
		pendrive.agregarComponente(fotos);
		pendrive.eliminarComponente(documentos);
		assertEquals(pendrive.getContenido().contains(documentos), false);
		assertEquals(pendrive.getContenido().size(), 1);
	}
	
}
