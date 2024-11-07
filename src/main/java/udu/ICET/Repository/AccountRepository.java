package udu.ICET.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import udu.ICET.Entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,String> {
    boolean existsByEmail(String email);

    boolean existsByContactNumber(String contactNumber);


    AccountEntity getByEmail(String email);
}
