package ex01;

import java.util.Scanner;
public class aulaAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Duas rodas ou quatro?");
		String duas = scanner.next() , quatro = scanner.next();
	//    String quatro = Scanner.next();
		
		
		if ( duas.equals("duas")) {
			System.out.println("é moto");
		} else {
			System.out.println(quatro +  " =  é carro ");
		}

	}

}
