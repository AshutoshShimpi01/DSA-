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
