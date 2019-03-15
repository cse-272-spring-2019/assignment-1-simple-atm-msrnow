package rashad;
import java.util.ArrayList;
public class Client {
private  double Balance=0;
ArrayList<String> trans = new ArrayList<String>();

int index=0;
public double getBalance2()
{
	
String y = String.valueOf(Balance);
	
	String z = "Your balance " + y;
	trans.add(z);
	
	if(trans.size()>5)
	{trans.remove(0);
		}
	index=trans.size()-1;
return Balance;	
}

public double getBalance()
{
	

return Balance;	
}
public void deposit(double x)

{
    
	Balance=Balance+x;
	
String y = String.valueOf(x);
	
	String z = "Deposite " + y;
	trans.add(z);
	if(trans.size()>5)
	{trans.remove(0);
		}
	index=trans.size()-1;
}

public void WithDraw(double x)

{Balance=Balance-x;
String y = String.valueOf(x);

String z = "WithDraw " + y;
trans.add(z);
if(trans.size()>5)
{trans.remove(0);
	}
index=trans.size()-1;
}

public String Next1()
{
	if(index==trans.size()-1)
		return null;

	index++;
	return trans.get(index);
	
	}
public String Previous()
{
	if(index==0)
		return null;

	index--;
	return trans.get(index);
	
	}



public int getIndex()
{
	return index;
}



public int getSize()
{
	return trans.size();
	}

}