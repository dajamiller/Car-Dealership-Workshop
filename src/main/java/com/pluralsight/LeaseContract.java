package com.pluralsight;

public class LeaseContract extends Contract {

    public LeaseContract(String date, String customerName, String customerEmail, boolean vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    //
//
//    these values will be computed based on type of contract
    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
