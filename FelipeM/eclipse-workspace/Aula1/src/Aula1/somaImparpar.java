package Aula1;

import java.util.Scanner;
public class somaImparpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int valor = -1;
		while(valor != 0) {
			System.out.println("Informe um número");
			valor = teclado.nextInt();
			if (valor %2 ==0) {
			par = valor + par;
			}
			else {
			impar = valor + impar;
			}
		}
		System.out.println("A soma dos pares é: " + par);
		
		System.out.println("A soma dos impares é: " + impar);
	}

}
