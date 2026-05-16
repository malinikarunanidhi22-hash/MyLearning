package org.testleaf.day4;

/**
 * Abstract class for Canarabank payment operations.
 * Implements the Payments interface and provides bank-specific payment handling.
 * Subclasses must implement all abstract payment methods from the Payments interface.
 */
public abstract class Canarabank implements Payments
{
    /**
     * Records and stores payment transaction details in the Canarabank customer account.
     * This method persists payment information for audit trails and customer records.
     */
    public void recordPaymentDetails() {
        System.out.println("Payment details recorded successfully on Canarabank account");
    }
}
