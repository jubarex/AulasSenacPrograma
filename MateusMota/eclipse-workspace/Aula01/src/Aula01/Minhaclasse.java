package Aula01;
import java.util.Scanner;
public class Minhaclasse {

	public static void main(String[  ] args) {
		// TODO Auto-generated method stub
    System.out.println( "Meu primeiro programa em JAVA puro");
// Sysout -> Pra exibir no console 

//variaveis do tipo inteiro 
      
     int num1; // 
     byte num2; // 
     short num3;
     long num4, num5 ,num6 , num7;
     
     
     //variaveis tipos reais (números de ponto flutuante)
     
     float val1;
     double val2; 
     
     //variaveis tipo caracter 
     char letra;
     
     //variavel string tipo texto
     String texto;
     
     // variavel tipo boleano - verdadeiro ou falso 
     boolean boleano;
     
     // atribuição de valores (mudar o valor)
     num1 = 10;
     num2 = 2;
     num3 = num2;
      
     //operadores matematicos
     //soma +
     //subtração -
     //multiplacação *
     //divisão / 
     
     num4 = num1 + num2;
     num5 = num4 - 5;
     num6 = num5 * 2;
     num7 = num6 / 10;
     System.out.println( "valor da variável num4: "+ num4  ); //Para juntar utilize o +
     System.out.println("valor da variável num5:"+num5);
     System.out.println("valor da variávelnum6:"+num6);
     System.out.println("valor da variável num7:"+num7);
     
     float media = (7 + 6)/2f;
     double media2 = (3 + 8)/2.0;
     System.out.println("média:"+ media);
      
     double soma = 0.1 + 0.2;
     System.out.println("soma:"+soma );
     
     //Aula 02 ========== Aula 02 !! // 09099090909909
     
     
     
     //Estrutura se e senão
     int idade = 78;
     if ( idade >= 18 ) { 
    	 System.out.println(  "maior de idade "+ idade +" anos");
     } else {
    	 System.out.println("Menor da idade");
     }
     
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe um número");
     int numeroUsuario = teclado.nextInt();
     System.out.println("O número digitado foi "+ numeroUsuario);
     
     
     
	}

	

}  