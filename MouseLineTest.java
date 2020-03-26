import java.awt.*;
import java.awt.event.*;
class MouseLineTest extends Frame
{
	int x1,y1,x2,y2;
	MouseLineTest()
	{
		setSize(600,500);
		setTitle("mouse test");
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}
	class MouseHandler extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			x1 = e.getX();
			y1=e.getY();
		}
	}
	class MouseMotionHandler extends MouseMotionAdapter
	{
		public void mouseDragged(MouseEvent e)
		{
			x2 = e.getX();
			y2 = e.getY();
			repaint();
		}
	}
	public void paint(Graphics g)
	{
			g.drawLine(x1,y1,x2,y2);
	}
	public static void main(String args[])
	{
			MouseLineTest f = new MouseLineTest();
			f.setVisible(true);
	}
}




















































/*class DrawPanel extends JPanel
{
			int x1,y1,x2,y2;
			DrawPanel()
			{
				MouseHandler handler1 = new MouseHandler();
				addMouseListener(handler1);

				MouseMotionHandler handler2 = new MouseMotionHandler();
				addMouseMotionListener(handler2);
				setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

			}
			class MouseHandler extends MouseAdapter
			{
				public void mousePressed(MouseEvent e)
				{
					x1=e.getX();
					y1=e.getY();
				}
			}
			class MouseMotionHandler extends MouseMotionAdapter
			{
					public void mouseDragged(MouseEvent e)
					{
						x2=e.getX();
						y2=e.getY();
						repaint();
					}
			}
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawLine(x1,y1,x2,y2);

			}
	}*/
