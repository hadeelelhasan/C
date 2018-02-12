package calcu;
import javax.swing.JOptionPane;


public class modol {
	private int res;
    private int check;
public void add(int num1,int num2){
	
	 res=num1+num2;
	 
}

public void sub(int num1,int num2)
{
	res=num1-num2;
}
public void mul(int num1,int num2)
{
	res=num1*num2;
}
public void div(int num1,int num2)
{
	
  if (num2==0)
  {
	  check=1;
	 // JOptionPane.showMessageDialog(null,"divide on zero");
  } 
  else
	res=num1/num2;
}
public void mod(int num1,int num2)
{
	if (num2==0)
	{
		check=1;
	    //JOptionPane.showMessageDialog(null,"mod on zero");

	}
	else
	res=num1%num2;
}

public void sq(int num1)
{
	if(num1<0)
	{
		check=1;
		//JOptionPane.showMessageDialog(null,"you should enter positive number for square root");
		
	}
	else	
	res=(int) Math.sqrt(num1);
	
}


public int  getTheRes()
{  
	
	return res;
}

public void  setTheRes(int re)
{  
	
	res=re;
}
public int  getCheck()
{  
	
	return check;
}

public void  setCheck(int re)
{  
	
	check=re;
}

}
