package fr.ippon.osgi.simpleServer.impl;

import fr.ippon.osgi.simpleServer.api.CurrencyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by bertrand on 23/03/2015.
 */
public class CurrencyConverterImpl implements CurrencyConverter{


    public double getRate(double value, String from, String to) {
        double rate = 0;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://quote.yahoo.com/d/quotes.csv?f=l1&s=" + from + to + "=X");
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            if (line.length() > 0) {
                rate = Double.parseDouble(line);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader!= null) try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return value*rate;
    }

}
