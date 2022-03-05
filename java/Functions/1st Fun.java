import java.util.Scanner;


public class java
{
  public static int CalculateSum(int a,int b)
  {
    int sum=a+b;
    return sum;
  }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum=CalculateSum(a,b);
    System.out.println("The sum os a and b is: "+ (sum));

}
 
  }
  
  
/*

 12
8
The sum os a and b is: 20

*/
