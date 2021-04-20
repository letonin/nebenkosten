package org.nebenkosten.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "nebenkosten")
public class NebenkostenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Double gaskosten;

	private Double wasserkosten;

	private Double abwasserkosten;

	private LocalDate datum;

	@OneToMany(mappedBy = "nebenkosten", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<VerbrauchsstelleEntity> verbrauchsstellen;

	private Long mietobjektId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getGaskosten() {
		return gaskosten;
	}

	public void setGaskosten(Double gaskosten) {
		this.gaskosten = gaskosten;
	}

	public Double getWasserkosten() {
		return wasserkosten;
	}

	public void setWasserkosten(Double wasserkosten) {
		this.wasserkosten = wasserkosten;
	}

	public Double getAbwasserkosten() {
		return abwasserkosten;
	}

	public void setAbwasserkosten(Double abwasserkosten) {
		this.abwasserkosten = abwasserkosten;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public List<VerbrauchsstelleEntity> getVerbrauchsstellen() {
		return verbrauchsstellen;
	}

	public void setVerbrauchsstellen(List<VerbrauchsstelleEntity> verbrauchsstellen) {
		this.verbrauchsstellen = verbrauchsstellen;
	}

	public Long getMietobjektId() {
		return mietobjektId;
	}

	public void setMietobjektId(Long mietobjektId) {
		this.mietobjektId = mietobjektId;
	}
}
