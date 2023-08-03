package ex01;

import java.util.Scanner;

public class aula3ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double apple ;
		System.out.println("Quantas maças ?");
		apple = teclado.nextDouble();
		if (apple < 12 ){
			System.out.println(apple * 1.30);
		} else {
			System.out.println(apple * 1.0);
		}
		
		
		
		

	}

}
