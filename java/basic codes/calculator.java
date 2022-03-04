import java.util.Scanner;


class java
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the numbers");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int sum=n1+n2;
    int sub=n1-n2;
    int mult=n1*n2;
    int div=n1/n2;
    int rem=n1%n2;

    System.out.println("Sum is:"+sum);
    System.out.println(sub);
    System.out.println(mult);
    System.out.println(div);
    System.out.println(rem);

}


    
  }
/*

Enter the numbers
6
3
Sum is:9
3
18
2
0


*/
