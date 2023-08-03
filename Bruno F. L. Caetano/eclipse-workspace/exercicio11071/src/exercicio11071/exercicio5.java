package exercicio11071;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto1 = "Aula String";
		String texto2 = "Curso programação de Sistemas";
		
		
		//retorna o caracter de uma determinada posição da string 
		char letra = texto1.charAt(5);
		System.out.println(letra);
		
		//concatenar strings
		System.out.println(texto1.concat (texto2));
		System.out.println(texto1 + " " + texto2);

		if(texto1.contains("Aula"));{
		System.out.println("a variável contem a palavra: Aula");
		
		}
		
		if(texto1.endsWith("Sistemas")) {
		System.out.println("A variavel termina com a palavra: Sistemas");

		}
		
		if(texto2.startsWith("Curso")) {
		System.out.println("a variavel inicia com a palavra: Curso");
		}
	 		
	
       	if(texto1.equals("Aula String")) {
		System.out.println("Os textos são iguais");
       	}
       	
       	
       	if(texto1.equalsIgnoreCase("aula string")) {
       		System.out.println("Os textos são iguais");
       	}
		
		
       	//quantidade de caracteres
       	System.out.println("quantidade de caracteres:" +texto1.length());
       	
       	System.out.println(texto1.toUpperCase());
        System.out.println(texto1.toLowerCase());
      
       	
       	
       	
       	
	}

}
