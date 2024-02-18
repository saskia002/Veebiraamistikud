package ee.tlu.veebiraamistikud.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
