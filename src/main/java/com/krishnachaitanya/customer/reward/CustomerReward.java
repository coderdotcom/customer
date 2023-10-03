package com.krishnachaitanya.customer.reward;

public class CustomerReward {
    private String name;
    private String id;
    private int totalAmount;
    private int reward;

    public CustomerReward(String name, String id, int totalAmount, int reward) {
        this.name = name;
        this.id = id;
        this.totalAmount = totalAmount;
        this.reward = reward;
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

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
