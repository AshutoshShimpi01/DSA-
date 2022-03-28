#include<iostream>
#include<math.h>
#include<bitset>
using namespace std;

int digitSum(int n)
{
    if(n==0) return 0;
    return digitSum(n/10) + (n%10);
}
int main()
{
    int n;
    cin>>n;
    cout<<digitSum(n);
    
}

/*
 1234
 10
 
 
digitSum = our entered no. sum
 
 n=1234
 
 in function we take n/10
 we get 123
 
 and we store 4 as n%10
 we get 4
 
 SIMPLE
 */
