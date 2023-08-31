package vetorMatriz;

import java.util.Scanner;

public class jogoVelha {

	public static void main(String[] args) {

//		String inicial = "jogo começa"
//				+ "pede pro jogador qual peça ele quer ser"
//				+ "X sempre começa"
//				+ "robo fica com a outra peça"
//				+ "quem for o X joga em algum lugar"
//				+ "verifica se ganhou"
//				+ "quem for O joga em algum lugar"
//				+ "verifica se ganhou"
//				+ "enquanto nenhum dos dois ganhar, o jogo continua"
//				+ ""
//				+ "condicao pra ganhar:"
//				+ "formar uma linha"
//				+ "formar uma coluna"
//				+ "formar diagonal principal"
//				+ "formar diagonal secundária"
//				+ ""
//				+ "score pontuacao"
//				+ "ganha +1 no score"
//				+ "objeto: player"
//				+ "";

		boolean naoComecou = true;
		while (naoComecou) {
			boolean jogando = true;
			System.out.println("Iniciando...");
			Jogador player = new Jogador("Player 1", 0, "");
			Jogador bot = new Jogador("robô", 0, "");

			System.out.println("Quer ser o X? Responda 1 ou 2");
			Scanner entrada = new Scanner(System.in);
			int escolhaUm = entrada.nextInt();

			if (escolhaUm == 1) {
				player.simbolo = "X";
				bot.simbolo = "O";
			} else if (escolhaUm == 2) {
				player.simbolo = "O";
				bot.simbolo = "X";
			} else {
				System.out.println("Por favor, insira um valor válido 1 ou 2");
				jogando = false;
			}
			entrada.close();

			while (jogando) {

				// mostrar tabuleiro

				//
				if (bot.simbolo == X) {
                //jogar
				}

			}
		}

	}

	public static class Jogador {
		public Jogador(String nome, int pontuacao, String simbolo) {
			super();
			this.nome = nome;
			this.pontuacao = pontuacao;
			this.simbolo = simbolo;
		}

		String nome;
		int pontuacao;
		String simbolo;
	}

}
