/*****************************
 * Here, Shape is the abstract class, and its implementation is provided by
 * Rectangle and Circle classes, etc.
 *
 * Mostly, We don't know about the implementation(w/c is hidden to end user),
 * an object of the implementation is provided by the factory method.
 *
 * A factory method is a method that returns the instance of the class.
 *
 * In this program, If u create the instance of Rectangle class,
 * draw() method of Rectangle class is invoked.
 * ****************************/
package com.gadrawingz3;

abstract class Shape {
   abstract void draw();
}

// In real scenario, Implementation is provided by others.
// i.e. unknown by end users

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

// In real scenario, a method is called by programmer or user
public class AbstractionImpByUnknown {
    public static void main(String[] args) {

        // in real scenario, obj is provided through method, eg: getShape()
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();

    }
}
