#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int ans = 0;
    int i=0;
    
    while(n!=0)
    {
        int bit = n&1;
        
        ans = (bit * pow(10,i) ) + ans;  // Formula = Bit*10powi+ans
        
        n = n>>1;  //Rigth shift mean we divide no. by 2.
        i++;
    }
    cout<<"Answer is: "<<ans<<endl;
}

/*
 n=5
 Answer is: 101
 
 bit = 5&1
       101
       001
    -------
       001
 
 n>>1= 101=010
           001
          ----
           000
 n>>1= 010=001
           001
        -------
           001
 
 finally we got. 5=(101)
 */
