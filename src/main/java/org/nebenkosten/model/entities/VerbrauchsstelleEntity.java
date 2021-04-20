package org.nebenkosten.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "verbrauchsstelle")
public class VerbrauchsstelleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private Double zaehlerstand;

	@ManyToOne
	private NebenkostenEntity nebenkosten;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getZaehlerstand() {
		return zaehlerstand;
	}

	public void setZaehlerstand(Double zaehlerstand) {
		this.zaehlerstand = zaehlerstand;
	}

	public NebenkostenEntity getNebenkosten() {
		return nebenkosten;
	}

	public void setNebenkosten(NebenkostenEntity nebenkosten) {
		this.nebenkosten = nebenkosten;
	}
}
