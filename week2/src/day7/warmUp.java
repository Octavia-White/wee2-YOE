package day7;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grape = 12; 
		int apple = 13;
		int orange = 14; 
		String name = "";
		double right = 2.2;
		double left = 2.3;
		double middle = 2.4; 
		
		Scanner safe = new Scanner (System.in);
		System.out.println("enter your name");
		name = safe.next();
		System.out.println("Welcome to the sports calculator");
		System.out.println("enter a number");
		orange = safe.nextInt();
		System.out.println("enter a number");
		grape = safe.nextInt();
		System.out.println("this is the sum");
		int apple2 = orange +grape; 
		System.out.println(apple2);
		System.out.println("this is the difference");
		int orange4 = grape - apple; 
		System.out.println(orange4);
		System.out.println("this is the quotient");
		int apple3 = grape/orange;
		System.out.println(apple3);
		System.out.println("this is the product");
		int orange5 = apple* grape;
		System.out.println(orange5);
		
		System.out.println(" thank you for particapting " + 
		name);
		
		
		
		
	}

}
