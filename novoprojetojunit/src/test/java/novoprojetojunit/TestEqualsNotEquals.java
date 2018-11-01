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
	//verifica se o esperado mais o delta � maior ou igual ao atual.
	void TestarSeSaoIguaisDelta() {
		assertEquals(a, b, 10);
	}
	
	@Test
	//verifica se os objetos s�o iguais.
	void TestarSeSaoIguais2() {
		var c1 = new Cachorro("Tot�");
		var c2 = new Cachorro("Tot�");
		
		assertEquals(c1,c2);
	}
	
	@Test
	//verifica se os objetos s�o iguais.
	void TestarSeSaoIguais3() {
		var c1 = new Cachorro("Tot�");
		var c2 = new Cachorro("Bid�");
		
		assertEquals(c1,c2);
	}
}
