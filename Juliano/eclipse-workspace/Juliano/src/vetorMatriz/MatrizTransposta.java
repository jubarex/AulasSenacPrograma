package vetorMatriz;

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada: ");
        int ordem = scanner.nextInt();
        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizTransposta = new int[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
