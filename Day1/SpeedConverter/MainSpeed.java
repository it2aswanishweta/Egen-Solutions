package day1;

import java.util.Scanner;

public class MainSpeed {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Kindly enter the speed");
	     double speedKph = sc.nextDouble();
				 
	     SpeedConverter speedConverter = new SpeedConverter();
	     long speedMph = speedConverter.accessSpeed(speedKph);
		 
	     if(speedMph != -1) {
	    	 
	    	 System.out.println("Value of Speed in Miles per hour is: "+ speedMph);;
	     }
	     else {
	    	 
	    	 System.out.println("Value of the speed entered should be greater than zero"); 	 
	     }
	     
	     sc.close();

	}

}
