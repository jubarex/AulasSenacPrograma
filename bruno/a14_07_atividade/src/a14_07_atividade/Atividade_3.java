package a14_07_atividade;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		//O while representa a estrutura de repetição (repita até que) N OsCRETCH 
        int valor = -1, soma_par = 0, soma_impar =0, cont = 0, contimp = 0;
        
		while(valor != 0) {
			System.out.println("Digite um número");
			valor = teclado.nextInt();
			if(valor%2 == 0 && valor != 0 ) {
				 soma_par += valor;
				 cont ++;
				System.out.println("par: "+ valor);
			} else {
				 soma_impar += valor;
				 contimp ++;
				System.out.println("impar: "+ valor);
			}
			
		}
		System.out.println("A media dos valore pares são de: " +(soma_par / cont));
		System.out.println("a media total dos números é de "+ ((soma_par + soma_impar) / (cont + contimp)));
	}

	}


