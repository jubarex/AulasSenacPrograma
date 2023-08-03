package ex01;

import java.util.Scanner;

public class aula05ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int valor , contador;
		System.out.println("informe o número");
		valor = teclado.nextInt();
////        contador = valor - 1 ;
////        while (contador > 0) {
////        	valor = valor * contador ;
////        	contador --;
////        
////		}
////		System.out.println("resultado "+ valor);
////
////	}
//
//}
        for (int i = valor -1 ; i > 0; i--) {
        	valor = valor * i ;
        }
        System.out.println("resultado"+ valor);
        
	}
}