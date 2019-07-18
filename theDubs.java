import java.util.Scanner;

public class theDubs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner code = new Scanner (System.in); 
		 int bye = 5;
		 int hi = 10;
		 int back = 0; 
		 
		 String name = "";
		 
		 String color = ""; 
		 
		 System.out.println("Welcom to dubs Calulator" );
		 
		 System.out.println("enter your name");
		 
		 name=code.next(); 
		 
		 System.out.println("whats your favorite color" );
		 color = code.next();//string 
		 
		 System.out.println("enter a number");
		 bye = code.nextInt();
		 
		 System.out.println("enter a number ");
		 back= code.nextInt();
		 
		 
		 int hi1 = bye +back;
		 System.out.println(" this is the sum "+hi1 );
		 
		
		 int hi11 = bye - back; 
		 System.out.println(" this is the difference "+hi11 );
		 
		 
		 int hi111 = bye * back;
		 System.out.println(" this is the product "+hi111 );
		 
		
		 int hi1111 = bye / back;
		 System.out.println(" the qoutient is " +hi1111 );
		 
		 
		 System.out.println(" thank u for participating " + name + ( " rate the calculator on a scale of 1-5"));
		 
		 int be1 = 2;
		 int be11 = code.nextInt();
	     
		 System.out.println("thank you "+ name+" for rating the calculator a " + be11);
		 
		 
		 code.close();
		 
	}

}
