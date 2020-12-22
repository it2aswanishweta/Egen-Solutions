package day1;

import java.util.Scanner;

public class MainCarpet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly enter the length of the room");
		float length = sc.nextFloat();
		
		System.out.println("Kindly enter the width of the room");
		float width = sc.nextFloat();
		
		System.out.println("Kindly enter the cost per square foot of the room");
		float cost = sc.nextFloat();
		
		RoomCarpet room = new RoomCarpet(length, width, cost);
		float totalCost = room.totalCostCarpet();
		
		System.out.println("Total Cost of the carpet: " + totalCost);
		
		sc.close();
	}

}
