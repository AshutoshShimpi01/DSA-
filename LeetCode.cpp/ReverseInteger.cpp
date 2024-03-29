#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int ans=0;
    
    while(n!=0)
    {
        int digit = n%10;
        
        if(ans > INT_MAX/10 || ans < INT_MIN/10)  // coz we do ans*10 then ans value greater than integer datatype. hence we divide by 10 then it gives small value
        {
            return 0;
        }
        
        ans = ans * 10 + digit;
        
        n = n/10;    //n=1234,123,12,1,0 loop end
    }
    cout<<ans<<endl;
}

/*
 12345
 54321
 
 digit means reminder
 
 
 */
