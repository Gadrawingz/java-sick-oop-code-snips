package com.gadrawingz3;

// In this program, our abstract class has constructor, data member & methods
// Briefly abstract class can have a data member, method body(non-abstract method),
// Constructor & even main method

abstract class Website {

    Website() { // Constructor
        System.out.println("Website is created!");
    }
    abstract void loadingSpeed(); // Abstract method

    void getWebsiteUrl(String url) {
        System.out.println("Website url's "+url);
    }
}

class BlogWebsite extends Website {

    // Implementation of abstract method
    void loadingSpeed() {
        System.out.println("Site loads perfectly fast!");
    }
}

public class AbstractionHavingAll {
    public static void main(String[] args) {

        Website web = new BlogWebsite();
        web.getWebsiteUrl("https://www.donnekt.com");
        web.loadingSpeed();
    }
}
