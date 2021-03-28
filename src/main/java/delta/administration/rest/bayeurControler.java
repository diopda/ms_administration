package delta.administration.rest;

import delta.administration.domain.bayeur;
import delta.administration.exception.BayeurIntrouvableException;
import delta.administration.service.bayeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class bayeurControler {

	@Autowired
    private bayeurService bayeurService;
	
	
	@PostMapping("/bayeurs")
	public bayeur createConducteur(@RequestBody bayeur bayeur) {

		return bayeurService.saveBayeur(bayeur);
	}
	
	
	
	@GetMapping("/bayeurs/{id}")
	public bayeur getBayeur(@PathVariable("id") final Long id) throws BayeurIntrouvableException {
		Optional<bayeur> bayeur = bayeurService.getBayeur(id);
		if(bayeur.isPresent()) {
			return bayeur.get();
		} else {
			throw new BayeurIntrouvableException("Le produit avec l'id  est INTROUVABLE.");
		}
	}
	

	@GetMapping("/bayeurs")
	public Iterable<bayeur> getBayeurs() {
		return bayeurService.getBayeur();
	}
	
	
	@PutMapping("/bayeurs/{id}")
	public bayeur updateBayeur(@PathVariable("id") final Long id, @RequestBody bayeur bayeur) {
		Optional<bayeur> b = bayeurService.getBayeur(id);
		if(b.isPresent()) {
			bayeur nouveauBayeur = b.get();
			
			String reference = bayeur.getReference();
			if(reference != null) {
				nouveauBayeur.setReference(reference);
			}
			
			String nom = bayeur.getNom();
			if(nom != null) {
				nouveauBayeur.setNom(nom);
			}
			String prenom = bayeur.getPrenom();
			if(prenom != null) {
				nouveauBayeur.setPrenom(prenom);;
			}
			String adresse = bayeur.getAdresse();
			if(adresse != null) {
				nouveauBayeur.setAdresse(adresse);
			}
			String telephone = bayeur.getTel();
			if(telephone != null) {
				nouveauBayeur.setTel(telephone);;
			}
			String mail = bayeur.getEmail();
			if(mail != null) {
				nouveauBayeur.setEmail(mail);;
			}
			bayeurService.saveBayeur(nouveauBayeur);
			return nouveauBayeur;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an bayeur
	 * @param id - The id of the bayeur to delete
	 */
	
	@DeleteMapping("/bayeurs/{id}")
	public void deleteBayeur(@PathVariable("id") final Long id) {
		bayeurService.deleteBayeur(id);
	}
	

}
