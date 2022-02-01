// 1st create class then in that section write method and after our file name class and then call main method




class Calc
{
int num1;
int num2;
int result;

public void perform()
{
	result=num1+num2;
}

}	

public class ja
{

 public static void main(String[] args) 
	{
		Calc obj = new Calc();
		obj.num1 = 3;
		obj.num2 = 5;

		obj.perform();

		System.out.println(obj.result);
		
    
	}
	
}	

/*
OUTPUT-

8

*/
