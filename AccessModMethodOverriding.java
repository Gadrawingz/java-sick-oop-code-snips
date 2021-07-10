package com.accessmod1;

class SuperClass {

    // This one is more restrictive, for overriding reason, leave it default
    protected void sayMyNameBaby() {
        System.out.println("You are Gadrone, baby!");
    }

    // In order to override any method, must not be restrictive (default)
    void sayMyAgeBaby() {
        System.out.println("You are 100 years old!");
    }

}

public class AccessModMethodOverriding extends SuperClass {


    // By trying to override sayMyNameBaby() { }
    // This will gives a compile-time error, but I can override
    // sayMyAgeBaby because it is restrictive (with protected modifier)
    @Override
    void sayMyAgeBaby() {
        System.out.println("Fuck you I can't say it!");
    }

    public static void main(String[] args) {
        AccessModMethodOverriding obj = new AccessModMethodOverriding();
        obj.sayMyAgeBaby();
    }
}