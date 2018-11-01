package testeParametrizado;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TesteParametrizado {
	
	@ParameterizedTest
	@ValueSource(strings = {"informática", "meio ambiente", "eletroeletrônica" })
	void testarSeIgual(String stringAtual) {
	    assertTrue(stringAtual.equals("informática"));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"informática", "meio ambiente", "eletroeletrônica" })
	void testarSeContem(String stringAtual) {
	    assertTrue(stringAtual.contains("a"));
	}
}