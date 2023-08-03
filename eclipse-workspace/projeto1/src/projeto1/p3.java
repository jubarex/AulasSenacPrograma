package projeto1;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//1
		int n1, n2;
		 
		System.out.println("informe a base");
	    n1 = teclado.nextInt();

	    System.out.println("informe a altura");
	    n2 = teclado.nextInt();
	    
	    int m = (n1 * n2);
	    
	    System.out.println("a área do retângulo é igual a " + m);
	    
	    //2
	    
	    int n3;
		 
		System.out.println("informe a sua idade");
	    n1 = teclado.nextInt();

	    System.out.println("informe o mês em que você nasceu");
	    n2 = teclado.nextInt();
	    
	    System.out.println("informe o dia em que você nasceu");
	    n3 = teclado.nextInt();
	    
	    int dias = (n1 * 365) + (n2 * 30) + n3;
	    
	    System.out.println("a sua idade em dias éa " + dias);
	    
	    //3
	    double ap;
	    System.out.println("Quantas maçãs voc^deseja?");
	    n1 = teclado.nextInt();
	    if(n1 >= 12){
	    	ap = (n1 * 1);
	    	System.out.println("o preço que você terá de pagar será de " + ap);
	    }else {
	    	ap = (n1 * 1.30);
	    	System.out.println("o preço que você terá de pagar será de " + ap);
	    }
	    
	    //4
	    double nu1, nu2;
	    
	    System.out.println("informe a primeira nota");
	    nu1 = teclado.nextDouble();

	    System.out.println("informe a segunda nota");
	    nu2 = teclado.nextDouble();
	    
	    double media = (nu1 + nu2)/2;
		   System.out.println("sua média foi de " + media);
		   
		if(media >= 6){
			System.out.println("aprovado");
		}
		else{
			System.out.println("reprovado");
		}
		
		//5
		double dscnt;
		System.out.println("diga seu salário");
	    nu1 = teclado.nextDouble();
	    dscnt = (nu1 * 0.11);
	    if(dscnt >= 450) {
	    	System.out.println("o desconto total será o total de 450" + "seu salário será de " + (nu1 - 450));
	}else {
			System.out.println("o desconto total será o total de " + "seu salário será de " + (nu1 - dscnt));
		}
	    
	    //6
	    System.out.println("diga seu salário");
	    nu1 = teclado.nextDouble();
	    
	    if(nu1 >= 1500) {
	    	media = nu1 * 1.05;
	    	System.out.println("seu salário será de " + media);
	    }else {
	    	media = nu1 * 1.03;
	    	System.out.println("seu salário será de " + media);
	    }
	}
}
