/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevquestion;

/**
 *
 * @author Ashna Ahmed
 */
public class fall16_2c {
    public static void main(String[] args){
        Sphere s1=new Sphere(2.5);
        Cube c1=new Cube(1.5,2,3.5);
        s1.display();
        c1.display();
    }
}
class Sphere extends Calculation
{
    double baseRadius;
    Sphere(double baseRadius)
    {
        this.baseRadius=baseRadius;
    }
    void display()
    {
        System.out.println("Radius="+baseRadius+" Volume="+calcVolume(baseRadius));
    }
}
class Cube extends Calculation
{
    double length;
    double width;
    double height;
    Cube(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void display()
    {
        System.out.println("Length="+length+" Width="+width+" Height="+height+" Volume="+calcVolume(length,width,height));
    }
}
class Calculation
{
    double calcVolume(double baseRadius)
    {
        return (4/3)*Math.PI*Math.pow(baseRadius, 3);
    }
    double calcVolume(double length,double width,double height)
    {
        return length*width*height;
    }
}
