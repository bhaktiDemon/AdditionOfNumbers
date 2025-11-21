package Main;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		addition.addition(num1, num2);

	}

}
