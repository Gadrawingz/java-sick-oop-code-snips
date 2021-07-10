package com.gadrawingz3;

class DomesticAnimal {
    void animalSound() {
        System.out.println("The animal makes a sound!");
    }
}

class BigDog extends DomesticAnimal {
    void animalSound() {
        System.out.println("The dog says: bow wow...");
    }
}

class BigCat extends DomesticAnimal {
    void animalSound() {
        System.out.println("The cat says: wee wee...");
    }
}

public class PolymorphismRuntime3Animal {
    public static void main(String[] args) {
        DomesticAnimal animal;

        animal = new BigDog();
        animal.animalSound();

        animal = new BigCat();
        animal.animalSound();
    }
}
