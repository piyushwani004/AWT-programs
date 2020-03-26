
import java.awt.*;
import java.awt.event.*;

class ButtonColorFrame extends Frame implements ActionListener
{
	Button red = new Button("Red");
	Button green = new Button("Green");
	Button blue = new Button("Blue");

	ButtonColorFrame()
	{
			setSize(600,500);
			setTitle("Button Test");
			setLayout(new FlowLayout());
			add(red);
			add(green);
			add(blue);

			red.addActionListener(this);
			green.addActionListener(this);
			blue.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Red"))
			setBackground(Color.red);
		else
		if(str.equals("Green"))
			setBackground(Color.green);
		else
			setBackground(Color.blue);
	}
	public static void main(String args[])
	{
		ButtonColorFrame f = new ButtonColorFrame();
		f.setVisible(true);
	}
}


