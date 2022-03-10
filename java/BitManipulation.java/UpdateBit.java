
/*
if we want to update a perticular bit index 0 or 1

if we make 0:-                  if we make 1;-

CLAER operation:                SET operation:                            

Bit Mask: 1<<i                  Bit Mask: 1<<i
operation: AND with NOT         operation: OR

*/

import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();

    int n = 5;

    int pos = 1;

    int bitMask = 1<<pos;
    if(oper == 1)
    {
      //set
      int newNumb = bitMask | n;
      System.out.println(newNumb);
    }
    else
    {
      //clear
      int newBitMask = ~(bitMask);
      int newNumb = newBitMask & n;
      System.out.println(newNumb);

     } 
    

  
   }
}
 
  
/*

1:-
7
------------------

SET operation:
n=5(101)
then bitMask=1<<pos(1)
we get= 0001=0010
we got, bitMask=0010
      
      OR


0010
0101
-----
0111 (position 0 is converted into 1)

CLEAR operation:

n=5(101)
then bitMask=1<<pos(2)
we get= 0001=0100
we got, bitMask=0100

now ~(not)=inverseallbits:- 1011

now apply & with n

1011
0101
-----
0001(1)


*/
