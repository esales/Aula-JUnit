package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exemplo2.Cachorro;

class TestNullNotNull {

	@Test
	void testarSeNulo() {
		Cachorro cachorro = null;
		
		assertNull(cachorro);
		
	}
	
	@Test
	void testarSeNulo2() {
		var cachorro = new Cachorro();
		
		assertNull(cachorro);
		
	}
	
	@Test
	void testarSeNaoNulo() {
		var cachorro = new Cachorro();
		
		assertNotNull(cachorro);
		
	}

}
