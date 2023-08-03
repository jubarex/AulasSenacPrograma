package vetor27_07;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// declarando novo escanercom o nome teclado
		Scanner teclado = new Scanner(System.in);
		// saida da tela    "texto"
		System.out.println("insira o tamanho do vetor: ");
		
		 //declarando vareavel do tipo INT com o nome ORDEM
		//que RECEBE o valor que o usuario inserir
		int ordem = teclado.nextInt();
		
		//declarando uma vareavel VETOR com tipo INT
		//com o nome vetorNumerosInteiros
		//								que RECEBER uma nova istancia
		//								"nome vetor" de tamnho de ORDEM
		int vetorNumerosInteiros[] = new int[ordem];
		
		//saida na tela    "texto"            CONCATENA com a VAREAVEL ORDEM
 		System.out.println("Tamanho do vetor: " + ordem);
		System.out.println(".length: " + vetorNumerosInteiros.length);

		// usuariosinserir cada valor de vetor

		Scanner arroz = new Scanner(System.in);
		
		for(int posicao = 0; posicao < vetorNumerosInteiros.length; posicao++) {
			System.out.println("insira elemento: "+ posicao);
			vetorNumerosInteiros[posicao] = arroz.nextInt();
			;
		}
		
		//mostrar a soma de todos os valor do vetor
		
		//declarar vareavel soma recebe 0
		int soma = 0;
		for (int i = 0; i < vetorNumerosInteiros.length; i++){
		soma += vetorNumerosInteiros[i];
		
		//variavel recebe valor novo = valor antigo +elemento atual
		//soma = soma + vetorNumerosInteiros[i];
		
		
		}
			System.out.println("A soma do valor é: "+ soma);
		}
		
	}


