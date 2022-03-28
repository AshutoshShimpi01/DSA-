#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

void func(int n)
{
    if(n==0) return;;
    func(n-1);
    cout<<n<<endl;
        
}
int main()
{
    func(5);
}

/*
 1
 2
 3
 4
 5
 
 In Recursion first call only function,
 not cout<< statement.
 because we call function before cout<<
 
 so function can run=
    n=5
 (n-1)=4
 (n-1)=3
 (n-1)=2
 (n-1)=1
 
 after function execution complete then,
 
 cout start from desending order 1 the 2
 
 
 */
