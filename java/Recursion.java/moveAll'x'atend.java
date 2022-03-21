public class Recursion
{
	public static void moveAllX(String str,int idx,int count,String newString)
	{

		if(idx == str.length())
		{
			for(int i=0;i<count;i++) // for adding X after all methods done.
			{
				newString += "x";
		    }
		    System.out.println(newString);
		    return;
		}
		char currChar = str.charAt(idx);  // variable used for check index char
		if(currChar == 'x')
		{
			count++;                      //for ignore X and store in count variable
			moveAllX(str,idx+1,count,newString);
		}
		else
		{
			newString += currChar;          // for creating nwStr for prft Output
			moveAllX(str,idx+1,count,newString);
		}
	}
	public static void main(String[] args) {
		String str = "axbcxxd";
		moveAllX(str,0,0,"");
	}
}

/*
abcdxxx
*/


