package com.krishnachaitanya.customer.transaction;

import java.time.LocalDate;

public class CustomerTransaction {
    private String name;
    private String id;
    private LocalDate date;
    private int totalAmount;

    public CustomerTransaction(String name, String id, LocalDate date, int totalAmount) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate Date) {
        this.date = date;
    }


    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
