package Basicos;

import java.util.Scanner;

public class lista4 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in); 
		System.out.println("Informe qual atividade da lista deseja ver");
		int atvd = Teclado.nextInt();
		
		if (atvd == 1) {
			System.out.println("Informe a distancia percorrida");
			int km = Teclado.nextInt();
			System.out.println("Informe a quantidade de litros gastos");
			int litros = Teclado.nextInt();
			System.out.println("A media de combustivel gasto por km: " +(km/litros));
		}
		if (atvd == 2) {
			int ParImp = 1;
			int Par = 0;
			int Imp = 0;
			while (ParImp != 0) {
				System.out.println("Informe um numero");
				ParImp = Teclado.nextInt();
				if (ParImp % 2 == 0) {
				Par = Par + ParImp;
			}
				else {
				Imp = Imp + ParImp;
				}
			}
			System.out.println("A soma dos numeros pares é: " +Par);
			System.out.println("A soma dos numeros impares é: " +Imp);
		}
		if (atvd == 3) {
			System.out.println("Informe um numero");
			int Fatorial = Teclado.nextInt();
/*			int Cont = Fatorial - 1;
			while (Cont >0) {
				Fatorial = Fatorial * Cont;
				Cont --;
			}
*/
			for(int i = Fatorial - 1 ; i > 0; i --) {
				Fatorial = Fatorial * i;
			}
			System.out.println("Resultado: "+Fatorial);
		}

		
	}

}
