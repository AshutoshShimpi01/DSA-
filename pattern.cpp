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

