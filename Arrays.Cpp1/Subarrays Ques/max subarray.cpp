#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++)
            {
                cout<<a[k]<<" ";
            }
            cout<<endl;
        }
       
    }
}
/*
 4
 -1 2 7 4
 -1
 -1 2
 -1 2 7
 -1 2 7 4
 2
 2 7
 2 7 4
 7
 7 4
 4
 Program ended
 */

*******************************************
#include <iostream> // find maximum subarray sum
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    int intMax=INT_MIN;
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++) // we are placing 3 nested loops here to find the answer. then time complexity -o(n)cube
    {
        for(int j=i;j<n;j++){
            int sum=0;
            for(int k=i;k<=j;k++)
            {
                sum+=a[k];
               
                //cout<<a[k]<<" ";
            }
            intMax=max(intMax,sum);
            
        }
        
    }
    
    cout<<intMax;
    cout<<endl;
}
/*
 4
 -1 4 7 2
 13- max sum of array is 13
 Program ended
 */
