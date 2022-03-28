#include<iostream>
#include<math.h>
#include<bitset>
#include<vector>

using namespace std;

void PrintVct(vector<int>v)
{
    cout<< "size: " << v.size() << endl;
    for(int i=0;i<v.size();++i)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main()
{
    vector<int> v;
    int n;
    cin >> n;
    for(int i=0;i<n;++i)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    PrintVct(v);
}
/*
5
1 2 3 4 5
size: 5
1 2 3 4 5 
*/
