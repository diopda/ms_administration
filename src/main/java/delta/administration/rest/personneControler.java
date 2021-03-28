package delta.administration.rest;


import delta.administration.domain.personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 import delta.administration.service.personneService;
import java.util.Optional;

@RestController
public class personneControler {
	
	@Autowired
    private personneService personneService;
	
	/**
	 * Create - Add a new personne
	 * @param personne An object personne
	 * @return The personne object saved
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/personne")
	public personne createPersonne(@RequestBody personne personne) {
		return personneService.savePersonne(personne);
	}
	
	
	/**
	 * Read - Get one personne
	 * @param id The id of the personne
	 * @return An personne object full filled
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/personne/{id}")
	public personne getPersonne(@PathVariable("id") final Long id) {
		Optional<personne> personne = personneService.getPersonne(id);
		if(personne.isPresent()) {
			return personne.get();
		} else {
			return null;
		}
	}
	
	/**
	 * Read - Get all personne
	 * @return - An Iterable object of personne full filled
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/personnes")
	public Iterable<personne> getPersonnes() {
		return personneService.getPersonne();
	}
	
	/**
	 * Update - Update an existing personne
	 * @param id - The id of the personne to update
	 * @param personne - The personne object updated
	 * @return
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/personne/{id}")
	public personne updatePersonne(@PathVariable("id") final Long id, @RequestBody personne personne) {
		Optional<personne> pe = personneService.getPersonne(id);
		if(pe.isPresent()) {
			personne nouveauPersonne = pe.get();
			
			String reference = personne.getReference();
			if(reference != null) {
				nouveauPersonne.setReference(reference);
			}
			
			String nom = personne.getNom();
			if(nom != null) {
				nouveauPersonne.setNom(nom);
			}
			String prenom = personne.getPrenom();
			if(prenom != null) {
				nouveauPersonne.setPrenom(prenom);;
			}
			String adresse = personne.getAdresse();
			if(adresse != null) {
				nouveauPersonne.setAdresse(adresse);
			}
			String telephone = personne.getTel();
			if(telephone != null) {
				nouveauPersonne.setTel(telephone);;
			}
			String mail = personne.getEmail();
			if(mail != null) {
				nouveauPersonne.setEmail(mail);;
			}
			personneService.savePersonne(nouveauPersonne);
			return nouveauPersonne;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an personne
	 * @param id - The id of the personne to delete
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/personne/{id}")
	public void deletePersonne(@PathVariable("id") final Long id) {
		personneService.deletePersonne(id);
	}
	


}
