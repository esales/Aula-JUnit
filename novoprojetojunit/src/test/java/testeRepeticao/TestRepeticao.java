package testeRepeticao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import exemplo1.Calculadora;

class TestRepeticao {
	
	@RepeatedTest(value = 2)
	void testesComRepeticao(){
		var calculadora = new Calculadora();
		assertEquals(2, calculadora.somar(1, 1));		
	}
	
	@RepeatedTest(2)
	void testesComRepeticao2(){
		var calculadora = new Calculadora();
		assertEquals(2, calculadora.somar(1, 1));		
	}

	@RepeatedTest(value = 5, name = "{displayName}: Repetição {currentRepetition} de {totalRepetitions}")
	@DisplayName("Utilizando RepeatedTest")
	void testesComRepeticao3(){
		var calculadora = new Calculadora();
		assertEquals(2, calculadora.somar(1, 1));		
	}
	
	@RepeatedTest(3)
    void testesComRepeticaoEInformacao(RepetitionInfo repetitionInfo) {
        assertEquals(repetitionInfo.getTotalRepetitions(), repetitionInfo.getCurrentRepetition());
    }
	
	
	
	
	
	
	
	
	
	
	
}