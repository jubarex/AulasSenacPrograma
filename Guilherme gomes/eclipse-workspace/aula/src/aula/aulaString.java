package aula;

public class aulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String texto1 =  "Aula String";
	String texto2 = "Curso programado de Sistemas";
    
	//retrona o caracter de uma determinada posição da string
	char letra = texto1.charAt(5); 
	System.out.println(letra); 
	
	//concatenar.Strings
	System.out.println(texto1.concat(texto2));
	System.out.println(texto1 + " "+ texto2);
	
	if(texto1.contains("Aula")) {
		System.out.println("a variável contem a palavra: Aula");
	}
	
	if(texto2.endsWith("Sistemas")) {
		System.out.println("a variável termina a palavra:Sistemas");
		
	} 
	 if(texto2.startsWith("curso")) {
		 System.out.println("a variável inicia com a palavra: curso");
		 
	 }
	 if(texto1.equalsIgnoreCase("aula string")) {
		 System.out.println("Os textos são iguais");
		 
	 }
	  
	 //quantidade de caracteres 
	 System.out.println("quantidade de caracteres: " +texto1.length());
	 
	 System.out.println(texto1.toUpperCase());
	 System.out.println(texto1.toLowerCase());
	 
	 
		 
	 
	
		
		
	
    
	} 

}
