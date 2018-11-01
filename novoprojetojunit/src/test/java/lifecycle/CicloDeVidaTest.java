package lifecycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exemplo1.Calculadora;

class CicloDeVidaTest {
	Calculadora calculadora = null;

	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before Each!");
		this.calculadora = new Calculadora();
	}
	
	@BeforeAll
	static void beforeAllTest() {
		System.out.println("Before All!");
	}
	
	@Test
	void test() {
		assertEquals(2, calculadora.somar(1, 1));
	}
	
	@Test
	void test2() {
		assertEquals(1, calculadora.dividir(2,2));
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("After Each");
	}
	
	@AfterAll
	static void afterAllTest() {
		System.out.println("After All");
	}
}