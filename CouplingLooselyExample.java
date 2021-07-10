package com.gadrawingz4;
import java.io.IOException;

public class CouplingLooselyExample {
    public static void main(String[] args) throws IOException {

        Show second = new Second();
        Show third = new Third();

        First first = new First(second);
        first.displayInfo();

        First first1 = new First(third);
        first1.displayInfo();

    }
}


interface Show {
    public void displayInfo();
}

class First {
    Show sh;
    public First(Show sh) {
        this.sh = sh;
    }

    public void displayInfo() {
        System.out.println("First!");
        sh.displayInfo();
    }
}

class Second implements Show {

    public Second() {
    }

    public void displayInfo() {
        System.out.println("Second!\n");
    }
}

class Third implements Show {

    public Third() {

    }

    public void displayInfo() {
        System.out.println("Third!");
    }
}