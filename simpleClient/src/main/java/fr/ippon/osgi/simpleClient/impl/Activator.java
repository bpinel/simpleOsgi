package fr.ippon.osgi.simpleClient.impl;


import fr.ippon.osgi.simpleServer.api.CurrencyConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

/**
 * Created by bertrand on 23/03/2015.
 */

public class Activator implements BundleActivator {

    private CurrencyConverter currencyConverter;
    /**
         * Implements BundleActivator.start().
         * @param bundleContext - the framework context for the bundle.
         **/
        @Override
        public void start(BundleContext bundleContext) throws Exception {
            System.out.println("Simple client module is starting");

            double oneDollar = currencyConverter.getRate(1., "USD", "EUR");

            System.out.println("One dollar is "+oneDollar+" Euro");
        }

        /**
         * Implements BundleActivator.stop().
         * @param bundleContext - the framework context for the bundle.
         **/
        @Override
        public void stop(BundleContext bundleContext) throws Exception {
            System.out.println("Simple client module is shutting down");
        }

    public CurrencyConverter getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }
}
