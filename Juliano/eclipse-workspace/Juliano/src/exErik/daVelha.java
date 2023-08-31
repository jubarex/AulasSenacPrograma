package exErik;

import java.util.Scanner;

public class daVelha {

	static Scanner sc = new Scanner(System.in);

	static boolean vencedor;
	static String[][] arr = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

	static Jogador jogador1 = new Jogador();
	static Jogador jogador2 = new Jogador();

	static int continuarJogando = 1;
	static int jogadorAtual = 1;

	public static void main(String[] args) {
		// criou scanner

		jogador1.tipo = "X";
		jogador2.tipo = "O";
		System.out.println("Digite o nome do jogador 1");
		jogador1.nome = sc.nextLine();
		System.out.println("Digite o nome do jogador 2");
		jogador2.nome = sc.nextLine();

		vencedor = false;

		while (vencedor == false) {
			while (continuarJogando == 1) {
				if (jogadorAtual == 1) {
					System.out.println("--- Jogador 1 ---\n");
					System.out.println("Escolha onde jogar:\n" + "0.0|0.1|0.2\n" + "-----\n" + "1.0|1.1|1.2\n"
							+ "-----\n" + "2.0|2.1|2.2\n");
					mostrarNaTela();
					jogarAtual();
					jogadorAtual = 2;
				} else {
					System.out.println("--- Jogador 2 ---\n");
					mostrarNaTela();
					jogarAtual();
					jogadorAtual = 1;
				}
			}
		}
	}

	public static class Jogador {
		String nome;
		String tipo;
		int pontos;
	}

	public static void resetarVariaveis() {
		jogadorAtual = 1;
		vencedor = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = "";
			}
		}

		System.out.println("matriz inicializada..");
	}

	public static void jogarAtual() {
		System.out.println("Digite primeiro a linha:\n");
		int linha = sc.nextInt();
		System.out.println("Digite a coluna:\n");
		int coluna = sc.nextInt();
		if (jogadorAtual == 1) {
			arr[linha][coluna] = jogador1.tipo;
		} else {
			arr[linha][coluna] = jogador2.tipo;
		}
		vencedor = checarVencedor();
		if (vencedor == true) {
			if (jogadorAtual == 1) {
				System.out.println("O ganhador foi: " + jogador1.nome + "\n");
				System.out.println("Deseja continuar jogando? 1 para sim|0 para não\n");
				resetarVariaveis();
				continuarJogando = sc.nextInt();
			} else {
				System.out.println("O ganhador foi: " + jogador2.nome + "\n");
				System.out.println("Deseja continuar jogando? 1 para sim|0 para não\n");
				resetarVariaveis();
				continuarJogando = sc.nextInt();
			}
		}
	}

	public static void mostrarNaTela() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
				if (j != 2) {
					System.out.print("|");
				}
			}
			System.out.println("");
			if (i != 2) {
				System.out.println("-----");
			}

		}
	}

	public static boolean checarVencedor() {
		boolean vencedor = false;

		if (arr[0][0].equals("X")) {
			vencedor = true;
		} else if ((arr[0][0].equals("X") && arr[1][1].equals("X") && arr[2][2].equals("X"))
				|| (arr[0][0].equals("O") && arr[1][1].equals("O") && arr[2][2].equals("O"))) {
			vencedor = true;
		} else if ((arr[0][2].equals("X") && arr[1][1].equals("X") && arr[2][0].equals("X"))
				|| (arr[0][2].equals("O") && arr[1][1].equals("O") && arr[2][0].equals("O"))) {
			vencedor = true;
		} else if ((arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X"))
				|| (arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O"))) {
			vencedor = true;
		} else if ((arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X"))
				|| (arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O"))) {
			vencedor = true;
		} else if ((arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X"))
				|| (arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O"))) {
			vencedor = true;
		} else if ((arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X"))
				|| (arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O"))) {
			vencedor = true;
		} else if ((arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X"))
				|| (arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O"))) {
			vencedor = true;
		} else if ((arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X"))
				|| (arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O"))) {
			vencedor = true;
		}
		mostrarNaTela();
		return vencedor;
	}

}