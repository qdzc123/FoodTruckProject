package com.skilldistillery.foodtruck.entities;

public class FoodTruck{

	public int uniqueId = 0;
	public String name;
	public String foodType;
	public int rating;
	
	public FoodTruck( String name, int rating, String foodType) {
		super();
		//this.uniqueId = uniqueId;
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
		return uniqueId++;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
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

