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
    int counter=1;
    while(counter<n)
    {
        for(int i=0;i<n-counter;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
              //  cout<<n-count<<endl; //count always write outside for loop
            }
            }
        counter++;
    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<endl;
    }
}
/*
 5
 6 3 8 2 4
 2
 3
 4
 6
 8
 Program ended
 */
