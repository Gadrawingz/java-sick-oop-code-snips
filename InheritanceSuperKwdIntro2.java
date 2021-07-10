package com.gadrawingz3;


// 2. Can be used 2 invoke immediate parent class method.
// Should be used if subclass contains the same method as parent class (overriding)

class AnimalClass {

    // Lets say we want to re-use this getAnimalFoods() func.
    protected String food = "Insects";
    public void getAnimalFoods() {
        System.out.println("This animal eats "+food);
    }

    public void getLivingPlace() {
        System.out.println("Living place is not known!");
    }
}

class Elephant extends AnimalClass {

    @Override
    public void getLivingPlace() {
        System.out.println("Living place is Water(Overridden)");
    }

    // When we want to make single method to call both sub & super class method,etc
    void getAll() {
        super.getAnimalFoods(); // This animal eats Insects
        getLivingPlace(); // Living place is Water
    }
}

public class InheritanceSuperKwdIntro2 {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.getAll(); /* This animal eats Insects & Living place is Water*/

        AnimalClass parent = new AnimalClass();
        parent.getLivingPlace();
    }
}
