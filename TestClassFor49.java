/********************************
 * Package: is a group of similar types of classes, interfaces & sub-packages.
 *
 * TWO FORMS OF PACKAGES IN JAVA: categorized as:
 * i) Built-in packages: java, lang, awt, javax, swing, net, io, util, sql
 * ii) User-defined packages: gadpack, pack1, mypackage
 *
 * ADVANTAGES:
 * i) Provides access protection & removes naming collision.
 *
 * HOW TO ACCESS THE PACKAGE FROM ANOTHER PACKAGE:
 * (3ways 2 access the package from outside package)
 *
 * i) import package.* (all the classes & interfaces of this pack
 * will be accessible but not subpackages)
 *
 * ii) import.package.ClassX (only classX of this package will be accessible)
 *
 * iii)  fully qualified name.* (if use FQN, then only declared class will be accessible,There
 * is no need to import. But u need to use FQN every time when U are accessing the class/interface)
 * *****************************/
package com.grabpackage;

import com.accessmod1.AccessModParent49;
// we import class we want to use


public class TestClassFor49 {
    public static void main(String[] args) {

        // I need to access another class from accessmod1
        AccessModParent49 obj = new AccessModParent49();
        obj.getAmount();
    }
}
