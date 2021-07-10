/**************************************
 * Difference: a) Method overloading
 *
 * 1. M.overloading is used to increase code readability of the program
 * 11. M.overriding is used to provide the specific implementation of a
 * method that's already provided by its super class.
 *
 * 2. M.overloading is performed within class.
 * 22. Overriding occurs in two classes that have (IS-A) relationship.
 *
 * 3. In case of overloading, parameter must be different.
 * 33. In case of overriding, parameter must be same.
 *
 * 4. M.overloading is the exampo. of compile-time polymorphism.
 * 44. M.overloading is the exampo. of run-time polymorphism.
 *
 * 5. In java, meth.overloading can't be performed by changing return type
 * of method only Return type can be same or different in m.overloading
 * But u must have to change the parameter.
 *
 * 55. Return type must be same or covariant in m.overriding.
 * ************************************/

package com.gadrawingz1;

import java.util.Locale;

class OverloadingClass {

    // method with 2 parameters
    static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // method with 3 parameters
    static int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

class OverridingClass {

    // First method
    void getRapSpeed() {
        System.out.println("This guy raps fast!");
    }

    // Second method
    void getRapStyle(String style) {
        System.out.println("Rap style is "+style.toUpperCase());
    }

}

class OverridingChild extends OverridingClass {

    // Overriding First method
    void getRapSpeed() {
        System.out.println("This guy raps slowly!");
    }

    // Overriding Second method
    void getRapStyle(String style) {
        System.out.println("Rap style is "+style.toUpperCase());
    }

}

public class MethodOverloadRiding {
    public static void main(String[] args) {

        // Creating object for OverloadingClass
        OverloadingClass overloading = new OverloadingClass();
        System.out.println(overloading.addNumbers(40, 60)); // 100
        System.out.println(overloading.addNumbers(40, 72, 38)); // 150

        // Creating object for OverridingClass, we use: OverridingChild class
        OverridingChild overriding = new OverridingChild();
        overriding.getRapSpeed();
        overriding.getRapSpeed();

        overriding.getRapStyle("Trap"); // Rap style is TRAP
        overriding.getRapStyle("Mumbling"); // Rap style is MUMBLING

    }
}
