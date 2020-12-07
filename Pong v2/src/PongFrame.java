import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongFrame extends JPanel implements ActionListener{

	//practice declarations and assignments
	int ballx = 275;
	int bally = 150;
	int ballWidth = 30;
	int ballHeight = 30;
	
	int paddleLx = 0, paddleLy = 0; //left paddle
	int paddleRx = 535, paddleRy = 0; //right paddle
	int paddleWidth = 50, paddleHeight = 150; //paddle size
	//velocity variables
	int vx = 3;
	int vy = 2;
	
	public void paint(Graphics g) {
		   super.paintComponent(g); //do not remove
		   
		   //add code below
		   
		   // drawing ball
		   ballx = ballx + vx;//add vx to value of ballx
		   bally = bally + vy;
		   
		   g.setColor(Color.lightGray);
		   g.fillOval(ballx,bally, ballWidth,ballHeight);
		   
		   
		   
		   // drawing rectangles
		   g.setColor(Color.BLACK);
		   g.fillRect(paddleLx,paddleLy, paddleWidth,paddleHeight);//left paddle
		   g.fillRect(paddleRx,paddleRy, paddleWidth,paddleHeight);//right paddle
		   
	} //end of paint curly do not delete

	


	
	
	
	
	
	
	//do not touch
	public PongFrame(){
		JFrame frame = new JFrame("Pong");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);

		Timer t = new Timer(16, this);
		t.start();
		frame.setVisible(true);
	}//end of MainFrame




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	} //end of actionPerformed curly do not delete

} //end of class curly - do not delete
