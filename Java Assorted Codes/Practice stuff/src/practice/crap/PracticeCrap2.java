/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.crap;

/**
 *
 * @author USER
 */
class BoxDemo {

    public static void main(String args[]) {
        Box mybox, mybox1;
        double vol;
        mybox = new Box();
        mybox1 = new Box();
        mybox.width = 120;
        mybox.setDim(10, 20, 15);
        vol = mybox.volume();
        System.out.println(vol);

        mybox1.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println(vol);

    }
}

class Box {

    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}
