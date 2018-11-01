package testeParametrizado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TesteParametrizado4 {

	@ParameterizedTest
	@MethodSource("provedorDeNumeros")
	void testarSeMaiorQueCinco(int numero) {
	    assertTrue(numero>5);
	}

	static Stream<Integer> provedorDeNumeros() {
	    return Stream.of(1,2,3,4,5,6,7,8,9,10);
	}
	
	@ParameterizedTest
	@MethodSource("provedorDeNumeros2")
	void testarSeMaiorQueCinco2(int numero) {
	    assertTrue(numero>5);
	}

	static IntStream provedorDeNumeros2() {
	    return IntStream.range(1, 11);
	}
	
	@ParameterizedTest
	@MethodSource("provedorDeEstudantes")
	void testarNomeEIdadeDeEstudantes(String nome, int idade) {
	    assertEquals("Maria", nome);
	    assertTrue(idade > 5);
	}

	static Stream<Arguments> provedorDeEstudantes() {
	    return Stream.of(
	        Arguments.of("João", 2),
	        Arguments.of("Maria", 7)
	    );
	}
}