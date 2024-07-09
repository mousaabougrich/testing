/*package stage_test.testing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import stage_test.testing.dtos.SecretaireDTO;
import stage_test.testing.entities.Secretaire;
import stage_test.testing.entities.Service_Dep;
import stage_test.testing.repositories.SecretaireRepository;
import stage_test.testing.repositories.ServiceRepository;
import stage_test.testing.repositories.UtilisateurRepository;

@Service
public class SecretaireService {

    @Autowired
    private SecretaireRepository secretaireRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;  // Add this line

    // Add a new secretaire
    @Transactional
    public SecretaireDTO addSecretaire(SecretaireDTO secretaireDTO) {
        if (utilisateurRepository.findByEmail(secretaireDTO.getEmail()) != null) {
            throw new RuntimeException("User with email " + secretaireDTO.getEmail() + " already exists.");
        }

        Service_Dep serviceDep = serviceRepository.findByNom(secretaireDTO.getServiceName());
        if (serviceDep == null) {
            throw new RuntimeException("Service not found with name: " + secretaireDTO.getServiceName());
        }

        Secretaire secretaire = new Secretaire();
        secretaire.setNom(secretaireDTO.getNom());
        secretaire.setPrenom(secretaireDTO.getPrenom());
        secretaire.setEmail(secretaireDTO.getEmail());
        secretaire.setPassword(secretaireDTO.getPassword());
        secretaire.setServiceDep(serviceDep);

        Secretaire savedSecretaire = secretaireRepository.save(secretaire);

        return new SecretaireDTO(savedSecretaire.getNom(), savedSecretaire.getPrenom(), savedSecretaire.getEmail(), savedSecretaire.getPassword(), serviceDep.getNom());
    }

    // Delete a secretaire by nom and prenom
    @Transactional
    public void deleteSecretaire(String nom, String prenom) {
        secretaireRepository.deleteByNomAndPrenom(nom, prenom);
    }

    // Update an existing secretaire by nom and prenom
    @Transactional
    public SecretaireDTO updateSecretaire(String nom, String prenom, SecretaireDTO secretaireDTO) {
        Secretaire existingSecretaire = secretaireRepository.findByNomAndPrenom(nom, prenom);
        if (existingSecretaire != null) {
            Service_Dep serviceDep = serviceRepository.findByNom(secretaireDTO.getServiceName());
            if (serviceDep == null) {
                throw new RuntimeException("Service not found with name: " + secretaireDTO.getServiceName());
            }
            existingSecretaire.setNom(secretaireDTO.getNom());
            existingSecretaire.setPrenom(secretaireDTO.getPrenom());
            existingSecretaire.setEmail(secretaireDTO.getEmail());
            existingSecretaire.setPassword(secretaireDTO.getPassword());
            existingSecretaire.setServiceDep(serviceDep);

            Secretaire updatedSecretaire = secretaireRepository.save(existingSecretaire);

            return new SecretaireDTO(updatedSecretaire.getNom(), updatedSecretaire.getPrenom(), updatedSecretaire.getEmail(), updatedSecretaire.getPassword(), serviceDep.getNom());
        } else {
            throw new RuntimeException("Secretaire not found with nom: " + nom + " and prenom: " + prenom);
        }
    }
}*/
