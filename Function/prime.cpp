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
        cout<<"prime";
    }
    else{
        cout<<"not prime";
    }

    return 0;
}





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
    int isPrime=0;
    for(int i=1;i<=100;i++)
    {
        isPrime=is_Numberprime(i);

        if(isPrime==0)
            {
                cout<<i<<endl;
            }
    }
    
    
    
    
    

    return 0;

}

/*
 1
 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 31
 37
 41
 43
 47
 53
 59
 61
 67
 71
 73
 79
 83
 89
 97
 */



************************************


#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int i;
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            cout<<"not prime";
            break;
        }
    }
        if(n==i)
        {
            cout<<"prime no.";
  
        }
 
    return 0;
}
/*
 9
 not prime
 */


*************************************



