package Basicos;
import java.util.Scanner;
public class EstruturaDeRepetições {
	
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in); 
		System.out.println("Informe qual atividade da lista deseja ver");
		int atvd = Teclado.nextInt();
		if (atvd == 1) {
			for(int i = 99; i <= 199; i = i + 2) {
				System.out.println(i);
				
			}
		}
		if (atvd == 2) {
			int b1 = 0, b2 = 0, b3 = 0, b4 = 0, num = 0;
			while(num >= 0){
				System.out.println("Digite um numero");
				num = Teclado.nextInt();
				if (num >= 0 && num <= 25) {
					b1 = num + b1;
				}
				else if (num >= 26 && num <= 50) {
					b2 = num + b2;
				}
				else if (num >= 51 && num <= 75) {
					b3 = num + b3;
				}
				else if (num >=76  && num <= 100) {
					b4 = num + b4;
				}
			}
			System.out.println("[0-25]: " +b1);
			System.out.println("[26-50]: " +b2);
			System.out.println("[51-75]: " +b3);
			System.out.println("[76-100]: " +b4);
		}
		if (atvd == 3) {
			int par = 0, imp = 0, nume = 1, medpar = 0, media = 0;
			while(nume != 0) {
				System.out.println("Digite um numero");
				nume = Teclado.nextInt();
				if (nume <0) {
					System.out.println("Valor Invalido");
				}
				else {
					if (nume % 2 == 0 && nume != 0) {
						par = par + 1;
						medpar = nume + medpar;
						media = media + nume;
					}
					else {
						imp = imp + 1;
						media = media + nume;
					}
				}
			}
			System.out.println("A quantidade de numeros pares é de: " + par + " e a de numeros impares é de: " +imp);
			System.out.println("A media dos numeros pares é de: " +(medpar = medpar / par)+ " E a media total é de: " +(media = media / (par + imp)));
		}
	}
	

}
