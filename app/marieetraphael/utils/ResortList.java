package marieetraphael.utils;

import java.util.ArrayList;
import java.util.List;

public class ResortList {
	List<Resort> list;
	
	private ResortList() {
		super();
	}
	
	public static ResortList of() {
		ResortList instance = new ResortList();
		instance.list = new ArrayList<Resort>();
		return instance; 
	}

	public void add(String name, String city, int price, String details, String phoneNumber, String availabilty, int travelTimeInMinutes) {
		this.list.add(Resort.of(name, city, price, details, phoneNumber, availabilty, travelTimeInMinutes));
	}
	
	public List<Resort> getList() {
		return list;
	}
}
