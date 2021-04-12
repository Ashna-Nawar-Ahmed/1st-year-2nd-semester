#include<stdio.h>
struct matrix
{
    double a[3][3];
};
struct matrix sum(struct matrix o,struct matrix p);
void printMatrix(struct matrix m);
int main()
{
    struct matrix x,y,add;
    x.a[0][0]=1,x.a[0][1]=2,x.a[0][2]=3,x.a[1][0]=4,x.a[1][1]=5,x.a[1][2]=6,x.a[2][0]=7,x.a[2][1]=8,x.a[2][2]=9;
    y.a[0][0]=1,y.a[0][1]=2,y.a[0][2]=3,y.a[1][0]=4,y.a[1][1]=5,y.a[1][2]=6,y.a[2][0]=7,y.a[2][1]=8,y.a[2][2]=9;
    add=sum(x,y);
    printMatrix(add);
    return 0;
}
struct matrix sum(struct matrix o,struct matrix p)
{
    int i,j;
    struct matrix m;
    for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        m.a[i][j]=o.a[i][j]+p.a[i][j];
    return m;
}
void printMatrix(struct matrix m)
{
    int i,j;
    for(i=0;i<3;i++)
        for(j=0;j<3;j++)
            printf("%d ",m.a[i][j]);
        printf("\n");
}
