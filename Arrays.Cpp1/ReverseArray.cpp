/*
 Question-
 Given N strings, print unique strings
 in lexiographical(increasing)Order with their frequency
 N <= 10^5
 |s|<= 100
 */
#include <iostream>
#include <map>
#include<vector>
using namespace std;

void reverse(int arr[],int n)
{
    int start = 0;
    int end = n-1;
    while(start<= end)
    {
        swap(arr[start],arr[end]);
        start++;
        end--;
        
    }
}
void printArray(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main()
{
    int arr[] = {2,5,6,3,9,7};
    int brr[] = {8,2,-1,0,3};
    
    reverse(arr,6);
    reverse(brr,5);
    
    printArray(arr,6);
    printArray(brr,5);
}

/*
 7 9 3 6 5 2
 3 0 -1 2 8 
 */
