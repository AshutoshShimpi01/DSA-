// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>

using namespace std;

bool palindrome(string str, int i){
    
    if(i!=str.size()){
    
    return str[i]==str[str.size()-i-1] && palindrome(str,i+1);
    }
    else{
        return true;
    }
}

int main() {
    // Write C++ code here
    string str;
    cin>>str;
    
    if(palindrome(str, 0)){
        cout<<"Palindrome";
    }
    else{
        cout<<"Not a Palindrome";
    }
    return 0;
}
