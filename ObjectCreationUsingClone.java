package com.gadrawingz2;



public class ObjectCreationUsingClone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "Gadrawingz";

    // Driver method
    public static void main(String[] args) {

        // Creating obj using new...
        ObjectCreationUsingClone obj1 = new ObjectCreationUsingClone();

        
        try {
            ObjectCreationUsingClone obj1cloned = (ObjectCreationUsingClone) obj1.clone();
            System.out.println(obj1cloned.name); // Using cloned obj
            System.out.println(obj1.name); // Using object created with new keyword

        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
    }
}
