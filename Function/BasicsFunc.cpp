/*

Refrences(&)
Arrays always pass by Refrences not pass by values


REFRENCES-

void incerment(int n)   //Pass by value         // void increment(int &n)= (Pass by reffrence) Now accual variable passs 
{
    n++;                                                     outpUt- 3
                                                                     4  
}. 
int main()
{
    int a=3;
    cout<<a<<endl;
     incerment(a);
    cout<<a<<endl;
}
/*
 3
 3   // not increase value coz variable copy pass to func not variable. by passing &n so
 */

*/
