
public class Car {	//class header
	
	//attributes (instance variables)
	private String color;
	private double price;
	
	//constructors
	public Car() { //default-constructor (no parameters)
		//initialize instance variables
		color = "black";
		price = 200000.00;
	}
	//constructr that needs information from a user
	public Car(String paramColor, double paramPrice) {
		color = paramColor; //assign attributes t input values(parameters)
		price = paramPrice;
	}
	//write a constructor that allows a user to create a Car object with a given price but no color
	public Car(double paramPrice) {
		price = paramPrice;
	}
	
}
