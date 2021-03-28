package delta.administration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  class personne implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String reference;
	private String nom;
	private String prenom;
	private String adresse;
	private String tel;
	private String email;
	

}
