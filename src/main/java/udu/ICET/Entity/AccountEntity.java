package udu.ICET.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    private String email;
    private String Name;
    @Column(nullable = false ,unique = true)
    private String contactNumber;
    @Column(nullable = false)
    private String password;
}