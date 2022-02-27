package athleitch.woordle;

import java.util.ArrayList;
import java.util.Scanner;

import athleitch.woordle.estados.EstadoLetra;
import athleitch.woordle.views.ModoTextoView;
import athleitch.woordle.views.WordleViewInterface;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		WordleGameMotor wgm = new WordleGameMotor();
		WordleViewInterface vista = new ModoTextoView();

		String palabraSecreta = "gatos";
		char[] jugada = new char[palabraSecreta.length()];
		int intentos = 0;
		boolean acertado = false;

		vista.iniciaJuego(palabraSecreta);
		
		do {
			// Muestra el array sin solución
			String jugadaCadena = teclado.next();
			for (int pos = 0 ; pos < jugada.length ; pos++) {
				jugada[pos] = jugadaCadena.charAt(pos);
			}
			ArrayList<EstadoLetra>jugadaValidada = wgm.validaJugada(jugada, palabraSecreta);
			
			vista.resultadoJugada(jugada, jugadaValidada);
			
			if (jugadaCadena.equals(palabraSecreta)) {
				acertado = true;
			}
			intentos++;
		}
		while(!acertado && intentos < 5);
		
		if (acertado) {
			vista.gana();
		}
		else {
			vista.pierde();
		}
	}

}
