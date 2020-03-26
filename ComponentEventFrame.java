import java.awt.*;
import java.awt.event.*;

class ComponentEventFrame extends Frame implements ActionListener
{
	Button b1 = new Button("Hide");
	Button b2 = new Button("Info Planet");

	ComponentEventFrame()
	{
		setSize(600,500);
		setLayout(new FlowLayout());


		add(b1);
		add(b2);

		b1.addActionListener(this);

		b2.addComponentListener(new ComponentAdapter()
								{
									public void componentShown(ComponentEvent e)
									{
										System.out.println("Component shown");
									}
									public void componentHidden(ComponentEvent e)
									{
										System.out.println("Component hidden");
									}
								});
	}
	public void actionPerformed(ActionEvent e)
	{

		String str = e.getActionCommand();
		if(str.equals("Hide"))
		{
			b2.setVisible(false);
			b1.setLabel("Show");
		}
			else
		{
			b2.setVisible(true);
						b1.setLabel("Hide");
					}
		}

	public static void main(String [] args)
	{
		ComponentEventFrame f = new ComponentEventFrame();
		f.setVisible(true);
	}
}
