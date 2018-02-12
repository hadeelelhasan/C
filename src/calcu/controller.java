package calcu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//import Calcu.View;
import calcu.modol;

public class controller {
private View v;
private modol m;

public controller(View v,modol m)
{
	this.v=v;
	this.m=m;
	
	this.v.addCalcListener(new CalcListener());
	



}
class CalcListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int first,second=0;
		
			
		if (e.getActionCommand()=="add")
			{
			try {
			first=v.getNumber1();
			second=v.getNumber2();
				m.add(first, second);
				m.getTheRes();
			    v.setAns(m.getTheRes());
			}
			catch(NumberFormatException e2)
			{
				m.setCheck(1);
				JOptionPane.showMessageDialog(null, "enter just numbers ");
				//v.setAns(m.getTheRes());
			}
			}
		else if (e.getActionCommand()=="sub")
			{
			try {
			first=v.getNumber3();
			second=v.getNumber4();
				m.sub(first, second);
				m.getTheRes();
			    v.setAns1(m.getTheRes());
			}
			catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
			}
			}
		else if (e.getActionCommand()=="mul")
		{
			try {
			first=v.getNumber5();
			second=v.getNumber6();
			m.mul(first, second);
			m.getTheRes();
		    v.setAns2(m.getTheRes());
			}
			catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
			}
		}
		else if(e.getActionCommand()=="div")
		{
			try {
				
			
			first=v.getNumber7();
		    second=v.getNumber8();
			m.div(first, second);
			m.getTheRes();
			if (m.getCheck()!=1) 
				
			
		    v.setAns3(m.getTheRes());
			}
			catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
			}
		}
		else if(e.getActionCommand()=="mod")
		{
			try {
			first=v.getNumber9();
		    second=v.getNumber10();
			m.mod(first, second);
			m.getTheRes();
			if (m.getCheck()!=1) 
		    v.setAns4(m.getTheRes());
			}
			catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
			}
		}
		else if(e.getActionCommand()=="squr")
		{
			try {
			first=v.getNumber11();
			m.sq(first);
			m.getTheRes();
			if (m.getCheck()!=1) 
		    v.setAns5(m.getTheRes());
			}
			catch(NumberFormatException e2) {
				m.setCheck(1);
				//JOptionPane.showMessageDialog(null, "enter just numbers ");
			}
		}
		//else
		//{
			
			//JOptionPane.showMessageDialog(null, "ERROR");
		//}
	}
	
}
}
