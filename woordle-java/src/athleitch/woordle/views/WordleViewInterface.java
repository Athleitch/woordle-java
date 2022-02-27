package athleitch.woordle.views;

import java.util.ArrayList;

import athleitch.woordle.estados.EstadoLetra;

public interface WordleViewInterface {

	public void iniciaJuego(String palabraSecreta);

	public void resultadoJugada(char[] jugada, ArrayList<EstadoLetra> resultado);

	public void gana();

	public void pierde();
}
