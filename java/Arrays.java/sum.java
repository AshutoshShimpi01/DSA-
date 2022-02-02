class A
{
	public int show(int i,int j,int k)
	{
		return i+j+k;
	}
}

public class java 
{
	public static void main(String[] args) {
		A obj = new A();
       
       int result=obj.show(2,3,4);

		System.out.println(result);
	}
}
