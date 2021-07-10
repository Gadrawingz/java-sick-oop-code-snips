/**************************************
 * ABSTRACT & POINTS TO REMEMBER:
 *
 * @ It's a class w/c is declared with the abstract keyword (must)
 * @ It can have abstract methods and non-abstract methods(methods with
 * @ It cannot be instantiated.
 * @ It can have constructors & Static methods also
 * @ It can have final methods w/c force the subclass not to change the body method.
 * @ If there is an abstract method in a class that class must be abstract
 *
 * DIFF B2N ABSTRACT CLASS & INTERFACE
 *
 * #Abs.class can have abstract & non-abstract methods, int. can have have only
 * abstract methods. Since java8, it can have default & static method also.
 *
 * #Abs.class doesn't support multiple inheritance, int. support it.
 * #Abs.class can have final, non-final, static & non-static variables, int has only static & final vars.
 * #Abs.class can provide the implementation of intfc. but intfc. cant provide imp. of abstract class
 * #Abstract keyword is used to declare abs.class, and interface keyword is used 2 declare interface.
 * #Abstract class can be extended using keyword "extends" while,
 * interface,can be implemented using "implements" keyword.
 *
 * #An abstract class can extend another Java class & implement multiple java interfaces,
 * while,An interface can be implemented using keyword "implements"
 *
 * ABSTRACT METHOD: is a method w/c is declared as abstract & doesn't have implementation.
 * ABST.CLASS achieves partial abstraction (0 to 100%), Interface achieves fully abstraction(100%)
 *************************************/

package com.gadrawingz3;

abstract class Teacher {
    abstract int getMonthlySalary();
}

class EnglishTeacher extends Teacher {

    @Override
    int getMonthlySalary() {
        return 7000000;
    }
}

class MathsTeacher extends Teacher {

    @Override
    int getMonthlySalary() {
        return 10000000;
    }
}

public class AbstractionIntro {
    public static void main(String[] args) {
        Teacher teacher;
        teacher = new EnglishTeacher();
        System.out.println("English Teacher's Salary /month: "+teacher.getMonthlySalary());

        teacher = new MathsTeacher();
        System.out.println("Maths Teacher's Salary /month: "+teacher.getMonthlySalary());
    }
}

