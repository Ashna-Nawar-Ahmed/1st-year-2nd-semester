#include<stdio.h>
#include<string.h>
//structure declaration
struct type{
char name[30];
int a;
};
//f1 er prototype
struct type f1(struct type q);
//main function
int main(){
//2 ta variable,1ta te input dibo arek ta te return value store korbo
struct type p,m;
//Eikhane input dilam
strcpy(p.name,"NAME");
p.a=10;
puts(p.name);
printf("%d\n",p.a);

//f1 e just struct variable name ta pass korte hobe(in this case p). f1 er return 1 ta struct type variable (m) e store korlam
m=f1(p);
puts(m.name);
printf("%d",m.a);
return 0;

}
//f1 er return type e struct with type name,and parameter e new struct variable declare korte hobe.Ei q variable er values send kora p variable er equivalent.
struct type f1(struct type q){
strcat(q.name," UPDATED");
q.a=q.a+5;
//operation er sheshe just variable ta return korlei hobe.P.S: q er struct type and f1 er return struck type jeno same hoy.
return q;
};
