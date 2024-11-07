package udu.ICET.Response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AccountResponse {
    private boolean isEmailValid=false;
    private boolean isContactNumberValid=false;
    private boolean isPasswordValid=false;

}
