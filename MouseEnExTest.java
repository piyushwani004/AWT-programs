import java.awt.*;
import java.awt.event.*;
class MouseEnExTest extends Frame
{
	Button b = new Button("Info Planet");

	MouseEnExTest()
	{
		setSize(600,500);
		setTitle("mouse test");
		setLayout( new FlowLayout());
		add(b);

		b.addMouseListener(new MouseHandler());

	}
	class MouseHandler extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			b.setBackground(Color.green);
		}
		public void mouseExited(MouseEvent e)
		{
			b.setBackground(Color.red);
		}
	}
	public static void main(String args[])
	{
			MouseEnExTest f = new MouseEnExTest();
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
