package day1;

public class FeetToCentimeter {

	public int feetCentimeter(int feet) {
		
		if(feet > 0) {
			return (int)(30.48 * feet);
		}
		
		return -1;
	}
	
	public long feetCentimeter(long feet) {
		
		if(feet > 0) {
			return (long)(30.48 * feet);
		}
		
		return -1;
		
	}
	
	public double feetCentimeter(double feet) {
		
		if(feet > 0) {
			return (double)(30.48 * feet);
		}
		
		return -1;
		
	}
}
