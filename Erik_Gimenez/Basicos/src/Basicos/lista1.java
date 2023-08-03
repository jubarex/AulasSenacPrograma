package Basicos;

import java.util.Scanner;
import java.util.Arrays;

public class lista1 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in); 
		System.out.println("Informe qual atividade da lista deseja ver");
		int atvd = Teclado.nextInt();
		
		if (atvd == 1) {
			System.out.println("Informe um numero");
			int val1 = Teclado.nextInt();
			System.out.println("Informe outro numero");
			int val2 = Teclado.nextInt();
	
			if (val1 > val2) {
				System.out.println("O maior valor é de: " +val1);
			}
			if (val2 > val1) {
				System.out.println("O maior valor é de: " +val2);
			}
			else {
				System.out.println("Ambos valores são iguais");
			}
			}
		
		if (atvd == 2) {
			System.out.println("Informe um numero");
			int num = Teclado.nextInt();
			if (num >= 0) {
				System.out.println("O numero:" +num+ "é positivo");
			}
			else {
				System.out.println("O numero:" +num+ "é negativo");
			}
			}
	
		if (atvd == 3) {
			System.out.println("Informe o seu sexo (F/M)");
			String sexo = Teclado.nextLine();
			if (sexo == "F") {
				System.out.println("Sexo Feminino");
			}
			if (sexo == "M") {
			System.out.println("Sexo Masculino");
			}
			else {
				System.out.println("Sexo Invalido");
			}
			}
	
	
		if (atvd == 4) {
			 int arr [] = new int[3];
			 int i = 0;
		  
		       for (i = 0; i < 3; i++) {
				System.out.println("Informe um numero");
				arr[i] = Teclado.nextInt();
				}
		       Arrays.sort(arr);
		       System.out.printf("Os numeros em ordem decrescente são: " +Arrays.toString(arr));
			}
	
		if (atvd == 5) {
			System.out.println("Informe um numero");
			int nume1 = Teclado.nextInt();
			System.out.println("Informe um numero");
			int nume2 = Teclado.nextInt();
			System.out.println("Informe um numero");
			int nume3 = Teclado.nextInt();
			int media;
			media = (nume1 + nume2 + nume3) / 3;
			System.out.println("A media dos numeros é de: " +media);
			}
		
		if (atvd == 6) {
			System.out.println("Informe um numero");
			int ParImp = Teclado.nextInt();
			if (ParImp % 2 == 0) {
				System.out.println("O numero: "+ParImp+ "é par");
			}
			else {
				System.out.println("O numero: "+ParImp+ "é impar");
			}
			}
			
		if (atvd == 7) {
			System.out.println("Informe a nota 1");
			int nota1 = Teclado.nextInt();
			System.out.println("Informe a nota 2");
			int nota2 = Teclado.nextInt();
			int media;
			media = (nota1 + nota2) / 2;
			if (media >= 7 && media < 10) {
				System.out.println("O aluno esta APROVADO");
			}
			if (media >= 10) {
				System.out.println("O aluno esta APROVADO COM DISTINÇÃO");
			}
			else {
				System.out.println("O aluno esta REPROVADO");
			}
			}
		
		if (atvd == 8) {
			int respostas = 0;
			System.out.println("Telefonou para a vítima?");
			String resp1 = Teclado.next();
			if (resp1.equalsIgnoreCase( "Sim") || resp1.equalsIgnoreCase( "S")) {
				respostas += 1;
			}
			System.out.println("Esteve no local do crime?");
			String resp2 = Teclado.next();
			if (resp2.equalsIgnoreCase( "Sim") || resp2.equalsIgnoreCase( "S")) {
				respostas +=  1;
			}
			System.out.println("Mora perto da vítima?");
			String resp3 = Teclado.next();
			if (resp3.equalsIgnoreCase( "Sim") || resp3.equalsIgnoreCase( "S")) {
				respostas += 1;
			}
			System.out.println("Devia para a vítima?");
			String resp4 = Teclado.next();
			if (resp4.equalsIgnoreCase( "Sim") || resp4.equalsIgnoreCase( "S")) {
				respostas += 1;
			}
			System.out.println("Já trabalhou com a vítima?");
			String resp5 = Teclado.next();
			if (resp5.equalsIgnoreCase( "Sim") || resp5.equalsIgnoreCase( "S")) {
				respostas += 1;
			}
			
			if (respostas == 2) {
				System.out.println("Suspeita");
			}
			if (respostas == 3 || respostas == 4) {
				System.out.println("Cumplice");
			}
			if (respostas == 5) {
				System.out.println("Assassino");
			}
			else {
				System.out.println("Inocente");
			}
	}
		
		if (atvd == 9) {
			System.out.println("Informe o turno em que estuda (M/V/N)");
			String turno = Teclado.nextLine();
			if (turno == "M") {
				System.out.println("Turno Matutino");
			}
			if (turno == "V") {
				System.out.println("Turno Vespertino");
			}
			if (turno == "N") {
				System.out.println("Turno Noturno");
			}
			}
		
		if (atvd == 10) {
			System.out.println("Informe a nota 1");
			int not1 = Teclado.nextInt();
			System.out.println("Informe a nota 2");
			int not2 = Teclado.nextInt();
			int media;
			media = (not1 + not2) / 2;
			String conceito;
			if (media >= 9) {
				conceito = "A";
			}
			else if (media >= 7.5 && media < 9) {
				conceito = "B";
			}
			else if (media >= 6 && media < 7.5) {
				conceito = "C";
			}
			else if (media >= 4 && media < 6) {
				conceito = "D";
			}
			else {
				conceito = "E";
			}
			System.out.println("Conceito: "+conceito);
			if (conceito == "A" || conceito == "B" || conceito == "C") {
				System.out.println("O aluno esta APROVADO");
			}
			else if (conceito == "D" || conceito == "E") {
				System.out.println("O aluno esta REPROVADO");
			}
	
		}
	
		
	
	
	
	
	}
}
