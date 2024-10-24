package org.lbg.c4;

public class Item {
    private double cost;
    private int quantity;
    private double vat;


    public Item(double cost, int quantity, double vat) {
        this.cost = cost;
        this.quantity = quantity;
        this.vat = vat;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
}
