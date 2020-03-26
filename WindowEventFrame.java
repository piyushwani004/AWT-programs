import java.awt.*;
import java.awt.event.*;


class WindowEventFrame extends Frame
{
	WindowEventFrame()
	{
		setTitle("Window Test");
		setSize(600,500);
		addWindowListener(new WindowHandler());
	}
	class WindowHandler implements WindowListener
	{
		public void windowOpened(WindowEvent e)
		{
			System.out.println("Window opened");
		}
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing");
			dispose();
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
		public void windowClosed(WindowEvent e)
		{
			System.out.println("Window Closed");
		}
	}// end of  Window handler class
	public static void main(String args[])
	{
		WindowEventFrame f = new WindowEventFrame();
		f.setVisible(true);
	}
}


