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
we get= 0101=1010
we got, bitMask=1010

1010
 101
-----
 111(7)

*/

*/
