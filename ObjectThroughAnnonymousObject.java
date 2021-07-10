package com.gadrawingz2;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;

class Calculator {

    // An object which has no reference is known as anonymous obj.
    // It can be used at the time of object creation only.
    // If U have 2 use an object only once, This is a good approach to use.

    // They are used for immediate method calling.
    // They will be destroyed after method calling.
    // They are mainly used in different libraries, they are used to perform
    // some action on capturing an event (on click, key press

    void getCalculatorName(String name) {
        System.out.println("Calculator name is "+name);
    }

    void getFactorialNumber(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i; // fact= fact*i
        }
        System.out.println("Factorial number: "+fact);
    }
}

public class ObjectThroughAnnonymousObject {
    public static void main(String[] args) {

        // Because I wanna use object once, I call method with anonymous.obj
        new Calculator().getFactorialNumber(6); // 720

        // Another way to create it:
        new Calculator().getCalculatorName("GADULATOR");

        /******************************** or

        btn.setOnAction(new EventHandler() {
            public void handle(ActionEvent event) {
                System.out.println("Hello");
            }
        })

        **********************************/

    }
}
