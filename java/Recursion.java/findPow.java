public class Recursion
{
	public static int power(int n,int p)
	{
		if(p==0)
		{
			return 1;
		}
		int prevpow = power(n,p-1);
		return n*prevpow;
	}
		
		
	public static void main(String[] args) {
		int n=4,p=3;
		power(n,p);
		System.out.println(power(n,p));
	}
}

/*
64
*/


