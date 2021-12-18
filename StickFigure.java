import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JComponent;
/***
 * 
 * @author Leo Li
 * Stick Figure Component
 *
 */
public class StickFigure extends JComponent
{	
	public StickFigure(int x, int y)
	{
		this.setSize(new Dimension(51,121));
		this.setLocation(x,y);
	}
	
	public void paintComponent(Graphics g)
	{		
		Graphics2D g2D = (Graphics2D) g;
		
		//Head
		g2D.setColor(Color.green);
		g2D.fillOval(15, 0, 20, 25);
		
		//Arms
		g2D.setColor(Color.green);
		g2D.fillRect(0, 24, 50, 15); 
		
		//Body
		g2D.setColor(Color.green);
		g2D.fillRect(17, 38, 15, 30);
		
		//Leg 1
		g2D.setColor(Color.green);
		g2D.fillRect(8, 65, 15, 50);  
		
		//Leg 2
		g2D.setColor(Color.green);
		g2D.fillRect(29, 65, 15, 50);	  


	}
}
