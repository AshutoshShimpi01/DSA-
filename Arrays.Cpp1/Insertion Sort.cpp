#include <iostream>
using namespace std;
    

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    for(int i=1;i<n;i++)
    {
    int current=arr[i];
     int   j=i-1; // because index of i is 1 so for comparing with index 0 so j is started with index 0.
        while(arr[j]>current && j>=0)
        {
            arr[j+1]=arr[j]; // j=0 so 0+1=1 at index no. 1=value 2 replace with value 3.
            j--;
}
        arr[j+1]=current;
          }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<endl;
    }
}
/*
 5
 3 2 5 4 1
 1
 2
 3
 4
 5
 Program ended 
 */
