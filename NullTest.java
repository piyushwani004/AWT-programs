import java.awt.*;
class NullTest extends Frame
{
	NullTest()
	{
		setSize(600,500);
		setTitle("Null Test ");

		setLayout(null);

		Button b1 = new Button("Ok");
		Button b2 = new Button("Cancel");

		b1.setBounds(100,100,80,30);
		b2.setBounds(200,100,80,30);
		add(b1);
		add(b2);
	}
	public static void main(String [] args)
	{
		NullTest f = new NullTest();
		f.setVisible(true);
	}
}


