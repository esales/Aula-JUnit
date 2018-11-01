package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import exemplo2.Cachorro;
import exemplo2.Gato;

class TestSameNotSame {

	@Test
	void testarSeSaoOMesmoObjeto() {
		var cachorro = new Cachorro();
		var gato = new Gato();
		
		assertSame(cachorro, gato);
	}
	
	@Test
	void testarSeNaoSaoOMesmoObjeto() {
		var cachorro = new Cachorro();
		var gato = new Gato();
		
		assertNotSame(cachorro, gato);
	}
	
	@Test
	void testarSeSaoOMesmoObjeto2() {
		var cachorro = new Cachorro();
		var cachorro2 = new Cachorro();
		
		assertSame(cachorro, cachorro2);
	}
	
	@Test
	void testarSeNaoSaoOMesmoObjeto2() {
		var gato = new Gato();
		var gato2 = new Gato();
		
		assertNotSame(gato, gato2);
	}
	
	@Test
	void testarSeSaoOMesmoObjeto3() {
		var cachorro = new Cachorro();
		var cachorro2 = cachorro;
		
		assertSame(cachorro, cachorro2);
	}
}