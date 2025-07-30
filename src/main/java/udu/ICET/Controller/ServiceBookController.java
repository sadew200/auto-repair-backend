package udu.ICET.Controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.helpers.CheckReturnValue;
import org.springframework.web.bind.annotation.*;
import udu.ICET.Entity.ServiceEntity;
import udu.ICET.Model.Service;
import udu.ICET.Service.ServiceBookBO;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
public class ServiceBookController {

    private final ServiceBookBO serviceBookBO;

    @PostMapping("/BookService")
    public void bookService(@RequestBody Service service){
        serviceBookBO.addService(service);
    }

    @GetMapping("/PreviousService")
    public List<ServiceEntity> PreviousService(){
        return serviceBookBO.getService();
    }

    @GetMapping("/DeleteService/{serviceID}")
    public void bookService(@PathVariable  Integer serviceID){
        serviceBookBO.deleteService(serviceID);
    }
}
