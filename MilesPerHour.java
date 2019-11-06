package math;
import java.lang.Math;

public class MilesPerHour {
	
	//Method to calculate speed in miles per hour
	public int mph(int d, int hrs, int min) {
		
		//Find the total time in hours (convert minutes to hours and add it to hours)
		double hrs2 = hrs + (min/60);
		
		//Calculate speed
		int speed = (int)(d / hrs2);
		
		//Return speed
		return speed;
		
		
		
	}

}
