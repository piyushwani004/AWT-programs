import java.awt.*;
import java.awt.event.*;

class ButtonTest1 extends Frame implements ActionListener
{
	Button b = new Button("Ok");
	ButtonTest1()
	{
			setSize(600,500);
			setTitle("Button Test");
			setLayout(new FlowLayout());
			add(b);

			b.addActionListener( this);
	} // end of constructor
	public void actionPerformed(ActionEvent e)
	{
			System.out.println("Hello World");
	}

	public static void main(String args[])
	{
		ButtonTest1 f = new ButtonTest1();
		f.setVisible(true);
	}
}



