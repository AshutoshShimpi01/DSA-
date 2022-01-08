#include <stdio.h>

int main() {
    // insert code here...

    int No=4;
    int *p=&No;
    printf("size of integer %d\n",sizeof(No));
    printf("size of pointer %d\n",sizeof(&No));
    return 0;
}
/*
 Output-
 size of integer 4
 size of pointer 8
 Program ended with exit code: 0
 */

*********************************************


#include <stdio.h>
int main()
{
    
    int arr[5]={10,20,30,40,50};
    int *p=arr;
    char array[5]={'ashu','rushi','pawan','nayan','abhi'};
    char *pf=array;
  
    printf("%d\n",p);
    printf("%d\n",arr);
    printf("%u\n",arr+1);
    printf("%c\n",array);
    printf("%c\n",pf);
    printf("%c\n",array+1);
    printf("Print the array:\n",array+1);
    return 0;
}
/*
 Output-
 1876947456
 1876947456
 1876947460
 \350
 \350
 \351
 Print the array:
 Program ended with exit code: 0
 */
