import java.awt.*;
import java.awt.event.*;

class PopupMenuFrame extends Frame implements ActionListener
{
	PopupMenu popup = new PopupMenu();
	MenuItem red = new MenuItem("Red");
	MenuItem green = new MenuItem("Green");
	MenuItem blue = new MenuItem("Blue");

	PopupMenuFrame()
	{
		setSize(600,500);
		setTitle("Popup Test");

		popup.add(red);
		popup.add(green);
		popup.add(blue);

		add(popup);

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);

		addMouseListener( new MouseHandler());
	}

	class MouseHandler extends MouseAdapter
	{
		public void mouseReleased(MouseEvent e)
		{
			if(e.isPopupTrigger())
				popup.show(e.getComponent(),e.getX(), e.getY());
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Red"))
			setBackground(Color.red);
		else
		if(s.equals("Green"))
			setBackground(Color.green);
		else
			setBackground(Color.blue);
	}
	public static void main(String [] args)
	{
		PopupMenuFrame f = new PopupMenuFrame();
		f.setVisible(true);
	}
}








