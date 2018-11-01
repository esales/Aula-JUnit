package testeParametrizado;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TesteParametrizado {
	
	@ParameterizedTest
	@ValueSource(strings = {"inform�tica", "meio ambiente", "eletroeletr�nica" })
	void testarSeIgual(String stringAtual) {
	    assertTrue(stringAtual.equals("inform�tica"));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"inform�tica", "meio ambiente", "eletroeletr�nica" })
	void testarSeContem(String stringAtual) {
	    assertTrue(stringAtual.contains("a"));
	}
}