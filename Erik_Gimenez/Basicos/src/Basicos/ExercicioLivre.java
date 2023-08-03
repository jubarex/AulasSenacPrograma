package Basicos;
import java.util.Scanner;

public class ExercicioLivre {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		double num = scanner.nextDouble();
		System.out.println("Informe o expoente");
		double potencia = scanner.nextDouble();
		System.out.println("O resultado da potencia é: " +(Math.pow(num , potencia)));
		
	}
}
