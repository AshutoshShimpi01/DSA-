#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int i=0,ans=0;
    
    while(n!=0)
    {
        int digit = n%10;
        
        if(digit==1)
        {
        ans = ans + pow(2,i);
        }
        n = n/10;  // 101/10=10  then  n=10
        i++;
    }
    cout<<ans<<endl;
}

/*
 101
 5
 
 
   1     0     1
pow(2,2  2,1   2,0)
 
 ignore 0 = 2,2=4  and 2,0=1
 
               4 + 1 = 5
 */
