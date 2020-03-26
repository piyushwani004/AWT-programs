import java.awt.*;
import java.awt.event.*;
class KeyDrawTest extends Frame
{
	int code;
	KeyDrawTest()
	{
		setSize(600,500);
		setTitle("Key Test");
		addKeyListener( new KeyHandler());
	}
	class KeyHandler extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			code=e.getKeyCode();
			repaint();
		}
	}
	public void paint(Graphics g)
	{
				if(code==KeyEvent.VK_R)
					g.drawRect(50,50,300,200);
				else
				if(code==KeyEvent.VK_C)
				 	g.drawOval(50,50,300,300);
				else
				if(code==KeyEvent.VK_L)
					g.drawLine(50,50,300,200);
	}

	public static void main(String args[])
	{
		KeyDrawTest f = new KeyDrawTest();
		f.setVisible(true);
	}
} // end of frame class



