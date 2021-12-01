#include<iostream>
#include<climits>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int array[n];
    for(int i=0;i<n;i++)
    {
        cin>>array[i];
    }
    int maxNo=INT_MIN;
    int minNo=INT_MAX;
    for(int i=0;i<n;i++)
    {
        maxNo=max(maxNo, array[i]);
        minNo=min(minNo, array[i]);
    }
    cout<<maxNo<<" "<<minNo<<endl;
    
    return 0;
}
/*
5
21 5 100 34 55
100 5
Program ended 
*/
