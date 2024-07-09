/*package stage_test.testing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stage_test.testing.dtos.SecretaireDTO;
import stage_test.testing.services.SecretaireService;

@RestController
@RequestMapping("/secretaires")
public class SecretaireController {

    @Autowired
    private SecretaireService secretaireService;

    @PostMapping("/add")
    public SecretaireDTO addSecretaire(@RequestBody SecretaireDTO secretaireDTO) {
        return secretaireService.addSecretaire(secretaireDTO);
    }

    @DeleteMapping("/delete")
    public void deleteSecretaire(@RequestParam String nom, @RequestParam String prenom) {
        secretaireService.deleteSecretaire(nom, prenom);
    }

    @PutMapping("/update")
    public SecretaireDTO updateSecretaire(@RequestParam String nom, @RequestParam String prenom, @RequestBody SecretaireDTO secretaireDTO) {
        return secretaireService.updateSecretaire(nom, prenom, secretaireDTO);
    }
}*/
