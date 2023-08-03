package Aula1;
public class diff21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(diff(19) +" "+" "+ diff(10)+" "+ diff(43));
		
	}
private static float diff(float num1) {
		
		if(num1 > 21) {
		return (num1 - 21)*2;
		}
		else {
			return 21 - num1;
		}
		
}
}
