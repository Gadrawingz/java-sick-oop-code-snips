/***************************************
 * The abstract class can also be used to provide some implementation
 * of the interface.
 *
 * For example, In such case, The end user may not be forced to override
 * all the methods of the interface, because they are not optional.
 * ************************************/

package com.gadrawingz3;

interface SchoolApp {

    // Child classes are not forced to override all of those methods
    void registerStudent(); // by default,public & abstract
    void makeExamination();
    void changeProfile();
    void makeAttendance();
    void makeClearance();
    void deleteAccount();
}

abstract class CurrentStudent implements SchoolApp {

    public void makeAttendance() {
        System.out.println("I want to make attendance only!");
    }

    public void changeProfile() {
        System.out.println("I want to change my profile too!");
    }
}

class GraduatedStudent extends CurrentStudent {

    @Override
    public void registerStudent() {
        System.out.println("I want to do registration 1st!");
    }

    @Override
    public void makeExamination() {
        System.out.println("I want to get my hands on exams!");
    }

    @Override
    public void makeClearance() {
        System.out.println("Clearance is loading...");
    }

    @Override
    public void deleteAccount() {
        //
    }

    // For example, I don't want to delete account,
    // So, Im not forced to use this method
    // public void deleteAccount() { }
}


public class AbstractionRealScenario {
    public static void main(String[] args) {

        SchoolApp school = new GraduatedStudent();
        school.registerStudent();
        school.makeAttendance();
        school.changeProfile();
        school.makeExamination();
        school.makeClearance();
    }
}
