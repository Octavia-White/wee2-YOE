import java.util.Scanner;

public class theTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scam = new Scanner (System.in);

		String name = "";
		System.out.println(" What is your name ");		
		
		
		name = scam.next();
		System.out.println("Hello " + name +" Please answer the following questions"  );
		
		System.out.println("what is your favorite sport" ); 
		scam.next();
		
		System.out.println("what is your favorite food" );
		scam.next(); 
		
		int color = 15;
		int red = 20; 
		int pink =4; 
		
		System.out.println("need a calculto r" + name );
		
				
		System.out.println("enter a number");
		color =scam.nextInt();
		
		System.out.println("enter another number");
		red =scam.nextInt(); 
		
		System.out.println("enter the last number");
		pink = scam.nextInt(); 
		
		System.out.println("this is the sum");
		color = pink + red; 	
		System.out.print(color);
		
		System.out.println(" thios is the difference");
		color = pink- red; 
		System.out.print(color);
		
		System.out.println("this is the product");
		color = pink * red;
		System.out.print(color);
		
		System.out.println("this is the quotient ");
		color = pink/red ; 
		System.out.print(color);
		
		
		
		
	}

}
