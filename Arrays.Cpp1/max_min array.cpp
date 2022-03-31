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

__________________________________
    
#include<iostream>
#include<climits>
using namespace std;

int getMax(int arr[],int n)
{
    int maxi = INT_MIN;
    for(int i=0;i<n;i++)
    {
        maxi = max(maxi,arr[i]);
    }
    return maxi;
}
int getMin(int arr[],int n)
{
    int mini = INT_MAX;
    for(int i=0;i<n;i++)
    {
        mini = min(mini,arr[i]);
    }
    return mini;
}
int main()
{
    int n;
    cin>>n;
    int arr[100];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    cout<<"Maximum value is: "<<getMax(arr,n)<<endl;
    cout<<"Manimum value is: "<<getMin(arr,n)<<endl;
    return 0;
}

/*
 5
 4 12 5 6 7
 Maximum value is: 12
 Manimum value is: 4
 */



*************************************************
#include <iostream>
using namespace std;
    

int main()
{
    int mx=-1999;
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<n;i++)
    {
        mx=max(mx, arr[i]);
        cout<<mx<<endl;
    }
    return 0;
    
}
/*
 6
 0 -9 1 3 -4 5
 0
 0
 1
 3
 3
 5
 Program ended
 */
