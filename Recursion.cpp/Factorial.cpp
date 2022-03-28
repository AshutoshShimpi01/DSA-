#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;


int fact(int m)
{
    if(m==0) return 1;
    return fact(m-1)*m;
}
int main()
{
    int n;
    cin>>n;
    cout<<fact(n);
    
}

/*
 5
 120
 
 */
