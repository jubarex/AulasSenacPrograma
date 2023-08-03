package Exercio2;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Scanner teclado2 = new Scanner (System.in);
		double base, altura;
		
		System.out.println("Informe a base");
		base = teclado.nextDouble();
		
		System.out.println("Informe a altura");
		altura = teclado2.nextDouble();
		
		double area =(base * altura);
		System.out.println("area do retangulo:" + area);

	}

}
