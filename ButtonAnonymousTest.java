import java.awt.*;
import java.awt.event.*;

class ButtonAnonymousTest extends Frame
{
	Button b = new Button("Ok");

	ButtonAnonymousTest()
	{
		setSize(600,500);
		setTitle("Button Test");
		setLayout(new FlowLayout());
		add(b);

		b.addActionListener( new ActionListener()
											{
												public void actionPerformed(ActionEvent e)
												{
													System.out.println("Hello World");
												}
											});
	}

	public static void main(String [] args)
	{
		ButtonAnonymousTest f = new ButtonAnonymousTest();
		f.setVisible(true);
	}
}

