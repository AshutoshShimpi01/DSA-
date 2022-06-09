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


---------------------------------------
  
 //FIND 2nd LARGEST WUTH FUNC/METHOD
  
  
import java.util.*;
class java
{
    public static int isPrime(int ar[],int max2)
{
    int max1 = ar[0];
    for(int i=0;i<ar.length;i++)
    {
    if(ar[i]>max1)
    {
        max2=max1;
        max1=ar[i];
    }
    else if(ar[i]>max2)
    max2=ar[i];
    
}
return max2;
}
    
    public static void main(String args[])
    {
        
        int arr[] = {1,2,3,4,5,6};
        int Max4=0;
        
        int check = isPrime(arr,Max4);
        
        
          System.out.println(check);  
       
        
    }

}

//5



