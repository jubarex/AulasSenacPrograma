package aula;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int valor=0, i1=0, i2=0, i3=0, i4=0;
		while(valor >= 0) {
			System.out.println("informe um número entre 0 a 100");
			valor = teclado.nextInt();
			if(valor >= 0 && valor <= 25) {
				i1++; 
			}
			else if(valor >= 26 && valor <=50) {
				i2++;
			}
			else if(valor >= 51 && valor<=75) {
				i3++;
			}
			else if(valor >= 76 && valor <= 100) {
				i4++;
			}
		}
		System.out.println("quatidade de números no intervalo entre 0 a 25"+ i1);
		System.out.println("quatidade de números no intervalo entre 26 a 50"+ i2);
		System.out.println("quatidade de números no intervalo entre 51 a 75"+ i3);
		System.out.println("quatidade de números no intervalo entre 76 a 100"+ i4);
	}

}
