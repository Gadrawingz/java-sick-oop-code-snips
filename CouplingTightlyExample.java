// Implementation process of tight coupling
package com.gadrawingz4;

public class CouplingTightlyExample {
    public static void main(String[] args) {

        MyOne one = new MyOne();
        one.displayInfo();
    }
}

class MyOne {
    MyTwo two;
    public MyOne() {
        two = new MyTwo();
    }

    public void displayInfo() {
        System.out.println("My One!");
        two.display();
    }
}

class MyTwo {
    public MyTwo() {
    }

    public void display() {
        System.out.println("My Two {can be changed}!");
    }
}