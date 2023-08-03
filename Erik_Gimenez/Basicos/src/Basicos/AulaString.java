package Basicos;
import java.util.Scanner;

public class AulaString {

	public static void main(String[] args) {
//	retornar caracter de uma posição especifica da string
	String texto1 = "Aula String", texto2 = "Curso programador de sistemas";
	char letra = texto1.charAt(0);
	System.out.println(letra);
	
//	concatenar Strings
	System.out.println(texto1.concat(" "+texto2));
	System.out.println(texto1+" "+texto2);
	
//	contains String
	if(texto1.contains("Aula")) {
		System.out.println("a variavel contem a palavra aula");
	}
	
//	Ends with
	if(texto1.endsWith("String")){
		System.out.println("a palavra termina com String");
	}
	
//	Starts with
	if(texto2.startsWith("Curso")) {
		System.out.println("a palavra começa com curso");
	}
	
//	Igualdade
	if(texto1.equals("Aula String")) {
		System.out.println("Os textos são iguais");

	}
	
//	Igualdade (Ignorar CapsLock)
	if(texto1.equalsIgnoreCase("aula string")) {
		System.out.println("Os textos são iguais");

	}
	
//	Quantidade de caracteres
	System.out.println("Quantidade de caracteres: "+texto1.length());
	
//	Converter para maiusculo ou minusculo
	System.out.println(texto1.toUpperCase());
	System.out.println(texto1.toLowerCase());
}
}
