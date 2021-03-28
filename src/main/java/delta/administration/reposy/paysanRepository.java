package delta.administration.reposy;

import delta.administration.domain.paysan;
import org.springframework.data.jpa.repository.JpaRepository;


public interface paysanRepository extends JpaRepository<paysan, Long>{


   Iterable <paysan> findByIdgroupement(Long id);
   Iterable <paysan> findByPrenom(String nom);
}
