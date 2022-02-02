/*
               ********METHOD OVERRIDING********

      Child class Method will Override the Parent class method called

*/

class Ashu
{
	public void shri()
	{
		System.out.println("Brother is Keshav");
	}
}
class Yogesh extends Ashu
{
	
}

public class java
{
	public static void main(String[] args) {
		
		Yogesh obj1 = new Yogesh();

        obj1.shri();
	}
}

/*

OUTPUT-

Brother is Keshav





*/
