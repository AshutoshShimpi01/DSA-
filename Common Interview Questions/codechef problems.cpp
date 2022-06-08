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

/*
Isyana is given the number of visitors at her local theme park on N consecutive
days. The number of visitors on the i-th day is Vi
. A day is record breaking if it
satisfies both of the following conditions:
● The number of visitors on the day is strictly larger than the number of
visitors on each of the previous days.
● Either it is the last day, or the number of visitors on the day is strictly larger
than the number of visitors on the following day.
Note that the very first day could be a record breaking day!
Please help Isyana find out the number of record breaking days.
Input
The first line of the input gives the number of test cases, T. T test cases follow.
Each test case begins with a line containing the integer N. The second line
contains N integers. The i-th integer is Vi
.
Output
For each test case, output one line containing Case #x: y, where x is the test case
number (starting from 1) and y is the number of record breaking days.
Constraints
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ T ≤ 100.
0 ≤ Vi ≤ 2 × 105
.
Test set 1
1 ≤ N ≤ 1000.
Test set 2
1 ≤ N ≤ 2 × 105 for at most 10 test cases.
For the remaining cases, 1 ≤ N ≤ 1000.
*/

//Solution for Record Breaking
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
        if(a[i]>mx && a[i]>a[i+1]) // 2nd day value is greater than 1st and also 3rd.
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

-----------------------------------
/* 
 
 First line will contain T, number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three integers X,Y, and A as mentioned in the statement.
*/
 
 #include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int x,y,z;
	    cin>>x>>y>>z;
	    if(z>=x && z<y){
	        cout<<"YES"<<endl;
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
/* 
5 -Test Cases
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28
Output-
YES
NO
YES
NO
YES
