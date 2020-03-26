import java.awt.*;
import java.awt.event.*;

class MouseLeftRightTest extends Frame
{
	MouseLeftRightTest()
	{
		setSize(600,500);
		setTitle("Mouse Test");
		addMouseListener(new MouseHandler());
	}
	class MouseHandler extends MouseAdapter
	{
			public void mouseClicked(MouseEvent e)
			{
				int x=e.getX();
				int y=e.getY();
				Graphics g = getGraphics();

				if((e.getModifiers() & InputEvent.BUTTON1_MASK)!=0)  //left click
					g.drawRect(x,y,30,30);

				if((e.getModifiers() & InputEvent.BUTTON3_MASK)!=0) // right click
					g.drawOval(x,y,30,30);
			}
	}
	public static void main(String args[])
	{
			MouseLeftRightTest f = new MouseLeftRightTest();
			f.setVisible(true);
	}
}

