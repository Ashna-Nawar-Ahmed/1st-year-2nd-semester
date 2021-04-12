#include<stdio.h>
int main()
{
    int ar[5],i,j,temp;
    printf("Enter 5 integers:");
    for(i=0; i<5; i++)
        scanf("%d",&ar[i]);
    for(j=0; j<4; j++)
    {
        for(i=0; i<4-j; i++)
        {

            if(ar[i]>ar[i+1])
            {
                temp=ar[i+1];
                ar[i+1]=ar[i];
                ar[i]=temp;

            }
        }
    }
    printf("Ascending order:");
    for(i=0; i<5; i++)
        printf("%d ",ar[i]);

    for(j=0; j<4; j++)
    {
        for(i=0; i<4-j; i++)
        {

            if(ar[i]<ar[i+1])
            {
                temp=ar[i+1];
                ar[i+1]=ar[i];
                ar[i]=temp;

            }
        }
    }
    printf("\nDescending order:");
    for(i=0; i<5; i++)
        printf("%d ",ar[i]);


    return 0;
}
