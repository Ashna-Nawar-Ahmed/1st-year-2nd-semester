#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
    char hex[7];
    int rgb[3];

    char digits[16]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    printf("Enter 6 digit hexcode(#):");
    gets(hex);
    int i,j,k,l=0,power=1;
    int val=0;

    for(i=0; i<strlen(hex); i++)
    {
        for(k=0; k<2; k++)
        {
            for(j=0; j<16; j++)
                if(hex[i]==digits[j])
                {
                    val+=j*pow(16,power);
                    power--;
                }
            if(i%2!=0)
            {
                rgb[l]=val;
                l++;
            }

        }
    }
    printf("RGB:");
    for(i=0;i<3;i++)
        printf("%d ",rgb[i]);
    return 0;
}
