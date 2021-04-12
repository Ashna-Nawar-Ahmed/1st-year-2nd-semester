#include<stdio.h>
#include<string.h>
int main()
{
    char hexcode[8];
    printf("Enter hexcode:");
    gets(hexcode);
    double rgb[3];
    char digits[16] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
    int i, j, k, l = 0, val = 0,m;


    for (i = 1; i < strlen(hexcode); i++)
    {
        m=16;
        val=0;
        for (k = 0; k<2; k++)
        {

            for (j = 0; j<16; j++)
                if (hexcode[i] == digits[j])
                {
                    val += j*m;
                    m=1;
                }


        }
        if (i % 2 != 0)
        {
            rgb[l] = val;
            l++;
        }
    }
    printf("RGB=%lf %lf %lf",rgb[0],rgb[1],rgb[2]);

}

