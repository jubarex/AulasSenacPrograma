package Vetor;

import java.util.Scanner;

public class StringVetor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor");
		int tamanho = scanner.nextInt();
		String arr[] = new String[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.println("Escreva uma palavra");
			arr[i] = teclado.nextLine();
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite qual das palavras deseja encontrar");
		String pesquisa = scan.nextLine();
		int posicaoEncontrada = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(pesquisa)) {
				posicaoEncontrada = i;
			}

		}
		System.out.println("A palavra " + pesquisa + " esta na posição " + posicaoEncontrada);

	}

}
