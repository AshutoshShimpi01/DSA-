//BroutForce APPROCH- we cant use use old store value, we find everytime new power= pow(2,i)= 1,4,8,16,32,64,128

#include<iostream>
#include<math.h>

using namespace std;

int main()
{
    int n,ans=0;
    cin>>n;
    
    
    for(int i=0;i<=30;i++)
    {
        ans = pow(2,i);
        if(ans==n)
        {
            cout<<"true";
            break;
        }
    }
    if(ans!=n)
    {
        cout<<"false";
    }
    return 0;
    
}
    
    


/*
 17
 false
 2*2*2*2=16
 2*2*2*2*2=32
 
 8
 true
 
 cube of 2=8 2*2*2=8
 */