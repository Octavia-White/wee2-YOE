package steph;

import java.util.Scanner;

public class week5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tavia = new Scanner ( System.in);
		
		
		int color= 0;
		int red = 3;
		String name ="";
		String movie = "go see a movie or go skating ... 15";
		String golf = "go play golf..... 45";
		
		System.out.println("would you perfer a indoor or outdoor date?");
		
	    name = tavia.next();		
		System.out.println("how much would you like to spend tonight");
		color = tavia.nextInt(); 
		
		 if (name.equalsIgnoreCase("outdoor") && color <= 45 )
		 System.out.println(golf); 
			 
		 if (name.equalsIgnoreCase("indoor") && color >= 15)
			 System.out.println(movie);{ 
				 
				 
		
	
		
		 }
	
	
		 
	}
}
	
