package novoprojetojunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeiroTeste {

	@Test
	void meuPrimeiroTeste() {
        assertEquals(2, 2 + 1);
    }
	
	@Test
	void meuSegundoTeste() {
        assertNotEquals(2, 2 + 1);
    }
}
