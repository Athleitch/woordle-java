package athleitch.woordle;

import java.util.ArrayList;

import athleitch.woordle.estados.Acierto;
import athleitch.woordle.estados.Casi;
import athleitch.woordle.estados.EstadoLetra;
import athleitch.woordle.estados.Fallo;

public class WordleGameMotor {

	public ArrayList <EstadoLetra> validaJugada(char[] jugada, String palabraSecreta) {
		ArrayList <EstadoLetra> jugadaValidada = new ArrayList<>(palabraSecreta.length());
		for (int pos = 0 ; pos < palabraSecreta.length() ; pos++) {
			jugadaValidada.add(new Fallo());	
			boolean comprobada = false;
			if (jugada[pos] == palabraSecreta.charAt(pos) && !comprobada) {
				jugadaValidada.set(pos, new Acierto());			
			}
			else {
				int posComprobar = 0;
				do {
					if (jugada[pos] == palabraSecreta.charAt(posComprobar)) {
						jugadaValidada.set(pos, new Casi());
						comprobada = true;
					}
					else {
						jugadaValidada.set(pos, new Fallo());	
					}
					posComprobar++;	
				}
				while(!comprobada && posComprobar < palabraSecreta.length());
			}
		}
		return jugadaValidada;
	}
}