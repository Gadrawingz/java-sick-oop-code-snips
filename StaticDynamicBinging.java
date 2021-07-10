/*************************************
 * Binding: is a way of connecting a method call.
 *
 * @ We have 2 types:
 * a) Static binding (Early binding):
 * ->When type of object is determined at compiled time(by compiler)
 * ->Again, if there is any private, final or static method in class its static.bindin
 *
 * b) Dynamic binding (Late binding)
 * >When type of object is determined at run-time
 *
 * @ Types of instance:
 * a) Variable have a type : which may be primitive and non-primitive: ex: int a= 5;
 * b) Reference have a type:
 *      class Dog {
 *      }
 *      Dog d1; // d1 is a type of dog
 *
 * c) Object have a type: an object is an instance of particular java class,
 * but it also an instance of super class. Here d1 is instance of Dog, and Animal
 *      class Dog extends Animal{
 *      }
 *      Dog d1= new Dog();
 ************************************/


package com.gadrawingz3;

class DontExtendMeClass {

    // Static binding
    private void getMe() {
        System.out.println("I have static binding bcz of private...\n");
    }
    public static void main(String[] args) {
        DontExtendMeClass d = new DontExtendMeClass();
        d.getMe();
    }
}

class BaseClass {
    void getBehaviors() {
        System.out.println("Loading behaviors...");
    }
}

class ChildClass extends BaseClass {
    void getBehaviors() {
        System.out.println("Children have bad behaviors");
    }
}

public class StaticDynamicBinging {
    public static void main(String[] args) {
        
        // This is Dynamic binding since, object 'base' cannot be determined by the compiler
        // bcz, the instance of ChildClass is also an instance of BaseClass
        // For this reason, Compiler doesn't know its type, only its base type

        BaseClass base = new ChildClass();
        base.getBehaviors();
    }
}
