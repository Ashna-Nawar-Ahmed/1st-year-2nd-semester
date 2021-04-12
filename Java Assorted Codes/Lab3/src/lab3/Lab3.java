/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author USER
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1, std2, std3;
        std1 = new Student();
        std1.display();
        std2 = new Student("Nawar", 24);
        std2.display();
        std3 = new Student("ANA", 24, "CSE");
        std3.display();
    }

}

class Student {

    String name;
    int roll;
    String dept;

    Student() {
        name = "ashna nawar";
        roll = 24;
    }

    Student(String name, int r) {
        this.name = name;
        roll = r;
    }

    Student(String name, int r, String dept) {
        this.name = name;
        roll = r;
        this.dept = dept;
    }

    void display() {
        System.out.println("Student name: " + name + "\nRoll:" + roll + "\nDepartment:" + dept);
    }
}
