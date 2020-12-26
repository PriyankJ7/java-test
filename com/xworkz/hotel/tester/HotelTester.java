package com.xworkz.hotel.tester;
import com.xworkz.hotel.*;
import com.xworkz.hotel.constants.Locations;


public class HotelTester {

	public static void main(String[] args) {
		String[] foods= {"Puri","rice","Roti_Lunch"};
		
		String[] hotelNames= {"Sri ram hotel","Amma hotel","Mani Uta"};
		
		Hotel hotel=new Hotel(hotelNames,"Mr Ram","veg" ,false,foods);
		
		System.out.println(hotel.getHotelNames());
		System.out.println(hotel.getOwnerName());
		System.out.println(hotel.getHoteltype());
		System.out.println(hotel.getLocation());
		System.out.println(hotel.getFoodItems());
		
		
		hotel.searchByName("Sri ram hotel");
		hotel.displayHotel("Sri ram hotel",Locations.HUBLI,  foods);
		
		hotel.ownerName("Raagu", "Mani Uta");
		System.out.println(hotel.getOwnerName());
		System.out.println(hotel.getHotelNames());
		
	}

	
	

	

}
