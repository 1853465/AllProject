
public class Bicycle {

	//instance variables
	private double price;
	private String color;
	private int tireSize;
	
	public Bicycle() {
		price = 200.00;
		color = "blue";
		tireSize = 20;
	}
	
	public Bicycle(double initPrice, String initColor, int initTireSize) {
		price = initPrice;
		color = initColor;
		tireSize = initTireSize;
	}
	
}
