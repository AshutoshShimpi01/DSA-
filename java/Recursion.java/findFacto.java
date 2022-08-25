// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class java {
    
    public static int fact(int n)
    {
   
        
        if(n==1)
        {
            return 1;
        }
        else
        {
             return(n * fact(n-1));  
        }
    }
    public static void main(String[] args) {
       
      System.out.println(fact(5));  
       
    }
}

















// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class reverse{
    public static int  fact(int n)
{
    if(n==0) 
    {
        return 1;
        
    }
  return fact(n-1) * n;
 
}

    public static void main(String[] args) {
    
    reverse r = new reverse();
        int n=5;
        r.fact(n);
	    
		System.out.println(fact(n));
      
    
 

    }
}

//120




----------------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact1 = fact(n-1);
        int fact =  n * fact1;
        return fact;
    }
    public static void main(String[] args) {
        
        
       int n=5;
       int check = fact(n);
       System.out.println(check);
    }
}

//120

----------------------------------------------







#include <iostream>
using namespace std;

int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    int prevFact = fact(n-1);
    return n*prevFact;
}

int main()
{
    int n;
    cin>>n;
    cout<<fact(n);

    
    return 0;
}












   
/*
 4
 24
 */

