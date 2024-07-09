package stage_test.testing.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretaireDTO {
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String serviceName;
}