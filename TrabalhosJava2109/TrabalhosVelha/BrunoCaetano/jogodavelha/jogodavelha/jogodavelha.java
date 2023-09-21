package jogodavelha;

import java.util.Scanner;

public class jogodavelha {
	public static void main(String[] args) {
		char[][] tabuleiro =
			{       { ' ', ' ', ' ' }, 
					{ ' ', ' ', ' ' }, 
					{ ' ', ' ', ' ' } };

		
		char jogadorAtual = 'X';
		boolean jogoTerminado = false;
		Scanner scanner = new Scanner(System.in);

		while (!jogoTerminado) {
			exibirTabuleiro(tabuleiro);

			System.out.println(
					"Jogador " + jogadorAtual + ", digite a linha (0-2) e coluna (0-2) separados por espaço: ");
			int linha = scanner.nextInt();
			int coluna = scanner.nextInt();

			if (movimentoValido(tabuleiro, linha, coluna)) {
				tabuleiro[linha][coluna] = jogadorAtual;

				if (verificarVitoria(tabuleiro, jogadorAtual)) {
					exibirTabuleiro(tabuleiro);
					System.out.println("Jogador " + jogadorAtual + " venceu!");
					jogoTerminado = true;
				} else if (tabuleiroCompleto(tabuleiro)) {
					exibirTabuleiro(tabuleiro);
					System.out.println("Empate!");
					jogoTerminado = true;
				} else {
					jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
				}
			} else {
				System.out.println("Movimento inválido. Tente novamente.");
			}
		}

		scanner.close();
	}

	public static void exibirTabuleiro(char[][] tabuleiro) {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}

	public static boolean movimentoValido(char[][] tabuleiro, int linha, int coluna) {
		return (linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3) && (tabuleiro[linha][coluna] == ' ');
	}

	public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
		for (int i = 0; i < 3; i++) {
			if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador)
					|| (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
				return true;
			}
		}

		return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador)
				|| (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
	}

	public static boolean tabuleiroCompleto(char[][] tabuleiro) {
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
