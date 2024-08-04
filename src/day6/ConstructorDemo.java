package day6;

public class ConstructorDemo {
	String name;
	String streetName;
	int houseNumber;
	String zipCode;
	
	public ConstructorDemo(String name, String streetName, int houseNumber, String zipCode) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
	}
	
	public string declareAddress() {
		return (name + "\n" + housenumber + ", " + streetName + "\n" + zipCode);
	}

}
