package Aula;

import java.util.Scanner;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Meu primeiro programa em JAVA!");
//sysout -> comando digo do Scratch

//tipos números inteiros
int num1;
byte num2;
short num3;
long num4, num5, num6, num7, num8;



//tipo números reais (números de pontos flutuante)
float va1;
double val2;
//tipo caracter
char letra;

//tipo texto
String texto;

//tipo(boleano - verdadeiro ou falso)
boolean boleano;
// atribuição de valores (comando Mude do Scratch)
num1 = 10;
num2 = 2;
num3 =  num2;

// operadores matemáticos
//soma +
//subtração -
// multiplcação *
//divisão /

num4 = num1 + num2;
num5 = num4 -5;
num6 = num5 * 2;
num7 = num6 / 10;

System.out.println("valor da variável num4:" + num4); // para junta ultilize on sinal +
System.out.println("valor da variável num5:" + num5);
System.out.println("valor da variável num6:" + num6);
System.out.println("valor da variável num7:" +num7); 

float media = (7+ 6)/2f;
double media2 = (3+8)/2.0;

System.out.println("media:" + media);
System.out.println("media2:" + media2);

double soma = 0.1 + 0.2;
System.out.println("soma:" +soma);

int idade = 20;
if(idade >=18) {// se então do Scratch

System.out.println("é maior de idade!");
}
else {
	System.out.println("é menor de idade!");
}

Scanner teclado = new Scanner(System.in);

System.out.println("informe um número");
int numeroUsuario = teclado.nextInt();
System.out.println("o número digitado foi: " + numeroUsuario);





	}

}
