package com.accessmod1;

class SimplePrivate {

    private int data = 50;

    private SimplePrivate() {
        // If u make any class constructor private
        // U can't create the instance of that class  from outside class (ROLE)
    }

    private void getMessage() {
        System.out.println("Hello, I'm private!");
    }
}

public class AccessModPrivate {

    public static void main(String[] args) {
        // SimplePrivate obj1 = new SimplePrivate(); // Compile-time error
    }
}
