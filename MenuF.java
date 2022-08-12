import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


public class MenuF extends JFrame{
	Image img;
	MenuF(String title){
		super(title);
		
		setLayout(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		c.fill= GridBagConstraints.HORIZONTAL;	
		c.gridx=0;
		c.gridy=0;
		c.insets= new Insets(10,0,0,0);
		JLabel l= new JLabel(new ImageIcon("C:\\Users\\PADDY SHINDE\\Downloads\\vjti.jpg"));
		add(l,c);
		JLabel l2= new JLabel("VEERMATA JIJABAI ");
		add(l2);
		l2.setFont(new Font("TimesRoman",Font.BOLD,18));
		l2.setForeground(Color.BLUE);
		JLabel l3= new JLabel("TECHNOLOGICAL INSTITUTE");
		add(l3);
		l3.setForeground(Color.BLUE);
		l3.setFont(new Font("TimesRoman",Font.BOLD,18));
		c.gridx=3;
		c.gridy=0;
		c.insets= new Insets(10,0,0,0);
		JLabel l1= new JLabel(new ImageIcon("C:\\Users\\PADDY SHINDE\\Downloads\\vj.jpg"));
		add(l1,c);
		
		JMenuBar mbr = new JMenuBar();
		mbr.setBackground(Color.CYAN);
		mbr.setFont(new Font("TimesRoman",Font.BOLD,15));
		setJMenuBar(mbr);
		
		JMenu home = new JMenu("HOME");
		mbr.add(home);
		
		JMenu au = new JMenu("ABOUT US");
		JMenuItem vv,dd,ma,vg,vb;
		au.add(vv = new JMenuItem("Vision&Values"));
		vv.setForeground(Color.BLUE);
		au.add(dd = new JMenuItem("Director's Desk"));
		dd.setForeground(Color.BLUE);
		au.add(ma = new JMenuItem("Management&Administration"));
		ma.setForeground(Color.BLUE);
		au.add(vg = new JMenuItem("VJTI At a Glance"));
		vg.setForeground(Color.BLUE);
		au.add(vb = new JMenuItem("VJTI Brochure"));
		vb.setForeground(Color.BLUE);
		mbr.add(au);
		
		JMenu dep = new JMenu("DEPARTMENTS");
		JMenuItem co,ce,ee,hm,mt,mca,me,ph,pe;
		dep.add(co=new JMenuItem("Computer Engineering&Information Technology"));
		co.setForeground(Color.BLUE);
		dep.add(ce=new JMenuItem("Civil&Environmental Engineering"));
		ce.setForeground(Color.BLUE);
		dep.add(ee=new JMenuItem("Electrical Engineering"));
		ee.setForeground(Color.BLUE);
		dep.add(hm=new JMenuItem("Humanities&Managements"));
		hm.setForeground(Color.BLUE);
		dep.add(mt=new JMenuItem("Mathematics"));
		mt.setForeground(Color.BLUE);
		dep.add(mca=new JMenuItem("MCA"));
		mca.setForeground(Color.BLUE);
		dep.add(me=new JMenuItem("Mechanical Engineering"));
		me.setForeground(Color.BLUE);
		dep.add(ph=new JMenuItem("Physics"));
		ph.setForeground(Color.BLUE);
		dep.add(pe=new JMenuItem("Production Engineering"));
		pe.setForeground(Color.BLUE);
		mbr.add(dep);
		
		JMenu adm = new JMenu("ADMISSION");
		JMenuItem dp,ugp,pp,phd;
		adm.add(dp= new JMenuItem("Diploma Programs"));
		dp.setForeground(Color.BLUE);
		adm.add(ugp= new JMenuItem("Under Graduate Programs"));
		ugp.setForeground(Color.BLUE);
		adm.add(pp= new JMenuItem("Postgraduate Programs"));
		pp.setForeground(Color.BLUE);
		adm.add(phd= new JMenuItem("PHD Programs"));
		phd.setForeground(Color.BLUE);
		mbr.add(adm);
		
		JMenu tp = new JMenu("TRAINING&PLACEMENTS");
		mbr.add(tp);
		
		JMenu fac = new JMenu("FACILITIES");
		JMenuItem ace,act,ho,lib,ofac;
		fac.add(ace= new JMenuItem("Association of Computer Enthusiasts"));
		ace.setForeground(Color.BLUE);
		fac.add(act= new JMenuItem("Activities"));
		act.setForeground(Color.BLUE);
		fac.add(ho= new JMenuItem("Hostel"));
		ho.setForeground(Color.BLUE);
		fac.add(lib= new JMenuItem("Library"));
		lib.setForeground(Color.BLUE);
		fac.add(ofac= new JMenuItem("Other facilities"));
		ofac.setForeground(Color.BLUE);
		mbr.add(fac);
		
		JMenu ot = new JMenu("OTHER");
		JMenuItem al,fr,ul,gr,ac;
		ot.add(al=new JMenuItem("Alumni"));
		al.setForeground(Color.BLUE);
		ot.add(fr=new JMenuItem("Fees and Registration"));
		fr.setForeground(Color.BLUE);
		ot.add(ul=new JMenuItem("Academics"));
		ul.setForeground(Color.BLUE);
		ot.add(gr=new JMenuItem("Grievance"));
		gr.setForeground(Color.BLUE);
		ot.add(ac=new JMenuItem("Achievements"));
		ac.setForeground(Color.BLUE);
		mbr.add(ot);
		
		JButton b = new JButton(" Student's Corner");
		c.weighty=0.5;
		c.ipady=10;
		c.gridx=0;
		c.gridy=1;
		add(b,c);
		b.setForeground(Color.RED);
		b.setFont(new Font("TimesRoman",Font.BOLD,20));
		
		JButton b1= new JButton("Latest News");
		c.gridx=1;
		c.gridy=1;
		add(b1,c);
		b1.setForeground(Color.RED);
		b1.setFont(new Font("TimesRoman",Font.BOLD,20));
		
		JButton b2= new JButton("Exam Section");
		c.gridx=2;
		c.gridy=1;
		add(b2,c);
		b2.setForeground(Color.RED);
		b2.setFont(new Font("TimesRoman",Font.BOLD,20));
		
		JButton b3= new JButton("Events");
		c.gridx=3;
		c.gridy=1;
		add(b3,c);
		b3.setForeground(Color.RED);
		b3.setFont(new Font("TimesRoman",Font.BOLD,20));
		
		setVisible(true);
		setSize(800,300);
		
		
		
	}
	public static void main(String args[]){
		MenuF m = new MenuF("MenuBar");
	}
}