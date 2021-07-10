/***********************************
 * Here, WebLecturer class inherits Lecturer class, So all properties of Lecturer
 * Will be inherited to WebLecturer by default. To initialize all the property,
 * We are using parent class constructor from child class.
 *
 * Thus, We are reusing the parent class constructor.
 * *********************************/

package com.gadrawingz3;

class Lecturer {
    int age;
    String names;

    Lecturer(int a, String n) {
        this.age = a;
        this.names=n;
    }
}

class WebLecturer extends Lecturer {

    float salary;
    WebLecturer(int age, String names, float salary) {

        //Here, I am reusing parent constructor
        super(age, names);
        this.salary = salary;
    }

    void displayLecturerInfo() {
        System.out.println("Name: "+names+", Age: "+age+", Salary: "+salary);
    }
}

public class InheritanceSuperRealUse {
    public static void main(String[] args) {

        WebLecturer weblect1 = new WebLecturer(33, "Murasandonyi", 700000F);
        weblect1.displayLecturerInfo();

        WebLecturer weblect2 = new WebLecturer(42, "Mrs Mama Yvonne", 600000F);
        weblect2.displayLecturerInfo();
    }
}