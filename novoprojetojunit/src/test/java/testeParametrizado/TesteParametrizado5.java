package testeParametrizado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TesteParametrizado5 {

	@ParameterizedTest
	@CsvSource({ "Maria Alice, 7", "'Vinícius, João', 2" })
	void testarNomeEIdadeDeEstudantes(String nome, int idade) {
		assertEquals("Maria Alice", nome);
	    assertTrue(idade > 5);
	}
}