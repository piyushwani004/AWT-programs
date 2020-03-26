import java.awt.*;
import java.awt.event.*;
import java.io.*;

class FileDialogFrame extends Frame implements ActionListener
{
	TextArea ta = new TextArea();

	MenuBar mb = new MenuBar();
	Menu file = new Menu("File");

	MenuItem n = new MenuItem("New");
	MenuItem open = new MenuItem("Open");
	MenuItem save = new MenuItem("Save");
	MenuItem exit = new MenuItem("Exit");

	FileDialogFrame()
	 {
		 setSize(600,500);
		 setTitle("Menu Test");
		add(ta);

		 file.add(n);
		 file.add(open);
		 file.add(save);

		 file.add(exit);

		 mb.add(file);

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
 		 if(s.equals("Open"))
 		 {
		 			 FileDialog dlg = new FileDialog(this);
		 			 dlg.setVisible(true);
		 			 setTitle("Selected file is "+dlg.getDirectory()+dlg.getFile());
		 			 try
		 			 {
						 BufferedReader fin = new BufferedReader(new FileReader(dlg.getDirectory()+dlg.getFile()));

						 ta.setText("");
						 String line = fin.readLine();
						 while(line!=null)
						 {
							 ta.append(line+"\n\r");
							 line = fin.readLine();
						 }
						 fin.close();
					 }
					 catch(Exception e1)
					 {
						 System.out.println(e1);
					 }

 		 }
 		 else
 		 if(s.equals("Save"))
 		 {
		 			 FileDialog dlg = new FileDialog(this,"Save",FileDialog.SAVE);
		 			 dlg.setVisible(true);
		 			 setTitle("Selected file is "+dlg.getDirectory()+"\\"+dlg.getFile());
 		 }
		 else
		 	 setTitle(s+" Menu Item is selected");
	 }
	 public static void main(String args[])
	 {
		 FileDialogFrame f = new FileDialogFrame();
		 f.setVisible(true);
	 }
 }


