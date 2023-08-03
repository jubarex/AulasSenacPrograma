package OrdemDecrescente;

import java.util.Scanner;
public class OrdemDecrescente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("informe um número");
		num1= teclado.nextInt();
		
		System.out.println("informe um número");
		num2= teclado.nextInt();
		
		System.out.println("informe um número");
		num3= teclado.nextInt();
		
		if(num1>= num2 && num2>= num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		else if(num1>= num3 && num3>= num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if (num2 >= num1 && num1 >= num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		}
		else if (num2 >= num3 && num3 >= num1) {
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		else if (num3 >= num1 && num1 >= num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		}
		else if (num3 >= num2 && num2 >= num1) {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
	}

}
