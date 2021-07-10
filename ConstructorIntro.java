// Constructor is a special type of method which is used to init object.
// Every time an object is created using the new() keyword, at least one
// constructor is called.

// It calls a default const if there's no constructor available in the class
// Java compiler provides a default by default.

// It is called constructor bcz it constructs the value at the time of object creation.
// It is not necessary to write a constructor for a class, bcz java compiler creates a
// default const, if yo class does't have any.

/******************************************
 * Rules to create a Java constructor
 *
 * 1. Constructor name must be the same as its class name
 * 2. A constructor must have no explicit return type
 * 3. Java constructor cannot be abstract, static, final and synchronized.
 *
 * When to use constructor?
 * ............
 *
 * Purpose of Constructor class:
 * @ Java provide Const'class w/c can be used to get internal info of a constr. in the class.
 * @ Its found in java.lang.reflect package
 *
 * Types:
 * 1. Default constructor (non-arg)
 * 2. Parameterized constructor.
 *
 * Difference b2n Constructor & method
 * 1. Is used to initialize the state of an object, method is used to expose the behavior of an obj
 * 2. Constructor must not have a return type, method must have a return type.
 * 3. Constructor is invoked implicitly, The method, inv. explicitly.
 * 4. Java compiler provides a default const if you don't have any in class,
 * but method is not provided by the compiler in any case.
 * 5. Constructor name must be same as its class name, method may be or not be
 *
 */


package com.gadrawingz1;
public class ConstructorIntro {
    public static void main(String[] args) {

    }
}
