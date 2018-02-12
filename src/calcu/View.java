package calcu;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{
	
private JTextField number1=new JTextField(10);
private JLabel addi=new JLabel ("+");
private JTextField number2=new JTextField(10);
 JButton calculate=new JButton("add");
private JTextField ans=new JTextField(10);

private JTextField number3=new JTextField(10);
private JLabel subi=new JLabel ("-");
private JTextField number4=new JTextField(10);
 JButton calculate1=new JButton("sub");
private JTextField ans1=new JTextField(10);

private JTextField number5=new JTextField(10);
private JLabel muli=new JLabel ("*");
private JTextField number6=new JTextField(10);
 JButton calculate2=new JButton("mul");
private JTextField ans2=new JTextField(10);

private JTextField number7=new JTextField(10);
private JLabel divi=new JLabel ("/");
private JTextField number8=new JTextField(10);
 JButton calculate3=new JButton("div");
private JTextField ans3=new JTextField(10);


private JTextField number9=new JTextField(10);
private JLabel modi=new JLabel ("%");
private JTextField number10=new JTextField(10);
 JButton calculate4=new JButton("mod");
private JTextField ans4=new JTextField(10);

private JLabel sqri=new JLabel ("squer");
private JTextField number11=new JTextField(10);
 JButton calculate5=new JButton("squr");
private JTextField ans5=new JTextField(10);

View()
{
	JPanel calcPanel=new JPanel();
	
calcPanel.add(number1);
calcPanel.add(addi);
calcPanel.add(number2);
calcPanel.add(calculate);
calcPanel.add(ans);


calcPanel.add(number3);
calcPanel.add(subi);
calcPanel.add(number4);
calcPanel.add(calculate1);
calcPanel.add(ans1);

calcPanel.add(number5);
calcPanel.add(muli);
calcPanel.add(number6);
calcPanel.add(calculate2);
calcPanel.add(ans2);

calcPanel.add(number7);
calcPanel.add(divi);
calcPanel.add(number8);
calcPanel.add(calculate3);
calcPanel.add(ans3);

calcPanel.add(number9);
calcPanel.add(modi);
calcPanel.add(number10);
calcPanel.add(calculate4);
calcPanel.add(ans4);


//calcPanel.add(sqri);
calcPanel.add(number11);
calcPanel.add(calculate5);
calcPanel.add(ans5);




this.add(calcPanel);
this.setSize(500,400);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public int getNumber1()

{
	
	return Integer.parseInt(number1.getText());

	
}
public int getNumber2()
{
	return Integer.parseInt(number2.getText());
	
}

public int getNumber3()
{
	return Integer.parseInt(number3.getText());
	
}
public int getNumber4()
{
	return Integer.parseInt(number4.getText());
	
}

public int getNumber5()
{
	return Integer.parseInt(number5.getText());
	
}

public int getNumber6()
{
	return Integer.parseInt(number6.getText());
	
}
public int getNumber7()
{
	return Integer.parseInt(number7.getText());
	
}


public int getNumber8()
{
	return Integer.parseInt(number8.getText());
	
}
public int getNumber9()
{
	return Integer.parseInt(number9.getText());
	
}

public int getNumber10()
{
	return Integer.parseInt(number10.getText());
	
}

public int getNumber11()
{
	return Integer.parseInt(number11.getText());
	
}

public int getAns()
{
	return Integer.parseInt(ans.getText());
	
}

public int getAns1()
{
	return Integer.parseInt(ans1.getText());
	
}

public int getAns2()
{
	return Integer.parseInt(ans2.getText());
	
}

public int getAns3()
{
	return Integer.parseInt(ans3.getText());
	
}
public int getAns4()
{
	return Integer.parseInt(ans4.getText());
	
}


public int getAns5()
{
	return Integer.parseInt(ans5.getText());
	
}

public void setAns(int answer)
{
	ans.setText(Integer.toString(answer));
	
}

public void setAns1(int answer)
{
	ans1.setText(Integer.toString(answer));
	
}
public void setAns2(int answer)
{
	ans2.setText(Integer.toString(answer));
	
}

public void setAns3(int answer)
{
	ans3.setText(Integer.toString(answer));
	
}

public void setAns4(int answer)
{
	ans4.setText(Integer.toString(answer));
	
}

public void setAns5(int answer)
{
	ans5.setText(Integer.toString(answer));
	
}

void addCalcListener(ActionListener L)
{
	calculate.addActionListener(L);
	calculate1.addActionListener(L);
	calculate2.addActionListener(L);
	calculate3.addActionListener(L);
	calculate4.addActionListener(L);
	calculate5.addActionListener(L);
}


}
//void addcalcListner(ActionListener L)

