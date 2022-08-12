import java.awt.*;
import java.awt.event.*;

public class Calcu extends Frame implements ActionListener{
	TextField t;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,equ,clr;
	static double a=0,b=0,c=0;
	static int choice=0;
		
	Calcu(){
		t=new TextField();
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		equ=new Button("=");
		clr=new Button("Clr");
		Label l= new Label("");
		Label l1= new Label("");
	
		add(t);
		add(l);
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(equ);
		add(clr);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equ.addActionListener(this);
		clr.addActionListener(this);
		setLayout(new GridLayout(7,3));
		setVisible(true);
		setSize(500,500);
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			t.setText(t.getText().concat("1"));
		}
		if(ae.getSource()==b2){
			t.setText(t.getText().concat("2"));
		}
		if(ae.getSource()==b3){
			t.setText(t.getText().concat("3"));
		}
		if(ae.getSource()==b4){
			t.setText(t.getText().concat("4"));
		}
		if(ae.getSource()==b5){
			t.setText(t.getText().concat("5"));
		}
		if(ae.getSource()==b6){
			t.setText(t.getText().concat("6"));
		}
		if(ae.getSource()==b7){
			t.setText(t.getText().concat("7"));
		}
		if(ae.getSource()==b8){
			t.setText(t.getText().concat("8"));
		}
		if(ae.getSource()==b9){
			t.setText(t.getText().concat("9"));
		}
		if(ae.getSource()==b0){
			t.setText(t.getText().concat("0"));
		}
		if(ae.getSource()==add){
			a=Double.parseDouble(t.getText());
			choice=1;
			t.setText("");
		}
		if(ae.getSource()==sub){
			a=Double.parseDouble(t.getText());
			choice=2;
			t.setText("");
		}
		if(ae.getSource()==mul){
			a=Double.parseDouble(t.getText());
			choice=3;
			t.setText("");
		}
		if(ae.getSource()==div){
			a=Double.parseDouble(t.getText());
			choice=4;
			t.setText("");
		}
		if(ae.getSource()==equ){
			b=Double.parseDouble(t.getText());
			
			switch(choice){
				case 1:
				c=a+b;
				break;
				
				case 2:
				c=a-b;
				break;
				
				case 3:
				c=a*b;
				break;
				
				case 4:
				c=a/b;
				break;
				
				default: 
				c=0;
			}
			t.setText(""+c);
		}
		if(ae.getSource()==clr){
			t.setText("");
		}
	}
	public static void main(String args[]){
		new Calcu();
	}
}