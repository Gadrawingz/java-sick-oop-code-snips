package com.accessmod1;

/**********************************
 * If there's no any modifier used, it is treated as default by default.
 * Is only accessible within package.
 * Provides more accessibility than private.
 * But, It is more restrictive than protected & public
 * ********************************/

public class AccessModDefault {
    public static void main(String[] args) {

        AccessModPublic accmod1 = new AccessModPublic();

    }
}
