
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("unused")
public class DrawingLab extends JPanel  {

	public void paint(Graphics g) 	
	{
/*
		g.drawRect(10,10,780,580);
		int x1, x2, y1, y2;
		for(x1 = 10, x2=790, y1=590, y2=590; x1<=780 && y2>=10; x1+=14, y2-=10) {
			g.drawLine(x1, y1, x2, y2);
		}
		for(x1 = 790, x2=10, y1=10, y2=10; x1>=10 && y2<=590; y2+=10, x1-=14) {
			g.drawLine(x1, y1, x2, y2);
		}	
		for(x1=790, x2=10, y1=590, y2=590; y2>=10 && x1>=10; x1-=14, y2-=10) {
			g.drawLine(x1, y1, x2, y2);
		}
		for(x1=10, x2=790, y1=10, y2=10; y2<=590 && x1<=790; x1+=14, y2+=10) {
			g.drawLine(x1, y1, x2, y2);
		}
		*/
		
	 	// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);

		//(int)(Math.random()*(range+1)+min);	
		
		// Draw Random Lines
		int counterLine = 0;
		while(counterLine < 100) {
			//generate color hues
			int red = (int)(Math.random()*(256));
			int green = (int)(Math.random()*(256));
			int blue = (int)(Math.random()*(256));
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			//drawing lines
			int x1 = (int)(Math.random()*(391)+10);
			int y1 = (int)(Math.random()*(291)+10);
			int x2 = (int)(Math.random()*(391)+10);
			int y2 = (int)(Math.random()*(291)+10);
			g.drawLine(x1, y1, x2, y2);
			
			counterLine++;//increment counter
		}
		
		// Draw Random Squares
		int counterSquare = 0;
		while(counterSquare < 100) {
			//generate color hues
			int red = (int)(Math.random()*(256));
			int green = (int)(Math.random()*(256));
			int blue = (int)(Math.random()*(256));
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			//drawing squares
			int xSquare = (int)(Math.random()*(341)+400);
			int ySquare = (int)(Math.random()*(241)+10);
			g.fillRect(xSquare,ySquare,50,50);
			
			counterSquare++;//increment counter
		}
		
		// Draw Random Circles
		int counterCircle = 0;
		while(counterCircle < 100) {
			//generate color hues
			int red = (int)(Math.random()*(256));
			int green = (int)(Math.random()*(256));
			int blue = (int)(Math.random()*(256));
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			//drawing circles
			int radius = (int)(Math.random()*(201));
			int xCircle = (int)(Math.random()*(391-radius)+10);
			int yCircle = (int)(Math.random()*(291-radius)+300);
			g.drawOval(xCircle,yCircle,radius,radius);
			
			
			counterCircle++;//increment counter
		}
		// Draw 3-D Box
		g.setColor(Color.yellow);
		g.fillRect(500, 350, 100, 100);
		g.setColor(Color.red);
		g.fillRect(550,400,100,100);
		g.setColor(Color.blue);
		g.fillPolygon(new int[] {600,600,650}, new int[] {350,400,400},3);
		g.setColor(Color.green);
		g.fillRect(500, 400, 50, 50);
		g.fillPolygon(new int[] {500,500,550}, new int[] {350,400,400},3);
		g.fillPolygon(new int[] {500,550,550}, new int[] {450,450,500},3);
		

	}	

	// do not touch
	public DrawingLab() {
		JFrame frame = new JFrame("Loops");
		frame.setSize(870, 700);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
