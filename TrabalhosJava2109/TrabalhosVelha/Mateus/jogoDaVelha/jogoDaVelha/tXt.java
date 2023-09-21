package jogoDaVelha;

import java.util.Scanner;

public class tXt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tabuleiro = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		char jogadorAtual = 'X';
		boolean jogoAcabou = false;                   

		Scanner scanner = new Scanner(System.in);

		while (!jogoAcabou) {
			exibirTabuleiro(tabuleiro);

			System.out.print("Jogador " + jogadorAtual + ", digite a linha (0-2): ");
			int linha = scanner.nextInt();

			System.out.print("Jogador " + jogadorAtual + ", digite a coluna (0-2): ");
			int coluna = scanner.nextInt();

			if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
				tabuleiro[linha][coluna] = jogadorAtual;

				if (verificarVitoria(tabuleiro, jogadorAtual)) {
					exibirTabuleiro(tabuleiro);
					System.out.println("Jogador " + jogadorAtual + " venceu!");
					jogoAcabou = true;
				} else if (verificarEmpate(tabuleiro)) {
					exibirTabuleiro(tabuleiro);
					System.out.println("O jogo terminou em empate!");
					jogoAcabou = true;
				} else {
					jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
				}
			} else {
				System.out.println("Jogada inválida. Tente novamente.");
			}
		}

		scanner.close();
	}

	public static void exibirTabuleiro(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("---------");
			}
		}
	}

	public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
				return true;
			}
			if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
				return true;
			}
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
			return true;
		}
		return false;
	}

	public static boolean verificarEmpate(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
