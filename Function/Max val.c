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


********************************



//
//  main.c
//  arrays.c
//
//  Created by ♠️ᴅᴀᴅ's ɢɪғᴛ♠️ on 03/01/22.
//

#include<stdio.h>

int Maximum(int no1,int no2,int no3)
{
   if(no1 > no2 && no1 > no3)
   {
       return no1;
   }
   else if(no2 > no1 && no2 >no3)
   {
       return no2;
   }
    else
   {
       return no3;
   }
}
int main()
{
    int a=0;
    int b=0;
    int d=0;
    
    printf("Enter The 1st No.\n\t");
    scanf("%d",&a);
    printf("Enter The 2nd No.\n\t");
    scanf("%d",&b);
    printf("Enter The 3rd No.\n\t");
    scanf("%d",&d);
    
    int c = Maximum(a,b,d);
    printf("%d is Greater Number\n",c);
    return 0;
}

// output
/*
 Enter The 1st No.
     30
 Enter The 2nd No.
     10
 Enter The 3rd No.
     5
 30 is Greater Number
 Program ended
 */
