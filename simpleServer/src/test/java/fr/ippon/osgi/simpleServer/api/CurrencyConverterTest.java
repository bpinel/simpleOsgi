package fr.ippon.osgi.simpleServer.api;

import fr.ippon.osgi.simpleServer.impl.CurrencyConverterImpl;
import junit.framework.TestCase;

/**
 * Created by bertrand on 23/03/2015.
 */
public class CurrencyConverterTest  extends TestCase {

    public void testGetRateFromSameMoney() {
        CurrencyConverter currencyConverter = new CurrencyConverterImpl();
        double result = currencyConverter.getRate(1., "USD", "USD");
        assertEquals(1.0, result, 0.00001);

    }

}
