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


// Multiply.java




public class java {

//User defined Method
public int multiply(int a, int b, int c){
int result = a * b * c;
return result;
}

public static void main (String [] args){

//Create Object
java abc = new java();

//Call Method
int x = abc.multiply(11, 25, 35);
System.out.println(x);

System.out.println(abc.multiply(10, 25, 35));
System.out.println(abc.multiply(2,2,2));
}
}

/*

9625
8750
8



*/
