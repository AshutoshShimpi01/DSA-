#include <iostream>
using namespace std;
void Array(int arr[5]);
int main()
{
    
    int arr1[5]={10,20,30,40,50};
    int arr2[5]={5,5,4,3,2};
    Array(arr1);
    Array(arr2);
}
void Array(int arr[5])
{
    cout<<"Print Array 2"<<endl;
    for(int i=0;i<5;i++)
    {
        cout<<arr[i]<<endl;
    }
}
/*
 10
 20
 30
 40
 50
 Print Array 2
 5
 5
 4
 3
 2
 Program ended
 */
