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

