package com.pluralsight;

public class SaleContract extends Contract {

    private double salesTax = 0.5;
    private int recordingFee = 100;
    private int processingFee = 295;    //if under 10k, if over will be $495
    private boolean isFinanced;
    //if isFinanced
    private double monthlyPayment;  //loan = 4.25% interest for 48 months if over $10k, otherwise 5.25% for 24 months


    public SaleContract(String date, String customerName, String customerEmail, boolean vehicleSold, double salesTax, int recordingFee, int processingFee, boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
    }

    //
//
//    these values will be computed based on type of contract
    @Override
    public double getTotalPrice() {
//        Vehicle.vehiclePrice
//        return (vehiclePrice * salesTax) + recordingFee + processingFee;
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    //    these values will be computed based on type of contract

}
