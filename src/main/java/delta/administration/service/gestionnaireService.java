package delta.administration.service;

import delta.administration.domain.gestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class gestionnaireService {
	
	@Autowired
	private delta.administration.reposy.gestionnaireRepository gestionnaireRepository;
	
	public Optional<gestionnaire> getGestionnaire(final Long id) {
		return gestionnaireRepository.findById(id);
	}
	
	public Iterable<gestionnaire> getGestionnaire() {
		return gestionnaireRepository.findAll();
	}
	
	public void deleteGestionnaire(final Long id) {
		gestionnaireRepository.deleteById(id);
	}
	
	public gestionnaire saveGestionnaire(gestionnaire gestionnaire) {
		gestionnaire savedgestionnaire = gestionnaireRepository.save(gestionnaire);
		return savedgestionnaire;
	}

}
