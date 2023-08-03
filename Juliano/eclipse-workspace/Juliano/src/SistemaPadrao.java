import java.util.Scanner;

public class SistemaPadrao {

	public static void main(String[] args) {

		sistemaPrincipal();
	}

	private static void sistemaPrincipal() {
		boolean executar = true;

		float resultado = 0;

		while (executar) {
			Scanner teclado = new Scanner(System.in);

			System.out.println("O sistema está rodando! Resultado Atual: "+ resultado);

			System.out.println("Veja nossas opções: ");
			System.out.println("1: Somar");
			System.out.println("2: Multiplicar");
			System.out.println("3: Mostrar Resultado");
			int opcaoEscolhida = teclado.nextInt();
			switch (opcaoEscolhida) {
			case 1:
				int opcaoEscolhidaSoma = 0;
				System.out.println("1: Quer usar valores novos?");
				System.out.println("2: Ou usar o antigo?");
				opcaoEscolhidaSoma = teclado.nextInt();
				if (opcaoEscolhidaSoma == 1) {
					System.out.println("Insira o número 1:");
					float num1Soma = teclado.nextFloat();
					System.out.println("Insira o número 2");
					float num2Soma = teclado.nextFloat();
					resultado = num1Soma + num2Soma;
				} else if (opcaoEscolhidaSoma == 2) {
					System.out.println("Insira o número 1:");
					float num1Soma = teclado.nextFloat();
					resultado += num1Soma;
				} else {
					System.out.println("Você inseriu uma opção inválida.");
				}
				break;
			case 2:
				int opcaoEscolhidaMultiplicar = 0;
				System.out.println("1: Quer usar valores novos?");
				System.out.println("2: Ou usar o antigo?");
				opcaoEscolhidaMultiplicar = teclado.nextInt();
				if (opcaoEscolhidaMultiplicar == 1) {
					System.out.println("Insira o número 1:");
					float num1Mul = teclado.nextFloat();
					System.out.println("Insira o número 2");
					float num2Mul = teclado.nextFloat();
					resultado = num1Mul * num2Mul;
				} else if (opcaoEscolhidaMultiplicar == 2) {
					System.out.println("Insira o número 1:");
					float num1Mul = teclado.nextFloat();
					resultado *= num1Mul;
				} else {
					System.out.println("Você inseriu uma opção inválida.");
				}
				break;
			case 3:
				System.out.println("Encerrando e mostrando resultado..");
				executar = false;
				break;
			default:
				System.out.println("Você inseriu uma opção inválida.");
				break;
			}

		}
		
		System.out.println("Resultado = "+resultado);

	}

}
