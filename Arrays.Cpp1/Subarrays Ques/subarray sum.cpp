#include <iostream>
using namespace std;
    

int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n; i++)
    {
        cin>>a[i];
    }
    int current=0;
    for(int i=0;i<n;i++)
    {
        current =0;
        for(int j=i;j<n;j++)
        {
            current=current+a[j];
            cout<<current<<endl;
        }
    }

    return 0;
    
}
/*
 5
 1 2 0 7 2 //.       1+2=3,1+2+0=3,1+2+0+7=10,1+2+0+7+2=12,  then 2nd index=2,2+0=2,2+0+7=9.  total 15 subarrays sum.
 1
 3
 3
 10
 12
 2
 2
 9
 11
 0
 7
 9
 7
 9
 2
 Program ended
 */
