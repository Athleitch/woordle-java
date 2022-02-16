package athleitch.woordle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordleGameMotorTest {

	@Test
	void cuando_acierta_la_palabra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'p','e','r','r','o'};
		char[] resultado = wgm.validaJugada(jugada, "perro");
		char[] esperado = new char[] {'p','e','r','r','o'};
		assertArrayEquals(resultado, esperado);
	}

	@Test
	void cuando_acierta_una_letra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'p','a','j','x','s'};
		char[] resultado = wgm.validaJugada(jugada, "perro");
		char[] esperado = new char[] {'p','*','*','*','*'};
		assertArrayEquals(resultado, esperado);
	}
	
	@Test
	void cuando_no_acierta_ninguna_letra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'ñ','a','j','x','s'};
		char[] resultado = wgm.validaJugada(jugada, "perro");
		char[] esperado = new char[] {'*','*','*','*','*'};
		assertArrayEquals(resultado, esperado);
	}
	
	@Test
	void cuando_acierta_una_letra_pero_no_en_la_posicion() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'e','a','j','x','s'};
		char[] resultado = wgm.validaJugada(jugada, "perro");
		char[] esperado = new char[] {'+','*','*','*','*'};
		assertArrayEquals(resultado, esperado);
	}
}
