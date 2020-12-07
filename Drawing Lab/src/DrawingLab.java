
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

	public void paint(Graphics g) {
		//draw cube
		g.drawRect(50, 50, 250, 250);
		g.drawRect(125, 125, 250, 250);
		g.drawLine(50, 50, 125, 125);
		g.drawLine(50, 300, 125, 375);
		g.drawLine(300, 50, 375, 125);
		g.drawLine(300, 300, 375, 375);
		
		//draw sphere
		g.drawOval(500, 75, 250, 250);
		g.drawOval(500, 175, 250, 50);
		g.drawOval(500, 137, 250, 125);
		g.drawOval(500, 100, 250, 200);
		g.drawOval(600, 75, 50, 250);
		g.drawOval(562, 75, 125, 250);
		g.drawOval(525, 75, 200, 250);
		
		//draw inscribed triangle
		g.drawOval(600,400, 200,200);
		g.drawOval(640, 475, 75, 75);
		
	
		//draw pacman flower
		g.setColor(Color.black);
		g.fillArc(450, 400, 75, 75,125,290);
		g.fillArc(450, 500, 75, 75,305,290);
		g.fillArc(500, 450, 75, 75,35,290);
		g.fillArc(400, 450, 75, 75,215,290);
		
		//draw APCS
		g.setColor(Color.black);
		//A
		g.fillRect(50, 450, 25, 150);
		g.fillRect(50, 450, 75, 25);
		g.fillRect(100, 450, 25, 150);
		g.fillRect(50, 500, 75, 25);
		//P
		g.fillRect(135, 450, 25, 150);
		g.fillRect(135, 450, 75, 25);
		g.fillRect(135, 500, 75, 25);
		g.fillRect(185, 450, 25, 50);
		//C
		g.fillRect(220, 450, 25, 150);
		g.fillRect(220, 450, 75, 25);
		g.fillRect(220, 575, 75, 25);
		//S
		g.fillRect(305, 450, 75, 25);
		g.fillRect(305, 450, 25, 75);
		g.fillRect(305, 512, 75, 25);
		g.fillRect(355, 512, 25, 75);
		g.fillRect(305, 575, 75, 25);
		
		/*
		//draw head
		g.setColor(new Color(76,0,153));
		g.fillOval(170, 190, 150, 150);
		g.fillOval(515, 190, 150, 150);
		g.setColor(Color.gray);
		g.fillRect(240, 150, 350, 300);
		//antennae
		g.setColor(Color.black);
		g.fillRect(365,75,2,75);
		g.fillRect(440, 105, 2, 45);
		g.fillRect(440, 105, 30, 2);
		g.setColor(new Color(109,150,243));
		g.fillOval(340, 45, 50, 50);
		g.fillOval(465, 80,50,50);
		//draw eyes
		g.setColor(Color.white);
		g.fillOval(310,220,85,85);
		g.fillOval(420,220,85,85);
		g.setColor(new Color(0,0,102));//left
		g.fillOval(315, 225, 75, 75);
		g.setColor(new Color(0,153,153));//right
		g.fillOval(425, 225, 75, 75);
		//pupils
		g.setColor(Color.black);
		g.fillOval(340, 260, 25, 25);
		g.setColor(Color.black);
		g.fillOval(440, 240, 25, 25);
		g.setColor(new Color(204,153,255));
		g.fillOval(350, 270, 10, 10);
		g.fillOval(445, 245, 10, 10);
		//draw mouth
		g.setColor(Color.black);
		g.fillRect(440, 350, 50, 25);
		//wings
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(40,60, 175,30);
		g.fillRect(90,90,125,30);
		g.fillRect(115, 135, 100, 30);
		g.fillRect(615, 60, 175, 30);
		g.fillRect(615, 90, 125, 30);
		g.fillRect(615,135,100,30);
		*/
		
	}

	// do not touch
	public DrawingLab() {
		JFrame frame = new JFrame("Loops");
		frame.setSize(820, 680);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	} // end of MainFrame



} // end of class curly - do not delete
