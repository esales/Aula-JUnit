package testeParametrizado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

class TesteParametrizado3 {
	private enum Mes{
		JANEIRO,
		FEVEREIRO,
		MARÇO,
		ABRIL,
		MAIO,
		JUNHO,
		JULHO,
		AGOSTO,
		SETEMBRO,
		OUTUBRO,
		NOVEMBRO,
		DEZEMBRO
	}

	@ParameterizedTest
	@EnumSource(value = Mes.class)
	void testarSeIgual(Mes mes) {
	    assertTrue(String.valueOf(mes).equals("DEZEMBRO"));
	}
}
