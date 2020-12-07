
public class Rectangle {
	private int width;
	private int height;
	
	
	public Rectangle(int w, int h) {
		//correct the constructor so that it works correctly
		//why does this not work?
		width = w;
		height = h;
	}
	
	/* complete the method so that it returns the area of the Rectangle*/
	public double getArea() {
		return width*height;//to be completed by student
	}
	
	/* complete the method isSquare which returns true if the Rectangle
	 * is actually a square, false otherwise
	 */
	public boolean isSquare() {
		return width==height;
	}
}
