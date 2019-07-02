package ferralucho.designpatterns.servicelocator;

/*
The purpose of the Service Locator pattern is to return the service instances on demand.
This is useful for decoupling service consumers from concrete classes.

An implementation will consist of the following components:

Client – the client object is a service consumer. It’s responsible for invoking the request from the service locator
Service Locator – is a communication entry point for returning the services from the cache
Cache – an object for storing service references to reuse them later
Initializer – creates and registers references to services in the cache
Service – the Service component represents the original services or their implementation
The original service object is looked up by the locator and returned on demand.
 */

import ferralucho.designpatterns.servicelocatorpattern.InitialContext;

public class ServiceLocatorPattern {
    private static Cache cache = new Cache();

    public static MessagingService getService(String serviceName) {

        MessagingService service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        MessagingService service1 = (MessagingService) context
                .lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}

