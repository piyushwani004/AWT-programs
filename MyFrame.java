import java.awt.*;

class MyFrame extends Frame
{
	Button b1 = new Button("Ok");
	Button b2 = new Button("Cancel");
	Button b3 = new Button("Save");
	MyFrame()
	{
			setSize(600,500);
			setTitle("Button Test");
			add(b1,"North");
			add(b2,"Center");
			add(b3,"South");

	} // end of constructor



	public static void main(String args[])
	{
		MyFrame f = new MyFrame();
		f.setVisible(true);
	}
}



