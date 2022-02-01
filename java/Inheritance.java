
// This is a Single Level Inheritance 


class Calculator // in java Super, Parent , in cpp Base
{
	public int add(int i,int j)
	{
		return i+j;
	}
	
}
class AdvCal extends Calculator // in java sub, child, in cpp Derived
{
	public int sub(int i,int j)
	{
		return i-j;
	}
	
}

public class ja
{
	public static void main(String[] args) {
		AdvCal obj = new AdvCal();

        
         int result1 = obj.sub(8,4);
         int result2 = obj.add(7,8);
         
		System.out.println(result1);
		System.out.println(result2);
		
		}
}

/*
OUTPUT=

4
15
*/









*********************************************************

// This is a Multi Level Inheritance 

class Calculator
{
	public int add(int i,int j) 
	{
		return i+j;
	}
	
}
class AdvCal extends Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
	
}
class SupAdvCal extends AdvCal
{
	public int multi(int i,int j)
	{
	return i*j;
	}
	
}

public class ja
{
	public static void main(String[] args) {
		SupAdvCal obj = new SupAdvCal();

         int result1 = obj.multi(5,4);
         int result2 = obj.sub(8,4);
         int result3 = obj.add(7,8);
         

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		}
}

/*
OUTPUT=
20
4
15
*/