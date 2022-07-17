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
