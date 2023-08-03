package aulaAula;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eclarando um novo sccaneer com o nome teclado
		Scanner teclado =new Scanner(System.in);
		
		//saida natela "texto"
		System.out.println("Insira o tamanho do vetor");
		
		
		// declarando a variavel do yipo INT com onome tamanho 
		//que recebe o valor que o usuario inserir 
		int tamanho = teclado.nextInt();
		
		//declarando uma variavel Vetor do tipo int 
		//com o nome vetorNumerosINteiros 
		//                                que recebe uma nova instância 
		//                                "novo vetor " de tamanho TAMANHO
		int [] vetorNumerosInteiros = new int [tamanho];
		
		// saida natela "texto" CONCATENA com a VARIAVEL TAMANHO
		System.out.println("Tamanho do vetor : "+ tamanho);
		
		//Exibe na tela .length: 5 
		System.out.println(".length: " + vetorNumerosInteiros.length);
		
		  
		Scanner teclado2 = new Scanner(System.in);
		
		
		for (int posicao = 0; posicao < vetorNumerosInteiros.length; posicao++) {
			//elemento atual pede pro usuario uma int
		
			vetorNumerosInteiros[posicao] = teclado2.nextInt();
			
		}
		//mostrar a soma de todos valor do vetor 
		
		//declara variavel soma receb 0 
		int soma = 0;
		for(int i = 0 ; i < vetorNumerosInteiros.length; i++) {
			soma += vetorNumerosInteiros[i];
			
			//variavel recebe valor novo = valor antigo + elemento atual 
			//soma = soma + vetorNumerosInteiros[i];
		}
		System.out.println(soma);
		
		//mostrar um veotr inteiro na tela :
		System.out.println(Arrays.toString(vetorNumerosInteiros));
		
		
		
		
		
		
		
	/*	int[] num=new int[5];
	//	 num[0] = 3;
		// num[1] = 5;
	//	 num[2] = 7;
	//	 num[3] = 9;
	//	 num[4] = 12;
	//	 
		 
	//	 for(int[] i=num; i+0; i++) {
			 
			 
			 
		 }*/

	}

}
