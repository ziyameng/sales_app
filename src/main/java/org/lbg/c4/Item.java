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

    public Item() {

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

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", vat=" + vat +
                '}';
    }


    public void vatCalculatorInClass(){
        double totalPrice = cost + cost*(vat/100);

        System.out.println("the total price is "+totalPrice);
    }
}
