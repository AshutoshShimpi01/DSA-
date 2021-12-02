#include<iostream>
using namespace std;

int BinearSearch(int array[],int n,int key)
{
    int s=0;
    int e=n;
    while(s<=n)
    {
        int mid=(s+e)/2;
    
    if(key==array[mid])
    {
        return mid;
}
    else if(array[mid]>key)
    {
        e=mid-1;
    }
    else{
        s=mid+1;
    }
    return -1;
}

int main()
{
    int n,key;
    cin>>n;
    int array[n];
    for(int i=0;i<n;i++)
    {
        cin>>array[i];
    }
    cin>>key;
    cout<<BinarySearch(array,n,key);
    return 0;
}
