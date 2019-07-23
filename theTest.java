import java.util.Scanner;

public class theTest {

	import java.util.Scanner;

public class theTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scam = new Scanner(System.in);
		
		String name = "";
		System.out.println("Enter your name please.");
		name = scam.next();
	    String sport = "";
	    String food = "";
	
		System.out.println("Hello " + name + " please answer our short survey. ");
		
		System.out.println("What's your favorite sport?");
		sport = scam.next();
		
		System.out.println("What's your favorite food?");
		food = scam.next();
		
		
		System.out.println("Wow, " + sport + " is an amazing sport that I'm pretty sure you're very good at. I see " + food + " is your favorite food. Good choice, I love" + food + "myself." );
		
		int color = 15;
		int red = 20;
		int pink = 4;
		
	
		
		System.out.println("Have anything adding, subtracting, multiplying, or dividing to do?" + name + " We have a calculator on deck for you. Would you like to try it out? Answer with yes or no please." );
		
		String answer = "";
		answer = scam.next();
		
		if (answer.equalsIgnoreCase("yes")){
		
		System.out.println("Enter a number");
		color = scam.nextInt();
		
		System.out.println("Enter another number");
		red = scam.nextInt();
		
		
		
		System.out.println("This is the sum");
		 pink = red + color ;
		 System.out.println(pink);
		 
		 System.out.println("This is the difference");
		 pink = red - color;
		 System.out.println(pink);
		 
		 System.out.println("This is the product");
		 pink = color * red ;
		 System.out.println(pink);
		 
		 System.out.println("This is the quotient");
		 pink = red / color ;
		 System.out.println(pink); 
		 
		 System.out.println("Thank you for taking our survey and trying our calculator.");
		 
		} else {
				
			System.out.println("Ok thank you for your participation.");
			
			
		} 
	}

	}
	 
		 
		
		
				

