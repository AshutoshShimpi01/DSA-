import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {

    int n = 5;

    int pos = 1;

    int bitMask = 1<<pos;

    int newNum = bitMask | n;
    System.out.println(newNum);
    

  
   }
}
 
  
/*

/*

7

n=5(101)
then 1<<pos(1)
we get= 0001=0010
we got, bitMask=0010

0010
0101
-----
0111(7)

*/

*/
