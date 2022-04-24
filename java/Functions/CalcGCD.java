//find gretest common divisible by Using Recurssion

import java.util.Scanner;

public class java
{
  public static int gcd(int a,int b)
  {
    if(a==0) return b;
    if(b==0) return a;
    if(a==b) return a;
    if(a>b) 
      return gcd(a-b,b); 
    return gcd(a,b-a);

  }
  public static void main(String[] args) {
    
    int a=98, b=56;
    System.out.println("GCD of No: "+ gcd(a,b));
  }
}
//GCD of No: 14
