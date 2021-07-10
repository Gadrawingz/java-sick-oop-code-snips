// In case subclass overridden method declares subclass exception
package com.gadrawingz1;
import java.io.*;

class Parent2 {
    void message() throws Exception {
        System.out.println("This is parent!");
    }
}

public class MethodOverridingException2 extends Parent2 {

    // It can even run even if there is no Exception
    void message() throws ArithmeticException {
        System.out.println("This is child!");
    }

    public static void main(String[] args) {

        Parent2 parent = new MethodOverridingException2();
        try {
            parent.message();
        } catch(Exception e) {

        }

    }
}
