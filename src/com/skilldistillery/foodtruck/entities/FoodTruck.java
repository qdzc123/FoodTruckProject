package com.skilldistillery.foodtruck.entities;

public class FoodTruck{

	private int uniqueId;
	private String name;
	private String foodType;
	private int rating;
	private static int nextId = 1;
	
	public FoodTruck( String name, int rating, String foodType) {
		super();
		FoodTruck.nextId++;
		this.uniqueId = nextId;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
		uniqueId++;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck [uniqueId=" + uniqueId + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating
				+ "]";
	}
	
	
	
	
}

