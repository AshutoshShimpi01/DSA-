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
we get= 0001=0100

we got, bitMask=0100

then 0100 & 101

0100
0101
______
0100       if we get 1 so "bit was one"  and if we get 0 so "bit was zero"

&(AND) = 11=1 || 01=0 || 10=0 || 00=0

|(OR) = 00=0 || 01=1 || 10=1 || 11=1

^(Exort) = 01=1 || 10=1 || 11=0 || 00=0

*/


