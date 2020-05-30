package org.nebenkosten.service;

import org.mapstruct.Mapper;
import org.nebenkosten.model.Mietobjekt;
import org.nebenkosten.model.dto.MietobjektDTO;

@Mapper(componentModel = "spring")
public interface MietobjektMapper {

	Mietobjekt mapMietobjektDTOToMietobjekt(MietobjektDTO mietobjektDTO);

	MietobjektDTO mapMietobjektToMietobjektDTO(Mietobjekt mietobjekt);
}
