#include <iostream>
using namespace std;

int power(int n,int p)
{
    if(p==0)
    {
        return 1;
    }
        
    int prevPow= power(n, p-1);
    return n*prevPow;
}

int main()
{
    int n,p;
    cin>>n>>p;
    cout<<power(n, p);

    
    return 0;
}
   
/*
 4 3 // 4*3*2*1
 64
 */

