package com.pluralsight;

public class SaleContract extends Contract {

    double salesTax = 0.5;
    int recordingFee = 100;
    int processingFee = 295;    //if under 10k, if over will be $495
    boolean isFinanced;
    //if isFinanced
    double monthlyPayment;  //loan = 4.25% interest for 48 months if over $10k, otherwise 5.25% for 24 months


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
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    //    these values will be computed based on type of contract

}
