
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
