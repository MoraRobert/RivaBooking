package com.robertmora.bookingriva;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApartmentBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String aptName;
    private double price;
    private int numberOfNights;

    public ApartmentBooking() {}        //föltétlenül kell az Insomniának

    public ApartmentBooking(String aptName, double price, int numberOfNights) {
        this.aptName = aptName;
        this.price = price;
        this.numberOfNights = numberOfNights;
    }

    public String getAptName() {
        return aptName;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalPrice() {
        return price * numberOfNights;
    }

    public long getId() {
        return id;
    }
}
