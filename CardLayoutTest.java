import java.awt.*;
import java.awt.event.*;
public class CardLayoutTest extends Frame implements ActionListener
{
	Button n = new Button("Next");
	Button p = new Button("Previous");
	Button f = new Button("First");
	Button l = new Button("Last");

	Panel center = new Panel();
	Panel south = new Panel();
	CardLayout cl = new CardLayout( );
	public CardLayoutTest ()
	{
		setSize(600,500);
		setTitle("CardLayout");
		south.add(f);
		south.add(p);
		south.add(n);
		south.add(l);

		n.addActionListener(this);
		p.addActionListener(this);
		f.addActionListener(this);
		l.addActionListener(this);
		add(south,"South");

		center.setLayout (cl);
		Panel pA = new Panel();
		pA.setBackground(Color.red);
		pA.add(new Button("Info Planet"));

		Panel pB = new Panel();
		pB.setBackground(Color.blue);

		Panel pC = new Panel ();
		pC.setBackground(Color.green);

		Panel pD = new Panel ();
		pD.setBackground(Color.pink);


		center.add ("One", pA);
		center.add ("Two", pB);
		center.add ("Three", pC);
		center.add("Four",pD);

//		cl.show(center,"Three");
		add(center);
}
public void actionPerformed(ActionEvent e)
{
	String s = e.getActionCommand();
	if(s.equals("First"))
		cl.first(center);
	else
		if(s.equals("Next"))
			cl.next(center);
		else
			if(s.equals("Last"))
				cl.last(center);
			else
				cl.previous(center);
}
public static void main(String args[])
{
	CardLayoutTest f = new CardLayoutTest();
	f.setVisible(true);
}
}
