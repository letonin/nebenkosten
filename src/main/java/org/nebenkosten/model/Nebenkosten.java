package org.nebenkosten.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;

import java.time.LocalDate;
import java.util.List;

@ApiModel("Nebenkosten Eintrag für ein Jahr")
public class Nebenkosten implements Comparable<Nebenkosten> {

	private Double gaskosten;

	private Double wasserkosten;

	private Double abwasserkosten;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate datum;

	private List<Verbrauchsstelle> verbrauchsstellen;

	private Long mietobjektId;

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

	public List<Verbrauchsstelle> getVerbrauchsstellen() {
		return verbrauchsstellen;
	}

	public void setVerbrauchsstellen(List<Verbrauchsstelle> verbrauchsstellen) {
		this.verbrauchsstellen = verbrauchsstellen;
	}

	public Long getMietobjektId() {
		return mietobjektId;
	}

	public void setMietobjektId(Long mietobjektId) {
		this.mietobjektId = mietobjektId;
	}

	@Override
	public int compareTo(Nebenkosten nebenkosten) {
		return nebenkosten.getDatum().compareTo(this.getDatum());
	}

}
