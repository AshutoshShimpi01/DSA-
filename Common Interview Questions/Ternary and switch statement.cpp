//Ternary Operator= ?:

#include<iostream>
using namespace std;
int main()
{
    int n=2;
    int m=0;
    
    m=n>6?1:2;
        cout<<2<<endl;
   
    return 0;
}
/* output-
 2
 Program ended
*/

***********************************

//Switch statement

#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
   
    
    switch (n) {
            
        case 1:
            cout<<"ashu";
            break;
        case 2:
            cout<<"Yogesh";
            break;
        case 3:
            cout<<"Shri";
            break;
        case 4:
            cout<<"Keshav";
        case 5:
            cout<<"YASK"<<endl;
            break;
        default:
            break;
    }
    return 0;
}
/* output-
 5
 YASK
 Program ended
*/

**************************************************
