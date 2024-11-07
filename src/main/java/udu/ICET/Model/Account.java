package udu.ICET.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {
    private String email;
    private String Name;
    private String contactNumber;
    private String password;
}
