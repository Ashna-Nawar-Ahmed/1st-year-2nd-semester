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
public class spring15_3b {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        MyQueue m = new MyQueue(ar);
        m.printMyQueue();
        m.enqueue(256);
        m.printMyQueue();
        m.dequeue();
        m.printMyQueue();
        
    }
}

class MyQueue {

    int ar[] = new int[20];
    int currentIndex = 0;

    MyQueue(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            this.ar[currentIndex] = ar[currentIndex];
            currentIndex++;
        }

    }

    void enqueue(int v) {
        ar[currentIndex] = v;
        currentIndex++;
        if (currentIndex >= 20) {
            System.out.println("Queue overflow error!!!");
        }
    }

    void dequeue() {
        for(int i=0;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        if (currentIndex>ar.length) {
            System.out.println("Queue underflow error!!!");
        }
        
    }

    void printMyQueue() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
