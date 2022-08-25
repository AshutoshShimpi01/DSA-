
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    
    static int n1=0,n2=1,n3;
    
    public static void fibo(int n)
    {
   
        
        
        if(n>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3 + " ");
            fibo(n-1);  // call func return type void
        }
        
    }
    public static void main(String[] args) {
       
       int num=15;
       
       System.out.print( n1 + " " + n2);
       fibo(num-2);
       
    }
}

// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 


----------







public class Recursion
{
	public static int fibo(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
		
		
	public static void main(String[] args) {
		int n=5;
		fibo(n);
		System.out.println(fibo(n));
	}
}

/*
5
*/


