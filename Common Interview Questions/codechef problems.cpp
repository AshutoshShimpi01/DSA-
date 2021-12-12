/* Finally, College has started calling students back to campus. 
There are so many students and thus due to some safety measures the college can’t call back all the students on the same day.
It currently has the capacity of screening K students on a single day. There is a total of N students. 
What's the minimum number of days required for all the students to be back on the campus? 

sample input-
 3
 3 3
 3 2
 4 3
 sample output-
 1
 2
 2

 Program ended
*/


#include<iostream>
#include<math.h>
using namespace std;

int main(){


    int t;
    cin>>t;

    while(t--){
        int k,n;
        cin>>n>>k;
        int sum=n, count=0;
        while(sum>0){
            sum=sum-k;
            count++;
        }
        cout<<count<<endl;
    }
}
/*
 output-    codechefProb-
 
 3
 3 3
 1
 3 2
 2
 4 3
 2
 
 Program ended
 */
********************************************************

// Record Breaking days Question subarray
#include <iostream>
using namespace std;
    

int main()
{
    int n;
    cin>>n;
    int a[n+1];
    a[n]=-1;
    
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
        if(n==1)
        {
            cout<<-1;
        return 0;
        }
    int ans=0;
    int mx=-1;
    for(int i=0;i<n;i++)
    {
        if(a[i]>mx && a[i]>a[i+1])
        {
            ans ++;
        }
        mx=max(mx, a[i]);
    }
    cout<<ans<<endl;

    return 0;
    
}
/*
 8
 1 2 0 7 2 0 2 2
 2  // Record Breaking days
 Program ended
 */
