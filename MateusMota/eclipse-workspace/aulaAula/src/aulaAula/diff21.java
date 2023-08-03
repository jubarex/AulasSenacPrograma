package aulaAula;

import java.util.Scanner;

public class diff21 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// só quando quero pedir pro usuário o valor 
		System.out.println(diff21 (60)); // chama a função dai entre parentese coloco o valor que é pra ela executar
		 

	}
	private static int diff21 (int n ) { //  <=== cria uma  função fora da main                                    
		if (n <= 21 ) {
			return 21 - n;
		} else {
		return (n - 21) * 2;
	}

}
}
