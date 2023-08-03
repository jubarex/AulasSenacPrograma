package ex01;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//AULA STRING !!!!!!!!!!!!!!!!!!!!
		String texto1 = "Aula String";
		String texto2 = "Curso Programador de Sistemas";
		
		//Método que retorna o caracter determinado da posição string!!!!!!!!!!!
		
		 char letra =texto1.charAt(5);
		 System.out.println(letra);
		
		 // Concatenar String !!!
		 System.out.println(texto1.concat(texto2));
		 System.out.println(texto1 + " " + texto2);
		
		 //metodo contains !!!!!!
		 
		 if(texto1.contains("Aula")) {
			 System.out.println("a variável contem a palavra Aula");
		 }
		 
		 //metodo endsWidht
		 if(texto2.endsWith("Sistemas")) {
			 System.out.println("A variável termina com apalvra Sistemas!");
		 }
		 //
		 if(texto2.startsWith("Curso")) {
			 System.out.println("a variavel termina com a palavra curso!!");
		 }
		 if(texto1.equals("Aula String")) {
			 System.out.println("Os textos são iguais");
			 }
		 
		 if(texto1.equalsIgnoreCase("aula String")) {
			 System.out.println("Os textos são iguais");
		 }
		 //quantidade de caracter
		 System.out.println("quantidade de caracteres :" +texto1.length());
		 
		 System.out.println(texto1.toUpperCase()); //Deixa tudo maisculo
		 System.out.println(texto1.toLowerCase()); //Deixa minuscuo
	}

}
