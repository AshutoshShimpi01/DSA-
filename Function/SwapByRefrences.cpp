#include <iostream>
#include<vector>
using namespace std;

void swap(int &a,int &b) //Passing by refrences(&) required for func
{
    int temp=a;
    a=b;
    b=temp;
   
}
int main()
{
    int a=3;
    int b=5;
    cout<<a<<" "<<b<<endl;
    swap(a,b);
    cout<<a<<" "<<b<<endl;
}
/*
 3 5
 5 3
 */
