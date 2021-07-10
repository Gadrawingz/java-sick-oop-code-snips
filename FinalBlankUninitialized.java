/*************************
 * Blank final variable:
 * ->Is final var that isn't initialized at the time of declaration
 * ***********************/

package com.gadrawingz3;

class Employee {

    // NB 1: We can initialize 'blank final variable' only in constructor
    final int CARD_NUMBER;

    Employee() {
        CARD_NUMBER = 45660;
        System.out.println("Card number is "+CARD_NUMBER);
    }
}

class Carpenter {

    // NB 2: Again, this static blank final can be only initialized in static block
    static final double salary;
    static {
        salary = 506000.56;
        System.out.println(String.format("Salary is " + salary, '#'));
    }
}

class Electrician {

    // NB 3: For final parameter, If u declared any param as final,
    // U cannot change the value of it

    int getWorkingHours(int mornings,final int afternoons) {
        // afternoons = afternoons+=4; Can't be changed as its final
        return mornings + afternoons;
    }

    // NB 4: constructor cannot be declared as final, bcz, It's never inherited!
    // i.e: final Electrician() {}
}


public class FinalBlankUninitialized {
    public static void main(String[] args) {

        new Employee(); // or Employee emp = new Employee();
        new Carpenter(); // or Carpenter carp = new Carpenter();

        Electrician ele = new Electrician();
        int result = ele.getWorkingHours(5, 6);
        // OR, new Electrician().getWorkingHours(5, 6);
        System.out.println("Total working hours: "+result);
    }

}
