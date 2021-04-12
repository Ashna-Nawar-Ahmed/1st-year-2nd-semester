/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Ashna Ahmed
 */
public class Exercise1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1=new Circle();
        System.out.println("Circle has radius:"+c1.getRadius()+" and area:"+c1.getArea());
        Circle c2=new Circle(5);
        System.out.println("Circle has radius:"+c2.getRadius()+" and area:"+c2.getArea());
        Circle c3=new Circle(7,"blue");
        System.out.println("Circle has radius:"+c3.getRadius()+" and area:"+c3.getArea()+" and color:"+c3.getColor());
        c3.setColor("Pink");
        c3.setRadius(2.5);
        System.out.println("Circle has radius:"+c3.getRadius()+" and area:"+c3.getArea()+" and color:"+c3.getColor());
        System.out.println(c3);
    }
    
}
class Circle
{
    private double radius;
    private String color;
    Circle()
    {
        radius=1.0;
        color="red";
    }
    Circle(double radius)
    {
        this.radius=radius;
        color="red";
    }
    Circle(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String toString()
    {
        return ("Circle's radius:"+this.radius+" color:"+this.color+" area:"+getArea());
    }
}
