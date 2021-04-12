/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.a1;

import java.util.Scanner;

public class OnlineA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = input.next();
        System.out.println("Enter address:");
        String address = input.next();
        System.out.println("Enter pay rate:");
        double pay_rate = input.nextDouble();

        System.out.println("Enter bonus:");
        double bonus = input.nextDouble();
        Executive ex1 = new Executive(name, address, pay_rate);
        double sal1 = ex1.calculatePay(bonus);
        System.out.println("Executive:\nName: " + ex1.getEmployeeName()+ "\nAddress:" + ex1.getEmployeeAddress() + "\nTotal pay:" + sal1 + "tk (" + pay_rate + "tk +" + bonus + " tk)");

        System.out.println("Enter name:");
        String name2 = input.next();
        System.out.println("Enter address:");
        String address2 = input.next();
        System.out.println("Enter pay rate:");
        double pay_rate2 = input.nextDouble();
        System.out.println("Enter hours worked:");
        double hours_worked = input.nextDouble();
        Hourly h1 = new Hourly(name2, address2, pay_rate2);
        double sal2 = h1.calculatePay(hours_worked);
        System.out.println("Hourly:\nName: " + h1.getEmployeeName() + "\nAddress:" + h1.getEmployeeAddress() + "\nTotal pay:" + sal2 + "tk (" + pay_rate + "tk x " + hours_worked + " hrs)");

    }

}

class Employee {

    private String name;
    private String address;
    private double pay_rate;

    public void setEmployee(String name, String address, double pay_rate) {
        this.name = name;
        this.address = address;
        this.pay_rate = pay_rate;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeAddress() {

        return address;

    }

    public double getEmployeePayRate() {

        return pay_rate;
    }

    Employee(String name, String address, double pay_rate) {
        this.name = name;
        this.address = address;
        this.pay_rate = pay_rate;
    }
}

class Executive extends Employee {

    double bonus;

    Executive(String name, String address, double pay_rate) {
        
        super(name, address, pay_rate);

    }

    double calculatePay(double bonus) {
        return getEmployeePayRate() + bonus;
    }
}

class Hourly extends Employee {

    double hours_worked;

    Hourly(String name, String address, double pay_rate) {
        super(name, address, pay_rate);

    }

    double calculatePay(double hours_worked) {
        return getEmployeePayRate() * hours_worked;
    }
}
