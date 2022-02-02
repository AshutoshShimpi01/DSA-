class A        // Super Class
{
	public A()                       // Default Constructor
	{
		System.out.println("In A");
	}
	public A(int i)                  // Parameterized  Constructor
	{
		System.out.println("In A Int");
	}
}
class B extends A     // Sub Class
{
	public B()                         // Default Constructor
	{
        super();
		System.out.println("In B");
	}
	public B(int i)                     // Parameterized  Constructor
	{
		super(i);
		System.out.println("In B Int");
	}
}

public class java
{
	public static void main(String[] args) 
	{
	
	B obj = new B(5);


	}
}

/*
Output=

In A Int
In B Int

***********

but we don't pass parameter then
B obj = new B();
In A
In B

***********

public B()                        
	{
        super(5); // in Super method pass parameter=5
		System.out.println("In B");
	}
In A Int
In B

***********

 if we don't Write Super method then
In A
In B Int


*/
