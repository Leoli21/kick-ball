import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
/***
 * 
 * @author Leo Li
 * Ball Component
 *
 */
public class Ball extends JComponent
{
	private Ellipse2D.Double circle = new Ellipse2D.Double(0,0,15,15);
	
	public Ball(int x, int y)
	{
		this.setSize(new Dimension(16,16));
		this.setLocation(x,y);
	}


	public void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.yellow);
		g2D.fill(circle);
		g2D.setColor(Color.black);
		g2D.draw(circle);
	}
}
