import java.awt.*;
import java.awt.event.*;

class ScrollBarTest extends Frame implements AdjustmentListener
{
	Scrollbar red = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
	Scrollbar green = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
	Scrollbar blue = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);

	Panel cp = new Panel();

	ScrollBarTest()
	{
		setSize(600,500);
		setTitle("MyFrame");

		add(cp);

		Panel p = new Panel();
		p.setLayout(new GridLayout(3,2));
		p.add(new Label("Red:",Label.RIGHT));
		p.add(red);
		p.add(new Label("Green:",Label.RIGHT));
		p.add(green);
		p.add(new Label("Blue:",Label.RIGHT));
		p.add(blue);
		add(p,"South");

		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		cp.setBackground(Color.black);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int r= red.getValue();
		int g= green.getValue();
		int b = blue.getValue();
		cp.setBackground(new Color(r,g,b));
		String str="( "+r+","+g+","+b+")";
		setTitle(str);
	}
	public static void main(String args[])
	{
			ScrollBarTest f = new ScrollBarTest();
			f.setVisible(true);
	}
}