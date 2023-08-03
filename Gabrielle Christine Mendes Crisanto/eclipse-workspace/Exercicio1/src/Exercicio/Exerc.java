package Exercicio; 

import java.util.Scanner;
public class Exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Informe o maior numero");
Scanner teclado = new Scanner (System.in);
System.out.println("informe o primeiro valor");
int valor1 = teclado.nextInt();

System.out.println("informe o segundo valor");
int valor2 = teclado.nextInt();

if(valor1 >= valor2) {
	System.out.println (valor1 + "é maior valor");
}

	else {
		System.out.println(valor2 + " é o maior valor");
}

	}

}
