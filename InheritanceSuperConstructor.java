package com.gadrawingz3;

// 3.

class Game {

    Game() {
        System.out.println("The Game is created!");
    }
}

class Football extends Game {

    Football() {
        // This super() is added in each class constructor automatically.
        // Means super() is provided by compiler implicitly, even if we 4get it.
        super();
        System.out.println("Football's created, child of Game!");
    }
}

public class InheritanceSuperConstructor {
    public static void main(String[] args) {
        Football foot = new Football();
    }
}