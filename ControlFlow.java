import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class AsciiChars {
	public static void printNumbers()
	  {
	    for (int i = 48; i < 58; i++) {
	    	String n = Character.toString((char)i);
	    	System.out.println(n);
	    }
	  }

	  public static void printLowerCase()
	  {
		  for (int i = 97; i <= 122; i++) {
			  String n = Character.toString((char)i);
		    	System.out.println(n);
		  }
	  }

	  public static void printUpperCase()
	  {
		  for (int i = 65; i <= 90; i++) {
			  String n = Character.toString((char)i);
		    	System.out.println(n);
		  }
	  }
}


public class ControlFlow {

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();	
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Do you wish to continue?");
		    String answer = input.nextLine();
		   
		   if (answer.equals("Yes") || answer.equals("Y")) {
			   
				   
			   } else {
			 
			 System.out.println("Please return later to complete the survey");
			   }	
		   
		  Scanner in = new Scanner(System.in);
		 System.out.println("Name of favorite pet: ");
		 String petName = input.next();
		 System.out.println("Age of favorite pet: ");
		 String petAge = input.next();
		 System.out.println("What's your lucky number?: ");
		 String luckyNumber = input.next();
		 System.out.println("Do you have a favorite quarterback? 'Yes' or 'No'");
		 String qbAnswer = input.next();
		 	if (qbAnswer.equals("Yes")) {
		 		System.out.println("What is their jersey number?");
		 	} else qbAnswer.equals("No");{
		 		
		 	} System.out.println("That's cool too");
		 	
		 System.out.println("Two digit model year of your car: ");
		 String carYear = input.next();
		 System.out.println("First name of favorite actor or actress: ");
		 String actorName = input.next();
		 System.out.println("Enter a random number betwen 1 and 50: ");
		 String randomNum = input.next();
		 
		 Scanner in = new Scanner(System.in)
		 
				 
	}
	
}
// unsure how to generate magic ball numbers, will update after Nick explains in class







