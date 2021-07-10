package com.gadrawingz2;

// In Java, class is a logical entity. It can't be physical.
// Class is a group of objects which have common properties.
// Is a (user-defined) template/ blueprint/prototype from which objects are created.
// Class can contain Fields, Methods, Constructors blocks &
// Nested class & interface

class FirstGroup {

    // Defining fields,data member, instance variable
    int salary;
    int age= 80;
    String name = "Gad IRADUFASHA"; // Init
    String regNumber;

}

public class ClassIntroduction {
    public static void main(String[] args) {

        // Creating an object/ instance of FirstGroup
        FirstGroup myobject = new FirstGroup();

        // Initializing object.
        myobject.regNumber= "17RP04981";

        System.out.println(myobject.age); // 80, accessing member through ref.variable
        System.out.println(myobject.name); // Gad IRADUFASHA
    }
}
