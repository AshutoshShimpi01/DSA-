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
