package com.xworkz.hotel;

import com.xworkz.hotel.constants.*;

/**
 * @author Priyanka
 *
 */
public class Hotel {
	public static final String Arrays = null;
	private String[] hotelNames1 = new String[5];
	private Locations location;
	private String ownerName;
	private String hoteltype;
	private boolean service;
	private String[] foodItems;

	String[] hotelNames = { "Sri ram hotel", "Amma hotel", "Mani Uta" };

	public Hotel(String[] hotelNames, String ownerName, String hoteltype, boolean service, String[] foodItems) {
		super();
		this.hotelNames1 = hotelNames;

		this.ownerName = ownerName;
		this.hoteltype = hoteltype;
		this.service = service;
		this.foodItems = foodItems;
	}

	public void searchHotelInfo(String hotelName1, String location, String[] foodItems) {
		System.out.println(" seraching for hotel");
		System.out.println(" arg 1: " + this.hotelNames1);
		System.out.println("arg2 " + this.location);
		System.out.println("arg 3 :" + this.foodItems);

	}

	public void searchByName(String name) {

		System.out.println("Hotels are :" + hotelNames1.length);
		System.out.println("arg 1:" + hotelNames1);
		boolean hotelFound = false;
		for (int count = 0; count < hotelNames1.length; count++) {
			String hotel = this.hotelNames[count];
			if (hotel.equals(name)) {
				hotelFound = true;
				// System.out.println(" hotel found");

			}

			else {
				hotelFound = false;
				// System.out.println("hotel not found");
			}
		}
	}

	public void displayHotel(String hotelName, Locations location, String[] foodItems) {
		System.out.println(" seraching for hotel");
		System.out.println(" arg 1: " + this.hotelNames1);
		System.out.println("arg2 " + this.location);
		System.out.println("arg 3 :" + this.foodItems);
		for (int i = 0; i < hotelNames.length; i++) {
			String allHotel = hotelNames[i];
			System.out.println(allHotel);
		}

	}

	public String ownerName(String ownerName, String string) {
		System.out.println(" agr 1:" + ownerName);
		System.out.println("arg 2 :" + string);
		return ownerName;
	}

	public String[] getHotelNames() {
		return hotelNames1;
	}

	public void setHotelNames(String[] hotelNames) {
		this.hotelNames1 = hotelNames;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getHoteltype() {
		return hoteltype;
	}

	public void setHoteltype(String hoteltype) {
		this.hoteltype = hoteltype;
	}

	public boolean isService() {
		return service;
	}

	public void setService(boolean service) {
		this.service = service;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

}
