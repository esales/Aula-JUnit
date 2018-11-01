package testeParametrizado;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TesteParametrizado6 {

	@ParameterizedTest
	@CsvFileSource(resources = "/arquivo.csv", numLinesToSkip = 1)
	void testarNomeECursoDeEstudantes(String nome, String curso) {
	    assertTrue(nome.length()>5);
	    assertTrue(curso.contains("Informatica"));
	}
}