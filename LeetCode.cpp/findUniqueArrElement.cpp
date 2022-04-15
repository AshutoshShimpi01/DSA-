#include <iostream>
#include<math.h>
using namespace std;


int findUnique(int arr[],int size)
{
    int ans = 0;
    for(int i=0;i<size;i++)
    {
        ans = ans ^ arr[i];
    }
    return ans;
}
int main()
{
    int arr1[] = {2,3,1,6,3,6,2,1,10};
    
    cout<<findUnique(arr1, 9)<<endl;
   
}

/*
 10
 */
