package ex01;
import java.util.Scanner;
public class ex04aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Informe um número");
		num1=teclado.nextInt();
		num2=teclado.nextInt();
		num3=teclado.nextInt();
		
		if(num1 > num2 &&  num2 > num3) {
			System.out.println(num1 + "" + num2 +""+num3);
			} else if (num1 >= num3 && num2 >=num3) {
				System.out.println(num1+""+num3+""+num3);
			} else if ( num2 >= num3 && num3 >= num1) {
				System.out.println(num2  + " "  + num3 + " " + num1 );
			} else if (num3 >= num1 && num1 >=num2) {
				System.out.println(num3+""+num1+""+num2);
			} else if ( num3 >= num2 && num2 >= num1) {
				System.out.println(num3 + " "  + num2 + " " + num1 );
			}
		
	}

}
