package day1.examples;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A STRING VARIABLE NAMED INPUT IS DECLARED
		        
				String Input;
				Scanner STRING = new Scanner(System.in);
				
				//THE STRING BELOW IS PRINTED OUT TO AID THE USER ENTER THE STRING
				System.out.println("ENTER THE STRING WORD:");
				Input = STRING.nextLine();
				
				//SPLITS THE STRING GIVEN INTO SEPARATE STRINGS
				String [] a = Input.split(" ");
				
				String Reverse = " ";
				
				//LOOPS THROUGH THE GIVEN STRING  AND TAKES INDEX OF EACH CHARACTER
				for(int i = 0; i < a.length ; i++) {
					String Reversed = a[i];
					String R = " ";
					
					// FOR A GIVEN WORD, THE INNER LOOP TAKES EACH CHARACTER FORMING A WORD, REVERSES THEM AND APPEND THEM INTO A DIFFERENT STRING
					for( int j = Reversed.length() - 1 ; j >= 0 ; j--) {
						R = R + Reversed.charAt(j);	 
					}
					
					Reverse = Reverse + R + " ";
					
				}
				System.out.println(Reverse);
				
			

	}

}
