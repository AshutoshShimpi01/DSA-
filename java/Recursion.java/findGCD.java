import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
    
    System.out.println(gcd(24,60));
  }

  static int gcd(int a,int b)
  {

    if(b==0) return a;

    return gcd(b, a%b);
  } 
  
   }

   /*
    12
   */
