
// variable length arguments


class Calc
{
	public int add(int ...n) // (...n) then n becomes an array{2,3,53,53,43,2}
	{
     
    int sum=0;

    for(int i : n)   //i is fetching the values from n 
    {
    	sum +=i;
    }
    return sum;

	}
}

public class ja 
{

	public static void main(String[] args) {
		Calc obj = new Calc();

		 System.out.println(obj.add(2,3,53,53,43,2));
	}
}

// OUTPUT=156
