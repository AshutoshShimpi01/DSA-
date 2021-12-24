#include <iostream>
using namespace std;

int main() {
    int n,m;
    cin>>n>>m;
    int a[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cin>>a[i][j];
        }
    }
        cout<<"matrix is :\n";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                cout<<a[i][j]<<" ";
            }
            cout<<"\n";
    }
    return 0;
}
/*
 3 3
 21 54 24 22 31 25 76 45 61
 matrix is :
 21 54 24
 22 31 25
 76 45 61
 Program ended
 */
