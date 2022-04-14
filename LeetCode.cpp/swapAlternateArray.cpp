#include <iostream>
#include<math.h>
using namespace std;


void printArr(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void swapArr(int arr[],int size)
{
for(int i=0; i<size; i=i+2)
{
    if(i+1 < size)
    {
        swap(arr[i],arr[i+1]);
    }
}
    
}

int main()
{
    int a[] = {2,1,4,3,6,5};
    int b[] = {9,8,7,6,5};
    swapArr(a, 6);
    printArr(a, 6);
    
    cout<<endl;
    
    swapArr(b, 5);
    printArr(b, 5);
    
}
/*
 1 2 3 4 5 6

 8 9 6 7 5 
 */
