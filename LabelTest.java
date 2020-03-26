import java.awt.event.*;
import java.awt.*;

class LabelTest extends Frame implements ActionListener
{
	Label label = new Label("Info Planet");
	LabelTest()
	{
		setSize(600,500);

		label.setFont(new Font("Times New Roman",Font.BOLD,24));

		Panel p = new Panel();

		String s[] = {"Left","Center","Right"};

		for(int i=0;i<s.length;i++)
		{
				Button b = new Button(s[i]);
				p.add(b);
				b.addActionListener(this);
		}
		add(p);
		add(label,"North");
	}
	public void actionPerformed(ActionEvent e)
	{
			String s = e.getActionCommand();
			if(s.equals("Left"))
			label.setAlignment(Label.LEFT);
			else
			if(s.equals("Center"))
			label.setAlignment(Label.CENTER);
			else
			label.setAlignment(Label.RIGHT);
	}
	public static void main(String args[])
	{
		LabelTest f = new LabelTest();
		f.setVisible(true);
	}
}



