import java.awt.*;
import java.awt.event.*;

class MenuTest extends Frame implements ActionListener
{
	MenuBar mb = new MenuBar();
	Menu file = new Menu("File");
	Menu edit = new Menu("Edit");
	Menu help = new Menu("Help");
	Menu op = new Menu("Options");

	MenuItem n = new MenuItem("New");
	MenuItem open = new MenuItem("Open");
	MenuItem save = new MenuItem("Save");
	MenuItem exit = new MenuItem("Exit");
	MenuItem cut = new MenuItem("Cut");
	MenuItem copy = new MenuItem("Copy");
	MenuItem paste = new MenuItem("Paste");
	MenuItem about = new MenuItem("About");
	MenuItem read = new MenuItem("Read");
	MenuItem write = new MenuItem("Write");

	MenuTest()
	 {
		 setSize(600,500);
		 setTitle("Menu Test");

		 file.add(n);
		 file.add(open);
		 file.add(save);
		 file.add(op);
		 file.add(exit);
		 op.add(read);
		 op.add(write);


		 edit.add(cut);
		 edit.add(copy);
		 edit.add(paste);

		 help.add(about);

		 mb.add(file);
		 mb.add(edit);
		 mb.add(help);

		setMenuBar(mb);

		n.addActionListener(this);
		 open.addActionListener(this);
		 exit.addActionListener(this);
		 save.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent e)
	 {
		 String s = e.getActionCommand();
		 if(s.equals("Exit"))
		 	System.exit(0);
		 else
		 	 setTitle(s+" Menu Item is selected");
	 }
	 public static void main(String args[])
	 {
		 MenuTest f = new MenuTest();
		 f.setVisible(true);
	 }
 }


