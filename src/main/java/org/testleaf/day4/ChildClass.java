package org.testleaf.day4;

/**
 * ChildClass extends ParentClass and demonstrates method overriding.
 * It overrides the takesnap() method from the parent class to provide custom implementation.
 */
public class ChildClass extends ParentClass {

    /**
     * Overrides parent's takesnap() method with child implementation.
     * In this case, it demonstrates that snapshot is not taken.
     */
    public void takesnap() {
        System.out.println("snapshot is not taken");
    }

    /** Main method to test child class functionality */
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.reportStep();
        obj.takesnap();
    }

}
