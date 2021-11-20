#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                cout<<"1";
            }
            else{
                cout<<"0";
            }
        }cout<<endl;
        
    }
    
    
    return 0;
}
/* output-
1
01
101
0101
10101
010101 */



*********************************************************************

#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(j<=n-i){
                cout<<" ";
            }
            else{
                cout<<"*";
            }
        }
        cout<<endl;
    }
    return 0;
}
/*OUTPUT-
    *
   **
  ***
 ****
*****
       */


#include<iostream>
using namespace std;
int main()
{
    int row,col;
    cin>>row>>col;
    
    for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}
/* output-
*****
*****
*****
***** */


*********************************************************************





#include<iostream>
using namespace std;
int main()
{
    int row,col;  //holo rectangle pattern         
    cin>>row>>col;
    
    for(int i=1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i==1 || i==row || j==1 || j==col){
                cout<<"#";
            }else{
                cout<<" ";
            }
        }
        cout<<endl;
    }
    return 0;
}
/*  output- 
######
#    #
#    #
#    #
######  */

*********************************************************************



#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n+1-i; j++){
            cout<<j<<" ";
        }
        cout<<endl;
    }
    
    
    return 0;
}
/* output-
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/

*********************************************************************


#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            cout<<"*";
         
        }
        cout<<endl;
    }
    
    return 0;
}
/* output-
*****
****
***
**
*
        */

*********************************************************************


#include<iostream>
using namespace std;
int main()
{
    
    
    for(int i=70; i>=65; i--){
        for(int j=70; j>=65; j--){
            cout<<(char)j;
        }
        cout<<endl;
    }
    
    
    return 0;
}
               
/* output-   ASCII value a=65 & z=90
 
 FEDCBA
 FEDCBA
 FEDCBA
 FEDCBA
 FEDCBA
 FEDCBA
 
 
 
 */

*********************************************************************

#include <iostream>
using namespace std;
int main()
{
    int n,count=1;
    cin>>n;
    
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            cout<<count++<<" ";
        }
        cout<<endl;
    }
    return 0;
}
/*
 output-
 
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */

*********************************************************************

class Solution
{
public:
    int largest(vector<int> &arr, int n)
    {
        int mx=INT_MIN;
        for(int i=0; i<n; i++){
            mx= max(mx,arr[i]);
        }
        return mx;
    }

};

*********************************************************************


#include <iostream>
using namespace std;

int main()
{
    int a,b;

    cin>>a>>b;
    
    for(int i=a; i<=a*b; i++)
    {
        if(i%a==0 && i%b==0)
        {
            cout<<i<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}


/*
 output-
 
 Lowest multiple value (LCM)
 
 5,3
 out-15
 */
*********************************************************************

#include <iostream>
using namespace std;

int main()
{
    int a,b,i,num;
    
    cin>>a>>b;
    
    for(num=a; num<=b; num++)
    {
        for(i=2; i<num; i++)
            {
            if(num%i==0)
            {
                break;
            }
        }
        
    if(i==num)
    {
        cout<<num<<endl;
    }
    }
    return 0;
}


/*
 output-
 prime no. with user define no.-10 to 20
 10
 20
 11
 13
 17
 19
 */
*********************************************************************


