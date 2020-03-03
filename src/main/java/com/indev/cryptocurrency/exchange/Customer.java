package com.indev.cryptocurrency.exchange;

public class Customer {
    private String bitcoin;
    private int i;

    public Customer(){}

    public Customer(String bitcoin, int i){
        this.bitcoin = bitcoin;
        this.i = i;
    }

    public Customer withCryptocurrency(String bitcoin, int i) {
        return new Customer(bitcoin, i);
    }

    public Customer withBalance(int i) {
        return null;
    }

    @Override
    public String toString() {
        return "0:$,"+i+":"+bitcoin;
    }
}
