package com.indev.cryptocurrency.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyBank {
	
	private Customer sellerCustomer;
	private List<String> supportedCryptoCurrency = new ArrayList<>();
	
    public void addSupportedCryptoCurrency(String bitcoin) {
        this.supportedCryptoCurrency.add(bitcoin);
    }

    public int requestTransaction(Customer buyerCustomer, int i, String bitcoin) {
    	int ret = 0;
    	if(sellerCustomer == null)
    		return ret;
    	else {
    		if(sellerCustomer.getBitcoin() == bitcoin) {
    			sellerCustomer.setBalance(i);
    			sellerCustomer.setI(sellerCustomer.getI() - i);
    			buyerCustomer.setBalance(buyerCustomer.getBalance() - i);
    			buyerCustomer.setI(i);
    			buyerCustomer.setBitcoin(bitcoin);
    			ret = i;
    		}
    		return ret;
    	}
    }

    public void addSeller(Customer sellerCustomer) {
    	this.sellerCustomer = sellerCustomer;
    }
}
