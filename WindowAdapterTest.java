
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class WindowAdapterTest extends Frame
{
	WindowAdapterTest()
	{
		setTitle("Window Test");
		setSize(600,500);
		addWindowListener( new WindowHandler());
	}
	class WindowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			JOptionPane.showMessageDialog(null,"Save File ?");
			dispose();
		}
	}// end of  Window handler class
	public static void main(String args[])
	{
		WindowAdapterTest f = new WindowAdapterTest();
		f.setVisible(true);
	}
}



