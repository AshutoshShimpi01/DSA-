/*
to get same no.
n=546                                                                          LCM=2
5*100+4*10+6*1=546                               no.-14 Convert into Binary:-  14/2=7 rem 0
In Binary n=101                                                                 7/2=3 rem 1
1*2^2 + 0*2^1 + 1*2^0                                                           3/2=1 rem 1
  4   +  0    +  1  = 5                                                         1/2=0 rem 1    Reverse=(1110)

to get lastdigit
n=123
n%10=3

to get starting no.
n=123
n/10=12

to get reverse no.
n=123, ans=0
formula- digit= n%10
ans=ans*10+digit= 0*10+3=3,3*10+2=32,32*10+1=321


decimal To Binary-
int bit = n&1;
        
        ans = (bit * pow(10,i) ) + ans;  // Formula = Bit*10powi+ans
        
        n = n>>1;  //Rigth shift mean we divide no. by 2.
        i++;
        
        
Binary To Decimal-
int digit = n%10;
        
        if(digit==1)
        {
        ans = ans + pow(2,i);
        }
        n = n/10;  // 101/10=10  then  n=10
        i++;
        

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
