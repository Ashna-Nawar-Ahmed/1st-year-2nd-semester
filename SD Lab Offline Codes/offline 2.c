#include<stdio.h>
void print_array (int arr[][4])
{
    int i, j;
    for(i = 0; i<6 ; i++)
    {
        for(j = 0; j<4; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int ar[6][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};
    int i, j, temp;

    for(i = 0; i<6 ; i++)
    {
        for(j = 0; j<4; j++)
        {
            if (j%2 == 0)
            {
                temp = ar[i][j];
                ar[i][j] = ar[i][j+1];
                ar[i][j+1] = temp;
            }
        }
    }
    print_array(ar);
    return 0;
}
