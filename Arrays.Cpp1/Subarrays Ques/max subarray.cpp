#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++){
            for(int k=i;k<=j;k++)
            {
                cout<<a[k]<<" ";
            }
            cout<<endl;
        }
       
    }
}
/*
 4
 -1 2 7 4
 -1
 -1 2
 -1 2 7
 -1 2 7 4
 2
 2 7
 2 7 4
 7
 7 4
 4
 Program ended
 */
