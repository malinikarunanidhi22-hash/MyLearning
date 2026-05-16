package org.testleaf.day4;

/**
 * ParentClass serves as a parent class for demonstrating inheritance and method
 * overriding.
 * It provides utility methods for capturing snapshots and reporting test steps.
 */
public class ParentClass {

    /**
     * Captures a snapshot of the current state.
     */
    public void takesnap() {
        System.out.println("snapshot is taken");
    }

    /**
     * Reports a test step successfully.
     */
    public void reportStep() {
        System.out.println("Step reported sucessfully");
    }

    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.takesnap();
    }

}
