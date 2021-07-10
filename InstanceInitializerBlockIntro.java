/********************************
 * Instance initializer block:
 * @ Is used to initialize data member.
 * @ It runs each time when obj of the class is created.
 * @ Init of the instance var,can be done directly but there can be performed
 * extra operations while initializing the instance var in the instance init. block.
 *
 * WHAT'S ITS USE WHILE WE CAN DIRECTLY ASSIGN VALUE IN INSTANCE DATA MEMBER
 * @
 *
 * THERE 3 PLACES IN JAVA, WHERE U CAN PERFORM OPERATIONS:
 * (1). Method, (2) Constructor, (3) Block
 *
 * RULES FOR INST.INIT.BLOCK:
 * a) It is created when instance of the class is created
 * b) It is invoked after parent class constructor is invoked (after super() constructor call
 * c) It comes in the order in w/c they appear.
 *
 * *****************************/

package com.gadrawingz3;

class MotorBike {
    int speed;

    MotorBike() {
        System.out.println("Speed is "+speed);
    }

    {speed=85;}

}

public class InstanceInitializerBlockIntro {

    public static void main(String[] args) {

        MotorBike bike1 = new MotorBike(); // Speed is 85
        MotorBike bike2 = new MotorBike(); // Speed is 85
        MotorBike bike3 = new MotorBike(); // Speed is 85
    }
}
