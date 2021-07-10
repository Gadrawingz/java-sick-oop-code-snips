package com.gadrawingz2;

class Person {
    long telephoneNo;

    Person (long num) {
        this.telephoneNo = num;
    }
}

public class ObjectSwapping {

    // Swap method: to swap person1 & person2
    public static void swap(Person person1, Person person2) {
        long temp = person1.telephoneNo;
        person1.telephoneNo = person2.telephoneNo;
        person2.telephoneNo = temp;
    }

    // Driver method
    public static void main(String[] args) {

        Person p1 = new Person(1784557333445L);
        Person p2 = new Person(233454454);

        swap(p1, p2); // method to swap for us

        System.out.println("P1's number: "+p1.telephoneNo);
        System.out.println("P2's number: "+p2.telephoneNo);
    }
}
