package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exemplo2.Cachorro;

class TestEqualsNotEquals {
	
	private float a = 10;
	private float b = 20;

	@Test
	void TestarSeSaoIguais() {
		assertEquals(a,b);
	}
	
	@Test
	void TestarSeSaoDiferentes() {
		assertNotEquals(a,b);
	}
	
	@Test
	//verifica se o esperado mais o delta é maior ou igual ao atual.
	void TestarSeSaoIguaisDelta() {
		assertEquals(a, b, 10);
	}
	
	@Test
	//verifica se os objetos são iguais.
	void TestarSeSaoIguais2() {
		var c1 = new Cachorro("Totó");
		var c2 = new Cachorro("Totó");
		
		assertEquals(c1,c2);
	}
	
	@Test
	//verifica se os objetos são iguais.
	void TestarSeSaoIguais3() {
		var c1 = new Cachorro("Totó");
		var c2 = new Cachorro("Bidú");
		
		assertEquals(c1,c2);
	}
}
