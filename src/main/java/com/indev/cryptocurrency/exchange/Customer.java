package com.indev.cryptocurrency.exchange;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Customer {
	
	private final Log LOGGER = LogFactory.getLog(Customer.class);
    private String bitcoin;
    private int i;
    private int balance;

    public Customer(){}

    public Customer(String bitcoin, int i, int balance){
        this.bitcoin = bitcoin;
        this.i = i;
        this.balance = balance;
    }

    public Customer(int balance){
        this.balance = balance;
    }
    
    public Customer withCryptocurrency(String bitcoin, int i) {
        return new Customer(bitcoin, i, this.balance);
    }

    public Customer withBalance(int i) {
        return new Customer(i);
    }

    @Override
    public String toString() {
    	LOGGER.info("******** "+balance+":$,"+i+":"+bitcoin+"***********");
        return balance+":$,"+i+":"+bitcoin;
    }
}
