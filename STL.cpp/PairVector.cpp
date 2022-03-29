#include<iostream>
#include<vector>
using namespace std;


void printVec(vector<pair<int,int> > &v)
{
    cout<<"size: " << v.size() << endl;
    for(int i=0;i<v.size();++i)
    {
            cout<<v[i].first<< " "<<v[i].second<<endl;
    }
        cout<<endl;
}
int main()
{
    vector<pair<int,int> > v = {{1,2},{2,3},{3,4}};
    printVec(v);
}

/*
 size: 3
 1 2
 2 3
 3 4

 */


//INPUT FROM USER


#include<iostream>
#include<vector>
using namespace std;


void printVec(vector<pair<int,int> > &v)
{
    cout<<"size: " << v.size() << endl;
    for(int i=0;i<v.size();++i)
    {
            cout<<v[i].first<< " "<<v[i].second<<endl;
    }
        cout<<endl;
}
int main()
{
    vector<pair<int,int>> v;
    printVec(v);
    int n;
    cin>>n;
    for(int i=0;i<n;++i)
    {
        int x,y;
        cin>>x>>y;
        v.push_back({x,y});
    }
    printVec(v);
}

/*
 size: 3
 1 2
 3 4
 5 6

 */

