package math;
import java.lang.Math;

public class MilesPerHour {
	
	public int mph(int d, int hrs, int min) {
		double hrs2 = hrs + (min/60);
		int speed = (int)(d / hrs2);
		return speed;
		
		
		
	}

}
