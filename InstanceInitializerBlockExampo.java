package com.gadrawingz3;

class Parent {
    Parent() {
        System.out.println("Parent class constructor invoked");
    }
}

class Child extends Parent {

    Child() { // 1st const
        super();
        System.out.println("Child class constructor invoked"); // (runs 1st)
    }

    Child(int no) { // 2nd const.with params
        super();
        System.out.println("Child class constructor invoked at: "+no+"\n"); // (runs at 3rd)
    }

    {
        System.out.println("Instance init.block is invoked!"); // (runs at 2nd)
    }
}

public class InstanceInitializerBlockExampo {
    public static void main(String[] args) {
        // Here we go
        Child obj1 = new Child();
        Child obj2 = new Child(20);
    }
}
