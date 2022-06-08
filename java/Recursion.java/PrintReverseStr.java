//WRITEN BY ME

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class reverse{
    public void func(int n)
{
    if(n==0)     return;
    System.out.print(n + " ");
    func(n-1);
    
 
}
}
class HelloWorld {
    public static void main(String[] args) {
     
    reverse r=new reverse();
    
    r.func(5);
    
 

    }
}

//5 4 3 2 1 

--------------------------------------




public class Recursion
{
	public static void printRev(String str,int idx)
	{
		if(idx == 0)
		{
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		printRev(str,idx-1);
	}

		
	public static void main(String[] args) {
		String str = "abcd";
		printRev(str,str.length()-1);
	}
}

/*
dcba
*/


