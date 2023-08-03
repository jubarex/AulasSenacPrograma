package aula2707;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// usuario insere tamanho do vetor
		// inserir cada valor do vetor
		// mostrar a soma de todos os valores do vetor

		Scanner Teclado = new Scanner(System.in);

		System.out.println("Insira o tamanho do vetor");

		int ordem = Teclado.nextInt();

		// declarando uma variavel veto do tipo int com o nome vetorNumerosInteiros
		// que recebe uma instancia um novo vetor de tamanho ordem
		int vetorNumerosInteiros[] = new int[ordem];

		// saida na tela "texto" concatena com a variavel ordem
		System.out.println("Ordem do vetor" + ordem);
		System.out.println(".lenght: " + vetorNumerosInteiros.length);

		// mostrar um Array inteiro na tela
		System.out.println(Arrays.toString(vetorNumerosInteiros));

		// usuario inserir cada valor do vetor
		Scanner Teclado2 = new Scanner(System.in);
		// for pro usuario inserir cada valor
		for (int posicao = 0; posicao < vetorNumerosInteiros.length; posicao++) {
			// elemento atual pede ao usuario uma int
			System.out.println("Insira o elemento " + posicao);
			vetorNumerosInteiros[posicao] = Teclado2.nextInt();
		}

		// mostrar a soma de todos os valores do vetor

		// declara variavel soma recebe 0
		int soma = 0;
		for (int i = 0; i < vetorNumerosInteiros.length; i++) {
			soma += vetorNumerosInteiros[i];

		}
		
		System.out.println("A soma do vetor é " + soma);

	}

}
