#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int sum(int n,int a[])
{
    if(n<0) return 0;
    return sum(n-1,a) + a[n];
}

int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<sum(n-1, a);
}

/*
 5
 1 2 3 4 5
 15
 
 */



#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int sum(int n,int a[])
{
    if(n<0) return 0;
    return sum(n-1,a) + a[n];
}

int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<sum(2, a);
}

/*
 6
 1 2 3 4 5 6
 6
 
 
 if we got sum between index 0 To 2(1+2+3)=6
 
 */
