#include<iostream>
#include<vector>
using namespace std;


void printVect(vector<int> &v)
{
    cout<<"size: "<<v.size()<<endl; // here  display size of vector we take
    for(int i=0;i<v.size();++i)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main()
{
    int N;
    cin>>N;
    vector<int> v[N];
    for(int i=0;i<N;++i)
    {
    int n;
    cin>>n;             // here we take array length
    for(int j=0;j<n;++j)
    {
        int x;
        cin>>x;        // here we take array elements
        v[i].push_back(x); // here array elements pushback in vector length we declare
    }
    }
    for(int i=0;i<N;++i)
    {
    printVect(v[i]);
    }
}

/*
 size: 3
 1 2 3
 size: 3
 3 4 5
 size: 2
 1 2 
 */
