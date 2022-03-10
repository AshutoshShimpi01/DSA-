class pen
{
  String color;
  String rate;
  public void write()
  {
    System.out.println("Write Anything");
  }
  public void printColor()
  {
    System.out.println(this.color);
    System.out.println(this.rate);
  }
}

public class java
{
  public static void main(String[] args) {
    
    pen pen1 = new pen();

    pen1.color = "Red";
    pen1.rate = "10";

    pen pen2 = new pen();

    pen2.color = "Blue";
    pen2.rate = "50";

    pen1.printColor();
    pen2.printColor();
  }
}

/*

Red
10
Blue
50

*/
