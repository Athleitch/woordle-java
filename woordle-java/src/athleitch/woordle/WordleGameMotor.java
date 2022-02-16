package athleitch.woordle;

public class WordleGameMotor {
	public char[] validaJugada(char[] jugada, String palabraSecreta) {
		char[] jugadaValidada = new char[jugada.length];
		for (int pos = 0 ; pos < palabraSecreta.length() ; pos++) {
			boolean comprobada = false;
			if (jugada[pos] == palabraSecreta.charAt(pos) && !comprobada) {
				jugadaValidada[pos] = palabraSecreta.charAt(pos);
			}
			else {
				int posComprobar = 0;
				do {
					if (jugada[pos] == palabraSecreta.charAt(posComprobar)) {
						jugadaValidada[pos] = '+';
						comprobada = true;
					}
					else {
						jugadaValidada[pos] = '*';	
					}
					posComprobar++;	
				}
				while(!comprobada && posComprobar < palabraSecreta.length());
			}
		}
		return jugadaValidada;
	}
}