

import java.awt.event.*;
import java.awt.*;

class KeyTypeTest extends Frame
{
	String str="";

	KeyTypeTest()
	{
		setTitle("Key Event Test");
		setSize(600,500);

		addKeyListener(new KeyHandler());
	}
	class KeyHandler extends KeyAdapter
	{
		public void keyTyped(KeyEvent e)
		{
			char ch = e.getKeyChar();
			str= str+ch;
			Graphics g = getGraphics();
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.drawString(str,50,100);
		}
	}

	public static void main(String args[])
	{
		KeyTypeTest f = new KeyTypeTest();
		f.setVisible(true);
	}
}


