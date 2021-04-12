#include<stdio.h>
struct student
{
    char name[50];
    char roll[30];
    double cgpa;
};
int main()
{
    FILE *fp;
    int choice,n;
    printf("Enter number of students:");
    scanf("%d",&n);
    printf("Enter a choice:(\n1:Display all Student's Info\n2:Enter new Student's Info\n3:Search student by roll\n4:Find student with highest CGPA):");
    scanf("%d",&choice);
    switch(choice)
        {
            case 1:
                {
                    FILE *fp=fopen("D:\\Student's Info.dat","rb");
                    if(fp==NULL)
                        printf("Sorry, the file doesn't exist");
                    else
                    {
                        struct student st[2];
                        int i;
                        for(i=0;i<2;i++)
                            fread(&st[i],sizeof(st[0]),2,fp);
                        for(i=0;i<2;i++)
                            printf("Student %d:\nName:%s\nRoll:%s\nCGPA:%lf\n",i+1,st[i].name,st[i].roll,st[i].cgpa);

                            fclose(fp);
                    }
                }
                break;

            case 2:
                {
                    FILE *fp=fopen("D:\\Student's Info.dat","ab");
                    if(fp==NULL)
                        printf("Doesn't exist");
                    else
                    {
                        struct student st[n];
                        int i;
                        for(i=0;i<n;i++)
                        {
                            printf("Student %d:\n",i+1);
                            getchar();
                            printf("Input name:");
                            gets(st[i].name);
                            printf("Enter roll:");
                            gets(st[i].roll);
                            printf("Enter CGPA:");
                            scanf("%lf",&st[i].cgpa);

                        }
                        for(i=0;i<n;i++)
                            fwrite(&st[i],sizeof(st[0]),n,fp);
                        fclose(fp);
                    }
                }
                break;

            case 3:
                {
                    char r[30];
                    printf("Enter roll to search for:");
                    gets(r);
                    getchar();
                    FILE *fp=fopen("D:\\Student's Info.dat","rb");
                    if(fp==NULL)
                        printf("Sorry, the file doesn't exist");
                    else
                    {
                        char rolls[2][30];
                        struct student st[2];
                        int i,location;
                        for(i=0;i<2;i++)
                            {
                                fread(&st[i],sizeof(st[0]),2,fp);
                                rolls[i][30]=st[i].roll;
                            }

                        for(i=0;i<2;i++)
                            {
                                if(strstr(rolls[i][30],r))
                                {
                                    location=i;
                                    printf("Name:%s\nRoll:%s\nCGPA:%lf",st[location].name,st[location].roll,st[location].cgpa);
                                }

                            }

                            fclose(fp);
                    }
                }
                break;

            case 4:
                {
                    double maxCgpa;

                    FILE *fp=fopen("D:\\Student's Info.dat","rb");
                    if(fp==NULL)
                        printf("Sorry, the file doesn't exist");
                    else
                    {
                        double grades[n];
                        struct student st[n];
                        int i,location;
                        for(i=0;i<n;i++)
                            {
                                fread(&st[i],sizeof(st[0]),n,fp);
                                grades[i]=st[i].cgpa;
                            }
                        maxCgpa=grades[0];
                        for(i=0;i<n;i++)
                            {
                                if(grades[i]>maxCgpa)
                                    {
                                        maxCgpa=grades[i];
                                        location=i;
                                    }
                                printf("Student with highest CGPA:\nStudentName:%s\nRoll:%s\nCGPA:%lf",st[location].name,st[location].roll,st[location].cgpa);


                            }

                            fclose(fp);
                    }
                }
                break;

            default:
                printf("Invalid input");
                break;
        }
    return 0;
}
