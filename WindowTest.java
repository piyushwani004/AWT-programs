import java.awt.*;
import java.awt.event.*;
class WindowTest extends Frame
{
	WindowTest()
	{
		setTitle("adf");
		setSize(600,500);

		addWindowListener(new WindowHandler());
	}
	class WindowHandler extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}// end of  Window handler class
	public static void main(String args[])
	{
		WindowTest f = new WindowTest();
		f.setVisible(true);
	}
}


