import java.awt.*;

class GridTest extends Frame
{
	GridTest()
	{
		setSize(400,300);
		setTitle("Grid Layout Test");
		setLayout(new GridLayout(3,4));

		for(int i=1;i<=12;i++)
		{
			Button b = new Button("Button "+i);
			add(b);
		}
	}
	public static void main(String args[])
	{
		GridTest f = new GridTest();
		f.setVisible(true);
	}
}

