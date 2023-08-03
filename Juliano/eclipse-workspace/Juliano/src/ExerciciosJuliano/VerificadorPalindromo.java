package ExerciciosJuliano;

import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String reverso = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverso += palavra.charAt(i);
        }
        
        // remover espacos da palavra
//        palavra = palavra.trim();
        palavra = palavra.replaceAll("\\s+","");
        
        // remover espacos do reverso
//        reverso = reverso.trim();
        reverso = reverso.replaceAll("\\s+","");

        if (palavra.equalsIgnoreCase(reverso)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

       
    }
}
