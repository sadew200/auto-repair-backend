package udu.ICET.Service;

import udu.ICET.Entity.ServiceEntity;
import udu.ICET.Model.Service;

import java.util.List;

public interface ServiceBookBO {
    void addService(Service service);

    List<ServiceEntity> getService();

    void deleteService(Integer serviceID);
}
