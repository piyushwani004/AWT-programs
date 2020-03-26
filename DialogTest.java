import java.awt.*;
import java.awt.event.*;

class DialogTest extends Frame implements ActionListener
{
	DialogTest()
	{
		setSize(600,500);
		setTitle("My App");

		MenuBar mb = new MenuBar();
		Menu help = new Menu("Help");
		MenuItem about = new MenuItem("About");

		help.add(about);
		mb.add(help);
		setMenuBar(mb);
		about.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		AboutDialog dlg = new AboutDialog(this);
		dlg.setVisible(true);
	}
	public static void main(String args[])
	{
		DialogTest f = new DialogTest();
		f.setVisible(true);
	}
}	//end of frame class

class AboutDialog extends Dialog
{
	AboutDialog(Frame parent)
	{
		super(parent,"About",false);
		setSize(300,200);
		setLocation(150,150);
		Label label = new Label("Software by Info Planet",Label.CENTER);
		add(label);

		Button b = new Button("Ok");
		add(b,"South");
		b.addActionListener( new ActionListener()
											{
												public void actionPerformed(ActionEvent e)
												{
													setVisible(false);
												}
											});
    }
}// end of dialog class


