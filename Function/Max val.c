#include <stdio.h>

int MaxNo(int val1,int val2)
{
    if(val1>val2)
    {
        return val1;
    }
    else{
        return val2;
    }
}
int main()
{
    int no1=0;
    int no2=0;
    
    
    printf("Enter t val of no1\t");
    scanf("%d",&no1);
    printf("Enter t val of no.2\t");
    scanf("%d",&no2);
    int iret=MaxNo(no1, no2);
    
    printf("Max value is %d\t",iret);
 
    return 0;
}
