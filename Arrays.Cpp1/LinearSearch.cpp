#include<iostream>
#include<climits>
using namespace std;

int LinearSearch(int array[],int n,int key)
{
    for(int i=0;i<n;i++)
    {
    if(key==array[i])
        return i;
}
    return -1;
}
int main()
{
    int n;
    cin>>n;
    
    int array[n];
    for(int i=0;i<n;i++)
    {
        cin>>array[i];
    }
    int key;
    cin>>key;
    cout<<LinearSearch(array,n,key)<<endl;
    return 0;
}
/*
 5
 54 34 76 87 56
 76
 2
 Program ended with exit code: 0
 */
