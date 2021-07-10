package com.gadrawingz3;

class Animal0 {
    void eatAction() {
        System.out.println("Eating...");
    }
}

class Dog0 extends Animal0 {
    void eatAction() {
        System.out.println("Eating bones...");
    }
}

class BabyDog0 extends Animal0 {
    void eatAction() {
        System.out.println("Drinking milk...");
    }
}

public class PolymorphismRuntimeMultilev {
    public static void main(String[] args) {

        Animal0 animal1, animal2, animal3;

        animal1 = new Animal0();
        animal2 = new Dog0();
        animal3 = new BabyDog0();

        animal1.eatAction(); // Eating...
        animal2.eatAction(); // Eating bones...
        animal3.eatAction(); // Drinking milk...

    }
}
