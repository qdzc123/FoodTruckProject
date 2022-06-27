package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp { 
	
	public static void main(String[] args) {
		
		//oodTruck [] truck  = new FoodTruck[5];
		
		FoodTruckApp app = new FoodTruckApp();
		
		Scanner sc = new Scanner(System.in);
		
		FoodTruck[] truckInfo = app.addingCarInfo(sc);
		
		while(true) {
			menu();
			choseOption(sc.nextInt(), truckInfo);
		}
	}
	
	public FoodTruck[] addingCarInfo(Scanner sc) {
		int number = 5;	
		int i = 0;
		FoodTruck [] truck  = new FoodTruck[number];
		
		while(i < truck.length) {
			
			truck[i] = new FoodTruck("name", 0,"food" );
			
			
			String truckName = "";
			
			System.out.println("Enter the truck name or quit to terminate");
			truckName = sc.nextLine();
			truck[i].setName(truckName);
			
			
			if(truck[i].getName().equalsIgnoreCase("quit")) {
				
				System.out.println("The input is over");
				truck[i]= null;
				break;
				
			}
			
			else {	
				System.out.println("Enter the food type");
				String foodType = sc.nextLine();
				truck[i].setFoodType(foodType);
				
				System.out.println("Enter the user rating");
				int  rating = sc.nextInt();
				truck[i].setRating(rating);	
			}
			
			i++;
		}
		
		return truck;
	}
	
	public static void menu() {
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
	}
	
	public static void choseOption(int option, FoodTruck[] truckInfo) {
		
		int sum = 0;
		double average;
		int max = 0;
		
		switch(option) {
			case 1:
				//List all the truck
				for(FoodTruck t : truckInfo) {
					if(t.getName() != null) {
					System.out.println(t.toString());
				}
			}
				break;
				
			case 2:
				// the average of the rating
				for(FoodTruck t : truckInfo) {
					sum += t.getRating();
				}
				average = sum / 5;
				
				System.out.println("The average rating of food truck is " + average);
				
				break;
				
			case 3:
				//Display the highest-rated food truck.
				for(FoodTruck t : truckInfo) {
					if(max < t.getRating()) {
						max = t.getRating();
					}
				}
				
				for(FoodTruck t : truckInfo) {
					if(t.getRating() == max) {
						System.out.println(t.toString());
						break;
					}
				}
				
				break;
			
			case 4:
				System.out.println("GOOD BYE");
				System.exit(0);
			
			default:
				System.out.println("Choose the number between 1 - 4");
		}
	}
}
