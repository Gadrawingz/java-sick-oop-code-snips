/*************************************
 * SUPER Keyword:
 * In java, is a reference variable w/c is used to refer immediate parent class obj.
 * ***********************************
 * Whenever u create the instance of subclass, an instance of parent class
 * is created implicitly w/c is referred by super reference variable.
 *
 * USAGE of super keyword:
 * 1. Can be used 2 refer immediate parent class instance var.
 * 2. Can be used 2 invoke immediate parent class method.
 * 3. super() can be used to invoke immediate parent class constructor
 * **********************************/
package com.gadrawingz3;


// 1. Can be used 2 refer immediate parent class instance variable.
class Animal {
    String color= "grey";
    String nationality ="RW";
}

class Goat extends Animal {

    String color= "Black";
    public void printAnimalDetails() {
        System.out.println("Color is: "+color.toLowerCase()); // Color is black
        System.out.println("Color is: "+super.color); // Color is grey
        System.out.println("Nationality is: "+super.nationality); // Color is grey
    }
}

public class InheritanceSuperKwdIntro {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.printAnimalDetails();
    }
}
