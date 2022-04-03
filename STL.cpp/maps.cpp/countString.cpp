/*
 Question-
 Given N strings, print unique strings
 in lexiographical(increasing)Order with their frequency
 N <= 10^5
 |s|<= 100
 */
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
    map<string,int> m;
    
    int n;
    cin>>n;
    for(int i=0;i<n;++i)
    {
        string s;
        cin>>s;
        m[s]++;
    }
    for(auto pr : m)
    {
        cout<< pr.first <<" "<<pr.second<<endl;
    }
}
/*
 
 input-
 8
 abc
 def
 abc
 ghi
 jkl
 ghj
 ghj
 abc
 
 Output-
 abc 3
 def 1
 ghi 1
 ghj 2
 jkl 1
 
 */
