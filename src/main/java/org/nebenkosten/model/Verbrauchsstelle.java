package org.nebenkosten.model;

import io.swagger.annotations.ApiModel;

@ApiModel("Entspricht ein Zähler")
public class Verbrauchsstelle implements Comparable<Verbrauchsstelle> {

	private String name;

	private Double zaehlerstand;

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

	@Override
	public int compareTo(Verbrauchsstelle verbrauchsstelle) {
		return verbrauchsstelle.getName().compareTo(this.getName());
	}
}
