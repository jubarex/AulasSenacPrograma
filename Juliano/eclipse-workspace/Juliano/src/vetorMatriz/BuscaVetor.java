package vetorMatriz;

import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        String[] vetor = new String[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.next();
        }

        System.out.print("Digite o valor de pesquisa: ");
        String valorPesquisa = scanner.next();

        int posicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(valorPesquisa)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O valor foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O valor não foi encontrado no vetor.");
        }

        scanner.close();
    }
}

