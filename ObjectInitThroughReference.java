// Initializing an object means storing data
// Ways to initialize object in Java:
// 1. By reference, 2. By method, 3. By Constructor
package com.gadrawingz2;

class BigBox {

    int id;
    int height;
    int rollno;
    String name;
    String color;

}

public class ObjectInitThroughReference {
    public static void main(String[] args) {


        // (1) Initialization through reference

        // We can have multiple obj&store info in it through reference
        BigBox object1 = new BigBox();
        BigBox object2 = new BigBox();

        object1.id = 304;
        object1.color = "grey";

        object2.id = 306;
        object2.color = "green".toUpperCase(); // GREEN

        // Printing members
        System.out.println("ID is: "+object1.id+" and color is: "+object1.color);
        System.out.println("ID is: "+object2.id+" and color is: "+object2.color);

    }
}
