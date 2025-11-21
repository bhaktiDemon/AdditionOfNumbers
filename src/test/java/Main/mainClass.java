package Main;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        // Convert string arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
 
        // Call addition method
        addition.addition(num1, num2);
	    } catch (NumberFormatException e) {
	        System.out.println("Error: Arguments must be valid integers.");
	    }
	}

}
