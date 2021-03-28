package delta.administration.rest;


import delta.administration.domain.paysan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class paysanControler {

	@Autowired
	private delta.administration.service.paysanService paysanService;

	@PostMapping("/paysans")
	public paysan createPaysan(@RequestBody paysan paysan) {

		return paysanService.savePaysan(paysan);
	}



	@GetMapping("/paysans/{id}")
	public paysan getPaysan(@PathVariable("id") final Long id) {
		Optional<paysan> paysan = paysanService.getPaysan(id);
		if (paysan.isPresent()) {
			return paysan.get();
		} else {
			return null;
		}
	}


	@GetMapping("/paysanss/{id}")
	public Iterable<paysan> getPaysanss(@PathVariable("id") final Long id) {
		Iterable<paysan> paysan = paysanService.getPaysanss(id);
		if (paysan.iterator().hasNext()){
			return paysan;
	     }else
			return null;
}
	

	@GetMapping("/prenom/{nom}")
	public Iterable<paysan> getPrenom(@PathVariable("nom") final String nom) {
		Iterable<paysan> paysan = paysanService.getPrenom(nom);
		if (paysan.iterator().hasNext()){
			return paysan;
	     }else
			return null;
}

	
	
	 @RequestMapping(value = "/paysans", method = RequestMethod.GET)
	public Iterable<paysan> getPaysans() {
		return paysanService.getPaysans();
	}
	


	@PutMapping("/paysans/{id}")
	public paysan updatePaysan(@PathVariable("id") final Long id, @RequestBody paysan paysan) {
		Optional<paysan> p = paysanService.getPaysan(id);
		if(p.isPresent()) {
			paysan nouveauPaysan = p.get();
			
			String reference = paysan.getReference();
			if(reference != null) {
				nouveauPaysan.setReference(reference);
			}
			
			String nom = paysan.getNom();
			if(nom != null) {
				nouveauPaysan.setNom(nom);
			}
			String prenom = paysan.getPrenom();
			if(prenom != null) {
				nouveauPaysan.setPrenom(prenom);;
			}
			String adresse = paysan.getAdresse();
			if(adresse != null) {
				nouveauPaysan.setAdresse(adresse);
			}
			String telephone = paysan.getTel();
			if(telephone != null) {
				nouveauPaysan.setTel(telephone);;
			}
			String mail = paysan.getEmail();
			if(mail != null) {
				nouveauPaysan.setEmail(mail);;
			}
			String fonction = paysan.getFonction();
			if(fonction != null) {
				nouveauPaysan.setFonction(fonction);;
			}
			Long Idgroupement = paysan.getIdgroupement();
			if(Idgroupement != null) {
				nouveauPaysan.setIdgroupement(Idgroupement);;
			}
			
			
			float superficie = paysan.getSuperficie();
			if(superficie != 0) {
				nouveauPaysan.setSuperficie(superficie);;
			}
			paysanService.savePaysan(nouveauPaysan);
			return nouveauPaysan;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Delete - Delete an paysan
	 * @param id - The id of the paysan to delete
	 */
	
	@DeleteMapping("/paysans/{id}")
	public void deletePaysan(@PathVariable("id") final Long id) {
		paysanService.deletePaysan(id);
	}
	


}
