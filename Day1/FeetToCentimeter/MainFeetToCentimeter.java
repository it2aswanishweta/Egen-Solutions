package day1;

import java.util.Scanner;

public class MainFeetToCentimeter {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 FeetToCentimeter convert = new FeetToCentimeter();
		 int centiInt = convert.feetCentimeter(30);
		 double centiDouble = Math.floor(convert.feetCentimeter(560.24) * 100) / 100;
		 long centiLong = convert.feetCentimeter(8000);
		 
		 System.out.println("Feet to Centimeter Conversion");
		 System.out.println("Integer value: " + centiInt + ", Double value: "+ centiDouble + ", Long value: "+ centiLong);
		 
		 sc.close();
	}

}
