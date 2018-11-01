package testeParametrizado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TesteParametrizado2 {

	@ParameterizedTest
	void testarSeIgual(String stringAtual) {
	    assertTrue(stringAtual.equals("informática"));
	}

}
