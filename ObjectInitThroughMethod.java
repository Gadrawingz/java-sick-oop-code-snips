package com.gadrawingz2;

class Student {

    int level;
    String names;
    String regno;

    void registerNew(String n, String r, int l) {
        names = n;
        regno = r;
        level = l;
    }

    void displayStudents() {
        System.out.println("Name is: "+names+" and Reg.Number is "+regno);
        System.out.println("Studies in level: "+level+".\n");
    }
}

public class ObjectInitThroughMethod {
    public static void main(String[] args) {

        // Creating reference variables, stored in stack memory.
        Student student1 = new Student(); // student1 is reference
        Student student2 = new Student(); // student2 is reference

        // We can create multiple objects, by one type only
        // as we do in primitives::: int age=20, name= gad;
        Student obj1 = new Student(),  obj2 = new Student();

        // Both s1 and s2 are stored in heap memory
        student1.registerNew("Gad IRADUFASHA", "17RP04981", 3);
        student2.registerNew("Pazzo Mugabire", "17RP04981", 1);

        // Invoking the displayStudents() method
        student1.displayStudents();
        student2.displayStudents();
    }
}
