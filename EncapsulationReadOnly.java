package com.gadrawingz3;

// This class has only getter methods (Read-only class)
class StudentReadOnly {

    // Private data member!
    private String college= "TUMBA";

    // Getter and Setter methods for college
    public String getCollege() {
        return college;
    }

}

// a Java class to test StudentReadOnly class
public class EncapsulationReadOnly{
    public static void main(String[] args) {

        // instance creation for encapsulated class
        StudentReadOnly student = new StudentReadOnly();

        // student.setCollege(""); this will render compile-time error
        // We can't change the value college w/c is Tumba

        System.out.println("College is "+student.getCollege());
    }
}
