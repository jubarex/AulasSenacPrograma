package Aula1;

import java.util.Scanner;
public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida em Km");
		double km = teclado.nextDouble();
		
		System.out.println("Informe quantos litros foram gastos");
		double litros = teclado.nextDouble();
		
		double media = km / litros;
		
		System.out.println("O consumo médio foi de " + media);
	}

}
