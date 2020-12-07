import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Duck implements MouseListener{
	private int x = 100,y = 180;
	private int vx, vy;
	private Image img;
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	private boolean dead = false;

	public Duck() {
		img = getImage("d.png");
		vy = (int)(Math.random()*(8)-10);
		vx = ((int)(Math.random()*(5)+5));
		if(Math.random()<.5) {
			vx *= -1;
		}
		else{
			 vx *= 1;
		}
		init(x, y); 				//initialize the location of the image
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		y += vy;
		if(x<-50 || x>750) {
			vx*=-1;
		}
		x += vx;
		if((y<-100 || y>400)&&!(dead)) {
			vy*=-1;
		}
		tx.setToTranslation(x, y);

		g2.drawImage(img, tx, null);   
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Duck.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
	
	public boolean collision(int xClick, int yClick) {
		Rectangle duckHit = new Rectangle(x,y,150,150);{
			if(duckHit.contains(xClick-50, yClick-50)) {
				dead = true;
				vx=0;
				vy=8;
				return true;
			}
			else {
				return false;
			}
		}
	}
	public void reset() {	
		if(dead) {
			y = 180;
			x = (int)(Math.random()*(751));
			vy = (int)(Math.random()*(6)-10);
			vx = ((int)(Math.random()*(6)+5));
			tx.setToTranslation(x,y);
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ouch");
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
