#include <iostream>
#include <map>
#include<vector>
using namespace std;

void print(map<int,string> &m)
{
    cout<<m.size()<<endl;
    for(auto &pr :m)
    {
        cout<<pr.first<<" "<<pr.second<<endl;
    }
}
int main()
{
    map<int,string> m;
    m[1] = "abc";
    m[5] = "def";
    m[3] = "xyz";
    
    m.insert({4,"ijk"});
    m[6];
    print(m);
    
}
/*
 5
 1 abc
 3 xyz
 4 ijk
 5 def
 6 
 */
