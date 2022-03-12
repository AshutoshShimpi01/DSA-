class java
{
  public static void main(String[] args) {
    int no=121;
    int temp=no;
    int rev=0,rem;

    while(temp!=0)
    {

      rem=temp%10;// 121%10
      rev=rev*10+rem; // 0
      temp=temp/10; //0/10=0
    }
    if(no==rev)
    {
      System.out.println(no + "Palindrome");
    }
    else
    {
      System.out.println(no + "not palindrome");
    }

  }
}
/*
1214not palindrome
*/
