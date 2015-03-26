package fr.ippon.osgi.simpleServer.impl;

import fr.ippon.osgi.simpleServer.api.CurrencyConverter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    /**
     * Implements BundleActivator.start().
     * @param bundleContext - the framework context for the bundle.
     **/
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Currency converter module is starting");
     }

    /**
     * Implements BundleActivator.stop().
     * @param bundleContext - the framework context for the bundle.
     **/
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Currency converter module is shutting down");
    }

}