import java.util.Scanner;


public class java
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age > 18)
    {

System.out.println("Adult");

    }
    else
    {
      System.out.println("Not adult");
    }
  }

}
//15
//Not adult

*************************************---------------------************************************************

import java.util.Scanner;


public class java
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name");
    String name=sc.next();
    System.out.println("Enter Your Age");
    int age=sc.nextInt();
    System.out.println("Enter Your Gender");
    char gender = sc.next().charAt(0);
    System.out.println("Enter Your Phone number");
    long phno=sc.nextLong();

    System.out.println("------------------------------------");


    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("gender:"+gender);
    System.out.println("phone No.:"+phno);

  }

}
/*
Enter Your Name
Ashutosh
Enter Your Age
21
Enter Your Gender
M
Enter Your Phone number
8605562326
------------------------------------
Name:Ashutosh
Age:21
gender:M
phone No.:8605562326
(base) ashutoshsanjayshimpi@Ashutoshs-MBP coreJava % 
*/
