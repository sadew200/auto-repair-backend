package udu.ICET.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import udu.ICET.Entity.ServiceEntity;
import udu.ICET.Repository.ServiceBookRepository;
import udu.ICET.Service.ServiceBookBO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceBookBOImpl implements ServiceBookBO {

    private final ServiceBookRepository serviceBookRepository;

    @Override
    public void addService(udu.ICET.Model.Service service) {
        serviceBookRepository.save(new ModelMapper().map(service, ServiceEntity.class));
    }

    @Override
    public List<ServiceEntity> getService() {
        return serviceBookRepository.findAll();
    }
}
