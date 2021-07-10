package com.gadrawingz3;

// This class has only setter methods (Write-only class)
// So, U cant get value of the college. Instead, U can only change the value
class StudentWriteOnly {

    // Private data member!
    private String college;
    private String fullName;

    // Getter and Setter methods for college
    public String setCollege(String college) {
        this.college = college;
        return college;
    }

    public String setNames(String name) {
        this.fullName = name;
        return fullName;
    }

}

// a Java class to test StudentReadOnly class
public class EncapsulationWriteOnly{
    public static void main(String[] args) {

        // We can only set no getCollege
        StudentWriteOnly student1 = new StudentWriteOnly();
        StudentWriteOnly student2 = new StudentWriteOnly();

        String setterA = student1.setNames("Gad IRAUFASHA");
        String setterA2 = student1.setCollege("HUYE");

        // Lets here set only Names as we wish:
        String setterB = student2.setNames("Patrick MUGABIRE");

        System.out.println(setterA+" and college's "+setterA2);
        System.out.println(setterB);
    }
}

