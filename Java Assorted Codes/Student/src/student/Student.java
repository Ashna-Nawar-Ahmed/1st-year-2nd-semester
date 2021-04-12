/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Ashna Ahmed
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rolls[]={1,2,3,4,5};
        String names[]={"ash","naf","tas","tbird","susu"};
        StudentSearch s=new StudentDB(rolls,names);
        String str=s.search(3);
        System.out.println(str);
    }
    
}
class StudentDB implements StudentSearch{
    int studentRoll[];
    String studentName[];
    StudentDB(int studentRoll[],String studentName[])
    {
        for(int i=0;i<studentRoll.length;i++)
        {
            this.studentRoll=studentRoll;
            this.studentName=studentName;
        }
    }
    public String search(int roll){
        int i=0;
        for(int j=0;j<studentRoll.length;j++)
        {
            if(roll==studentRoll[j])
            {
                i=j;
            }
        }
        return studentName[i];
    }
}
