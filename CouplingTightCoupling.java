/*************************************
 * TIGHT COUPLING:
 * @ Is when a group of classes are highly dependent on one another.
 * @ This scenario arises when a class assumes too many responsibilities.
 * @ Or when once concern is spread over many classes rather than having its own class.
 * @ Tight coupling is the situation where an object creates another object for its usage.
 *
 * @ Here, The parent class will be knowing more about the child object,
 * Hence the two objects are called as tightly coupled.
 *
 * @ The dependency factor & the fact that the object cannot be changed by anybody else
 * helps it to achieve the term 'tightly coupled'.
 *
 * @ BRIEFLY, Tight c. means the two classes often change together. Thus, It is Tightly
 * coupled when class A knows more than it should, about the way in w/c B was implemented
 *
 * @ LOGIC: If u wanna change the skin, U would also have to change the design of yo
 * body as well bcz, the two are joined together (tightly coupled)
 * Example: RMI(Remote Method Invocation).
 *
 * ***********************************/






/**********************************
 * Tight coupling concept
 * ----------------------
 * Subject class is dependent on Topic class,
 * So Subject class is tightly coupled with Topic class.
 *
 * It means that, any changes in Topic class requires
 * Subject class to change.
 * *********************************/

package com.gadrawingz4;
class Subject {
    Topic t = new Topic();

    public void startReading() {
        t.understand();
    }
}

class Topic {
    // if this method's change, For example, to learn() We've
    // to change the startReading() method to call learn() instead
    public void understand() {
        System.out.println("tight coupling concept".toUpperCase());
    }
}

public class CouplingTightCoupling {
    public static void main(String[] args) {
        Subject subj = new Subject();
        subj.startReading();
    }
}