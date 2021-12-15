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
