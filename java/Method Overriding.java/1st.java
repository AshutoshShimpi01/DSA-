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

    //         ******CASE-2*******


class Ashu
{
	public void shri()
	{
		System.out.println("Brother is Keshav");
	}
}
class Yogesh extends Ashu
{
	public void shri()
	{
		System.out.println("Is a Big Brother of Ashu,shri and keshav");
	}
}

public class java
{
	public static void main(String[] args) {
		
		Yogesh obj1 = new Yogesh();

        obj1.shri();
	}
}

//   OUTPUT=
//   Is a Big Brother of Ashu,shri and keshav
