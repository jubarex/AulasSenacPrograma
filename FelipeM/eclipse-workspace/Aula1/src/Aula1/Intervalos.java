package Aula1;

import java.util.Scanner;
public class Intervalos {

	public static void main(String[] args, Scanner teclado) {
		// TODO Auto-generated method stub
//		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		
		while(valor >=0) {
		System.out.println("Informe um valor");
		valor = teclado.nextInt();
		
		if (valor >=0 && valor <=25) {
		i1 = i1 + 1;
		}
		else if (valor >=26 && valor <=50) {
		i2 = i2 + 1;
		}
		else if (valor >=51 && valor <=75) {
		i3 = i3 + 1;
		}
		else if (valor >=76 && valor <=100) {
		i4 = i4 + 1;
		}
		
	}
	System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
	}
}
