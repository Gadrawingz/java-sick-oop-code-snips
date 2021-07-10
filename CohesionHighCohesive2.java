package com.gadrawingz4;

// All of this classes illustrate high cohesive
class Multiply {
    int num1 = 10;
    int num2 = 12;

    public int multiplyNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 * num2;
    }
}

class Name {
    String name;
    public String getName(String name) {
        this.name = name;
        return name;
    }
}

class Number {
    int mobileno;
    public int getNumber(int mobileno) {
        this.mobileno = mobileno;
        return mobileno;
    }
}

// DISPLAY CLASS
public class CohesionHighCohesive2 {
    public static void main(String[] args) {

        Multiply m = new Multiply();
        System.out.println(m.multiplyNumbers(5, 10));

        Name n = new Name();
        System.out.println(n.getName("Gadrawingz"));

        Number no = new Number();
        System.out.println(no.getNumber(25078));
    }
}
