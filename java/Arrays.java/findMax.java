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

------------------------------------
  
//SECOND LAGREST ELEMENT
  
  
import java.lang.*;
import java.util.*;

class java
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);


int arr[] = {4,10,2,6,15,12};

int max1=arr[0];
int max2 = arr[0];

for(int i=0;i<arr.length;i++)
{

if(arr[i]>max1)
{
max2=max1;
max1=arr[i];


}

else if(arr[i]>max2)
{
max2=arr[i];
}
}

System.out.println(max1);
System.out.println(max2);

}

}

//15
//12



