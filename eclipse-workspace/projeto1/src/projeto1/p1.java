package projeto1;

import java.util.Scanner;

public class p1 {

		 

		    public static void main(String[] args) {

		        System.out.println("meu primeiro programa em java");

//		        tipos inteiros

		        byte num1;

		        short num2;

		        int num3;

		        long num4, num5, num6, num7;

		        

//		        tipos reais

		        float val1;

		        double val2;

		        

//		        tipo caracter

		        char letra;

		        

//		        tipo texto

		        String texto;

		        

//		        tipo boolean

		        boolean boleano;

		        

//		        atribuição de valores

		        num1 = 10;

		        num2 = num1;

		        

//		        operadores matematicos

//		        soma +

//		        subtração -

//		        multiplicação *

//		        divisao /

		        num4 = num1 + num2;

		        num5 = num4 - 5;

		        num6 = num5 * 2;

		        num7 =num6/ 10;    

		        

		        System.out.println("num4: " +num4);

		        System.out.println("num5: " +num5);

		        System.out.println("num6: " +num6);

		        System.out.println("num7: " +num7);

		        

		        float media = (7 + 6) / 2f;

		        double media2 = (3+8)/2.0;

		        System.out.println("media: " +media);

		        System.out.println("media2: " +media2);

		        

		        double soma = 0.1 + 0.2;

		        System.out.println("soma: " +soma);

		        

		        int idade = 20;

		        if(idade >= 18) {

		                System.out.println("é maior de idade");

		        }

		        else {

		            System.out.println("é menor de idade");

		        }
		        
		        Scanner teclado = new Scanner(System.in);
		        System.out.println("Me informe um número");
		        int numeroUsuario = teclado.nextInt();
		        System.out.println("O número digitado foi: " + numeroUsuario);

		  }

		 

}