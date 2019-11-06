package math;

import java.util.Scanner;

public class MPHRunner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the distance: ");
		int d = keyboard.nextInt();
		
		System.out.println("Enter the hours: ");
		int hrs = keyboard.nextInt();
		
		System.out.println("Enter the minutes: ");
		int min = keyboard.nextInt();
		
		System.out.println(d + " miles in " + hrs + " hours and " + min + " minutes = " + speed + " MPH");
		

	}

}
