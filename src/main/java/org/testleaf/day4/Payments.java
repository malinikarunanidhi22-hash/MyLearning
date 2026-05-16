package org.testleaf.day4;

/**
 * Payments interface defines various payment methods available in e-commerce platforms.
 * Implementing classes must provide implementations for all payment options.
 */
public interface Payments {
    /**
     * Handles Cash on Delivery (COD) payment method.
     * Customer pays when the order is delivered.
     */
    public void cashOnDelivery();

    
    /**
     * Processes UPI (Unified Payments Interface) payment method.
     * Quick digital payment through UPI gateway.
     */
    public void upiPayments();
    
    /**
     * Handles credit or debit card payment method.
     * Secure card transaction processing.
     */
    public void cardPayments();
    
    /**
     * Processes Internet Banking payment method.
     * Direct bank transfer through online banking services.
     */
    public void internetBanking();
}
