package udu.ICET.Model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Service {
    private int id;
    private String name;
    private String email;
    private String serviceType;
    private LocalDate date;
    private LocalTime time;
    private String specialRequest;


}
