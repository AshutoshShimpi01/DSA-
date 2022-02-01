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
