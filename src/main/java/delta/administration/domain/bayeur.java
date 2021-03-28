package delta.administration.domain;


import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@AttributeOverrides({
		@AttributeOverride(name="reference", column=@Column(name="reference")),
		@AttributeOverride(name="nom", column=@Column(name="nom")),
		@AttributeOverride(name="prenom", column=@Column(name="prenom")),
		@AttributeOverride(name="adresse", column=@Column(name="adresse")),
		@AttributeOverride(name="tel", column=@Column(name="telephone")),
		@AttributeOverride(name="email", column=@Column(name="email"))
})
public class bayeur extends personne {

	private static final long serialVersionUID = 1L;



	

}
