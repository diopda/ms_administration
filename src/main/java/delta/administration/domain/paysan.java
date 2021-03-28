package delta.administration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
		@AttributeOverride(name="reference", column=@Column(name="reference")),
		@AttributeOverride(name="nom", column=@Column(name="nom")),
		@AttributeOverride(name="prenom", column=@Column(name="prenom")),
		@AttributeOverride(name="adresse", column=@Column(name="adresse")),
		@AttributeOverride(name="tel", column=@Column(name="telephone")),
		@AttributeOverride(name="email", column=@Column(name="email"))
})
public class paysan extends personne {
	
	
	private static final long serialVersionUID = 1L;
	private String fonction;
	private Long  idgroupement;
	private Long saison;
	private float superficie;





}
