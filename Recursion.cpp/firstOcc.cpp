// find index

#include <iostream>
using namespace std;

int checjindex(int a[],int i,int n,int key )
{
    if(a[i]==n)
    {
        return -1;
    }
    if(a[i]==key)
    {
        return i;
    }
    return checjindex(a, n, i+1, key);
}

int main()
{
    
    int a[] = {1,2,3,4,2,5};
    
    cout<<checjindex(a,6,0,2);

    return 0;
}
/*
 1
 */
