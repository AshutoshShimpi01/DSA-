class Calc
{
int num1;
int num2;
int result;

public Calc()
{
	num1=5;
	num2=5;
	System.out.println("in Constructor");
}
public Calc(int n)
{
	num1=n;
	num2=n;
}
}

public class ja
{

 public static void main(String[] args) 
     {
	
		Calc obj = new Calc(7);
		System.out.println(obj.num1);
	
     }
}	


/*
OUTPUT-

7

*/
