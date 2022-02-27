package athleitch.woordle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordleGameMotorTest {

	@Test
	void cuando_acierta_la_palabra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'p','e','r','r','o'};
		String resultado = wgm.validaJugada(jugada, "perro").toString();
		String esperado = "[Acierto, Acierto, Acierto, Acierto, Acierto]";
		assertEquals(esperado, resultado);
	}

	@Test
	void cuando_acierta_una_letra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'p','a','j','x','s'};
		String resultado = wgm.validaJugada(jugada, "perro").toString();
		String esperado = "[Acierto, Fallo, Fallo, Fallo, Fallo]";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void cuando_no_acierta_ninguna_letra() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'ñ','a','j','x','s'};
		String resultado = wgm.validaJugada(jugada, "perro").toString();
		String esperado = "[Fallo, Fallo, Fallo, Fallo, Fallo]";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void cuando_acierta_una_letra_pero_no_en_la_posicion() {
		WordleGameMotor wgm = new WordleGameMotor();
		char[] jugada = new char[] {'e','a','j','x','s'};
		String resultado = wgm.validaJugada(jugada, "perro").toString();
		String esperado = "[Casi, Fallo, Fallo, Fallo, Fallo]";
		assertEquals(esperado, resultado);
	}
}
