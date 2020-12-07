import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
 
public class Pong extends JPanel implements ActionListener, KeyListener{
 
	//attributes for a Pong frame
	Paddle left = new Paddle(50, 100);
	Paddle right = new Paddle(700,250);
	Ball b = new Ball(300, 250);
	
	//score
	int score1 = 0;
	int score2 = 0;
 
	public void paint(Graphics g) {
		super.paintComponent(g); //ignore
		
		g.drawString(score1+" ", 150, 125);
		g.drawString(score2+" ",550, 125);
		
		
		left.paint(g);
		right.paint(g);
		b.paint(g);
 
	}
 
 
	/* update variables */
	/*
	 * update ball x and y here
	 * update all other variables as necessary
	 */
	public void update() {
		b.collide(left);
		b.collide(right);
		
		if(b.getX()<=0) {
			b.reset();
			score2 += 1;
		}
		else if(b.getX()>=750) {
			b.reset();
			score1 += 1;
		}
 
	}
 
 
	public static void main(String[] arg) {
		Pong p = new Pong();
	}
 
 
	Timer t = new Timer(16,this);
	//setup frame 
	JFrame f;
	public Pong() {
		//800x600 frame
		int width = 800;
		int height = 600;
 
		//setup frame
		f = new JFrame("P-OOP");
		f.setSize(width,height);		
		t.start();
		f.addKeyListener(this);
		f.add(this);
 
		//make frame visible
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		update();
	}
 
 
	@Override
	public void keyPressed(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
			case 38:
				//move right paddle up
				right.moveUp();
				System.out.println("case 38");
				break;
			case 40:
				//move right paddle down
				right.moveDown();
				System.out.println("case 40");
				break;
			case 87:
				//move left paddle up
				left.moveUp();
				System.out.println("case 87");
				break;
			case 83:
				//move left paddle down
				left.moveDown();
				System.out.println("case 83");
				break;
		}
	}
 
 
	@Override
	public void keyReleased(KeyEvent e) {
		left.stop();
		right.stop();
	}
 
 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
 
	}
 
 
}
 