package marieetraphael.utils;

public class Resort {
	String name;
	String city;
	int price;
	String details;
	String availability;
	int travelTimeInMinutes;
	
	private Resort() {
		super();
	}
	
	public static Resort of(String name, String city, int price, String details, String availabilty, int travelTimeInMinutes) {
		Resort instance = new Resort();
		instance.name = name;
		instance.city = city;
		instance.price = price;
		instance.details = details;
		instance.availability = availabilty;
		instance.travelTimeInMinutes = travelTimeInMinutes;
		return instance;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public int getPrice() {
		return price;
	}

	public String getDetails() {
		return details;
	}

	public String getAvailability() {
		return availability;
	}

	public int getTravelTimeInMinutes() {
		return travelTimeInMinutes;
	}
}
