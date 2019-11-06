package math;

import java.util.Scanner;

public class MPHRunner {

	public static void main(String[] args) {
		
		//Create new Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get value for distance
		System.out.println("Enter the distance: ");
		int d = keyboard.nextInt();
		
		//Get value for hours
		System.out.println("Enter the hours: ");
		int hrs = keyboard.nextInt();
		
		//Get value for minutes
		System.out.println("Enter the minutes: ");
		int min = keyboard.nextInt();
		
		//Print out all variables and speed
		System.out.println(d + " miles in " + hrs + " hours and " + min + " minutes = " + speed + " MPH");
		

	}

}
