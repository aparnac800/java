package aparna;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			int a=scanner.nextInt();
			System.out.print("Enter an integer: ");
			int b=scanner.nextInt();
			int c=a+b;
			int d=a-b;
			System.out.println("sum: "+c);
			System.out.println("sum: "+d);
			System.out.println("product: "+a*b);
			System.out.println("modulus: "+a%b);
			
			
		}
	}

}
