#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    bitset<16> x(n);  // bitset = 32,16,8,4,2,1  (length =00000000000000)
    cout<<"Binary of"<<n<<":";
    cout<<x;
}

/*
 123
 Binary of123:00000000000000000000000001111011
 */
