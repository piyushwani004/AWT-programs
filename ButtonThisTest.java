import java.awt.*;
import java.awt.event.*;

class ButtonThisTest extends Frame implements ActionListener
{
	Button b = new Button("Ok");

	ButtonThisTest()
	{
		setSize(600,500);
		setTitle("Button Test");
		setLayout(new FlowLayout());
		add(b);

		b.addActionListener( this);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Hello ");
	}

	public static void main(String [] args)
	{
		ButtonThisTest f = new ButtonThisTest();
		f.setVisible(true);
	}
}

