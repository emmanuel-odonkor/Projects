package day1.examples;
import java.util.Scanner;
import java.util.*;

public class Circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int RADIUS;
		
		Scanner INPUT = new Scanner(System.in);
		
		//THE USER ENTERS THE RADIUS OF THE CIRCLE TO BE USED
		System.out.println("ENTER THE RADIUS:");
		
		RADIUS = INPUT.nextInt();
		
		double a = Math.PI;
		
		
		//FORMULA TO COMPUTE THE CIRCUMFERENCE
		double CIRCUMFERENCE = 2 * a * RADIUS;
		double ROUND_CIRCUMFERENCE = (double) Math.round(CIRCUMFERENCE * 100) / 100;
		
		
		//FORMULA TO COMPUTE THE AREA
		double AREA = a * RADIUS * RADIUS;
		double ROUND_AREA = (double) Math.round(AREA * 100) / 100;
		
		//PRINTS OUT THE AREA AND THE CIRCUMFERENCE OF THE CIRCLE GIVEN A SPECIFIC RADIUS
		System.out.println("THE AREA OF THE CIRCLE GIVEN A RADIUS OF "+ RADIUS +" IS " + ROUND_AREA  + " AND THE CIRCUMFERENCE IS " + ROUND_CIRCUMFERENCE + ".");
		
		
		

	}

}
