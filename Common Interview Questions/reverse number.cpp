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
        rev=(rev*10)+i%10; // i=234 then 234/10= always reminder=lastdigit reverse=4. then (4*10=40)+(23%10)=3 so 40+3 rev=43 again same
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
**************____________************

//USING RECURSION

#include <iostream>
using namespace std;

void inc(int n)
{
    if(n==1)
    {
        cout<<"1"<<endl;
        return;
    }
    inc(n-1);
    cout<<n<<endl;
}
void dec(int n)
{
    if(n==1)
    {
        cout<<"1"<<endl;
        return;
    }
    cout<<n<<endl;
    dec(n-1);
}

int main()
{
    int n;
    cin>>n;
    inc(n);
    dec(n);
    return 0;
}
/*
 5
 1
 2
 3
 4
 5
 5
 4
 3
 2
 1
 */

