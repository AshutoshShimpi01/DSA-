// PERFECT CODE
#include <iostream>
using namespace std;

int is_Numberprime(int num)
{
    int reminder=0;
    for(int i=2;i<=num/2;i++)
    {
        reminder=num%i;
        
        if(reminder==0)
        {
            return 1;
        }
        
    }
    return 0;
}
int main() {
    int n,isPrime;
    cin>>n;
    
    isPrime=is_Numberprime(n);
    
    
    if(isPrime==0)
    {
        cout<<"not prime";
    }
    else{
        cout<<"prime";
    }

    return 0;
}




















_________________________________________
#include<iostream>
#include<math.h>
using namespace std;

    

bool isPrime(int num)
{
    for(int i=2; i<=sqrt(num); i++)
    {
        if(num%i==0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int a,b;
    cin>>a>>b;
    
    for(int i=a; i<=b; i++)
    {
        if(isPrime(i))
        {
            cout<<i<<endl;
        }
    }
    return 0;
}


/*
 output-
 10
 20-
 11
 13
 17
 19
 Program ended
 */

************************************

#include <iostream>
using namespace std;

int main(){
    int b;
    cin>>b;
    int i;
    for(i=2; i<b;i++)
    {
        if(b%i==0)
        {
            cout<<"Non-Prime"<<endl;
            break;
        }
    }
        if(i==b)
        {
            cout<<"Prime"<<endl;
        }
    return 0;
}

*************************************

//
//  main.cpp
//  PracticeXcode
//
//  Created by ♠️ᴅᴀᴅ's ɢɪғᴛ♠️ on 07/02/22.
//

#include <iostream>
using namespace std;
int main() {
    int n,num;
    cin>>n;
    
    for(int i=2;i<=n/2;i++)
    {
        num=n%i;
        
    }
    if(num==0)
    {
        cout<<"not prime";
    }
    else{
        cout<<"prime";
    }

    return 0;
}

