#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int temp=n;
    int rev=0,rem;
    
    while(temp!=0)
    {
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
        
        cout<<"reminder is:"<<rem<<"  ";
        cout<<"reverse is:"<<rev<<" ";
        cout<<"temp is:"<<endl;
    }
    if(n==rev)
    {
    cout<<n<<"palendrome no";
    }
    else
    {
        cout<<n<<"not palindrome";
    }
    return 0;
}
/*
 
 1221
 reminder is:1  reverse is:1 temp is:
 reminder is:2  reverse is:12 temp is:
 reminder is:2  reverse is:122 temp is:
 reminder is:1  reverse is:1221 temp is:
 1221palendrome no
 
 */

    
    










#include<iostream> 
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    for(int i=1; i<=n; i++)
    {
        int count=1;
        for(int j=1; j<i; j++)
        {
            cout<<count;
            count++;
        }
        for(int m=1; m<i+1; m++)
        {
            cout<<count;
            count--;
        }
        cout<<endl;
    }
    
}
/*
 output-
 
 6
 1
 121
 12321
 1234321
 123454321
 12345654321
 Program ended
 */

******************************************************************


