package banana2;

import java.util.Scanner;
public class banana_fish {
		
		
		public static void main(String[]args) {
			
			
		Scanner teclado = new Scanner(System.in);			
		  System.out.println("informe um número"); 
		        int vali1 = teclado.nextInt();
		
		  System.out.println("informe o segundo número"); 
				int vali2 = teclado.nextInt();	
		if(vali1 >= vali2) {
			System.out.println(vali1 + "é o maior valor!");
		}
		else {
			System.out.println(vali2 + "é o maior valor");
		}
		

	}

}
