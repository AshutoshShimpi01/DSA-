#include<stdio.h>
void fun()
{
    auto int i=10;
    i++;
    printf("value of i from fun is :%d\n",i);
}
void gun()
{
    static int i=10;
    i++;
    printf("value of i from gun is :%d\n",i);
}
int main()
{
    printf("Inside main\n");
    fun();
    fun();
    fun();
    gun();
    gun();
    gun();
    gun();
    
    return 0;
}
/*
 output-
 Inside main
 value of i from fun is :11     by using auto storage class
 value of i from fun is :11
 value of i from fun is :11
 value of i from gun is :11     by using static storage class
 value of i from gun is :12
 value of i from gun is :13
 value of i from gun is :14
 Program ended with exit code: 0
 */
