package atvd1;

import java.util.Scanner;

public class aat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criando novo scanner
		Scanner teclado = new Scanner(System.in);
		System.out.println("insira o tamanho do vetor: ");
		// declarando variavel e pedindo para o usuário
		int ordem = teclado.nextInt();

		// declarando variavel vetor definindo tamanho
		int[] vetorNumerosInteiros = new int[ordem];

		// declarando variavel
		String[] arrozDoce;

		// instanciando novo vetor de tamanho 3 do tipo String //ARROZDOCE RECEBE NOVO
		// VETOR
		arrozDoce = new String[3];

		// saida "texto" CONCATENAR esta chamando variavel
		System.out.println("ordem do vetor: " + ordem);

		// funcao que retorna o tamanho/ordem do vetor
		System.out.println("lenght:" + vetorNumerosInteiros.length);

		// usuario inserir cada valor do vetor
		Scanner arroz = new Scanner(System.in);
		for (int posicao = 0; posicao < vetorNumerosInteiros.length; posicao++) {
			System.out.println("valorInteiro");
		vetorNumerosInteiros [posicao] = arroz.nextInt();
			
			
			// mostrar a soma de todos valor do vetor
		}
		// declara variavel soma recebe 0
		int soma = 0;
		for (int i = 0; i < vetorNumerosInteiros.length; i++) {
			//
			soma += vetorNumerosInteiros[i];

			// variavel recebe valor novo = valor antigo + elemento atual
			// soma = soma + vetorNumerosInteiros[i]
		}
		System.out.println("A soma do valor é: " + soma);

		// variavel recebe valor novo = valopr

	}
}