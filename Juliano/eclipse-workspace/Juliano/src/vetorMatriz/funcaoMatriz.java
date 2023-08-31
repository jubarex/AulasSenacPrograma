package vetorMatriz;

import java.util.Arrays;

public class funcaoMatriz {

	public static void main(String[] args) {

		String matriz[][] = { { "X", "O", "X" }, { "X", "O", "X" }, { "O", "X", "O" } };

		matriz = funcaoQualquer(matriz);

		boolean jogando = true;
		while (jogando) {
			boolean aquiFora = true;
			while (aquiFora) {
				// roda codigo
				aquiFora = false;
			}
			// > prox linha
			// perguntar
			jogando = false;
			aquiFora = true;
		}
	}

	public static String[][] funcaoQualquer(String teste[][]) {
		teste[0][0] = "ARROZ";
		return teste;
	}
}
