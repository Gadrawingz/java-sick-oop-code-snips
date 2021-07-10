/*******************************
 * DebateTopic1 & DebateTopic2 objects are loosely coupled.
 * It means DebateTopic is an interface & we can inject any of
 * implemented at run-time & we can provide servide to the end user.
 * *****************************/

package com.gadrawingz4;
interface DebateTopic {
    void understand();
}

class DebateTopic1 implements DebateTopic {
    public void understand() {
        System.out.println("Got it!");
    }
}

class DebateTopic2 implements DebateTopic {
    public void understand() {
        System.out.println("Understood!");
    }
}

class DebateTopic3 implements DebateTopic {
    public void understand() {
        System.out.println("Nabyumvishe!");
    }
}

public class CouplingLooselySubject {
    public static void main(String[] args) {

        DebateTopic t1 = new DebateTopic1();
        t1.understand(); // Got it!

        DebateTopic t2 = new DebateTopic2();
        t2.understand(); // Understood!

        DebateTopic t3 = new DebateTopic3();
        t3.understand(); // Nabyumvishe!
    }
}
