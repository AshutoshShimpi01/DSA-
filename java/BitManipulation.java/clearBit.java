//if we want to clear(make 0) any index no. bit.

import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {

    int n = 5;

    int pos = 2;

    int bitMask = 1<<pos;
    int notBitMask = ~(bitMask);

    int newNum = notBitMask & n;
    System.out.println(newNum);
    

  
   }
}
 
  
/*

1
------------------

n=5(101)
then bitMask=1<<pos(1)
we get= 0001=0100
we got, bitMask=0100

now ~(not)=inverseallbits:- 1011

now apply & with n

1011
0101
-----
0001(1)

*/
