package com.accessmod1;

// Accessible within package and outside the package
// But through inheritance only.
// Bcz, this modifier can be applied on the data member, method & constructor
// It can't be applied on the class.

// This class has subclass in another package2
public class AccessModProtectedBase {

    protected short currentYear = 2021;
    protected void sayHello() {
        System.out.println("Hello children. This is "+currentYear);
    }
}
