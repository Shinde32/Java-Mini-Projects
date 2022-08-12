import javax.swing.*;    
import java.awt.event.*; 
import java.awt.*;
 
public class MenubarP extends JFrame implements ActionListener{        
JMenuBar mb;    
JMenu home,staffR,studR,studLog,admLog,cont;     
MenubarP()
{       
	mb=new JMenuBar();
	mb.setBackground(Color.YELLOW);
	home=new JMenu("Home");
	staffR=new JMenu("Staff Registration");    
	studR=new JMenu("Students Registration");
	studLog=new JMenu("Students Login");
	admLog=new JMenu("Admin Login");
	cont=new JMenu("Contact Us");   
  
	mb.add(home);
	mb.add(staffR);
	mb.add(studR);
	mb.add(studLog);
	mb.add(admLog);
	mb.add(cont);

	home.addActionListener(this);    
	staffR.addActionListener(this);    
	studR.addActionListener(this);    
	studLog.addActionListener(this);    
	admLog.addActionListener(this);
	cont.addActionListener(this); 
 
	add(mb);  
	setJMenuBar(mb);     
	setSize(600,600);    
	setVisible(true);
}    
public void actionPerformed(ActionEvent ae)
{    
	if(ae.getSource()==home)
	{

	}	 
	else if(ae.getSource()==staffR)    	
	{
		
	}	    
	else if(ae.getSource()==studR)    
	{

	}   
	else if(ae.getSource()==studLog)
	{

	}  
	else if(ae.getSource()==admLog)
	{

	}
	else if(ae.getSource()==cont)
	{

	}
	else
	{

	}
}     
public static void main(String args[])
{    
    new MenubarP();    
}    
}    