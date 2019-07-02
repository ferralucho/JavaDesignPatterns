package ferralucho.designpatterns.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<MessagingService> services = new ArrayList<>();

    public MessagingService getService(String serviceName) {
        // retrieve from the list
        return services.get(0);
    }

    public void addService(MessagingService newService) {
        services.add(newService);
    }
}
