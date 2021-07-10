// There are 4 ways of creating object of a class.
package com.gadrawingz2;

class MainExample {
    void getMessage() {
        System.out.println("Hi Object!");
    }
}


public class ObjectCreation {
    public static void main(String[] args) {

        // 1 way: Using new keyword
        MainExample obj1 = new MainExample();

        // 2nd way: Using Class.forName(String className) method

        MainExample obj2 = null;
        try {
            // Creating obj of public class MainExample,
            // by considering it present in com.gadrawingz2 package
            obj2 = (MainExample)Class.forName("com.gadrawingz2.MainExample").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // 3rd way: Using clone method w/c is present in Object class.
        // it creates & return copy of the obj

        MainExample obj3 = new MainExample();
        // MainExample obj3copy = (MainExample)obj3.clone();


        obj1.getMessage();
        obj2.getMessage();
        obj3.getMessage();

    }
}
