package com.gadrawingz1;

class Teacher {
    String name;
    String department;
    float salary;

    // Creating parameterized constructor
    Teacher(String n, String dept, float sal) {
        name = n;
        department = dept;
        salary = sal;
    }

    // method for displaying values
    void displayTeachersInfo() {
        System.out.println("Name is: "+name+" Department: "+department+", Salary: "+salary);
    }
}

public class ConstructorParameterized {
    public static void main(String[] args) {

        // Creating objects & Passing values:
        Teacher teacher1 = new Teacher("Ndi Pason", "ICT", 700000);
        Teacher teacher2 = new Teacher("Murasandonyi", "ICT", 650000);
        Teacher teacher3 = new Teacher("Mama Yvonne", "ICT", 1000000);

        teacher1.displayTeachersInfo();
        teacher2.displayTeachersInfo();
        teacher3.displayTeachersInfo();

    }
}
