package delta.administration.rest;


import delta.administration.domain.conducteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import delta.administration.service.conducteurService;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class conducteurControler {
	@Autowired
    private conducteurService conducteurService;
	
	/**
	 * Create - Add a new conducteur
	 * @param conducteur An object conducteur
	 * @return The conducteur object saved
	 */

	@PostMapping("/conducteurs")
	public conducteur createConducteur(@RequestBody conducteur conducteur) {
		return conducteurService.saveConducteur(conducteur);
	}
	
	
	/**
	 * Read - Get one conducteur
	 * @param id The id of the conducteur
	 * @return An conducteur object full filled
	 */

	@GetMapping("/conducteurs/{id}")
	public conducteur getConducteur(@PathVariable("id") final Long id) {
		Optional<conducteur> conducteur = conducteurService.getConducteur(id);
		if(conducteur.isPresent()) {
			return conducteur.get();
		} else {
			return null;
		}
	}
	
	/**
	 * Read - Get all conducteur
	 * @return - An Iterable object of conducteur full filled
	 */

	@GetMapping("/conducteurs")
	public Iterable<conducteur> getConducteurs() {
		return conducteurService.getConducteur();
	}
	
	/**
	 * Update - Update an existing conducteur
	 * @param id - The id of the conducteur to update
	 * @param conducteur - The conducteur object updated
	 * @return
	 */
	
	@PutMapping("/conducteurs/{id}")
	public conducteur updateConducteur(@PathVariable("id") final Long id, @RequestBody conducteur conducteur) {
		Optional<conducteur> b = conducteurService.getConducteur(id);
		if(b.isPresent()) {
			conducteur nouveauConducteur = b.get();
			
			String reference = conducteur.getReference();
			if(reference != null) {
				nouveauConducteur.setReference(reference);
			}
			
			String nom = conducteur.getNom();
			if(nom != null) {
				nouveauConducteur.setNom(nom);
			}
			String prenom = conducteur.getPrenom();
			if(prenom != null) {
				nouveauConducteur.setPrenom(prenom);;
			}
			String adresse = conducteur.getAdresse();
			if(adresse != null) {
				nouveauConducteur.setAdresse(adresse);
			}
			String telephone = conducteur.getTel();
			if(telephone != null) {
				nouveauConducteur.setTel(telephone);;
			}
			String mail = conducteur.getEmail();
			if(mail != null) {
				nouveauConducteur.setEmail(mail);;
			}
			String permis = conducteur.getPermiConduire();
			if(permis != null) {
				nouveauConducteur.setPermiConduire(permis);;
			}
			String typeConducteur = conducteur.getTypeConducteur();
			if(typeConducteur != null) {
				nouveauConducteur.setTypeConducteur(typeConducteur);;
			}
			Long machine = conducteur.getMachine();
			if(machine != null) {
				nouveauConducteur.setMachine(machine);;
			}
			conducteurService.saveConducteur(nouveauConducteur);
			return nouveauConducteur;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an conducteur
	 * @param id - The id of the conducteur to delete
	 */
	
	@DeleteMapping("/conducteurs/{id}")
	public void deleteConducteur(@PathVariable("id") final Long id) {
		conducteurService.deleteConducteur(id);
	}
	

}
