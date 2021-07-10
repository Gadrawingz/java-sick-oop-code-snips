package com.gadrawingz3;

// If u make any method as final You cannot override it
final class Dog {
    final void bark() {
        System.out.println("Barking behavior.");
    }
}

// I cannot extend Dog bcz it is final, so inheritance is impossible
// I cannot override bark() methoo bcz its final


// Bcz, Only a method is final, we can inherit but not override it.
class Cow {
    final void eat() {
        System.out.println("Cows eats herbs");
    }
}

public class FinalClassAndMethod extends Cow{
    public static void main(String[] args) {

        // error: void eat() { System.out.println("Eats herbs too much!"); }
        // but we can: inherit it only

        new FinalClassAndMethod().eat();
    }
}
