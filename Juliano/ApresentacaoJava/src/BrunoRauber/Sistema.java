package BrunoRauber;

import java.util.Scanner;

public class Sistema {
	static String ganhar;
	static boolean rodando = true;
	static String jogadorAtual = "X";

	public static void main(String[] args) {
		jogadorAtual = "X";
		Scanner teclado = new Scanner(System.in);
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();

		System.out.println("Quer começar? 1:sim 2:não");
		int escolhaInicial = teclado.nextInt();
		if (escolhaInicial == 1) {

			System.out.println("você é o 'X' ");
			jogador1.marcador = "X";
			jogador2.marcador = "O";
		} else {
			System.out.println("Você é o 'O' ");
			jogador1.marcador = "O";
			jogador2.marcador = "X";
		}

		String[][] m = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

		printarMatrix(m);

		while (rodando) {

			jogarAtual(m);

		}

	}

	private static void printarMatrix(String[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void jogarAtual(String[][] m) {

		System.out.println("Vez do " + jogadorAtual);
		Scanner matrix = new Scanner(System.in);

		System.out.println("Digite linha q deseja jogar");
		int linha = matrix.nextInt();

		System.out.println("Digite a coluna q deseja jogar");
		int coluna = matrix.nextInt();

		if (verificarVazio(m, linha, coluna)) {

			m[linha][coluna] = jogadorAtual;
			printarMatrix(m);
			checGanho(m);

			if (jogadorAtual.equals("X")) {
				jogadorAtual = "O";
			} else if (jogadorAtual.equals("O")) {

				jogadorAtual = "X";
			}

		} else {
			System.out.println("Jogue Novamente, jogada inválida");
			jogarAtual(m);
		}

	}

	public static boolean verificarVazio(String[][] m, int linha, int coluna) {
		if (m[linha][coluna].equals("X")) {
			return false;
		} else if (m[linha][coluna].equals("O")) {
			return false;
		} else {
			return true;
		}
	}

	public static void checGanho(String[][] tabuleiro) {

		if (tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
		}
		// 1
		else if (tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O")) {
			// 2
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
		}
		if (tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 3
		} else if (tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 4
		}
		if (tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 5
		} else if (tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 6
		}
		if (tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;

			// 7
		} else if (tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 8
		}
		if (tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;

		} else if (tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 10
		}
		if (tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 9
		}

		if (tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;

			// 10
		}
		if (tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 11
		} else if (tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 12
		}
		if (tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;

		}
		if (tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 13
		} else if (tabuleiro[2][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[0][2].equals("X")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 14
		}
		if (tabuleiro[2][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[0][2].equals("O")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
		}
		if (tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[0][2].equals("X")) {
			ganhar = "X";
			rodando = false;
			System.out.println("O jogador 'X' ganhou");
			return;
			// 15
		} else if (tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[0][2].equals("O")) {
			ganhar = "O";
			rodando = false;
			System.out.println("O jogador 'O' ganhou");
			return;
			// 16
		}

	}

	public static class Jogador {
		String marcador;

//		Crear jogo da velha 
//
//		São 2 jogadores
		// Classe jogador 1,
//		 cada um pode colocar um marcador 
//		Com jogadas alternadas entre eles
//		O marcador de um dos jogadores é X e o outro O
//		podendo ser decidido por eles antes da partida 
//		em um espaço de 3 por 3
//
//		 qunado um jogador consegue fazer uma sequencia de 3 marcadores
//
//		 alinhados na diagonal
//		 orizontal 
//		 vertical
//
//		 ele ganha 
//		

	}

}
