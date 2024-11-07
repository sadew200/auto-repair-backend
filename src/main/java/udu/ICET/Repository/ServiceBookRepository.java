package udu.ICET.Repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udu.ICET.Entity.ServiceEntity;

@Repository
public interface ServiceBookRepository extends JpaRepository<ServiceEntity,Integer> {
}
