import java.awt.*;
import java.awt.event.*;

class ChoiceTest extends Frame implements ItemListener
{
	Choice ch = new Choice();
	Label label = new Label("         ",Label.CENTER);

	ChoiceTest()
	{
		setSize(600,500);
		setTitle("Choice Test");

		String items[]={"KB","MB","PD","CPU",
		                                       "RAM","HDD","Printer","SMPS","MOUSE"};

		for(int i=0;i<items.length;i++)
		   ch.add(items[i]);


		Panel p = new Panel();
		p.add(ch);
		ch.addItemListener(this);

		add(label,"North");
		add(p);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String s = ch.getSelectedItem();
		label.setText("Selected Item is "+s);
	}
	public static void main(String args[])
	{
		ChoiceTest f = new ChoiceTest();
		f.setVisible(true);
	}
}

