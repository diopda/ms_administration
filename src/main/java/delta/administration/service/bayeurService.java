package delta.administration.service;

import delta.administration.domain.bayeur;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class bayeurService {
	
	@Autowired
	private delta.administration.reposy.bayeurRepository bayeurRepository;
	
	public Optional<bayeur> getBayeur(final Long id) {
		return bayeurRepository.findById(id);
	}
	
	public Iterable<bayeur> getBayeur() {
		return bayeurRepository.findAll();
	}
	
	public void deleteBayeur(final Long id) {
		bayeurRepository.deleteById(id);
	}
	
	public bayeur saveBayeur(bayeur bayeur) {
		bayeur savedbayeur = bayeurRepository.save(bayeur);
		return savedbayeur;
	}


}