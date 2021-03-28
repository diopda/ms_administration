package delta.administration.service;

import delta.administration.domain.paysan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class paysanService {
	
	@Autowired
	private delta.administration.reposy.paysanRepository paysanRepository;
	
	public Optional<paysan> getPaysan(final Long id) {

		return paysanRepository.findById(id);
	}

	public Iterable <paysan> getPaysanss(final Long id) {

		return paysanRepository.findByIdgroupement(id);
	}
	
	public Iterable <paysan> getPrenom(final String prenom) {

		return paysanRepository.findByPrenom(prenom);
	}




	public Iterable<paysan> getPaysans() {
		return paysanRepository.findAll();
	}

	
	public void deletePaysan(final Long id) {
		paysanRepository.deleteById(id);
	}
	
	public paysan savePaysan(paysan paysan) {
		paysan savedpaysan = paysanRepository.save(paysan);
		return savedpaysan;
	}

}
