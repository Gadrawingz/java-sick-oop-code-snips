/*****************************************
 * Run-time polymorphism or Dynamic Method dispatch:
 * @ Is a process in w/c a call to an overridden method is resolved at run-time.
 *
 * @ In this process, an overridden method is called through the reference variable
 * of a superclass.
 *
 * @ And the determination of the method to be called is based on the object
 * being referred to by the reference variable.
 *
 * UPCASTING:
 * ----------
 * Before understanding run-time polymorphism, we must understand Upcasting:
 * If a ref.variable of Parent class refers to the object of child class its known as
 * Upcasting: example BaseClass obj = new ChildClass()
 *
 * For upcasting, we can use the reference variable of class type or interface type.
 * ***************************************/

package com.gadrawingz3;

class NetGame {
    void play() {
        System.out.println("Gaming time!");
    }
}

public class PolymorphismRuntime1 extends NetGame {

    @Override
    void play() {
        System.out.println("Chess game time!");
    }

    public static void main(String[] args) {

        /******************************************
         * Since, it refers to the subclass object & subclass method overrides the
         * Parent class method, The subclass method is invoked at run-time
         * AND, since method invocation is determined by JVM not compiler,
         * It's known as run-time polymorphism.
         * ***************************************/

        NetGame chess = new PolymorphismRuntime1(); // upcasting
        chess.play();
    }
}