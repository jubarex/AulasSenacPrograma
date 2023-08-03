package aula1;

import java.util.Scanner;

public class trrei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        
        int anos, meses, dias;
        System.out.println("informe os anos");
        anos = teclado.nextInt();
        
        System.out.println("informe os meses");
        meses = teclado.nextInt();
        
        System.out.println("informe os dias");
        dias = teclado.nextInt();
         
          dias += anos * 365; 
          
          dias += meses * 30;
          
          System.out.println("o total de dias: "+ dias);
	}

}
