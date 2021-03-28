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
public class conducteur extends personne{

	
	private static final long serialVersionUID = 1L;
	private String permiConduire;
	private String typeConducteur;
	private Long Machine;

	public String getPermiConduire() {

		return permiConduire;
	}
	public void setPermiConduire(String permiConduire) {

		this.permiConduire = permiConduire;
	}
	public String getTypeConducteur() {

		return typeConducteur;
	}
	public void setTypeConducteur(String typeConducteur) {
		this.typeConducteur = typeConducteur;
	}

	public Long getMachine() {
		return Machine;
	}

	public void setMachine(Long machine) {
		Machine = machine;
	}

	public conducteur(Long id, String reference, String nom, String prenom, String adresse, String tel, String email,
					  String permiConduire, String typeConducteur, Long machine) {
		super(id, reference, nom, prenom, adresse, tel, email);
		this.permiConduire = permiConduire;
		this.typeConducteur = typeConducteur;
		this.Machine=machine;

	}
	@Override
	public String toString() {
		return "conducteur [permiConduire=" + permiConduire + ", typeConducteur=" + typeConducteur
				+ ", getPermiConduire()=" + getPermiConduire() + ", getTypeConducteur()=" + getTypeConducteur()
				+ ", getId()=" + getId() + ", getReference()=" + getReference() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getAdresse()=" + getAdresse() + ", getTel()=" + getTel()
				+ ", getEmail()=" + getEmail() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}

}
