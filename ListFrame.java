import java.awt.*;
import java.awt.event.*;

class ListFrame extends Frame implements ItemListener
{
	List list = new List(7,true);
	Label label = new Label("         ",Label.CENTER);

	ListFrame()
	{
		setSize(600,500);
		setTitle("Choice Test");

		String items[]={"KB","MB","PD","CPU","RAM",
		                                        "HDD","Printer","SMPS","MOUSE"};

		for(int i=0;i<items.length;i++)
		list.add(items[i]);


		Panel p = new Panel();
		p.add(list);
		list.addItemListener(this);

		add(label,"North");
		add(p);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String[] s = list.getSelectedItems();
		String t = "Selected Items are ";
		for(int i=0;i<s.length;i++)
		     t=t+" "+s[i];

		label.setText(t);
	}
	public static void main(String args[])
	{
		ListFrame f = new ListFrame();
		f.setVisible(true);
	}
}

