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

__________________________________
    
 
#include<iostream>
#include<vector>
using namespace std;


void printVec(vector<int> &v)
{
    cout<<"size: "<<v.size()<<endl;
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
    vector<vector<int>> v;
    for(int i=0;i<N;++i)
    {
        int n;
        cin>>n;
        vector<int> temp;
    
    for(int j=0;j<n;++j)
    {
        int x;
        cin>>x;
        temp.push_back(x);
    }
    v.push_back(temp);
    }
v[0].push_back(10);  // at 0th vector add 10
v.push_back(vector<int> ());
for(int i=0;i<v.size();++i)
{
    printVec(v[i]);
}
cout<<v[0][1];
}

/*
 3
 3
 1 2 3
 3
 3 4 5
 2
 1 2
 
 Output-
 size: 4
 1 2 3 10
 size: 3
 3 4 5
 size: 2
 1 2
 size: 0

 2
 */

