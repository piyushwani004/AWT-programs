
import java.awt.*;
import java.awt.event.*;

class WindowListenerTest extends Frame
{
	WindowListenerTest()
	{
		setSize(600,500);
		setTitle("WindowEvent Test");
		addWindowListener( new WindowHandler());
	}
	class WindowHandler implements WindowListener
	{
		public void windowOpened(WindowEvent e) { }

		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing");

			System.exit(0);
		}
		public void windowClosed(WindowEvent e)
		{
			System.out.println("Window Closed");

		}
		public void windowActivated(WindowEvent e)
		{
			System.out.println("Window Activated");
		}
		public void windowDeactivated(WindowEvent e)
		{
			System.out.println("Window Deactivated");
		}
		public void windowIconified(WindowEvent e)
		{
			System.out.println("Window Iconified");
		}
		public void windowDeiconified(WindowEvent e)
		{
			System.out.println("Window Deiconified");
		}

	}// end of WindowHandler class
	public static void main(String [] args)
	{
		WindowListenerTest f = new WindowListenerTest();
		 f.setVisible(true);
	}
}// End of Application class


