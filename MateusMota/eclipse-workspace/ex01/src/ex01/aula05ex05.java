package ex01;

import java.util.Scanner;

public class aula05ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int int1=0,int2=0,int3=0,int4=0;
		int valor=1 ;
		while (valor > 0 ) {
			System.out.println("informe um número entre 0 a 100");
			valor = teclado.nextInt();
			if ( valor >= 0 && valor <= 25) {
				int1++;
			}
			else if(valor >= 26 && valor <= 50) {
				int2++;
			}
			else if (valor >=51 && valor <= 75) {
				int3++;
			}
			else if (valor >=76 && valor <= 100 ) {
				int4++;
			}
			
			
		}
		System.out.println("quantidade de números no intervalo entre 0 a 25 " + int1);
		System.out.println("quantidade de números no intervalo entre 26 a 50 " + int2);
		System.out.println("quantidade de números no intervalo entre 51 a 75 "+ int3);
		System.out.println("quantidade de números no intervalo entre 76 a 100 "+ int4);

	}

}
