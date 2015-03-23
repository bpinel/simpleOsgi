package fr.ippon.osgi.simpleServer.api;

/**
 * Created by bertrand on 23/03/2015.
 */
public interface CurrencyConverter {
    public double getRate(double value, String from, String to);
}
