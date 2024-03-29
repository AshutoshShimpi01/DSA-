//Iterators are like a pointers

#include <iostream>
#include<vector>
using namespace std;

int main()
{
    vector<int> v={2,3,5,6,7};
    for(int i=0;i<v.size();++i)
    {
        cout<<v[i]<<" ";
    }
    cout<<endl;
    //Iterator
    
    vector<int> :: iterator it = v.begin();
    for(it=v.begin();it!=v.end();++it)
    {
        cout<<(*it)<<endl;
    }
}
/*
 2 3 5 6 7
 2
 3
 5
 6
 7
 */
