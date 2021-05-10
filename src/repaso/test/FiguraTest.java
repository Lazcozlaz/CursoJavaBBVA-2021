package repaso.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;

class FiguraTest {
	
	Figura cuadrado;
	Figura circulo;
	
	@BeforeEach
	void setUp() throws Exception {
		cuadrado = new Cuadrado("cual", 10);
		circulo = new Circulo("cirl",10);
	}

	@AfterEach
	void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
	}

	@Test
	void testCalcularPerimetro() {
		assertEquals(40, cuadrado.calcularPerimetro(),0.1);
	}

	@Test
	void testCalcularSuperficie() {
		assertEquals(100, cuadrado.calcularSuperficie(),0.1);
	}

	@Test
	void testGetValores() {
		assertEquals("l=10",cuadrado.getValores());
	}
	@Test
	void testCalcularPerimetroCirculo() {
		assertEquals(62.8, circulo.calcularPerimetro(),0.1);
	}

	@Test
	void testCalcularSuperficieCirculo() {
		assertEquals(314.1, circulo.calcularSuperficie(),0.1);
	}

}
