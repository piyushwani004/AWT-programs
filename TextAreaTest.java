import java.awt.*;
import java.awt.event.*;

class TextAreaTest extends Frame
{

	TextArea ta = new TextArea();
	TextAreaTest()
	{
		setSize(600,500);
		add(ta);
	}
	public static void main(String [] args)
	{
		TextAreaTest f = new TextAreaTest();
		f.setVisible(true);
	}

}


