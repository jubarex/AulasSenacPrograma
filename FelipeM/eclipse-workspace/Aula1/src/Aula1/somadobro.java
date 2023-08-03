package Aula1;
public class somadobro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(soma(1, 2) +" "+" "+ soma(3, 2)+" "+ soma(2, 2));
		
	}
private static float soma(float num1, float num2) {
		
		if(num1 == num2) {
		return (num1 + num2) *2;
		}
		else return num1 + num2;
	}
}
