#include<stdio.h>
struct matrix
{
    double val[3][3];
};
struct matrix addition(struct matrix b[],int i, int j);
struct matrix multiplication(struct matrix e[],int i, int j,int k);
struct matrix transpose(struct matrix f[],int i, int j);
void print(struct matrix g,struct matrix h,struct matrix l,int i, int j);
int main()
{
    struct matrix a[2];
    struct matrix add,mul,trns;
    int c,d;
    a[0].val[0][0]=1,a[0].val[0][1]=2,a[0].val[0][2]=3,a[0].val[1][0]=4,a[0].val[1][1]=5,a[0].val[1][2]=6,a[0].val[2][0]=7,a[0].val[2][1]=8,a[0].val[2][2]=9;
    a[1].val[0][0]=1,a[1].val[0][1]=2,a[1].val[0][2]=3,a[1].val[1][0]=4,a[1].val[1][1]=5,a[1].val[1][2]=6,a[1].val[2][0]=7,a[1].val[2][1]=8,a[1].val[2][2]=9;
    add=addition(a,3,3);
    mul=multiplication(a,3,3,3);
    trns=transpose(a,3,3);
    print(add,mul,trns,3,3);


    return 0;
}
struct matrix addition(struct matrix b[],int i,  int j)
{
    int a,c;
    struct matrix d;
    for(a=0; a<i; a++)
    {
        for(c=0; c<j; c++)
        {
            d.val[a][c]=b[0].val[a][c]+b[1].val[a][c];
        }



    }
    return d;
}

struct matrix multiplication(struct matrix e[],int i,  int j,int k)
{
    int a,b,c;
    double sum;
    struct matrix d;
    for(a=0; a<i; a++)
    {
        for(b=0; b<j; b++)
        {
            for(c=0; c<k; c++)

            {
                sum+=e[0].val[a][c]*e[1].val[c][b];
            }
            d.val[a][b]=sum;
            sum=0;
        }



    }
    return d;
}
struct matrix transpose(struct matrix f[],int i,  int j)
{
    int a,b;
    struct matrix d;
    for(a=0; a<i; a++)
    {
        for(b=0; b<j; b++)
        {
            d.val[a][b]=f[0].val[b][a];
        }



    }
    return d;
}
void print(struct matrix g,struct matrix h,struct matrix l,int i, int j)
{
    int a,b;
    printf("Matrix Addition:\n");
    for(a=0; a<i; a++)
    {
        for(b=0; b<j; b++)
        {
            printf("%lf\t",g.val[a][b]);
        }
        printf("\n");
    }

    printf("\nMatrix Multiplication:\n");
    for(a=0; a<i; a++)
    {
        for(b=0; b<j; b++)
        {
            printf("%lf\t",h.val[a][b]);
        }
        printf("\n");
    }
    printf("\nMatrix Transposition:\n");
    for(a=0; a<i; a++)
    {
        for(b=0; b<j; b++)
        {
            printf("%lf\t",l.val[a][b]);
        }
        printf("\n");
    }
}




