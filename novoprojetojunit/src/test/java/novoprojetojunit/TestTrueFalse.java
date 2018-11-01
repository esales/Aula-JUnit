package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrueFalse {
	private int a = 1;
	private int b = 2;

	@Test
	void testarSeVerdadeiro() {
		assertTrue(a<b);
	}
	
	@Test
	void testarSeVerdadeiro2() {
		assertTrue(a>b, "O teste falhou!");
	}
	
	@Test
	void testarSeFalso() {
		assertFalse(a>b);
	}
}
