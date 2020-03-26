import java.awt.*;
import java.awt.event.*;
class MouseNoClickTest extends Frame
{
	int x,y;
	MouseNoClickTest()
	{
		setSize(600,500);
		setTitle("Mouse Test");
		addMouseListener(new MouseHandler());
	}
	class MouseHandler extends MouseAdapter
	{
			public void mouseClicked(MouseEvent e)
			{
				int c = e.getClickCount();
				x=e.getX();
				y=e.getY();
				Graphics g = getGraphics();

				if(c==1)
					g.drawRect(x,y,30,30);

				if(c==2)
				{
					g.setColor(Color.red);
					g.fillRect(x,y,30,30);
				}
			}
	}
	public static void main(String args[])
	{
			MouseNoClickTest f = new MouseNoClickTest();
			f.setVisible(true);
	}
}

