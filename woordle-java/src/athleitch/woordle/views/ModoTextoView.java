package athleitch.woordle.views;

import java.util.ArrayList;

import athleitch.woordle.estados.Acierto;
import athleitch.woordle.estados.Casi;
import athleitch.woordle.estados.EstadoLetra;

public class ModoTextoView implements WordleViewInterface {

	@Override
	public void iniciaJuego(String palabraSecreta) {
		System.out.println("Empieza el juego");
		for (int pos = 0 ; pos < palabraSecreta.length() ; pos++) {
			System.out.print("*");
		}
		System.out.println();
	}

	@Override
	public void resultadoJugada(char[] jugada, ArrayList<EstadoLetra> resultado) {
		for (int pos = 0 ; pos < jugada.length ; pos++) {
			EstadoLetra estadoLetra = resultado.get(pos);
			if (estadoLetra instanceof Acierto) {
				System.out.print(jugada[pos]);
			}
			else if (estadoLetra instanceof Casi) {
				System.out.print("+");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	@Override
	public void gana() {
		System.out.println("Has ganado.");
	}

	@Override
	public void pierde() {
		System.out.println("Has perdido.");
	}

}
