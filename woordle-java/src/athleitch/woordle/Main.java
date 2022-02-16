package athleitch.woordle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		WordleGameMotor wgm = new WordleGameMotor();
		
		String palabraSecreta = "gatos";
		char[] jugada = new char[palabraSecreta.length()];
		char[] jugadaValidada = new char[jugada.length];
		rellenarVector(jugadaValidada);
		int intentos = 0;
		boolean acertado = false;

		
		do {
			// Muestra el array sin solución
			System.out.println(jugadaValidada);
			System.out.printf(palabraSecreta + "\n");
			for (int pos = 0 ; pos < jugada.length ; pos++) {
				jugada[pos] = teclado.next().charAt(0);
			}
			jugadaValidada = wgm.validaJugada(jugada, palabraSecreta);
			
//			if (jugadaValidada == )
			intentos++;
		}
		while(!acertado && intentos < 5);
	}
	
	//Rellenar vector
	public static void rellenarVector(char[] jugadaValidada) {
		for (int pos = 0 ; pos < jugadaValidada.length ; pos++) {
			jugadaValidada[pos] = '*';
		}
	}

}
