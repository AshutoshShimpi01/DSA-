
public class ja
{
 public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++) // inner loop execute multiple times
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
    }
	
	
}
/*
OUTPUT-

* * * * 
* * * * 
* * * * 
* * * * 

*/

------------------------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=5;j++)
      {
        if(i==1 || j==1 || i==4 || j==5)
        {

        System.out.print("*");

        }

        else
        {
          System.out.print(" ");
        }

      }
      System.out.println();
      
    }
 
  }  
}
/*

*****
*   *
*   *
*****
*/	

------------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
        
      }
         System.out.println();

    }
 
  }
  
} 
/*

*
**
***
****
*/	
-------------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    
    for(int i=4;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
        
      }
         System.out.println();

    }
 
  }
  
}
/*
****
***
**
*

*/	

---------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    int n=4;
    for(int i=1;i<=n;i++) // OUTER LOOP
    {
      for(int j=1;j<=n-i;j++) //1st INNER LOOS
      {
        System.out.print(" ");
        
      }

      for(int j=1;j<=i;j++) // 2nd INNER LOOP
      {

         System.out.print("*");
      }
      System.out.println();

    }
 
  }
  
 }

/*

FOR THIS TYPE OF QUESTIONS WE NEED TO CREATE TWO INNER LOOPS 1ST FOR SPACE AND 2ND FOR *.

   *
  **
 ***
****
*/
--------------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    int n=5;
    for(int i=1;i<=n;i++) // OUTER LOOP
    {
      for(int j=1;j<=n-i+1;j++) // n=5-i(1)+1=5, 5-i(2)+1=4, 5-i(3)+1=3 SIMPLE
      {
        System.out.print(j);
        
      }
      System.out.println();

    }
      

    }
 
  }
  
  
/*
12345
1234
123
12
1
*/
-------------------------------------------------
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    
    int n=5;
    int number=1;
    for(int i=1;i<=n;i++) // OUTER LOOP
    {
      for(int j=1;j<=i;j++) //1st INNER LOOS
      {
        System.out.print(number+ " ");
        number++;
        
      }
      System.out.println();

    }
      

    }
 
  }
  
  
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
-----------------------------------------
//STAR PATTERN
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    int n=5;

    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      int spaces= 2 * (n-i);
      for(int j=1;j<=spaces;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
     
      System.out.println();
    }

    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      int spaces= 2 * (n-i);
      for(int j=1;j<=spaces;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
     
      System.out.println();
    }




    }
 
  }
  
  
/*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/

--------------------------------------------------------------
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    int n=5;

    for(int i=1;i<=n;i++)
    {

      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");

      }
      for(int j=1;j<=n;j++)
      {
        System.out.print("*");    
      }
     
      System.out.println();
    }



    }
 
  }
  
  
/*
    *****
   *****
  *****
 *****
*****

*/
------------------------------------------------
	
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    int n=5;

    for(int i=1;i<=n;i++)
    {

     for(int j=1;j<=n-i;j++)
     {
      System.out.print(" ");
     }
     for(int j=1;j<=i;j++)
     {
      System.out.print(i+" ");
     }
     
      System.out.println();
    }



    }
 
  }
  
  
/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/
--------------------------------------------------
import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    int n=5;

    for(int i=1;i<=n;i++)
    {

      //for Spaces

      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }

      //for 1st half no.

      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
      }
      //for 2nd half no.

      for(int j=2;j<=i;j++)
      {
        System.out.print(j);
      }

     
      System.out.println();
    }

    }
 
  }
  
  
/*
    1
   212
  32123
 4321234
543212345

*/
---------------------------------------------
