package vetorMatriz;

import java.util.Scanner;


public class ProdutoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas e colunas das matrizes: ");
        int tamanho = scanner.nextInt();

        int[][] matrizA = new int[tamanho][tamanho];
        int[][] matrizB = new int[tamanho][tamanho];
        int[][] matrizProduto = new int[tamanho][tamanho];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                for (int k = 0; k < tamanho; k++) {
                    matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz produto:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizProduto[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
