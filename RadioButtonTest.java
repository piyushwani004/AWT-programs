import java.awt.*;
import java.awt.event.*;

class RadioButtonTest extends Frame implements ItemListener
{
	CheckboxGroup gp = new CheckboxGroup();

	Checkbox b1 = new Checkbox("10",gp,true);
	Checkbox b2 = new Checkbox("30",gp,false);
	Checkbox b3 = new Checkbox("50",gp,false);

	Label label = new Label("Info Planet",Label.CENTER);

	RadioButtonTest()
	{
		setSize(600,500);
		setTitle("Radio Test");

		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p,"South");
		add(label);

		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		int s=10;

		if(b2.getState())
		s=30;

		if(b3.getState())
		s=50;

		Font f = new Font("SanSerif", Font.PLAIN, s);
		label.setFont(f);
	}
	public static void main(String args[])
	{
		RadioButtonTest f = new RadioButtonTest();
		f.setVisible(true);
	}
}

