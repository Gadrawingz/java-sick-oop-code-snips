/*******************************
 * Encapsulation in java,
 * @ a process of wrapping code and data 2gether into a single unit
 * Example: a capsule w/c is mixed with several machines.
 *
 * @ We can create a fully encapsulated class in Java by making all the data
 * members of the class private. we can use setter & getter methods to set & get data in it.
 *
 * @ The 'Java Bean' is the example of a fully encapsulated class.
 *
 * [ADVANTAGES]
 * @ By providing only a setter & getter method, U can make class read-only & write-only
 * (which means that u can skip getter & setter methods.
 *
 * @ It provides you the control over the data,
 * x. Suppose u wanna set the value of id w/c should be greater than 100 only.
 * xx.U can write the logic inside the setter method, for example, logic for not
 * to store the negative number in the setter method.
 *
 * @ It is a way to achieve data hiding in Java bcz other class will not be able
 * to access the data through the private data members.
 *
 * @ Encapsulation's better for unit testing, So its easy 2 test.
 *
 * @ Its easy and fast to create an encapsulated class in java, bcz of IDE's support
 * to create getters and setters.
 * *****************************/


// Here is a fully encapsulated class
// Which has private member, getter & setter methods
package com.gadrawingz3;

class Prisoner {

    private String name;  // Private data member!

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

// a Java class to test Prisoner (encapsulated class)
public class EncapsulationIntro {
    public static void main(String[] args) {

        // instance creation for encapsulated class
        Prisoner prisoner = new Prisoner();
        prisoner.setName("Thor Ragnarok");
        System.out.println("Prisoner name is: "+prisoner.getName());
    }
}
