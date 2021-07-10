package com.gadrawingz3;

// Run-time polymorphism can't be achieved by data members
// Which means method is overridden but data members don't
// So, Accessing the data members by the reference var of parent class
// Which refer to the sub class obj,  ((it'll always access the data
// member of parent class always)

class Plane {
    int speedLimit = 75; // (1)
}

class AirforceOne extends Plane {
    int speedLimit = 125; // (2)
}

public class PolymorphismRuntime4DataMember extends Plane {
    public static void main(String[] args) {

        int speedLimit = 200; // (3)

        Plane p1;

        p1 = new PolymorphismRuntime4DataMember();
        System.out.println("Speed Limit: "+p1.speedLimit); //

        p1 = new AirforceOne();
        System.out.println("Speed Limit: "+p1.speedLimit);

        p1 = new Plane();
        System.out.println("Speed Limit: "+p1.speedLimit);

        /* OUTPUT:
        * Speed Limit: 75
        * Speed Limit: 75
        * Speed Limit: 75
        */

    }
}
