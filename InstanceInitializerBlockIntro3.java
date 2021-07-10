package com.gadrawingz3;

class Base {

    Base() {
        System.out.println("Base class constructor is invoked!");
    }
}

class Derived extends Base {

    //
    Derived() {
        super();
        System.out.println("Derived class constructor is invoked!");
    }

    {
        // Instance init.block that is invoked after super()
        System.out.println("Instance init.block is invoked!");
    }
}

public class InstanceInitializerBlockIntro3 {

    public static void main(String[] args) {

        Derived derived = new Derived();

    }
}

