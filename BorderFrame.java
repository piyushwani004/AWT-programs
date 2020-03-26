import java.awt.*;
class BorderFrame extends Frame
{
	Button b = new Button("Ok");
	BorderFrame()
	{
		setSize(600,500);
		setTitle("button Test");
		add(b);

	}
	public static void main(String args[])
	{
		BorderFrame f = new BorderFrame();
		f.setVisible(true);
	}
}


