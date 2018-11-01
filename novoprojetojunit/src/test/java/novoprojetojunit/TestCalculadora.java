package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exemplo1.Calculadora;

class TestCalculadora {
	
	@Test
	void testSomar() {
		var calculadora = new Calculadora();
		assertEquals(0, calculadora.somar(1, -1));
		assertEquals(2, calculadora.somar(1, 1));
		assertEquals(-2, calculadora.somar(-1, -1));
	}
	
	@Test
	void testSubtrair() {
		var calculadora = new Calculadora();
		assertEquals(2, calculadora.subtrair(1, -1));
		assertEquals(0, calculadora.subtrair(1, 1));
		assertEquals(0, calculadora.subtrair(-1, -1));
	}

	@Test
	void testMultiplicar() {
		var calculadora = new Calculadora();
		assertEquals(-1, calculadora.multiplicar(1, -1));
		assertEquals(1, calculadora.multiplicar(1, 1));
		assertEquals(1, calculadora.multiplicar(-1, -1));
	}
	
	@Test
	void testDividir() {
		var calculadora = new Calculadora();
		assertEquals(-1, calculadora.dividir(1, -1));
		assertEquals(1, calculadora.dividir(1, 1));
		assertEquals(1, calculadora.dividir(-1, -1));
	}
	
	
}