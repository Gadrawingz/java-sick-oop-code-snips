package com.gadrawingz1;

class Lecturer {
    int id;
    String name;
    int age;

    // Creating 2 arg constructor
    Lecturer(String n, int myId) {
        name = n;
        id = myId;
    }

    // Creating 3 arg constructor
    Lecturer(String n, int a, int myId) {
        name = n;
        age = a;
        id = myId;
    }

    void displayAllInfo() {
        System.out.println("Name: "+name+", id: "+id+" age: "+age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("Gadson", 599434);
        Lecturer lecturer2 = new Lecturer("Pauline", 100,345000);

        lecturer1.displayAllInfo(); // Name: Gadson,  id: 599434 age: 0
        lecturer2.displayAllInfo(); // Name: Pauline, id: 345000 age: 100
    }
}
