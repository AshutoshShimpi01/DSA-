#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    int i,rev=0;
    
    
    cout<<"Enter a numb";
    cin>>i;
    while(i>0)
    {
        rev=(rev*10)+i%10; // i=234 then 234/10= always reminder=lastdigit=4
        i=i/10; // 234/10=quotient is 23.4 so int is 23 and 4 is ignor. Then 23/10=2.3 so 3 ignore
        
    }
    cout<<rev;
return 0;
}


/*
 output-
 123456-
 654321
 Program ended
 */
