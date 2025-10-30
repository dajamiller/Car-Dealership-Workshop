package com.pluralsight;

public class SaleContract extends Contract {

    private double salesTax;
    private int recordingFee;
    private int processingFee = 295;    //if under 10k, if over will be $495
    private boolean isFinanced;
    //if isFinanced
    private double monthlyPayment;  //loan = 4.25% interest for 48 months if over $10k, otherwise 5.25% for 24 months

    private double salesTaxRate  = 0.05;

    public SaleContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, double salesTax, int recordingFee, int processingFee, boolean isFinanced) {
        super(date, customerName, customerEmail, vehicleSold);
        this.salesTax = vehicleSold * salesTaxRate;
        this.recordingFee = 100;
        if (this.processingFee is;
        this.isFinanced = isFinanced;
    }

    //// financed true/false = yes/no
    //public String getFinancedAsText(){
    //    return financed ? "Yes" : "No";
    //}
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
