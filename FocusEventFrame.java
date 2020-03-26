import java.awt.*;
import java.awt.event.*;


class FocusEventFrame extends Frame
{
	Button b = new Button("Ok");
	Button  c = new Button("cancel");
	FocusEventFrame()
	{
		setSize(600,500);
		Panel p = new Panel();
		p.add(b);
		p.add(c);
		add(p);

		FocusHandler handler = new FocusHandler();

		c.addFocusListener(handler);
	}
	class FocusHandler implements FocusListener
	{
		public void focusGained(FocusEvent e)
		{
			Button  x = (Button)e.getComponent();
			x.setBackground(Color.red);

			System.out.println("Focus Gained");
		}
		public void focusLost(FocusEvent e)
		{
			Button  x = (Button)e.getComponent();
			x.setBackground(Color.green);

			System.out.println("Lost");
		}
	}

	public static void main(String args[])
	{
		FocusEventFrame f = new FocusEventFrame();
		f.setVisible(true);
	}
}

