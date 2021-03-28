package delta.administration.service;

import delta.administration.domain.conducteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class conducteurService {
	
	@Autowired
	private delta.administration.reposy.conducteurRepository conducteurRepository;
	
	public Optional<conducteur> getConducteur(final Long id) {

		return conducteurRepository.findById(id);
	}
	
	public Iterable<conducteur> getConducteur() {

		return conducteurRepository.findAll();
	}
	
	public void deleteConducteur(final Long id) {
		conducteurRepository.deleteById(id);
	}
	
	public conducteur saveConducteur(conducteur conducteur) {
		conducteur savedconducteur = conducteurRepository.save(conducteur);
		return savedconducteur;
	}

}
