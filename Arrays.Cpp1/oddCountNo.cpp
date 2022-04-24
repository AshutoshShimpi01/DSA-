#include <iostream>
#include<math.h>
using namespace std;

int odd_count(int n)
{
    int oddC = 0;
    while(n>0)
    {
        int rem = n%10;
        if(rem%2!=0) oddC++;
        n=n/10;
        
    }
    cout<<"\n odd Count: "<<oddC;
    if(oddC%2==1)
        return 1;
    else
        return 0;
}
int main()
{
    
    int n= 4421;
    
    int t= odd_count(n);
    
    if(t==1)
    {
        cout<<" ""Yes"<<endl;
    }
    else
        cout<<"\nno"<<endl;
    
    return 0;
    
    
}
//odd Count: 1 Yes
