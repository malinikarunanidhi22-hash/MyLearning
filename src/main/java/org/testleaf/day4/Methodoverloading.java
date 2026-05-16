package org.testleaf.day4;

/**
 * Methodoverloading demonstrates method overloading with multiple versions of the reportStep method.
 * It shows how different parameter combinations can define different method behaviors.
 */
public class Methodoverloading {
    
    /**
     * Reports a test step with message and status.
     * @param msg the test step message
     * @param status the test status (PASS/FAIL)
     */
    public void reportStep(String msg, String status) {
        System.out.println("Message : " + msg);
        System.out.println("Status  : " + status);
    }

    /**
     * Reports a test step with message, status, and snapshot option.
     * @param msg the test step message
     * @param status the test status (PASS/FAIL)
     * @param snap boolean flag indicating whether to capture a snapshot
     */
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Message : " + msg);
        System.out.println("Status  : " + status);
        if (snap) {
            System.out.println("Snapshot Taken");
        } else {
            System.out.println("Snapshot Not Taken");

        }

    }

    public static void main(String[] args) {
        Methodoverloading overloading = new Methodoverloading();
        overloading.reportStep("Login Successful", "PASS");
        System.out.println("----------------------------------------------------");
        overloading.reportStep("Payment Failed", "FAIL", true);
    }

}
