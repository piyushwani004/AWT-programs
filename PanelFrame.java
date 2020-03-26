import java.awt.*;

class PanelFrame extends Frame
{
	PanelFrame()
	{
		setSize(600,500);
		setTitle("Panel Frame");

		Panel north = new Panel();
		north.add(new Button("Red"));
		north.add(new Button("Green"));
		north.add(new Button("Blue"));
		north.setBackground(Color.red);
		add(north,"North");

		Panel south = new Panel();
		south.add(new Button("Ok"));
		south.add(new Button("Cancel"));
		south.setBackground(Color.green);
		add(south,"South");
	}
	public static void main(String [] args)
	{
		PanelFrame f = new PanelFrame();
		f.setVisible(true);
	}
}


