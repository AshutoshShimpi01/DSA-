// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class java {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int temp = n;
      
      int rem,res=0;
      
      while(temp!=0)
      {
          rem = temp%10;
          res += Math.pow(rem,3);
          temp = temp/10;
      }
      
      if(res == n)
      {
         System.out.println("Armstrong no."); 
      }
     else
      {
         System.out.println("not Armstrong no."); 
      }
      
      /*
      //153
      //Armstrong no.
      
      means sum of each no. cube and digits are equal
      
      1*1*1=1
      5*5*5=125
      3*3*3=27
      sum = 153
      
      */
      
      
       
    }
}
