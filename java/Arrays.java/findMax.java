import java.lang.*;
import java.util.*;

class java
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);


int arr[] = {4,10,2};

int max = arr[0];


for(int i=0;i<arr.length;i++)
{

if(arr[i]>max)
{

max=arr[i];

}

}

System.out.println(max);


}

}

// output- 10


