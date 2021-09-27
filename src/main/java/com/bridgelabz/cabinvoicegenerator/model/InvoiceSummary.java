package com.bridgelabz.cabinvoicegenerator.model;

import java.util.Objects;

public class InvoiceSummary {

    private final int numberOfRides;
    private final double totalFare;
    private final double avgFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare / this.numberOfRides;
    }
    // to compare objects we should have hashcode method else they
    //create a two different instances so creating equals() and hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfRides, totalFare, avgFare);
    }
}
