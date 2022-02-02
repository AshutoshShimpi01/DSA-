class Casio
{


public void add(int i,int j)
{
	System.out.println(i+j);
	
}
public void add(int i,int j,int k)
{
	System.out.println(i+j+k);
}
public void add(double i,double j)
{
	System.out.println(i+j);
}

}

public class ja
{

 public static void main(String[] args) 
     {
	
		Casio obj = new Casio();
		obj.add(5,2);
		obj.add(4,3,5);
		obj.add(4.5,3.8);
	
     }
}	


/*
OUTPUT-

3      //  same method names but different parameters called Meth Overloading
12
8.3 

*/

************************---------****************************

// about static method in meth overloading 


class Emp
{
	int id;
	static String  manager;
	int sal;

static
{
   manager="sham";
   	System.out.println("in SHAM Static");
}


public Emp()
{
	id = 1;
	sal = 3000;
	System.out.println("in constructor");
}
static
{
   manager="ram";
   	System.out.println("in Static");
}
	public void show()
	{
		System.out.println(id + ":" + sal + ":" + manager);
	}
	
}

public class ja
{
	public static void main(String[] args) 
	{
		Emp ashu = new Emp();

		
		Emp omkar = new Emp();

		
		ashu.show();
		omkar.show();
	}
}

/*
in SHAM Static
in Static
in constructor
in constructor
1:3000:ram
1:3000:ram
*/
