import java.awt.*;
import java.awt.event.*;

class CheckBoxTest extends Frame implements ItemListener
{
	Checkbox red = new Checkbox("Red",true);
	Checkbox green = new Checkbox("Green",true);
	Checkbox blue = new Checkbox("Blue",true);

	CheckBoxTest()
	{
		setSize(600,500);
		setTitle("Color Test");
		setLayout(new FlowLayout());

		add(red);
		add(green);
		add(blue);

		red.addItemListener(this);
		green.addItemListener(this);
		blue.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		int r=0, g=0, b=0;
		if(red.getState())
			r=255;
		if(green.getState())
			g=255;
		if(blue.getState())
			b=255;

		Color clr = new Color(r,g,b);
		setBackground(clr);
	}
	public static void main(String args[])
	{
		CheckBoxTest f = new CheckBoxTest();
		f.setVisible(true);
	}
}
