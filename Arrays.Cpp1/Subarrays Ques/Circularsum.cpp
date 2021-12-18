//kadane algorithm 

#include <iostream>
#include<climits>
using namespace std;

int kadane(int arr[],int n)
{
   
    int currentsum=0;
    int maxsum=INT_MIN;
    for(int i=0;i<n;i++)
    {
        currentsum+=arr[i];
        if(currentsum<0)
        {
            currentsum=0;
        }
        maxsum=max(maxsum,currentsum);
    }
    return maxsum;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[n];
        
    }
    int wrapsum; // wraping mean variable are move and nonwrap mean eg={-1,4,-6,7,5,-4}so max sum index is 7+5 so 7,5 is non wrap & others are wrap because their sum is negative sum
    int nonwrapsum;
    nonwrapsum=kadane(arr,n);
    int totalsum=0;
    for(int i=0;i<n;i++)
    {
       totalsum+=arr[i];
        arr[i]=-arr[i];
    }
    wrapsum=totalsum + kadane(arr,n);
    
    cout<<max(wrapsum,nonwrapsum)<<endl;
    return 0;
}
/*
output
7
4 -4 6 -6 10 -11 12 // kadane algorithm use for circulare sum counting mean we are start counting from 12+4+6+-6+10=22 -11 not count because 4+-4+6+-6+10+-11+12=11
22 // and 12+4+-4+6+-6+10=22
Program ended.
*/
