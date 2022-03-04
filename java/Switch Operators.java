public class ja
{
 public static void main(String[] args) 
	{
		int i=4;
		int j=7;

		int m=j>9?1:2;  // Ternary operator 
		System.out.println(m);
	}
}

// SWITCH.JAVA


public class ja
{
 public static void main(String[] args) 
	{
		int n=9;
		switch(n)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
		    System.out.println("Two");	
		    break;
		case 3:
		    System.out.println("Three");
		    break;
		case 4:
		    System.out.println("Four");	
		    break;
		default:
		    System.out.println("No match");		
		}
	}
}


*****************-------------******************

//SWITCH BY USING SCANNER

import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    int button=sc.nextInt();

    switch(button)
    {

    case 1 : System.out.println("Hello");
      break;
    case 2 : System.out.println("Namaste");
      break;
     case 3 : System.out.println("Kese ho Bhai");
     break;
     default : System.out.println("Invalid input"); 

}


    
  }
}
/*

3
Namaste

*/
