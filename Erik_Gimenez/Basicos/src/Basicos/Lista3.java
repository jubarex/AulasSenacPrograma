package Basicos;

import java.util.Scanner;
import java.util.Arrays;

public class Lista3 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in); 
		System.out.println("Informe qual atividade da lista deseja ver");
		int atvd = Teclado.nextInt();
		
		if (atvd == 1) {
			System.out.println("Informe a base do retangulo");
			double base = Teclado.nextDouble();
			System.out.println("Informe a altura do retangulo");
			double altura = Teclado.nextDouble();
			double area = base * altura;
			System.out.println("A area do retangulo é igual a: " +area);
		}
		if (atvd == 2) {
			System.out.println("Escreva sua idade:");
			System.out.println("Anos: ");
			int anos = Teclado.nextInt();
			System.out.println("Meses: ");
			int meses = Teclado.nextInt();
			System.out.println("Dias: ");
			int dias = Teclado.nextInt();
			int diastotais = (anos * 365) + (meses * 30) + dias;
			System.out.println("No total você viveu "+diastotais+ "dias");
		}
		if (atvd == 3) {
			System.out.println("Quantas maças deseja comprar?");
			double macas =  Teclado.nextDouble();
			if (macas >= 12.00) {
				System.out.println("O preço total sera de R$" +macas);
			}
			else {
				System.out.println("O preço total sera de R$" +(macas * 1.30));
			}
		}
		if (atvd == 4) {
			System.out.println("Informe a nota 1");
			int nota1 = Teclado.nextInt();
			System.out.println("Informe a nota 2");
			int nota2 = Teclado.nextInt();
			int media;
			media = (nota1 + nota2) / 2;
			if (media >= 6) {
				System.out.println("Média total: " +media+ "\no aluno esta APROVADO");
			}
			else {
				System.out.println("Média total: " +media+ "\no aluno esta REPROVADO");
			}
		}
		if (atvd == 5) {
			System.out.println("Escreva o salario do funcionario");
			double salario = Teclado.nextDouble();
			double desconto = salario * 0.11;
			if (desconto >= 450.00) {
				System.out.println("O desconto total do salario sera de R$450,00 ficando com um salario de R$" +(salario - 450.00));
			}
			else {
				System.out.println("O desconto total do salario sera de R$" +desconto+ " ficando com um salario de R$" +(salario - desconto));
			}
		}
		if (atvd == 6) {
			System.out.println("Informe o salario");
			double salario = Teclado.nextDouble();
			System.out.println("Informe o total de vendas");
			double vendas = Teclado.nextDouble();
			if (vendas >= 1500.00) {
				double comissao = (1500.00 * 0.03) + ((vendas - 1500) * 0.05);
				System.out.println("O total da comissao sera de R$" +comissao+" Dando um salario total de R$"+(salario + comissao));
			}
			else {
				double comissao = vendas * 0.03;
				System.out.println("O total da comissao sera de R$" +comissao+" Dando um salario total de R$"+(salario + comissao));
			}
		}
		
	}
}

