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
public class gestionnaire extends personne {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String typeGestionnaire;

	public String getTypeGestionnaire() {
		return typeGestionnaire;
	}

	public void setTypeGestionnaire(String typeGestionnaire) {
		this.typeGestionnaire = typeGestionnaire;
	}


	@Override
	public String toString() {
		return "gestionnaire [typeGestionnaire=" + typeGestionnaire + ", getTypeGestionnaire()=" + getTypeGestionnaire()
				+ ", getId()=" + getId() + ", getReference()=" + getReference() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdresse()=" + getAdresse() + ", getTel()=" + getTel()
				+ ", getEmail()=" + getEmail() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

	public gestionnaire(Long id, String reference, String nom, String prenom, String adresse, String tel, String email,
			String typeGestionnaire) {
		super(id, reference, nom, prenom, adresse, tel, email);
		this.typeGestionnaire = typeGestionnaire;
	}
	
	

}
