import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {

    int n = 5;

    int pos = 2;

    int bitMask = 1<<pos;

    if((bitMask & n) == 0)
    {
      System.out.println("bits was zero");
    }
    else
    {
      System.out.println("bit was one");
    }

  
   }
}
 
  
/*

bit was one

*/
