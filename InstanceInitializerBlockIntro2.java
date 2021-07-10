package com.gadrawingz3;

class Student {

    // Constructor
    Student() {
        System.out.println("Constructor is invoked!");
    }


    {
        // Instance initializer block
        System.out.println("Instance init.block is initialized!");
    }
}

public class InstanceInitializerBlockIntro2 {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();

        // Instance init.block is initialized!,then... Constructor is invoked!
        /**************
         * It seems that inst.init.block is firstly invoked, but no!
         * Cuz Instance init.block is invoked at the time of object creation.
         *
         * NB: Java compiler copies the code of instance initializer block in
         * every constructor. (after the first statement super()
         *
         * class MyClass {
         *    super();
         *    { System.out.println("Inst.init.block"); }
         *    { System.out.println("Constructor block"); }
         * }
         * ************/

    }
}
