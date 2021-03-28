package delta.administration.rest;


import delta.administration.domain.gestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class gestionnaireControler {
	
	@Autowired
    private delta.administration.service.gestionnaireService gestionnaireService;
	
	/**
	 * Create - Add a new gestionnaire
	 * @param bayeur An object gestionnaire
	 * @return The gestionnaire object saved
	 */

	@RequestMapping(value = "/gestionnaires", method = RequestMethod.POST)
	public gestionnaire createGestionnaire(@RequestBody gestionnaire gestionnaire) {
		return gestionnaireService.saveGestionnaire(gestionnaire);
	}
	
	
	/**
	 * Read - Get one gestionnaire
	 * @param id The id of the gestionnaire
	 * @return An gestionnaire object full filled
	 */

	@RequestMapping(value = "/gestionnaires/{id}", method = RequestMethod.GET)
	public gestionnaire getGestionnaire(@PathVariable("id") final Long id) {
		Optional<gestionnaire> gestionnaire = gestionnaireService.getGestionnaire(id);
		if(gestionnaire.isPresent()) {
			return gestionnaire.get();
		} else {
			return null;
		}
	}
	
	/**
	 * Read - Get all gestionnaire
	 * @return - An Iterable object of gestionnaire full filled
	 */
	
	@RequestMapping(value = "/gestionnaires", method = RequestMethod.GET)
	public Iterable<gestionnaire> getGestionnaires() {
		return gestionnaireService.getGestionnaire();
	}
	
	/**
	 * Update - Update an existing gestionnaire
	 * @param id - The id of the gestionnaire to update
	 * @param gestionnaire - The gestionnaire object updated
	 * @return
	 */
	
	@RequestMapping(value = "/gestionnaires/{id}", method = RequestMethod.PUT)
	public gestionnaire updateGestionnaire(@PathVariable("id") final Long id, @RequestBody gestionnaire gestionnaire) {
		Optional<gestionnaire> g = gestionnaireService.getGestionnaire(id);
		if(g.isPresent()) {
			gestionnaire nouveauGestionnaire = g.get();
			
			String reference = gestionnaire.getReference();
			if(reference != null) {
				nouveauGestionnaire.setReference(reference);
			}
			
			String nom = gestionnaire.getNom();
			if(nom != null) {
				nouveauGestionnaire.setNom(nom);
			}
			String prenom = gestionnaire.getPrenom();
			if(prenom != null) {
				nouveauGestionnaire.setPrenom(prenom);;
			}
			String adresse = gestionnaire.getAdresse();
			if(adresse != null) {
				nouveauGestionnaire.setAdresse(adresse);
			}
			String telephone = gestionnaire.getTel();
			if(telephone != null) {
				nouveauGestionnaire.setTel(telephone);;
			}
			String mail = gestionnaire.getEmail();
			if(mail != null) {
				nouveauGestionnaire.setEmail(mail);;
			}
			String type = gestionnaire.getTypeGestionnaire();
			if(type != null) {
				nouveauGestionnaire.setTypeGestionnaire(type);;
			}
			gestionnaireService.saveGestionnaire(nouveauGestionnaire);
			return nouveauGestionnaire;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an gestionnaire
	 * @param id - The id of the gestionnaire to delete
	 */

	@RequestMapping(value = "/gestionnaires/{id}", method = RequestMethod.DELETE)
	public void deleteGestionnaire(@PathVariable("id") final Long id) {
		gestionnaireService.deleteGestionnaire(id);
	}
	


}
