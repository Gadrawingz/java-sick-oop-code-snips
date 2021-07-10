package com.accessmod1;

// This class cannot be accessed from outside package
// for example AccessModPublicClass which is in accessmod2 package


public class AccessModPublic {

    public char grade = 'B';

    public void printMessage() {
        System.out.println("Hey, I am public class I'm accessible everywhere");
        System.out.println("My grade is undoubtedly: "+grade+".");
    }
}
