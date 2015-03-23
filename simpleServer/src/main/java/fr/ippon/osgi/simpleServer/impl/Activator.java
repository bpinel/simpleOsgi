package fr.ippon.osgi.simpleServer.impl;

import fr.ippon.osgi.simpleServer.api.CurrencyConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    ServiceRegistration currencyConverterServiceRegistration;
    /**
     * Implements BundleActivator.start().
     * @param bundleContext - the framework context for the bundle.
     **/
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Currency converter module is starting");
        CurrencyConverter currencyConverter = new CurrencyConverterImpl();
        currencyConverterServiceRegistration =bundleContext.registerService(CurrencyConverter.class.getName(), currencyConverter, null);
    }

    /**
     * Implements BundleActivator.stop().
     * @param bundleContext - the framework context for the bundle.
     **/
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Currency converter module is shutting down");
        currencyConverterServiceRegistration.unregister();
    }
/*
    public void onBindService(final CurrencyConverter sampleService) {
        if (sampleService == null) {
            System.out.println("sample service is null");
        } else {
            System.out.println("1 USD is " + sampleService.getRate(1.,"USD", "EUR")+ " EUR");
        }
    }

    public void onUnbindService(final CurrencyConverter sampleService) {
        System.out.println("service unbound");
    }
*/
}