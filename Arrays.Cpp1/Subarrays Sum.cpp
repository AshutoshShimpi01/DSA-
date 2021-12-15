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
****************************************************

#include <iostream>
using namespace std;
    

int main()
{
    int n,s;
    cin>>n>>s;
    int a[n];
    {
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        
        int st=-1,en=-1,i=0,j=0,sum=0;
        while(j<n && sum+a[j]<=s) // array j=a[j]
        {
            sum=sum+a[j];
            j++;
        }
        if(sum==s)
        {
            cout<<i+1<<endl;
            return 0;
        }
        while(j<n)
        {
            sum+=a[j];
            while(sum>s)
            {
                sum-=a[i];
                i++;
            }
            if(sum==s)
            {
                st= i+1;
                en=j+1;
                break;
            }
            j++;
        }
        cout<<st<<endl<<en<<endl;
    }
    return 0;
}
/*
 5 -number
 12- s= find inside index sum
 1 2 3 7 5 -array
 2 -2+3+7=12
 4 -inside 4th index
 Program ended
 */
*****************************************
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
