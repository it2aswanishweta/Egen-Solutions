package day1;

public class SpeedConverter {

	private long toMilesPerHour(double kilometersPerHour) {
		
        return Math.round(kilometersPerHour / 1.609);
    }
	
	public long accessSpeed(double kilometersPerHour) {
		
		if(kilometersPerHour > 0)
			return toMilesPerHour(kilometersPerHour);
		
		return -1;
	}

}
