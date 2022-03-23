#include <iostream>
using namespace std;

int firstOcc(int a[],int n,int i,int key)
{
    if(i==n)
    {
        return -1;
    }
    if(a[i] == key)
    {
        return i;
    }
   return firstOcc(a,n, i+1,key);
}

int lastOcc(int a[],int n,int i,int key)
{
    if(i==n)
    {
        return -1;
    }
    int restArray = lastOcc(a,n,i+1,key);
    if(restArray != -1)
    {
        return restArray;
    }
    if(a[i] == key)
    {
        return i;
    }
    return -1;
}
int main()
{
    
    int a[] = {1,2,3,4,2,5};
    
    cout<<"First Occerance of index 2 is:"<<firstOcc(a, 6, 0, 2)<<endl;
    cout<<"Last Occerance of index 2 is:"<<lastOcc(a,6,0,2)<<endl;

    return 0;
}
/*
 First Occerance of index 2 is:1
 Last Occerance of index 2 is:4
 */
