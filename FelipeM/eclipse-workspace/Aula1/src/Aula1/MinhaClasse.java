package Aula1;

import java.util.Scanner;
public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Meu primeiro programa em JAVA!");
		//syout -> comando Digo do Scrach

		//tipos números inteiros
		int num1;
		byte num2;
		short num3;
		long num4, num5, NUM6, num7;
		
		//tipo números reais (números de ponto flutuante)
		float val1;
		double val2;
		
		//tipo caracter
		char letra;
		
		//tipo texto
		String texto;
		
		//tipo (boleano - Verdadeiro ou falso)
		boolean boleano;
		
		//atribuição de valores (comando Mude do Scrach)
		num1 = 10;
		num2 = 2;
		num3 = num2;
		
		//operadores matemáticos
		// soma +
		// subtração -
		// multiplicação *
		// divisão /
		num4 = num1 + num2;
		num5 = num4 - 5;
		NUM6 = num5 * 2;
		num7 = NUM6 / 10;
		
		System.out.println("valor da variável num4: " + num4);
		System.out.println("valor da vaiável num5: " + num5);
		System.out.println("valor da variável num6:" + NUM6);
		System.out.println("valor da variável num7:" + num7);
		
		float media = (7 + 6)/2f;
		double media2 = (3+8)/2.0;
		System.out.println("media: "+ media);
		System.out.println("media2: "+ media2);
		
		double soma = 0.1 + 0.2;
		System.out.println("soma: "+ soma);
		
		int idade = 20; 
		if(idade >=18) { //Se então do Scratch
			System.out.println("é maior de idade!");
		}
		else {
			System.out.println("é menor de idade!");
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe um número");
		int numeroUsuário = teclado.nextInt();
		System.out.println("O número digitado foi: " + numeroUsuário);
	}
}
	