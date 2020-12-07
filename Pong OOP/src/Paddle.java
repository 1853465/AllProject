import java.awt.Graphics;

public class Paddle {
	//attributes
	private int width, height;
	private int x, y;
	private int velocity = 0;
	
	//paddle starting location
	public Paddle(int newX, int newY) {
		x = newX;
		y = newY;
		width = 40;
		height = 200;
	}
	
	//getters
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//setters
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public void setX(int newX) {
		x = newX;
		
	}
	public void setY(int newY) {
		y = newY;
	}
	
	//movement
	public void moveUp() {
		velocity = -10;
	}
	public void moveDown() {
		velocity = 10;
	}
	public void stop() {
		velocity = 0;
	}
	
	//paint
	public void paint(Graphics g) {
		y += velocity;
		g.fillRect(x, y, width, height);
	}
	
	

}
