/******************************************
 * In Obj.Oriented design, Coupling refers to the degree of direct knowledge
 * that one element has of another. It is the important Obj.Oriented concept.
 *
 * @ Is a situation where an object can be used by another object. So,
 * It is a process of collaborating the process together & working for each other.
 *
 * @ Briefly, Coupling is when one class uses another class. which refers to the degree
 * to which one class knows about another class.
 *
 * @ It simply means that 1 object requires another object to complete its assigned work.
 * @ Thereby, reducing the dependency b2n the modules. Its called as collaboration,
 * If one class, calls the logic of another class.
 *
 * #KEY POINTS
 *
 * @ While creating, a complex app in Java, the logic of one class will call the
 * logic of another class to provide the same service to the client.
 *
 * @ If 1 class calling another class logic, then it is called coupling.
 * @ When one class's collaborating with another class, then there exists a tight-coupling
 * between 2 classes.
 *
 * @ If 1 class wants to call the logic of a 2nd class need an object of 2nd class,
 * it means the 1st class creates an obj. of the 2nd class.
 *
 * TYPES OF COUPLING:
 * 1. Tight coupling (1 class tightly coupled with other class)
 * 2. Loose coupling (
 *
 * DIFFERENCE BETWEEN BOTH:
 * a) Tight.C (More interdependency), So, it is not good at testability
 * but Loose.C is Less dependency with better testability(improves test-ability)
 *
 * b) Tight.C doesn't provide the concept of interface, But Loose.C help us follow
 * the GOF principles of the program interface
 *
 * c) In tight coupling, Its not easy to swap the codes between 2 classes.
 * But its much easier 2 swap other piece of code/modules/objects/components in Loose.C..
 *
 * d) Tight.C doesn't have the changing capability. But Loose.C is highly changeable.
 *
 * c) Tight.C(Synchronous communication), & Loose.C (Asynchronous communication)
 * s) More coordination, Swapping a piece of code/objects btn 2 objects are easy,
 * & Loose.C (less coordination, not easy)
 *
 * {THEREBY}: Coupling, reduces the dependency between the modules.
 * ****************************************/

package com.gadrawingz4;

public class CouplingIntroduction {
}
