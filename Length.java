package day1.examples;
import java.util.Scanner;

public class Length {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A STRING VARIABLE NAMED INPUT IS DECLARED
		String Input;
		Scanner STRING = new Scanner(System.in);
		
		//THE STRING BELOW IS PRINTED OUT TO AID THE USER ENTER THE STRING
		System.out.println("ENTER THE STRING WORD:");
		Input = STRING.nextLine();
		
		//THE VARIABLE strLength COMPUTES THE LENGTH OF THE GIVEN STRING
		int strLength = Input.length();
		
		//THE LENGTH IS PRINTED OUT ON THE SCREEN
		System.out.println(strLength);

	}

}
