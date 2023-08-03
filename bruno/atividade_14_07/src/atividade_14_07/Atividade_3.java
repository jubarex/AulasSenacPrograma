package atividade_14_07;
import java.util.Scanner;
public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um número");
		int nu = teclado.nextInt();
      //int contador = nu - 1;
//		 while(contador != 0) {
//			 nu = nu * contador;
//		contador = contador - 1;	 
//		 }
		//System.out.println("o total foi de: "+ nu); 
       
	for(int i = nu-1; i < 0; i--) {
	nu = nu * i;
	}
	System.out.println("resultado: "+ nu);
	}
     
}
