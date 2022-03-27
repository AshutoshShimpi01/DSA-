#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int m=n;
    int ans,mask = 0;
    
    
    if(n==0)
    {
        return 1;
    }
    
    while(m!=0)
    {
        
            mask = (mask<<1) | 1;
            m = m>>1;
            
        }
        
         ans = (~n) & mask;
        cout<<ans;
    
    return 0;
        
    }
    
    


/*
 5
 2
 
 implementation-
 
 mask=0000      mask | 1
      0001
     -----
mask= 0001
 
mask<<1= 0010  mask | 1
         0001
         ----
         0011   again same finally we got mask=1111
 
 then, m= 101(5) m>>1 010 when m=0 while loop end
 
 then ans=0,  ans=(~n) & mask
 
     n=101
 
    ~n=0010
  mask=1111
 ------------
       0010(2)   PerfectAns
  
 
 */
