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



Logic:-

n=5(101)
then 1<<pos(2)
we get= 00101=10100

we got, bitMask=10100

then 10100 & 101

10100
00101
______
00100

& = 11=1 || 01=0 || 10=0 || 00=0

|| = 00=0 || 01=1 || 10=1 || 11=1

^ = 01=1 || 10=1 || 11=0 || 00=0

*/


