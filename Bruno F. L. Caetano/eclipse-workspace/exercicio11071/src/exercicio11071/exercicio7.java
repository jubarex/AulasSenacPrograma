package exercicio11071;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	  Scanner Teclado = new  Scanner (System.in);
      System.out.println("Informe a primeira Nota");
      int nota1 = Teclado.nextInt();
  
      System.out.println("Informe a segunda Nota");
      int nota2 = Teclado.nextInt();
  
      System.out.println("Informe a terceira Nota");
      int nota3 = Teclado.nextInt();
  
      double media;
      
     media = (nota1 + nota2+ nota3) / 3.0;
	
      if( media > 70 ) {
    	  System.out.println("O aluno foi aprovado com média de " + media);
      }
	
      else {
    	  System.out.println("O aluno foi reprovado com média de " + media);
      }
	
	
	
	
	
	
	
	
	
	
	
	
}
}