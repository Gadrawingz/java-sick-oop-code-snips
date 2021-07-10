// Object is an instance of a class.
// Object is a runtime entity.
// Object is an entity which has state & behavior.

/*****************************
 * X-tics of object:
 * -----------------
 * 1. State: represents the data(value) of an object => (represented by
 * attributes of an obj. it also reflects the response of an obj.
 *
 * 2. Behavior: Represents the behavior(functionality) of an object such as deposit, withdraw,
 * => (represented by methods of obj. It reflects the response of an obj with another objs.
 *
 * 3. Identity: Used internally by the JVM 2 identify each object uniquely.
 * 3a) The value of obj is not visible to the externally user, but used by JVM.
 * *****************************/

// An object in OOP is nothing but a self-contained component which make
// a particular method & properties 2make a particular type of data useful.
// Software objects are often used to model real-word objects u find in everyday life

// Instance variable is a var created inside the class but outside the method.
// doesn't get memory at compile time
// It only gets memory at runtime when an object/ instance is created

// Many ways of




package com.gadrawingz2;

class Dog {

    // instance variables
    String name;
    String breed;
    int age;
    String color;

    // method 1
    public String getInformation() {
        return ("Dog's name is "+name+"\nAge is "+age+" years old.\ncolor is "+color);
    }
}


public class ObjectIntroduction {
    public static void main(String[] args) {

        // Declaring objects is called instantiating a class
        Dog snoop = new Dog();
        // new keyword used to allocate memory at runtime.
        snoop.getInformation();

        snoop.name = "Snoopy";
        snoop.age= 4;
        snoop.color = "Black";
        System.out.println(snoop.getInformation());


    }

}
