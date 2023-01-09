package ma.ensaj.pharmacy.entities;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PharmacieDeGarde {

	@EmbeddedId
	private PharmacieDeGardePK PharmacieDeGardePK;

	private Date dateFin;

	@ManyToOne
	@JoinColumn(name = "pharmaciePK", insertable = false, updatable = false)
	private Pharmacie pharmacie;
	@ManyToOne
	@JoinColumn(name = "gardePK", insertable = false, updatable = false)
	private Garde garde;

	public PharmacieDeGarde(ma.ensaj.pharmacy.entities.PharmacieDeGardePK pharmacieDeGardePK, Date dateFin) {
		super();
		PharmacieDeGardePK = pharmacieDeGardePK;
		this.dateFin = dateFin;
	}

	public PharmacieDeGardePK getPharmacieDeGardePK() {
		return PharmacieDeGardePK;
	}

	public void setPharmacieDeGardePK(PharmacieDeGardePK pharmacieDeGardePK) {
		PharmacieDeGardePK = pharmacieDeGardePK;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	public Garde getGarde() {
		return garde;
	}

	public void setGarde(Garde garde) {
		this.garde = garde;
	}

	public PharmacieDeGarde() {
		super();
	}

}
