package vetorMatriz;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz soma:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
