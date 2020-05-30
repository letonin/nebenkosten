package org.nebenkosten.model;

import io.swagger.annotations.ApiModel;

@ApiModel("Mietobjekt für die die Nebenkostenabrechnung gilt")
public class Mietobjekt {

	private Long id;

	public String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
