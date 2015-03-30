package fr.ippon.osgi.simpleClient.client;

import fr.ippon.osgi.simpleServer.api.CurrencyConverter;

/**
 * Created by bertrand on 30/03/2015.
 */
public class CurrencyConverterClient {
    CurrencyConverter currencyConverter = null;

    public CurrencyConverter getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public void startUp() {
        if (currencyConverter != null) {
            double oneDollar = currencyConverter.getRate(1., "USD", "EUR");

            System.out.println("One dollar is " + oneDollar + " Euro");
        } else {
            System.out.println("CurrencyConverter is not initialized !!!");
        }
    }
}
