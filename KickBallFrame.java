import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
/***
 * 
 * @author Leo Li
 * Kick Ball Project
 *
 */
public class KickBallFrame extends JFrame
{
	public KickBallFrame()
	{
		this.setBounds(100,100,600,400);
		this.setLayout(null);
		setTitle("Kick Ball Frame");
		Ball ball = new Ball(300,200);
		add(ball);
		
		StickFigure man = new StickFigure(0,0);
		add(man);
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// Moving Up
				if(e.getKeyCode() == e.VK_W)
				{
					// Ensuring Stick Figure does not leave top of screen
					if (man.getY()-5 < 0)
						return;
					
					man.setLocation(man.getX(), man.getY()-5);
					
					if(collision())
					{
						ball.setLocation(ball.getX(),ball.getY()-5);
					}
						
				}
				// Moving Left
				if(e.getKeyCode() == e.VK_A)
				{
					// Ensuring Stick Figure does not leave left of screen
					if (man.getX()-5 < 0)
						return;
	
					man.setLocation(man.getX()-5, man.getY());
					if(collision())
					{
						ball.setLocation(ball.getX()-5,ball.getY());
					}
		
					
				}
				// Moving Down
				if(e.getKeyCode() == e.VK_S)
				{
					// Ensuring Stick Figure does not leave bottom of screen
					if(man.getY()+man.getHeight()+5>getHeight()-getInsets().top-getInsets().bottom)
						return;
					
					man.setLocation(man.getX(), man.getY()+5);
					if(collision())
					{
						ball.setLocation(ball.getX(),ball.getY()+5);
					}
			
				}
				// Moving Right
				if(e.getKeyCode() == e.VK_D)
				{
					// Ensuring Stick Figure does not leave right of screen
					if(man.getX()+man.getWidth()+5 > getWidth()-getInsets().right-getInsets().left)
						return;
					
					man.setLocation(man.getX()+5, man.getY());
					if(collision())
					{
						ball.setLocation(ball.getX()+5,ball.getY());
					}
		
				}
				
			}
			
			//Method checking if Stick Figure inside bounds of Ball
			public boolean collision()
			{
				Rectangle manRectangle = man.getBounds();
				Rectangle ballRectangle = ball.getBounds();
				
				if(manRectangle.intersects(ballRectangle))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		//this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	


	public static void main(String[] args) {
		new KickBallFrame();

	}

}
