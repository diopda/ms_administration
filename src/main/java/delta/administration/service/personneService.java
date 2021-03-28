package delta.administration.service;

import delta.administration.domain.personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class personneService {
	
	@Autowired
	private delta.administration.reposy.personneRepository personneRepository;
	
	public Optional<personne> getPersonne(final Long id) {
		return personneRepository.findById(id);
	}
	
	public Iterable<personne> getPersonne() {
		return personneRepository.findAll();
	}
	
	public void deletePersonne(final Long id) {
		personneRepository.deleteById(id);
	}
	
	public personne savePersonne(personne personne) {
		personne savedpersonne = personneRepository.save(personne);
		return savedpersonne;
	}

}
