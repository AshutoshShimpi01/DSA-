// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class HelloWorld {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       
      int arr[] = new int[n];
      
      int sum = 0;
      for(int i=0;i<arr.length;i++)
      {
          arr[i] = sc.nextInt();
          
      }
      
      for(int i=0;i<arr.length;i++)
      {
           sum +=arr[i];
      }
      System.out.print(sum);
      
      
      
      
        
    }
}

/*
5
1 2 3 4 5
15
*/









-----------------


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
