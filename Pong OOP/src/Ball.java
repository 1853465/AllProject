import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	//attributes
	private int width;
	private int x, y;
	private int vx, vy; //movement
	
	public Ball(int newX, int newY) {
		width = 50;
		x = newX;
		y = newY;
		vx = (int)(Math.random()*(2)+3);
		vy = (int)(Math.random()*(2)+3);
	}
	//getters
	public int getWidth() {
		return width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//setters
	public void setRadius(int newWidth) {
		width = newWidth;
	}
	public void setX(int newX) {
		x = newX;
		
	}
	public void setY(int newY) {
		y = newY;
	}
	public void setVX(int newVX) {
		vx = newVX;
	}
	public void setVY(int newVY) {
		vy = newVY;
	}
	
	public void paint(Graphics g) {
		x += vx;
		y += vy;
		
		if(y<=0 || y>= 550) {
			vy*=-1;
		}
		if(x<=0 || x>= 750) {
			vx*=-1;
		}
		
		g.fillOval(x, y, width, width);
	}
	
	public boolean collide(Paddle thePad) {
		//ball as rectangel
		Rectangle r1 = new Rectangle(x,y,width,width);
		//paddle
		Rectangle r2 = new Rectangle(thePad.getX(),
									 thePad.getY(),
									 thePad.getWidth(),
									 thePad.getHeight()
									 );
		
		if(r1.intersects(r2)) {
			vx *= -1;
		}
		
		return r1.intersects(r2);
		
	}
	public void reset() {
		x = 300;
		y = 250;
		if(Math.random()<.5) {
			vx = (int)(Math.random()*(2)-4);
		}
		else if(Math.random()<.5) {
			vy = (int)(Math.random()*(2)-4);
		}
		else {
			vx = (int)(Math.random()*(2)+3);
			vy = (int)(Math.random()*(2)+3);
		}
	}

}
