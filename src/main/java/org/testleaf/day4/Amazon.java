package org.testleaf.day4;

/**
 * Amazon class that extends Canarabank.
 * This class demonstrates various payment methods available on Amazon e-commerce platform.
 * It includes payment options such as Cash on Delivery, UPI, Card payments, Internet Banking,
 * and functionality to record payment details for an Amazon purchase.
 */
public class Amazon extends Canarabank {

    /**
     * Handles Cash on Delivery (COD) payment option for Amazon orders.
     * This method enables customers to pay for their orders when the product is delivered.
     */
    public void cashOnDelivery() {
        System.out.println("Cash on Delivery payment selected");
    }

    /**
     * Processes UPI (Unified Payments Interface) payment on Amazon.
     * This method completes the payment transaction using the UPI payment gateway.
     */
    public void upiPayments() {
        System.out.println("UPI payment completed");
    }

    /**
     * Handles credit/debit card payment on Amazon platform.
     * This method processes card transactions securely through Amazon's payment system.
     */
    public void cardPayments() {
        System.out.println("Card payment completed");
    }

    /**
     * Processes Internet Banking payment for Amazon orders.
     * This method enables direct bank transfer through internet banking services.
     */
    public void internetBanking() {
        System.out.println("Internet Banking payment completed");
    }

    /**
     * Records and stores the payment details in the Amazon customer account.
     * This method saves the transaction details for future reference and order history.
     */
    public void recordPaymentDetails() {
        System.out.println("Payment details recorded successfully on Amazon account");
    }

    /**
     * Main method to demonstrate all payment methods available on Amazon.
     * Creates an Amazon object and executes all payment and recording functionalities.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {

        Amazon obj = new Amazon();

        obj.cashOnDelivery();
        obj.upiPayments();
        obj.cardPayments();
        obj.internetBanking();
        obj.recordPaymentDetails();
    }
}
