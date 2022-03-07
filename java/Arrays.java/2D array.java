public class ja
{
	public static void main(String[] args) {
		int a[][]={
			{1,2,3},
			{2,4,6,8},
			{5,6,7,8,5}
		};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) // if arrays size is not fixed so use .length
			{
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
		}
	}
/*
1 2 3
 2 4 6 8
 5 6 7 8 5

*/

***************** ---------- *******************

//SAME method with less memory (Enhance for loop with 2D Arrays)


public class ja
{
	public static void main(String[] args)
	 {
		int a[][]={
			{1,2,3},
			{2,4,6,8},
			{5,6,7,8,5}
		};

	for(int k[] : a)
 {
        for(int l : k)
        {
	    System.out.print(" " + l);
        }
    System.out.println();
			
 }
		
	}
}
	
/*
1 2 3
 2 4 6 8
 5 6 7 8 5
*/
************************************************

// 1D ARRAY

public class ja
{
	public static void main(String[] args) {
		int a[]={1,25,54,60,59,88};

		for(int i=0;i<6;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
	}
}
/*
OUTPUT=

1 25 54 60 59 88
*/

-------------------------------------------
//WITH SCANNER

import java.util.Scanner;


public class java
{
 
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   int colm=sc.nextInt();

   int[][] n=new int[rows][colm];
   

   

   for(int i=0;i<rows;i++)
   {
    for(int j=0;j<colm;j++)
    {
   n[i][j]=sc.nextInt();
   }
 }
  

   for(int i=0;i<rows;i++)
   {
    for(int j=0;j<colm;j++)
    {
   System.out.print(n[i][j]+" ");
   }
   System.out.println();
 }

    
   }
}
 
  
/*
3 
5
1 2 3 4 5
5 4 3 2 1
1 2 3 4 5

1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
*/
